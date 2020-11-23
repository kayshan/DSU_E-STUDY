package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    public void doSomething(View view) {
        Intent i1= new Intent(this,MainActivity5.class);
        startActivity(i1);
    }

    public void wp(View view) {
        Intent i2= new Intent(this,WP.class);
        startActivity(i2);
    }

    public void eng1(View view) {
        Intent i2=new Intent(this,eng1.class);
        startActivity(i2);
    }

    public void fop(View view) {
        Intent i3=new Intent(this,fop.class);
        startActivity(i3);
    }

    public void afm(View view) {
        Intent i4=new Intent(this,afm.class);
        startActivity(i4);
    }

    public void co1(View view) {
        Intent i5=new Intent(this,co1.class);
        startActivity(i5);
    }
}