package com.szh;

import com.szh.setbao.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.util.Date;

public class MyTest01 {

    @Test
    public void test01(){
        String config = "setbao/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);

        Student student = (Student) ac.getBean("myStudent");
        System.out.println("现在" + student);

        System.out.println("===========================");
        Date myDate = (Date) ac.getBean("myDate");
        System.out.println(myDate);

        System.out.println("========io创建文件======");

        File file = (File) ac.getBean("myFile");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getName());


    }

}


