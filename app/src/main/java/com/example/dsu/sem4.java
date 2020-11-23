package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sem4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem4);
    }

    public void doSomething(View view) {
        Intent i1=new Intent(this,StudyMaterial.class);
        startActivity(i1);
    }

    public void ooad(View view) {
        Intent i1=new Intent(this,ooad.class);
        startActivity(i1);

    }

    public void dbms(View view) {
        Intent i1=new Intent(this,dbms.class);
        startActivity(i1);
    }

    public void awp(View view) {
        Intent i1=new Intent(this,awp.class);
        startActivity(i1);
    }

    public void st(View view) {
        Intent i1=new Intent(this,st.class);
        startActivity(i1);
    }

    public void cgm(View view) {
        Intent i1=new Intent(this,cgm.class);
        startActivity(i1);
    }

    public void iwa(View view) {
        Intent i1=new Intent(this,iwa.class);
        startActivity(i1);
    }
}