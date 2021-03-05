package com.example.appgasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Calcular(View view) {
        EditText alcool = findViewById(R.id.editTextNumberDecimal);
        EditText gasolina = findViewById(R.id.editTextNumberDecimal2);

        TextView result = findViewById(R.id.resultado);

        if(Float.parseFloat(alcool.getText().toString()) <= Float.parseFloat(gasolina.getText().toString())*0.7f)
        {
            result.setText("Álcool vale mais a pena.");
        }
        else  {
            result.setText("Gasolina vale mais a pena.");
        }
    }
}