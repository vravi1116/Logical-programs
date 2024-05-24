package org.example.java8.romannumber;

import java.util.*;

public class RomanListSorting {
    private static int value(char romachChar)
    {
        switch (romachChar){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return -1;

        }
    }


    public static int getDecimalValueFromRoman(String roman)
    {
        // Collect the result;
        int result=0;
        for(int i=0;i<roman.length();i++)
        {
            // here get the first char value in val1
            int val1=value(roman.charAt(i));

            // here get the first char value in val1
            if(i+1<roman.length()) {
                int val2 = value(roman.charAt(i+1));

                if (val1 >= val2) {
                    result = result + val1;
                } else {
                    result = result + (val2 - val1);
                    i++;
                }
            }else
                result=result + val1;
        }
        return result;
    }
    static class Pair
    {
        int x;
        String roman;

        public Pair(int x, String roman)
        {
            this.x=x;
            this.roman=roman;
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "x=" + x +
                    ", roman='" + roman + '\'' +
                    '}';
        }
    }

    static class Compare
    {
        public void sortList(List<Pair> list)
        {
            Collections.sort(list, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return o1.x-o2.x;
                }
            });
        }
    }
    public static void main(String[] args) {
        List<String> romanList= Arrays.asList("XIIV","XIXIV","MLXI","MCIV","V","VII");

        sortRomanList(romanList);


    }

    private static void sortRomanList(List<String> romanList) {

        List<Pair> pairList=new ArrayList<>();
        for (String roman:romanList) {
            pairList.add(new Pair(getDecimalValueFromRoman(roman),roman));
        }

        System.out.println(romanList);

        Compare compare=new Compare();
        compare.sortList(pairList);

        System.out.println(pairList);

      //  pairList.forEach(System.out::println);

      //  pairList.forEach(pair -> System.out.print(", "+pair.roman));

        List<String> newRomanList = pairList.stream().map(p -> p.roman).toList();
        System.out.println(newRomanList);
    }
}
