package com.lbs;

/**
 * description:
 *
 * @author libosheng
 * @date 2018-9-5
 */
public class HelloServiceMockImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "mock 容错数据";
    }
}
