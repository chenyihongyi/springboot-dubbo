package com.springboot.dubbo.provider.quickstart;

import com.alibaba.dubbo.config.annotation.Service;
import com.springboot.dubbo.ServiceAPI;
import org.springframework.stereotype.Component;

/**
 * @Author Elvis Chen
 * @Date 2019/1/31 20:07
 * @Version 1.0
 **/
@Component
@Service(interfaceClass = ServiceAPI.class)
public class QuickstartServiceImpl implements ServiceAPI {

    @Override
    public String sendMessage(String message) {
        return "quickstart-provider-message="+message;
    }
}
