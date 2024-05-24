package com.org;

public class ConcreateClassB implements MyInterface{
    @Override
    public void methodA() {
        System.out.println("Specific logic in for this method A in ConcreatClassB");
    }

    @Override
    public void methodB() {
        System.out.println("Specific logic in for this method B in ConcreatClassB");
    }
}
