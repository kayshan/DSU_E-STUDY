package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tsem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsem2);
    }

    public void tm2(View view) {
        Intent i1=new Intent(this,tm2.class);
        startActivity(i1);
    }

    public void tco2(View view) {
        Intent i1=new Intent(this,tco2.class);
        startActivity(i1);
    }

    public void ten2(View view) {
        Intent i1=new Intent(this,ten2.class);
        startActivity(i1);
    }

    public void tpop(View view) {
        Intent i1=new Intent(this,tpop.class);
        startActivity(i1);
    }
}