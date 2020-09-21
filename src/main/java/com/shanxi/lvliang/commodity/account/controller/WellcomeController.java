package com.shanxi.lvliang.commodity.account.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName:WellcomeController
 * @Descirpiton: TODO
 * @Author: Gaoww
 * @Date: 2020/9/3 18:10
 * @Version: 1.0
 */
@Controller
@Log4j2
public class WellcomeController {

    @RequestMapping("/lvliangaccount")
    public String index(){
        log.info("欢迎进入登录页面");
        return "/public/index";
    }
}
