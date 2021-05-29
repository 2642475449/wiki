package com.xiao.wiki.controller;

import com.xiao.wiki.domain.Test;
import com.xiao.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：降蓝
 * @description：测试
 * @date ：2021/5/28 23:39
 */
@RestController
public class TestController {


    @Resource
    private TestService testService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @PostMapping("/hello/post")
    public String helloPost(String name) {
        return "Hello World! Post"+name;
    }

    @GetMapping("/test/list")
    public List<Test> list() {
        return testService.list();
    }
}
