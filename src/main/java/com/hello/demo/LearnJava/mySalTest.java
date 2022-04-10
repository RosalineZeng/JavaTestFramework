package com.hello.demo.LearnJava;

import java.text.NumberFormat;
import java.util.HashMap;

public class mySalTest {

    public static Double mySal(double base, int ye, double increase) {
        return base * Math.pow(increase, (double)ye);
    }

    public static HashMap<Integer, Double> salCal(int currentY, double baseSal, double increase){
        HashMap<Integer, Double> mySalMap = new HashMap<>();
        mySalMap.put(currentY,baseSal);
        for (int i = 1; i < 10; i++) {
            currentY ++;
            double currentSal = mySal(baseSal, i, increase);
            mySalMap.put(currentY, currentSal);
        }
        return mySalMap;
    }

    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        HashMap<Integer,Double> salMap = salCal(2022, 320000, 1.078);
        salMap.forEach((k,v) -> System.out.println(
            "Current year is: " + k 
            + ", Salary is: " + nf.format(v)
            + ", Bounse is: " + nf.format(v/12*2)
            + ", Total is: " + nf.format(v+v/12*2)
            + ", Everage month : " + nf.format((v+v/12*2)/12)));
    }

    

}
