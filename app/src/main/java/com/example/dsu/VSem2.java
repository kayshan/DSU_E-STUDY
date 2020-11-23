package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VSem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_sem2);
    }

    public void vm2(View view) {
        Intent i1=new Intent(this,vm2.class);
        startActivity(i1);
    }

    public void vco2(View view) {
        Intent i1=new Intent(this,vco2.class);
        startActivity(i1);
    }

    public void ven2(View view) {
        Intent i1=new Intent(this,ven2.class);
        startActivity(i1);
    }

    public void vpop(View view) {
        Intent i1=new Intent(this,vpop.class);
        startActivity(i1);
    }
}