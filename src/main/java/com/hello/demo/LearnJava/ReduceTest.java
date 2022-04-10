package com.hello.demo.LearnJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReduceTest {
    private static class Person {
        int age;
        String name;
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Person(int age, String name) {
            this.age = age;
            this.name = name;
        }
        
    }
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(
            new Person(30, "Rosaline"),
            new Person(45, "joshua"),
            new Person(55, "Arnold")
        );
        int ageNum = personList.stream().map(s -> s.getAge()).reduce((a,b) -> a+b).get(); 
        System.out.println(ageNum);

    }
}
