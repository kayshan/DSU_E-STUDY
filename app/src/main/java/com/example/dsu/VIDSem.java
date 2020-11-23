package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VIDSem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_i_d_sem);
    }


    public void sem2(View view) {
        Intent i2=new Intent(this,VSem2.class);
        startActivity(i2);
    }

    public void sem3(View view) {
        Intent i3=new Intent(this,VSem3.class);
        startActivity(i3);
    }

    public void sem4(View view) {
        Intent i4=new Intent(this,VSem4.class);
        startActivity(i4);
    }

    public void sem5(View view) {
        Intent i5=new Intent(this,VSem5.class);
        startActivity(i5);
    }

    public void sem6(View view) {
        Intent i6=new Intent(this,VSem6.class);
        startActivity(i6);
    }


    public void sem1(View view) {
        Intent i1=new Intent(this,VSem1.class);
        startActivity(i1);
    }
}