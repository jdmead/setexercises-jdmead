package com.example.comp2000_software_engineering_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Employee_Home extends AppCompatActivity implements View.OnClickListener{

    ImageButton FeedbackBTN, EditDetailsBTN, SettingsBTN, CalendarBTN, SignOutBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employee_home);
        FeedbackBTN = findViewById(R.id.FeedbackBTN);
        FeedbackBTN.setOnClickListener(this);
        EditDetailsBTN = findViewById(R.id.EditDetailsBTN);
        EditDetailsBTN.setOnClickListener(this);
        SettingsBTN = findViewById(R.id.SettingsBTN);
        SettingsBTN.setOnClickListener(this);
        CalendarBTN = findViewById(R.id.CalendarBTN);
        CalendarBTN.setOnClickListener(this);
        SignOutBTN = findViewById(R.id.SignOutBTN);
        SignOutBTN.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.FeedbackBTN:
                Intent FeedbackPage = new Intent(Employee_Home.this, FeedbackPage.class);
                startActivity(FeedbackPage);
                break;

            case R.id.EditDetailsBTN:
                Intent EditDetailsPage = new Intent(Employee_Home.this, EditDetailsPage.class);
                startActivity(EditDetailsPage);
                break;

            case R.id.SettingsBTN:
                Intent SettingsPage = new Intent(Employee_Home.this, SettingsPage.class);
                startActivity(SettingsPage);
                break;

            case R.id.CalendarBTN:
                Intent CalendarPage = new Intent(Employee_Home.this, CalendarPage.class);
                startActivity(CalendarPage);
                break;

            case R.id.SignOutBTN:
                Intent SignOut = new Intent(Employee_Home.this, MainActivity.class);
                startActivity(SignOut);
                break;
        }
    }
}