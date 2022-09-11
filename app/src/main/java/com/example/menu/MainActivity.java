package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvus = findViewById(R.id.tvuser);
        tvus.setText("Bienvenido: "+getIntent().getStringExtra("pupil"));
    }

    //METODO DEL BOTON RAIZ
    public void Raiz(View view){
        Intent raiz = new Intent(this, Raiz.class);
        startActivity(raiz);
    }

    //METODO DEL BOTON 3NUMEROS
    public void TresNum(View view){
        Intent tresNumeros = new Intent(this, TresNumeros.class);
        startActivity(tresNumeros);
    }

    //METODO DEL BOTON 10NUMEROS
    public void DiezNum(View view){
        Intent dieznum = new Intent(this, DiezNumeros.class);
        startActivity(dieznum);
    }

    //METODO DEL BOTON CALCULADORA
    public void Calcu(View view){
        Intent calcu = new Intent(this, Calculadora.class);
        startActivity(calcu);
    }
}