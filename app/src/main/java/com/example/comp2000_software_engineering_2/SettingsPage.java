package com.example.comp2000_software_engineering_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class SettingsPage extends AppCompatActivity implements View.OnClickListener
{

    ImageButton RTNButton;
    CheckBox notifications;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);

        RTNButton = findViewById(R.id.ReturnBTN);
        RTNButton.setOnClickListener(this);
        notifications = findViewById(R.id.NotificationsBOX);
        notifications.setOnClickListener(this);


    }

    public void onClick(View v)
    {
        if (v == RTNButton)
        {
            Intent Return = new Intent(SettingsPage.this, Employee_Home.class);
            startActivity(Return);
            if (notifications.isChecked())
            {
                Toast.makeText(getApplicationContext(), "Notifications are turend On", Toast.LENGTH_LONG).show();
            }
        }
    }
}