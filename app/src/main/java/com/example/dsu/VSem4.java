package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class VSem4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_sem4);
    }

    public void vooad(View view) {
        Intent i1=new Intent(this,vooad.class);
        startActivity(i1);
    }

    public void vdbms(View view) {
        Intent i1=new Intent(this,vdbms.class);
        startActivity(i1);
    }

    public void vawp(View view) {
        Intent i1=new Intent(this,vawp.class);
        startActivity(i1);
    }

    public void vst(View view) {
        Intent i1=new Intent(this,vst.class);
        startActivity(i1);
    }

    public void CGM(View view) {
        Intent i1=new Intent(this,vcgm.class);
        startActivity(i1);
    }
}