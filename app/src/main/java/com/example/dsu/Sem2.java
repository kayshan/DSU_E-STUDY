package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem2);
    }


    public void m2(View view) {
        Intent i2=new Intent(this,m2.class);
        startActivity(i2);
    }

    public void co2(View view) {
        Intent i2=new Intent(this,co2.class);
        startActivity(i2);
    }

    public void en2(View view) {
        Intent i2=new Intent(this,en2.class);
        startActivity(i2);
    }

    public void pop(View view) {
        Intent i2=new Intent(this,pop.class);
        startActivity(i2);
    }
}