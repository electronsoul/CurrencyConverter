package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{
    public void get_amt(View view)
    {
        EditText dollars = (EditText)findViewById(R.id.dollars);
        EditText rupees = (EditText)findViewById(R.id.rupees);
        String s = dollars.getText().toString();
        if (s.length() != 0)
        {
            int i = Integer.parseInt(s);
            i *= 75;
            String amt = Integer.toString(i);
            rupees.setText(amt);
        }
        else
        {
            rupees.setText("0");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
