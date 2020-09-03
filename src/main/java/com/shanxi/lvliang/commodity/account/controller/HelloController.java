package com.shanxi.lvliang.commodity.account.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName:HelloController
 * @Descirpiton: TODO
 * @Author: Gaoww
 * @Date: 2020/8/17 18:31
 * @Version: 1.0
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String sayHello(){

        System.out.println("hello world");

        return "hello";
    }
}
