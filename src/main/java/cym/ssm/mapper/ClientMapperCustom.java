package cym.ssm.mapper;

import cym.ssm.po.ClientCustom;
import cym.ssm.po.ClientQueryVo;

import java.util.List;

public interface ClientMapperCustom {
    List<String> findClientByBusiness() throws Exception;

    List<String> findClientByType() throws Exception;

    List<ClientCustom> findClientList(ClientQueryVo clientQueryVo) throws Exception;

    void updateClient(ClientQueryVo clientQueryVo) throws Exception;
}