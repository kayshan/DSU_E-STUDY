package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QPSem4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_p_sem4);
    }

    public void qpooad(View view) {
        Intent i1=new Intent(this,qpooad.class);
        startActivity(i1);
    }

    public void qpdbms(View view) {
        Intent i1=new Intent(this,qpdbms.class);
        startActivity(i1);
    }

    public void qpawp(View view) {
        Intent i1=new Intent(this,qpawp.class);
        startActivity(i1);
    }

    public void qpst(View view) {
        Intent i1=new Intent(this,qpst.class);
        startActivity(i1);
    }

    public void qpcgm(View view) {
        Intent i1=new Intent(this,qpcgm.class);
        startActivity(i1);
    }
}