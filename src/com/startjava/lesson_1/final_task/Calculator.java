package com.startjava.lesson_1.final_task;

class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        char sing = '%';
        int result = 0;
        if (sing == '+') {
            result = a + b;
        } else if (sing == '-') {
            result = a - b;
        } else if (sing == '*') {
            result = a * b;
        } else if (sing == '/') {
            result = a / b;
        } else if (sing == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else if (sing == '%') {
            result = a % b;
        }
        System.out.println(a + " " + sing + " " + b + " = " + result);
    }
}