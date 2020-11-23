package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VSem5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_sem5);
    }

    public void vbda(View view) {
        Intent i1=new Intent(this,vbda.class);
        startActivity(i1);
    }

    public void vins(View view) {
        Intent i1=new Intent(this,vins.class);
        startActivity(i1);
    }

    public void vmp(View view) {
        Intent i1=new Intent(this,vmp.class);
        startActivity(i1);
    }
}