package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QPSem5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_p_sem5);
    }

    public void qpbda(View view) {
        Intent i2=new Intent(this,qpbda.class);
        startActivity(i2);
    }

    public void qpins(View view) {
        Intent i2=new Intent(this,qpins.class);
        startActivity(i2);
    }

    public void qpmp(View view) {
        Intent i2=new Intent(this,qpmp.class);
        startActivity(i2);
    }
}