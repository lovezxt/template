package com.yourchoice.template.sofabootrun.controller.user;

import com.alipay.sofa.runtime.api.annotation.SofaReference;
import com.yourchoice.login.model.ext.SysUserExt;
import com.yourchoice.login.service.system.SystemUserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统用户表
 * @author 高占江
 * @date 2019/2/15 10:14
 */
@RestController
@RequestMapping(value = "/systemUser")
public class SystemUserController{

    @SofaReference
    private SystemUserService systemUserService;

    @RequestMapping("/login")
    public void login(){
        System.out.println(666);
        SysUserExt systemUser = new SysUserExt();
        int aaa = systemUserService.systemUserLogin(systemUser);
        System.out.println(aaa);
    }
}
