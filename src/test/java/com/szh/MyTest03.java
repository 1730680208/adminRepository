package com.szh;


import com.szh.setbaoThree.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest03 {

    @Test
    public void test01(){
        String config = "setbaoThree/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent");
        System.out.println("Test类输出数据=========" + student);
    }
/*
    @Test
    public void test02(){
        String config = "setbaoThree/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent2");
        System.out.println("Test类输出数据=========" + student);
    }

    @Test
    public void test03(){
        String config = "setbaoThree/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student student = (Student) ac.getBean("myStudent3");
        System.out.println("Test类输出数据=========" + student);
    }*/
}


