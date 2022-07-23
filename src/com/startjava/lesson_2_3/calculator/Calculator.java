package com.startjava.lesson_2_3.calculator;

class Calculator {
    private int a;
    private int b;
    private char mathOperation;
    private int result;

    public void calculate() {
        switch(mathOperation) {
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '/' :
                result = a / b;
                break;
            case '^' :
                result = (int) Math.pow(a, b);
                break;
            case '%' :
                result = a % b;
                break;
            default:
                System.out.println("Введена неверная математическая операция, попробуйте снова.");
        }
        System.out.println("Результат: " + a + " " + mathOperation + " " + b + " = " + result);
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getMathOperation() {
        return mathOperation;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;

    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}