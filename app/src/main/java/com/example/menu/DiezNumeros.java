package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class DiezNumeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diez_numeros);
    }

    //METODO PARA EL BOTON VOLVER
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }

    //METODO PARA SACAR EL PROMEDIO
    public void Promedio(View view){

        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        EditText num3 = (EditText) findViewById(R.id.num3);
        EditText num4 = (EditText) findViewById(R.id.num4);
        EditText num5 = (EditText) findViewById(R.id.num5);
        EditText num6 = (EditText) findViewById(R.id.num60);
        EditText num7 = (EditText) findViewById(R.id.num7);
        EditText num8 = (EditText) findViewById(R.id.num8);
        EditText num9 = (EditText) findViewById(R.id.num9);
        EditText num10 = (EditText) findViewById(R.id.num10);
        EditText result = (EditText) findViewById(R.id.resultado);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int n3 = Integer.parseInt(num3.getText().toString());
        int n4 = Integer.parseInt(num4.getText().toString());
        int n5 = Integer.parseInt(num5.getText().toString());
        int n6 = Integer.parseInt(num6.getText().toString());
        int n7 = Integer.parseInt(num7.getText().toString());
        int n8 = Integer.parseInt(num8.getText().toString());
        int n9 = Integer.parseInt(num9.getText().toString());
        int n10 = Integer.parseInt(num10.getText().toString());

        int resultado = (n1+n2+n3+n4+n5+n6+n7+n8+n9+n10)/10;
        result.setText("El promedio es: "+resultado);

    }

}