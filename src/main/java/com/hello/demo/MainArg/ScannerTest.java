package com.hello.demo.MainArg;

import java.util.Scanner;

public class ScannerTest {
    
    public static void main(String[] args) {
        //创建一个可以从键盘输入中获取值的Scanner 对象
        Scanner scanner = new Scanner(System.in);
        System.getenv();

        //Scanner。hasNext（） 程序会组赛，意思是程序会等待输入，等输入Enter 之后继续
        while (scanner.hasNext()) {
            System.out.println("You input: " + scanner.next());
        }
    }
}
