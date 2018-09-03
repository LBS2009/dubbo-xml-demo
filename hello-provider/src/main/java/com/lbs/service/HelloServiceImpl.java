package com.lbs.service;

import com.lbs.HelloService;
import org.springframework.stereotype.Service;

/**
 * description: HelloServiceImpl
 *
 * @author libosheng
 * @date 2018-9-3
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "hello " + name;
    }
}
