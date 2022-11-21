package com.example.comp2000_software_engineering_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class CalendarPage extends AppCompatActivity implements View.OnClickListener {

    ImageButton RTN;
    Button RequestBTN;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_page);
        RTN = findViewById(R.id.RtnBtn);
        RTN.setOnClickListener(this);
        RequestBTN = findViewById(R.id.RqBTN);
        RequestBTN.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        if (v==RTN)
        {
            Intent Return = new Intent(CalendarPage.this, Employee_Home.class);
            startActivity(Return);
        }
        else if (v==RequestBTN)
        {
            Toast.makeText(getApplicationContext(), "Your request has been succesfully submited", Toast.LENGTH_LONG).show();
        }

    }
}