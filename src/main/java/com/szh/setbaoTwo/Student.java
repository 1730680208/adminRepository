package com.szh.setbaoTwo;

public class Student {
    private String name;
    private int age;
    private School school;

    public Student(String name,int ag, School school){
        System.out.println("=====Student有参数构造方法======");
        //属性赋值
        this.name  = name;
        this.age  = ag;
        this.school = school;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
