package com.hello.demo.LearnJava;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Rosaline");
        arrayList.add("Joshua");
        arrayList.add("Roy");
        arrayList.add("Robin");
        arrayList.add("Joyce");
        arrayList.add("Rose");
        
        // Stream 打印出所有名字R'开头的名字，stream 的来源可以是集合，数组等。
        arrayList.stream().filter((s -> s.startsWith("R"))).forEach(s -> System.out.println(s));
        System.out.println("====================================");
        arrayList.stream().filter((s -> s.startsWith("R"))).filter(s -> s.length() > 3).forEach(System.out::println);
    }
}
