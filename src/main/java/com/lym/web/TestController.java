package com.lym.web;

import com.lym.service.ConsumerDubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by liuyumeng on 2018/9/18.
 */
@RestController
public class TestController {
    @Resource
    private ConsumerDubboService consumerDubboService;

    @GetMapping(value = "/sayhello")
    public String sayhello(){
        consumerDubboService.say();
        return "success";
    }
}
