package cym.ssm.controller;

import cym.ssm.po.Client;
import cym.ssm.po.ClientCustom;
import cym.ssm.po.ClientQueryVo;
import cym.ssm.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chenyuming on 2017/3/30.
 */
@Controller
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private IClientService clientService;

    /*可以删掉*/
    @RequestMapping("/toClientList1")
    public String toClientList1() throws Exception {
        return "client/customer";
    }

    @RequestMapping("/toClientList")
    public String toClientList(Model model, ClientQueryVo clientQueryVo) throws Exception {
        /*获取查询条件*/
        List<String> clientByBusinessList = clientService.findClientByBusiness();
        List<String> clientByTypeList = clientService.findClientByType();
        List<ClientCustom> clientList = clientService.findClientList(clientQueryVo);
        /*获取查询内容*/
        model.addAttribute("BusinessList", clientByBusinessList);
        model.addAttribute("TypeList", clientByTypeList);
        model.addAttribute("clientList", clientList);
        /*数据回显*/
        if (clientQueryVo != null) {
            model.addAttribute("clientQueryVo", clientQueryVo);
        }
        return "client/clientList";
    }

    //根据id查询
    @RequestMapping("/detail")
    @ResponseBody
    public Client findClientById(Integer id) throws Exception {
        Client client = clientService.findClientById(id);
        return client;
    }

    @RequestMapping("/update")
    public String updateClient(Client client) throws Exception {
        clientService.updateClient(client, client.getId());
        return "client/clientList";
    }


    @RequestMapping("/delete")
    public String deleteClient(Integer id) throws Exception {
        clientService.deleteClient(id);
        return "client/clientList";
    }

}
