package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Raiz extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raiz);

    }

    //METODO PARA EL BOTON VOLVER
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }

    //METODO PARA SACAR LA RAIZ
    public void raiz (View view){

            EditText digitar = (EditText)findViewById(R.id.digitar);
            EditText resultado = (EditText)findViewById(R.id.resultado);

            double n1 = Integer.parseInt(digitar.getText().toString());

            double result = Math.sqrt(n1);
            resultado.setText("El resultado: "+result);
    }

}







