package com.example.parking;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    void goToLocationView(View View){
        Intent myIntent = new Intent(this,locationActivity.class);
        startActivity(myIntent);
    }

    void goToBasicMapView(View view){
        Intent myIntent2 = new Intent(this,MainActivity.class);
        startActivity(myIntent2);
    }

}

