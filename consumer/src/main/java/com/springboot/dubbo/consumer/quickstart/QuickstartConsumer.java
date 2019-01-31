package com.springboot.dubbo.consumer.quickstart;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @Author Elvis Chen
 * @Date 2019/1/31 21:03
 * @Version 1.0
 **/
@Component
public class QuickstartConsumer {

    @Reference(interfaceClass = ServiceAPI.class)

    ServiceAPI serviceAPI;

    public void sendMessage(String message){
        System.out.println(serviceAPI.sendMessage(message));
    }
}
