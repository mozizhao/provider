package main.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import main.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
