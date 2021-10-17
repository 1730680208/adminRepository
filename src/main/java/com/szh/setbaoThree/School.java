package com.szh.setbaoThree;

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
        System.out.println("");
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';

    }
}
