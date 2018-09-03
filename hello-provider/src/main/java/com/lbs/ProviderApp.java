package com.lbs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * description: 服务提供者启动类
 *
 * @author libosheng
 * @date 2018-9-3
 */
public class ProviderApp {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        context.start();
        System.out.println("hello-provider start ...");
        System.in.read();
    }
}
