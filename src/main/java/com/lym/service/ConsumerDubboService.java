package com.lym.service;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

/**
 * Created by liuyumeng on 2018/9/18.
 */
@Component
public class ConsumerDubboService {
    @Reference(version = "1.0.0")
    DubboService dubboService;

    public void say() {
        String word ="you can you up";
        dubboService.sayHello(word);
    }
}
