package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QPSem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_p_sem);
    }

    public void qpsem1(View view) {
        Intent i1=new Intent(this,QPSem1.class);
        startActivity(i1);
    }

    public void qpsem2(View view) {
        Intent i2=new Intent(this,QPSem2.class);
        startActivity(i2);
    }

    public void qpsem3(View view) {
        Intent i3=new Intent(this,QPSem3.class);
        startActivity(i3);
    }

    public void qpsem4(View view) {
        Intent i4=new Intent(this,QPSem4.class);
        startActivity(i4);
    }

    public void qpsem5(View view) {
        Intent i5=new Intent(this,QPSem5.class);
        startActivity(i5);
    }

    public void qpsem6(View view) {
        Intent i6=new Intent(this,QPSem6.class);
        startActivity(i6);
    }
}