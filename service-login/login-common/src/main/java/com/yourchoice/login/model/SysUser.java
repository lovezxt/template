package com.yourchoice.login.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 系统用户表实体类
 * @author 高占江
 * @date 2019/5/1 18:25
 */
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class SysUser implements Serializable {

    /**mysql主键自增必须注明*/
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "JDBC")
    private Integer id;

    /**注解声明数据库内的字段名*/
    @Column(name = "username")
    @NonNull
    private String username;

    private String password;

    private String type;
}