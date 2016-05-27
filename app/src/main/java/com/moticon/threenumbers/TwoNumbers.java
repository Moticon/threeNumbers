package com.moticon.threenumbers;

/**
 * Created by moticon on 5/27/2016.
 */
public class TwoNumbers {
    Integer a;
    Integer b;

    public TwoNumbers(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }

    public Integer getSum(){ return a+b;}

    public Integer getProduct() {return a*b;}

    public Integer getSumOfSquares(){ return a*a + b*b;}

    public Integer getSquareOfSum(){return (a+b)*(a+b);}
}
