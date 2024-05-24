package com.org;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringDemo {

    //Write a program where it will check both the string have same characters.

    public void checkStringChar(String str1, String str2)
    {
       Set<Character> strList=new HashSet<>();
       for(int i=0;i<str1.length();i++)
       {
           strList.add(str1.charAt(i));
       }


        Set<Character> strList2=new HashSet<>();
        for(int i=0;i<str2.length();i++)
        {
            strList2.add(str2.charAt(i));
        }

        boolean flag=true;
        if(strList2.size()!=strList2.size())
        {
            flag=false;
        }
        else
        {
            for (Character ch:strList) {
                if(!strList2.contains(ch))
                {
                    flag=false;
                }
                else
                    flag=true;
            }
        }

        System.out.println("Is String One and Two is same :: "+flag);


    }

    public static void main(String[] args) {
        StringDemo demo=new StringDemo();

        demo.checkStringChar("ABCD" ,"CBADO");
    }
}
