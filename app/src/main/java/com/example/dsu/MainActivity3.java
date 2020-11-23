package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void doSomething(View view) {
        Intent i1=new Intent(this,MainActivity4.class);
        startActivity(i1);

    }

    public void sem2(View view) {
        Intent i2=new Intent(this,Sem2.class);
        startActivity(i2);
    }

    public void sem3(View view) {
        Intent i3=new Intent(this,Sem3.class);
        startActivity(i3);
    }

    public void sem4(View view) {
        Intent i4=new Intent(this,sem4.class);
        startActivity(i4);
    }

    public void sem5(View view) {
        Intent i5=new Intent(this,Sem5.class);
        startActivity(i5);
    }

    public void sem6(View view) {
        Intent i6=new Intent(this,Sem6.class);
        startActivity(i6);
    }
}