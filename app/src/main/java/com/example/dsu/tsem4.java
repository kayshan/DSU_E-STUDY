package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class tsem4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tsem4);
    }

    public void tcgm(View view) {
        Intent i1=new Intent(this,tcgm.class);
        startActivity(i1);
    }

    public void tooad(View view) {
        Intent i1=new Intent(this,tooad.class);
        startActivity(i1);
    }

    public void tdbms(View view) {
        Intent i1=new Intent(this,tdbms.class);
        startActivity(i1);
    }

    public void tawp(View view) {
        Intent i1=new Intent(this,tawp.class);
        startActivity(i1);
    }

    public void tst(View view) {
        Intent i1=new Intent(this,tst.class);
        startActivity(i1);
    }
}