package com.shanxi.lvliang.commodity.account.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName:LoginController
 * @Descirpiton: TODO
 * @Author: Gaoww
 * @Date: 2020/9/3 10:20
 * @Version: 1.0
 */
@Log4j2
@Controller
@RequestMapping("/user")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST, consumes = "applicationi/json", produces = {"application/json;charset=UTF-8"})
    public String login(){

        log.info("用户,登录成功");

        return "index";
    }

}
