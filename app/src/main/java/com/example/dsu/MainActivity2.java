package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void StudyMaterial(View view) {
        Intent i2=new Intent(this,StudyMaterial.class);
        startActivity(i2);
    }

    public void callender(View view) {
        Intent i3=new Intent(MainActivity2.this,Callender.class);
        startActivity(i3);
    }

    public void syllybus(View view) {
        Intent i4=new Intent(this,Syllubus.class);
        startActivity(i4);
    }
}