package com.org;

public class MainClass {
    public static void main(String[] args) {
        ConcreateClass cc1=new ConcreateClass();
        ConcreateClassB ccb=new ConcreateClassB();

        cc1.methodB();
        cc1.methodA();

        ccb.methodB();
        ccb.methodA();

    }
}
