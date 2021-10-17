package com.szh.setbaoTwo;

public class School {
    private String name;
    private String address;

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "School类里面的输出方法{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
