package com.swaroop.array;

public class BasicArray {

    public static void main(String[] args)
    {
        //Integer Array
        int[] myIntArray = new int[10];
        for (int i=0;i<myIntArray.length;i++)
        {
            myIntArray[i]=i*10;
            System.out.println("Value of Element " + i + " " + myIntArray[i]);
        }

        //String Array
        String[] myStringArray = new String[10];
        for (int i=0;i<myStringArray.length;i++)
        {
            myStringArray[i]= "I am value " + i;
            System.out.println("Value of Element " + i + " " + myStringArray[i]);
        }
    }
}

