package com.renkyorganci.sami.storingdata;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences sharedPreferences = this.getSharedPreferences("com.renkyorganci.sami.storingdata", Context.MODE_PRIVATE);

        int age = 42;

//        sharedPreferences.edit().putInt("userAge",age).apply();

        int savedAge = sharedPreferences.getInt("userAge",0);
        System.out.println("Saved Value : " + savedAge);

        age = 30;

        sharedPreferences.edit().putInt("userAge",age).apply(); //Güncellendi

        sharedPreferences.edit().remove("userAge").apply();//Silme 

    }
}
