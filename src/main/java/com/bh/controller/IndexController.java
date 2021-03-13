package com.bh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:在controller包中创建类IndexController
 * @Author: WWT
 * @Date: 2021/3/9
 * @Time: 10:41
 */
@Controller
@RequestMapping("/home")
public class IndexController {
    @RequestMapping("/index_")
    public String index() {
        return "index_";
    }
}
