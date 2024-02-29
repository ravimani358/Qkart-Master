package com.crio.qcalc;

public class StandardCalculator {

    private int result;
    private int num1;
    private int num2;

    public int getResult() {
        return result;
    }

    private void setResult(int value) {
        this.result = value;
    }

    public static void getVersion() {
        System.out.println("Standard Calculator 1.0");
    }

   //public StandardCalculator(int num1, int num2) {
     //   this.num1 = num1;
       // this.num2 = num2;
    //}

    public int add(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    public int subtract(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    public int multiply(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    public int divide(int num1, int num2) {
        result = num1 / num2;
        return result;
    }
}
