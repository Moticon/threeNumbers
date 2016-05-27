package com.moticon.threenumbers;

/**
 * Created by moticon on 5/26/2016.
 */
public class ThreeNumbers {
    private Integer a;
    private Integer b;
    private Integer c;

    private Integer sum;
    private Integer product;
    private Integer average;

    public ThreeNumbers(Integer x, Integer y, Integer z){
        a = x;
        b = y;
        c = z;
        calculateSum();
        calculateProduct();
        calculateAverage();
    }

    private Integer getSumOfAll(){
        return getSum()+getAverage()+getProduct();
    }

    private void calculateSum(){
        sum = a + b + c;
    }

    private void calculateProduct(){
        product = a*b*c;
    }

    public void throwException(){
        if (a.compareTo(0) < 0)
            throw new IllegalArgumentException("X must not be negative");
    }

    private void calculateAverage(){
        average = sum/3;
    }

    public Integer getAverage() {
        return average;
    }

    public Integer getSum() {
        return sum;
    }

    public Integer getProduct() {
        return product;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getC() {
        return c;
    }

    public void setC(Integer c) {
        this.c = c;
    }
}
