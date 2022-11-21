package com.example.comp2000_software_engineering_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class EditDetailsPage extends AppCompatActivity implements View.OnClickListener
{
    ImageButton RTNButton, SaveButton;
    Spinner SpinnerIUD, IUD;
    Integer IUDINT;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_details_page);

        SpinnerIUD=findViewById(R.id.InsertUpdateDelete);
        ArrayAdapter<CharSequence>adapter= ArrayAdapter.createFromResource(this, R.array.IUD, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        SpinnerIUD.setAdapter(adapter);

        RTNButton = findViewById(R.id.ReturnBUTTON);
        RTNButton.setOnClickListener(this);
        SaveButton = findViewById(R.id.SaveBTN);
        SaveButton.setOnClickListener(this);


    }

    public void onClick(View v)
    {
        SpinnerIUD=findViewById(R.id.InsertUpdateDelete);
        IUDINT = SpinnerIUD.getSelectedItemPosition();

        switch(v.getId())
        {
            case R.id.SaveBTN:
                if (IUDINT==1)
                {
                    Toast.makeText(getApplicationContext(), "Data was succsesfully Inserted", Toast.LENGTH_LONG).show();
                    Intent Return = new Intent(EditDetailsPage.this, Employee_Home.class);
                    startActivity(Return);
                }
                else if (IUDINT==2)
                {
                    Toast.makeText(getApplicationContext(), "Data was succsesfully Updated", Toast.LENGTH_LONG).show();
                    Intent Return = new Intent(EditDetailsPage.this, Employee_Home.class);
                    startActivity(Return);
                }
                else if (IUDINT==3)
                {
                    Toast.makeText(getApplicationContext(), "Data was succsesfully Deleted", Toast.LENGTH_LONG).show();
                    Intent Return = new Intent(EditDetailsPage.this, Employee_Home.class);
                    startActivity(Return);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please select one of the dropdown items", Toast.LENGTH_LONG).show();
                }
                break;


            case R.id.ReturnBUTTON:
                Intent Returnn = new Intent(EditDetailsPage.this, Employee_Home.class);
                startActivity(Returnn);


        }

    }
}