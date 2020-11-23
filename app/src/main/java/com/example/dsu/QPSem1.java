package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QPSem1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_p_sem1);
    }

    public void qpm1(View view) {
        Intent i1=new Intent(this,qp_m1.class);
        startActivity(i1);
    }

    public void qpfop(View view) {
        Intent i2=new Intent(this,qpfop.class);
        startActivity(i2);
    }

    public void qpco1(View view) {
        Intent i3=new Intent(this,qpco.class);
        startActivity(i3);
    }

    public void qpwp(View view) {
        Intent i4=new Intent(this,qpwp.class);
        startActivity(i4);
    }

    public void qpafm(View view) {
        Intent i5=new Intent(this,qpafm.class);
        startActivity(i5);
    }

    public void qpen(View view) {
        Intent i6=new Intent(this,qpen1.class);
        startActivity(i6);
    }
}