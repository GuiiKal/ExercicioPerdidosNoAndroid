package com.example.exercicioperdidosnoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewData, textViewSinopse;
    private Spinner spinnerCine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referencias
        textViewData = findViewById(R.id.textViewData);
        textViewSinopse = findViewById(R.id.textViewSinopse);
        spinnerCine = findViewById(R.id.spinnerCine);

        //criando um evento do spinner
        AdapterView.OnItemSelectedListener itemSelectedListener = new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String cine = ((TextView)view).getText().toString(); //pega o nome do cinema selecionado
                if(cine.equals("Cinemark")) textViewData.setText("Data: 20/06/2021"); //se o cinema selecionado for esse, coloca essa data para a estreia o filme
                if(cine.equals("CineSenai")) textViewData.setText("Data: 10/06/2021");
                if(cine.equals("Cinépolis")) textViewData.setText("Data: 15/06/2021");
                if(cine.equals("Moviecom Cinemas")) textViewData.setText("Data: 18/06/2021");
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        };
            spinnerCine.setOnItemSelectedListener(itemSelectedListener); //para o spinner funcionar com os comandos criados a cima

    }

    public void onMostrarSinopse(View v){
        textViewSinopse.setText("Aluno do Senai salva a escola com os seus super poderes de Android!! Alienigenas se matriculando" +
                "no curso técnico de Desenvolvimento de Sistemas");

    }

}