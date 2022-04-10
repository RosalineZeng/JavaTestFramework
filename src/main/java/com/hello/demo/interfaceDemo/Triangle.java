package com.hello.demo.interfaceDemo;

public class Triangle implements Shape{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        if(a + b < c || a + c < b || b + c < a){
            System.out.println("This is not a triangle");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String getType() {
        return "Triangle";
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    
    
}
