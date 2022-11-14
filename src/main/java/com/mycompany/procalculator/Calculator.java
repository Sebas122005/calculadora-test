package com.mycompany.procalculator;

public class Calculator {
    
    float x,y;

    public Calculator(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Calculator() {
    }
    
    float suma(){
        return x+y;
    }
    
    
    float resta(){
        return x-y;
    }
    
    float producto(){
        return x*y;
    }
    
    float division(){
       if (y==0)
           return 0;
       else
           return x/y;
       
    }
    
}
