package com.org;

public class ArrayDemo {



    public static void main(String[] args) {

        int arr[][]={{1,2},
                     {3,4},
                     {5,6}};

        int arr2[][]=new int[3][2];

        for(int i=0;i<3;i++)
        {
            for (int j=0;j<2;j++)
            {
                if(j==1)
                {

                }
                arr2[i][j]=arr[i][j];
            }
        }

    }
}
