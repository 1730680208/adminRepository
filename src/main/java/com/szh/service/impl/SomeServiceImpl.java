package com.szh.service.impl;

import com.szh.service.SomeService;

public class SomeServiceImpl implements SomeService {
    public SomeServiceImpl() {
        System.out.println("无参构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("执行了com.szh.service.impl.SomeServiceImpl的doSome（）方法");
    }
}
