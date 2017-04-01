package cym.ssm.service.impl;

import cym.ssm.mapper.ClientMapper;
import cym.ssm.mapper.ClientMapperCustom;
import cym.ssm.po.Client;
import cym.ssm.po.ClientCustom;
import cym.ssm.po.ClientExample;
import cym.ssm.po.ClientQueryVo;
import cym.ssm.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenyuming on 2017/3/30.
 */
@Service("clientService")
public class ClientServiceImpl implements IClientService {
    @Autowired
    private ClientMapper clientMapper;
    @Autowired
    private ClientMapperCustom clientMapperCustom;


    public List<String> findClientByBusiness() throws Exception {
        List<String> clientByBusinessList = clientMapperCustom.findClientByBusiness();
        return clientByBusinessList;
    }

    public List<String> findClientByType() throws Exception {
        List<String> clientByTypeList = clientMapperCustom.findClientByType();
        return clientByTypeList;
    }

    public List<ClientCustom> findClientList(ClientQueryVo clientQueryVo) throws Exception {
        List<ClientCustom> clientList = clientMapperCustom.findClientList(clientQueryVo);
        return clientList;
    }

    public Client findClientById(Integer id) throws Exception {
        Client client = clientMapper.selectByPrimaryKey(id);
        return client;
    }

    public void updateClient(Client client, Integer update_id) throws Exception {
        ClientExample example = new ClientExample();
        ClientExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(update_id);
        clientMapper.updateByExampleSelective(client, example);

    }

    public void deleteClient(Integer id) throws Exception {
        clientMapperCustom.deleteClientById(id);
    }
}
