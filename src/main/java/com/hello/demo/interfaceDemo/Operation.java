package com.hello.demo.interfaceDemo;

public enum Operation {
    PLUS {

        @Override
        public double eval(double a, double b) {
            return a + b;
        }

    }, MINUS {

        @Override
        public double eval(double a, double b) {
            return a - b;
        }
        
    }, TIMES {
        @Override
        public double eval(double a, double b) {
            return a * b;
        }
    }, DEVIDE {
        @Override
        public double eval(double a, double b) {
            if(b != 0){
                return a / b;
            } else {
                return 0;
            }
        }
    };

    public abstract double eval(double a, double b);

    public static void main(String[] args) {
        System.out.println(Operation.TIMES.eval(3, 9));
    }
}
