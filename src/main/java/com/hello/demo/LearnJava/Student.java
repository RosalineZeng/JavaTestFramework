package com.hello.demo.LearnJava;

public class Student {
    private String name;
    private int age;
    private byte gender;
    private String email;
    private String address;
    
    public Student(String name, int age, byte gender, String email, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public byte getGender() {
        return gender;
    }
    public void setGender(byte gender) {
        this.gender = gender;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void eat() {
        System.out.println("I wanna eat");
    }

    public void sleep() {
        System.out.println("I wanna sleep");
    }
}
