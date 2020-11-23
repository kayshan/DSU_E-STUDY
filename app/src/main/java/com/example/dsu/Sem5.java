package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Sem5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem5);
    }


    public void bda(View view) {
        Intent i1=new Intent(this,bda.class);
        startActivity(i1);
    }

    public void ins(View view) {
        Intent i1=new Intent(this,ins.class);
        startActivity(i1);
    }

    public void mp(View view) {
        Intent i1=new Intent(this,mp.class);
        startActivity(i1);
    }
}