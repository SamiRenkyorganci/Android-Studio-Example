package com.renkyorganci.sami.methodsandclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Application started");
        test();
        math(5,4);

    }

    public void test(){

        int x =4+4;
        System.out.println(x);
    }

    public int math(int a , int b){

        return a+b;
    }

    public void makeMusician(){

//        Musician james =new Musician();//No Constructor
//
//        james.name="James Hetfield";
//        james.instrumans="Guitar";
//        james.age=50;

        Musician james = new Musician("James Hetfield", "Guitar" , 50);

    }
    public  void  makeSimpsons(){

        Simpsons homer = new Simpsons("Homer Simpsons", "Nuclear Reactor Chief",50);
//        homer.age=20; private
        homer.getName();
        homer.setName("James Homer Simpsons");


    }
}
