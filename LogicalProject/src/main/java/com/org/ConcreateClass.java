package com.org;

public class ConcreateClass extends MyAbstractImpl{

    @Override
    public void methodA() {
        super.methodA();
    }

    @Override
    public void methodB() {
        System.out.println("Specific logic implementation only for this class");
    }
}
