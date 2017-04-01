package cym.ssm.service;

import cym.ssm.po.Client;
import cym.ssm.po.ClientCustom;
import cym.ssm.po.ClientQueryVo;

import java.util.List;

/**
 * Created by chenyuming on 2017/3/30.
 */
public interface IClientService {
    List<String> findClientByBusiness() throws Exception;

    List<String> findClientByType() throws Exception;

    List<ClientCustom> findClientList(ClientQueryVo clientQueryVo) throws Exception;

    Client findClientById(Integer id) throws Exception;

    void updateClient(Client client, Integer update_id) throws Exception;
    void deleteClient(Integer id) throws Exception;


}
