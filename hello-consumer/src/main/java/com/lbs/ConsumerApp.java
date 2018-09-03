package com.lbs;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * description: 服务消费者启动类
 *
 * @author libosheng
 * @date 2018-9-3
 */
public class ConsumerApp {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("hello-consumer start ...");
        HelloService helloService = (HelloService) context.getBean("helloService");
        System.out.println(helloService.hello("lily"));
        System.in.read();
    }
}
