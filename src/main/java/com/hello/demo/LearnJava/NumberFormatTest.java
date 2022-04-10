package com.hello.demo.LearnJava;

import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.tomcat.jni.Local;

public class NumberFormatTest {
    public static void main(String[] args) {
        double testNum = 879565653132.5245;
        Locale[] locales = {Locale.CHINA, Locale.JAPAN, Locale.GERMAN, Locale.ENGLISH, Locale.FRANCE};
        NumberFormat[] numbers = new NumberFormat[20];
        
        for(int i = 0; i < locales.length; i++) {
            numbers[i * 4] = NumberFormat.getNumberInstance(locales[i]);
            numbers[i * 4 + 1] = NumberFormat.getCurrencyInstance(locales[i]);
            numbers[i * 4 + 2] = NumberFormat.getPercentInstance(locales[i]);
            numbers[i * 4 + 3] = NumberFormat.getIntegerInstance(locales[i]);
        }

        for(int i = 0; i < locales.length; i++) {
            System.out.println("=========== " + locales[i] + " ==========");
            System.out.println("getNumberInstance: " + numbers[i*4].format(testNum));
            System.out.println("getCurrencyInstance: " + numbers[i*4 +1].format(testNum));
            System.out.println("getPercentInstance: " + numbers[i*4 +2].format(testNum));
            System.out.println("getIntegerInstance: " + numbers[i*4 +3].format(testNum));
        }



        System.out.println("===================== Date format =================");

        Date date = new Date();
        
    }
}
