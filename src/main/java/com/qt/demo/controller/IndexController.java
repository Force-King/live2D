package com.qt.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description 首页
 * @Classname IndexController
 * @Author CleverApe
 * @Date 2020-09-21 18:41
 * @Version V1.0
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "/index";
    }

    @GetMapping("/index")
    public String index1() {
        return "/index";
    }
}
