package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem3);
    }

    public void doSomething(View view) {
        Intent i1=new Intent(this,StudyMaterial.class);
        startActivity(i1);
    }

    public void hci(View view) {
        Intent i2=new Intent(this,hci.class);
        startActivity(i2);
    }

    public void se(View view) {
        Intent i2=new Intent(this,se.class);
        startActivity(i2);
    }

    public void cn(View view) {
        Intent i2=new Intent(this,cn.class);
        startActivity(i2);
    }

    public void nm(View view) {
        Intent i2=new Intent(this,nm.class);
        startActivity(i2);
    }

    public void ada(View view) {
        Intent i2=new Intent(this,ada.class);
        startActivity(i2);
    }

    public void os(View view) {
        Intent i2=new Intent(this,os.class);
        startActivity(i2);
    }
}