package com.hello.demo;

public class Jieceng {

    // 求一个数到阶层
    public static int fn(int num) {
        int result = 1;
        for(int i=num; i > 0; i--){
            result *= i;
        }
        return result;
    }

    public static int jcfn(int num) {
        int result = 1;
        if (num > 1) {
            result = num * jcfn(num-1);
        }
        return result;        
    }

    public static void main(String[] args) {    
        
        // System.out.println(fn(5));
        // System.out.println(jcfn(5));
        function(6);
    }

    public static void function(int val) {
        if(val >=2) {
            function(--val);
        }
        System.out.println(val);
    }

}
