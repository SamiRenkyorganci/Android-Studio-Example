package com.renkyorganci.sami.javalearning;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by sami on 12.05.2018.
 */

public class Variables {
    public static void main(String[] args) {
        //Set
        HashSet<String> myset = new HashSet<String>();
        myset.add("Rob");
        myset.add("Rob");

        System.out.println(myset.size());

       //Map
        HashMap<String,String> myhashmap =new HashMap<String, String>();

        myhashmap.put("name","James");
        myhashmap.put("instrument","Guitar");

        System.out.println(myhashmap.get("name"));
        System.out.println(myhashmap.get("instrument"));

    }
}
