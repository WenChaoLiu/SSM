package cym.ssm.service.impl;

import cym.ssm.mapper.TUserMapper;
import cym.ssm.mapper.TUserMapperCustom;
import cym.ssm.po.TUser;
import cym.ssm.po.TUserCustom;
import cym.ssm.po.TUserExample;
import cym.ssm.po.TUserQueryVo;
import cym.ssm.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chenyuming on 2017/3/28.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Autowired
    private TUserMapperCustom userMapperCustom;
    @Autowired
    private TUserMapper userMapper;

    public TUserCustom findUserByName(TUserQueryVo tUserQueryVo) throws Exception {
        TUserCustom userCustom = userMapperCustom.findUserByName(tUserQueryVo);
        return userCustom;
    }

    public void t() {
        TUserExample example = new TUserExample();
        TUserExample.Criteria criteria = example.createCriteria();
        criteria.andIdentityEqualTo(1);

        List<TUser> userList = userMapper.selectByExample(example);
    }

}
