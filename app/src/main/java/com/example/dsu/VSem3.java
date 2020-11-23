package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VSem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_sem3);
    }

    public void vse(View view) {
        Intent i1=new Intent(this,vse.class);
        startActivity(i1);

    }

    public void vcn(View view) {
        Intent i1=new Intent(this,vcn.class);
        startActivity(i1);
    }

    public void vnm(View view) {
        Intent i1=new Intent(this,vnm.class);
        startActivity(i1);
    }

    public void vada(View view) {
        Intent i1=new Intent(this,vada.class);
        startActivity(i1);
    }

    public void vos(View view) {
        Intent i1=new Intent(this,vos.class);
        startActivity(i1);
    }
}