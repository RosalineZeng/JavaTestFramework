package com.hello.demo.LearnJava;

import java.math.BigDecimal;

public class MathTest {
    public static void main(String[] args) {
        //获取圆周率
        System.out.println(Math.PI);

        // 把弧度转化为角度
        System.out.println(Math.toDegrees(Math.PI /2));

        // 把角度转化为弧度
        System.out.println(Math.toRadians(90));

        //计算正弦
        System.out.println(Math.sin(Math.PI / 2));

        //计算余弦
        System.out.println(Math.cos(Math.PI / 2));

        //计算正切
        System.out.println(Math.tan(Math.PI / 2));

        //取整
        System.out.println(Math.floor(1.2));
        System.out.println(Math.ceil(1.5));

        //四舍五入
        System.out.println(Math.round(1.55));

        //计算平方根,立方根
        System.out.println(Math.sqrt(9));
        System.out.println(Math.cbrt(27));

        //e 的 N次幂
        System.out.println(Math.exp(3));

        // 计算x 的N 次方
        System.out.println(Math.pow(2,28));

        //获取0-1 之间的伪随机数
        System.out.println(Math.random());

        BigDecimal a = new BigDecimal("0.05");
        BigDecimal b = new BigDecimal("0.01");
        System.out.println(a.add(b));
    }
}
