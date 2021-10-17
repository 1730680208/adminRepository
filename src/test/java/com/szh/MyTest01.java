package com.szh;

import com.szh.service.SomeService;
import com.szh.service.impl.SomeServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MyTest01 {
    @Test
    public void test01(){
        SomeServiceImpl someService = new SomeServiceImpl();
        someService.doSome();
    }
    @Test
    public void test02(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        SomeService someService = (SomeService) ac.getBean("someService");
        someService.doSome();
    }
    @Test
    public void test03(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        int nums = ac.getBeanDefinitionCount();
        System.out.println("+++" + nums);

        String[] naems = ac.getBeanDefinitionNames();
        for (String na :
                naems) {
            System.out.println("容器里面的名字=======" + na);
        }
    }
    @Test
    public void test04(){
        String config = "beans.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Date date = (Date) ac.getBean("mydate");
        System.out.println("现在时间" + date);
    }

}


