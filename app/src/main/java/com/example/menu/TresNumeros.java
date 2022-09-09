package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TresNumeros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres_numeros);
    }

    //METODO PARA EL BOTON VOLVER
    public void Volver(View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }

    //METODO PARA HALLAR EL NUMERO MAYOR
    public void Mayor (View view){
        TextView num1 = (EditText)findViewById(R.id.numero1);
        TextView num2 = (EditText)findViewById(R.id.numero2);
        TextView num3 = (EditText)findViewById(R.id.numero3);

        TextView result = (EditText)findViewById(R.id.resultado);

        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int n3 = Integer.parseInt(num3.getText().toString());

        int resultado = 0;

        if (n1 == n2 ){
            result.setText("Hay dos numero IGUALES");
        } if(n1==n3){
            result.setText("HAY DOS NUMEROS IGAULES");
        } if (n2==n3) {
            result.setText("HAY DOS NUMEROS IGUEALES");
        }else{
            if (n1>n2){
                if (n1>n3){
                    result.setText("El Mayor es: "+n1);
                    // Toast.makeText(this, "El Mayor es: "+n1, Toast.LENGTH_SHORT).show();
                } else{
                    result.setText("El Mayor es: "+n3);
                    //  Toast.makeText(this, "El Mayor es: "+n3, Toast.LENGTH_SHORT).show();
                }
            }else if(n2>n3){
                result.setText("El Mayor es: "+n2);
                // Toast.makeText(this, "El Mayor es: "+n2, Toast.LENGTH_SHORT).show();
            }else{
                result.setText("El Mayor es: "+n3);
                //  Toast.makeText(this, "El Mayor es: "+n3, Toast.LENGTH_SHORT).show();
            }
        }


    }
}