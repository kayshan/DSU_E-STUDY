package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tsem5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsem5);
    }

    public void tbda(View view) {
        Intent i1=new Intent(this,tbda.class);
        startActivity(i1);
    }

    public void tins(View view) {
        Intent i1=new Intent(this,tins.class);
        startActivity(i1);
    }

    public void tmp(View view) {
        Intent i1=new Intent(this,tmp.class);
        startActivity(i1);
    }
}