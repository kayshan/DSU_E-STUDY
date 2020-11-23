package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VSem1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_sem1);
    }

    public void vm1(View view) {
        Intent i1=new Intent(this,vm1.class);
        startActivity(i1);
    }

    public void vfop(View view) {
        Intent i1=new Intent(this,vfop.class);
        startActivity(i1);
    }

    public void vwp(View view) {
        Intent i1=new Intent(this,vwp.class);
        startActivity(i1);
    }

    public void vco1(View view) {
        Intent i1=new Intent(this,vco.class);
        startActivity(i1);
    }

    public void veng1(View view) {
        Intent i1=new Intent(this,veng1.class);
        startActivity(i1);
    }

    public void vafm(View view) {
        Intent i1=new Intent(this,vafm.class);
        startActivity(i1);
    }
}