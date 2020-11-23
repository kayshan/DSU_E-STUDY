package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tsem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsem3);
    }

    public void thci(View view) {
        Intent i1=new Intent(this,thci.class);
        startActivity(i1);
    }

    public void tse(View view) {
        Intent i1=new Intent(this,tse.class);
        startActivity(i1);
    }

    public void tcn(View view) {
        Intent i1=new Intent(this,tcn.class);
        startActivity(i1);
    }

    public void tnm(View view) {
        Intent i1=new Intent(this,tnm.class);
        startActivity(i1);
    }

    public void tada(View view) {
        Intent i1=new Intent(this,tada.class);
        startActivity(i1);
    }

    public void tos(View view) {
        Intent i1=new Intent(this,tos.class);
        startActivity(i1);
    }
}