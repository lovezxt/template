package com.yourchoice.template.sofabootrun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 项目入口类
 * @author 高占江
 * @date 2019/5/1 19:14
 */
@SpringBootApplication
@MapperScan("com.yourchoice")
public class SofaBootRunApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(SofaBootRunApplication.class);
        springApplication.run(args);
    }

}
