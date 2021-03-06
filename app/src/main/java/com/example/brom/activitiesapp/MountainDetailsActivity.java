package com.example.brom.activitiesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MountainDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mountaindetails);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String MName = intent.getStringExtra("MountainName");
        String MLocation = intent.getStringExtra("MountainLocation");
        String MHeight = intent.getStringExtra("MountainHeight");

        TextView textViewName = (TextView)findViewById(R.id.text_MountainName);
        TextView textViewLocation = (TextView)findViewById(R.id.text_MountainLocation);
        TextView textViewHeight = (TextView)findViewById(R.id.text_MountainHeight);
        textViewName.setText(MName);
        textViewLocation.setText(MLocation);
        textViewHeight.setText(MHeight);

        //Toast.makeText(getApplicationContext(), MName+" "+MLocation+" "+MHeight , Toast.LENGTH_LONG).show();

        //FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
         //   @Override
         //   public void onClick(View view) {
        //        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        //                .setAction("Action", null).show();
        //    }
        //});
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
