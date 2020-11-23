package com.example.dsu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StudyMaterial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);
    }

    public void notes(View view) {
        Intent i1=new Intent(this,MainActivity3.class);
        startActivity(i1);
    }

    public void QuestionPaper(View view) {
        Intent i2=new Intent(this,QPSem.class);
        startActivity(i2);
    }

    public void videos(View view) {
        Intent i3=new Intent(this,VIDSem.class);
        startActivity(i3);
    }

    public void links(View view) {
        Intent i4=new Intent(this,LINKS.class);
        startActivity(i4);
    }
}