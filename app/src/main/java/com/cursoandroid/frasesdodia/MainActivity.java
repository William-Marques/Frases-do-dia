package com.cursoandroid.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] frases = {
                "Frase 0",
                "Frase 1",yyk//'    ,
                "Frase 2",
                "Frase 3"
        };
        int numero = new Random().nextInt(4);//0 1 2 3

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[numero] );

    }

}
