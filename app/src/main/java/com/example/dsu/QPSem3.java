package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QPSem3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q_p_sem3);
    }

    public void qpse(View view) {
        Intent i1=new Intent(this,qpse.class);
        startActivity(i1);
    }

    public void qphci(View view) {
        Intent i1=new Intent(this,qphci.class);
        startActivity(i1);
    }

    public void qpcn(View view) {
        Intent i1=new Intent(this,qpcn.class);
        startActivity(i1);
    }

    public void qpnm(View view) {
        Intent i1=new Intent(this,qpnm.class);
        startActivity(i1);
    }

    public void qpada(View view) {
        Intent i1=new Intent(this,qpada.class);
        startActivity(i1);
    }

    public void qpos(View view) {
        Intent i1=new Intent(this,qpos.class);
        startActivity(i1);
    }
}