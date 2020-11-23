package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LINKS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_l_i_n_k_s);
    }

    public void tsem1(View view) {
        Intent i1=new Intent(this,tsem1.class);
        startActivity(i1);
    }

    public void tsem2(View view) {
        Intent i1=new Intent(this,tsem2.class);
        startActivity(i1);
    }

    public void tsem4(View view) {
        Intent i1=new Intent(this,tsem4.class);
        startActivity(i1);
    }

    public void tsem5(View view) {
        Intent i1=new Intent(this,tsem5.class);
        startActivity(i1);
    }

    public void tsem6(View view) {
        Intent i1=new Intent(this,tsem6.class);
        startActivity(i1);
    }

    public void tsem3(View view) {
        Intent i1=new Intent(this,tsem3.class);
        startActivity(i1);
    }
}