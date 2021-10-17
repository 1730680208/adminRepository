package com.szh;

import com.szh.bao04.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest04 {
    @Test
    public void Test03(){
        String config ="bao04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        System.out.println("=======================下面开始就是byType了===========================");

        Student stu = (Student) ac.getBean("myStudentByClass");
        System.out.println("Java里的引用类型和配置文件bean的class类型值一样：\n\t\t" + stu);
    }


    @Test
    public void Test04(){
        String config ="bao04/applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        Student Stud = (Student) ac.getBean("myStudent");
        System.out.println(Stud);
        System.out.println("=======================下面开始就是byType了===========================");

        Student stu = (Student) ac.getBean("myStudentByClass");
        System.out.println("Java里的引用类型和配置文件bean的class类型值一样：\n\t\t" + stu);
    }
}
