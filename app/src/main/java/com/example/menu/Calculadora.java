package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity implements View.OnClickListener {

    EditText num1, num2;
    Button suma, resta, mult, divi;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        suma = (Button) findViewById(R.id.sumar);
        resta = (Button) findViewById(R.id.restar);
        mult = (Button) findViewById(R.id.multiplicar);
        divi = (Button) findViewById(R.id.dividir);

        resultado = (TextView) findViewById(R.id.resultado);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        divi.setOnClickListener(this);
    }

    //METODO PARA EL BOTON VOLVER
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }


    @Override
    public void onClick(View v) {

            String n1 = num1.getText().toString();
            String n2 = num2.getText().toString();

            int one = Integer.parseInt(n1);
            int two = Integer.parseInt(n2);

            int rta=0;

        switch (v.getId()){
            case R.id.sumar:
                    rta=one+two;
                    break;
            case R.id.restar:
                    rta=one-two;
                    break;
            case R.id.multiplicar:
                    rta=one*two;
                    break;
            case R.id.dividir:
                    rta=one/two;
                    break;

            }

        resultado.setText(""+rta);
    }
}