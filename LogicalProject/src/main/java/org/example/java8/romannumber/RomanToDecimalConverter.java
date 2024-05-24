package org.example.java8.romannumber;

public class RomanToDecimalConverter {
    private int value(char romachChar)
    {
        switch (romachChar){
            case 'I': return 1;
            case 'V': return 4;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'M': return 1000;
            default: return -1;

        }
    }

    public int getDecimalValueFromRoman(String roman)
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

    public static void main(String[] args) {
        String inputRoman="XLIV";
        RomanToDecimalConverter converter=new RomanToDecimalConverter();
        int decimalValue=converter.getDecimalValueFromRoman(inputRoman);
        System.out.println(inputRoman+" : "+decimalValue);
    }
}
