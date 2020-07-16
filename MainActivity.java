package com.example.chironscalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button num_1,num_2,num_3,num_4,num_5,num_6,num_7,num_8,num_9,num_0;
    Button AC;
    Button PLUS_MINUS,modulo,divide,multiple,minus,plus,equal_to,decimal;
    EditText input;
    TextView Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();



    }
    public void findViewById()
    {
        num_1=findViewById(R.id.number_1);
        num_2=findViewById(R.id.number_2);
        num_3=findViewById(R.id.number_3);
        num_4=findViewById(R.id.number_4);
        num_5=findViewById(R.id.number_5);
        num_6=findViewById(R.id.number_6);
        num_7=findViewById(R.id.number_7);
        num_8=findViewById(R.id.number_8);
        num_9=findViewById(R.id.number_9);
        num_0=findViewById(R.id.number_0);
        AC=findViewById(R.id.AC);
        PLUS_MINUS=findViewById(R.id.addorsub);
        modulo=findViewById(R.id.perceentage);
        divide=findViewById(R.id.division);
        multiple=findViewById(R.id.multiplie);
        minus=findViewById(R.id.minus);
        plus=findViewById(R.id.add);
        equal_to=findViewById(R.id.equal);
        decimal=findViewById(R.id.decimal);
        Result=findViewById(R.id.Output);
        input=findViewById(R.id.data);
    }
}