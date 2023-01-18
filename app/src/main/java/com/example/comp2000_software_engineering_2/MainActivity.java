package com.example.comp2000_software_engineering_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    ImageButton LgnButton;
    EditText username, pw;
    String usrSTR, pwSTR;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LgnButton = findViewById(R.id.Login_btn);
        LgnButton.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        username = findViewById(R.id.Username);
        usrSTR = username.getText().toString();
        pw = findViewById(R.id.Password);
        pwSTR = pw.getText().toString();

        if (v==LgnButton)
        {
            if ((usrSTR.equals("Employee")) && (pwSTR.equals("123")))
            {
                Intent Employee_Home = new Intent(MainActivity.this, Employee_Home.class);
                startActivity(Employee_Home);
            }
            else
            {
                Toast.makeText(getApplicationContext(), "Error:Username and or password is incorrect", Toast.LENGTH_LONG).show();
            }
        }
    }
}