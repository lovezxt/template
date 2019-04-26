package com.yourchoice.login.mapper;

import com.yourchoice.login.model.ext.SysUserExt;
import tk.mybatis.mapper.common.Mapper;

/**
 * 系统用户表Mapper
 * @author 高占江
 * @date 2019/5/1 18:25
 */
public interface SysUserMapper extends Mapper<SysUserExt> {
    /**
     * 通过用户名查询用户
     * @param username 用户名
     * @return 用户实体拓展类
     */
    SysUserExt findByUserName(String username);
}