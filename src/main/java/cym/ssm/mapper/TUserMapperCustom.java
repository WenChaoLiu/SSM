package cym.ssm.mapper;

import cym.ssm.po.TUserCustom;
import cym.ssm.po.TUserQueryVo;

/**
 * Created by chenyuming on 2017/3/28.
 */
public interface TUserMapperCustom {
    public TUserCustom findUserByName(TUserQueryVo tUserQueryVo) throws Exception;

}
