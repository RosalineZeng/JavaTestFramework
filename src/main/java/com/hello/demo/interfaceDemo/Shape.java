package com.hello.demo.interfaceDemo;

public interface Shape {
    // 接口中定义的变量都是常量，还有抽象方法，默认都是public
    int maxmum = 10;
    String getType();
    double perimeter();

    default void printMe() {
        beforePrintMe();
        System.out.println("I am a " + getType());
    }

    default void beforePrintMe() {
        System.out.println("This is after Java 9, before printMe");
    }
}
