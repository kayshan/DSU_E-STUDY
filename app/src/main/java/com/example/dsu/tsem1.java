package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tsem1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsem1);
    }

    public void tco1(View view) {
        Intent i1=new Intent(this,tco1.class);
        startActivity(i1);
    }

    public void tm1(View view) {
        Intent i1=new Intent(this,tm1.class);
        startActivity(i1);
    }

    public void tfop(View view) {
        Intent i1=new Intent(this,tfop.class);
        startActivity(i1);
    }

    public void ten1(View view) {
        Intent i1=new Intent(this,ten1.class);
        startActivity(i1);
    }

    public void tafm(View view) {
        Intent i1=new Intent(this,tafm.class);
        startActivity(i1);
    }

    public void twp(View view) {
        Intent i1=new Intent(this,twp.class);
        startActivity(i1);
    }
}