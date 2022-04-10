package com.hello.demo;

public class practise {

    public static void main(String[] args) {
        // System.out.println("100:" + jiafa(100));
        // jiujiu();
        // sayHi("Hey", "Rosaline", "Claire", "Vivi");
        // System.out.println("fn(10) is " + fn(10));

        int i = 1; 
        System.out.println(i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
    }

    // 1+2+...+100
    public static int jiafa(int num){
        int result = 0;
        for (int i=0; i<=num; i++) {
            result +=i;
        }
        return result;
    }
    //久久乘法表
    public static void jiujiu() {
        for(int i=1; i<10; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(i + "*" + j + "=" + i*j + "  ");
            }
            System.out.println();
        }
    }

    //不定长的参数传参,names 类型就是一个数组,可变参数必须放在参数最后
    public static void sayHi(String content, String... names) {
        for(String name: names) {
            System.out.println(content + ", " + name + ", How you doing?");
        }
    }

    /*递归
    f(0) = 1, f(1)=4, f(n+2)=2*f(n) + f(n+1)
    */
    public static int fn(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2*fn(n-2) + fn(n-1);
        }
    }

    
}
