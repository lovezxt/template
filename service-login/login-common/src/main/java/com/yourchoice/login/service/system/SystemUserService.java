package com.yourchoice.login.service.system;

import com.yourchoice.login.model.ext.SysUserExt;

/**
 * 系统用户表接口
 * @author 高占江
 * @date 2019/2/15 10:14
 */
public interface SystemUserService {
    /**
     * 系统用户登录
     * @param systemUser 用户实体类
     * @return 登录消息
     */
    int systemUserLogin(SysUserExt systemUser);

}
