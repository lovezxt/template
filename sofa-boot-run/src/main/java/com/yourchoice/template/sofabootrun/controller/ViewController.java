package com.yourchoice.template.sofabootrun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 基础页面跳转
 * @author : 高占江
 * @date : 2019/2/19 14:14
 */
@Controller
public class ViewController {

    @RequestMapping("/login")
    public String login(){ return "login"; }

    @RequestMapping("/404")
    public String page404(){ return "404"; }

    @RequestMapping("/page/main")
    public String main(){ return "page/main"; }

    @RequestMapping("/page/user/userInfo")
    public String userInfo(){ return "page/user/userInfo"; }

    @RequestMapping("/page/user/userGrade")
    public String userGrade(){ return "page/user/userGrade"; }

    @RequestMapping("//page/user/userList")
    public String userList(){ return "/page/user/userList"; }

    @RequestMapping("/page/user/changePwd")
    public String changePwd(){ return "page/user/changePwd"; }

    @RequestMapping("/page/doc/bodyTabDoc")
    public String bodyTabDoc(){ return "page/doc/bodyTabDoc"; }

    @RequestMapping("/page/doc/addressDoc")
    public String addressDoc(){ return "page/doc/addressDoc"; }

    @RequestMapping("/page/doc/navDoc")
    public String navDoc(){ return "page/doc/navDoc"; }

    @RequestMapping("/page/systemSetting/logs")
    public String logs(){ return "page/systemSetting/logs"; }

    @RequestMapping("/page/systemSetting/linkList")
    public String linkList(){ return "page/systemSetting/linkList"; }

    @RequestMapping("/page/systemSetting/icons")
    public String icons(){ return "page/systemSetting/icons"; }

    @RequestMapping("/page/systemSetting/basicParameter")
    public String basicParameter(){ return "page/systemSetting/basicParameter"; }

    @RequestMapping("/page/news/newsList")
    public String newsList(){ return "page/news/newsList"; }

    @RequestMapping("/page/img/images")
    public String images(){ return "page/img/images"; }


}
