package com.renkyorganci.sami.javalearning;

import java.util.ArrayList;

/**
 * Created by sami on 11.05.2018.
 */

public class Arrays {

    public static void main(String[] args) {

        //Arrays------------
        String[] myArray = new String[3];

        myArray[0] = "James";
        myArray[1] = "Lars";
        myArray[2] = "Kirk";

        System.out.println(myArray[2]);

        int[] mynumberArray = {10,20,30,40,50};

        System.out.println(mynumberArray[3]);

        //List -- Daha esnek ve Daha kullanışlı

        ArrayList<String> myMusican = new ArrayList<String>();

        myMusican.add("Lars");
        myMusican.add("James");
        myMusican.add(1,"Kirk");
        myMusican.add("Rob");

        System.out.println(myMusican.get(0));
        System.out.println(myMusican.get(1));
        System.out.println(myMusican.get(2));
        System.out.println(myMusican.get(3));




    }
}
