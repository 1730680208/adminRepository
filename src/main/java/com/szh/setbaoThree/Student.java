package com.szh.setbaoThree;

public class Student {
    private String name;
    private int age;
    private School mySchool;

    public Student(String myname,int myAge, School mySchool){

            System.out.println("=====Student有参数构造方法======");

        //属性赋值
        this.name  = myname;
        this.age  = myAge;
        this.mySchool = mySchool;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchool(School school) {
        this.mySchool = school;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + mySchool +
                '}';
    }
}
