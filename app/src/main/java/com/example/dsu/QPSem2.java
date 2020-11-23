package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QPSem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_p_sem2);
    }

    public void qppop(View view) {
            Intent i2=new Intent(this,qppop.class);
            startActivity(i2);
    }

    public void qpm2(View view) {
        Intent i3=new Intent(this,qpm2.class);
        startActivity(i3);
    }

    public void qpco2(View view) {
        Intent i4=new Intent(this,qpco2.class);
        startActivity(i4);
    }

    public void qpen2(View view) {
        Intent i5=new Intent(this,qpen2.class);
        startActivity(i5);
    }
}