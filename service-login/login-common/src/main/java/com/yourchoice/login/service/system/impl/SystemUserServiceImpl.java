package com.yourchoice.login.service.system.impl;

import com.alipay.sofa.runtime.api.annotation.SofaService;
import com.yourchoice.login.mapper.SysUserMapper;
import com.yourchoice.login.model.ext.SysUserExt;
import com.yourchoice.login.service.system.SystemUserService;

import javax.annotation.Resource;

/**
 * 系统用户表实现类
 * @author 高占江
 * @date 2019/2/15 10:14
 */
@SofaService
public class SystemUserServiceImpl implements SystemUserService {

    @Resource
    private SysUserMapper systemUserMapper;

    @Override
    public int systemUserLogin(SysUserExt systemUser){
//        SysUserExt resultUser = systemUserMapper.selectOne(systemUser);
        //正常用户状态为1
//        String type = "1";
//        if(resultUser == null){
            return 1541531;
//        }else if(type.equals(resultUser.getType())){
//            return 2;
//        }else{
//            return 3;
//        }
    }
}
