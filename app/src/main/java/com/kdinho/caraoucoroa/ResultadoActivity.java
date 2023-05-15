package com.kdinho.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private ImageButton imageButtonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        imageButtonVoltar = findViewById(R.id.imageButtonVoltar);

        Bundle dados = getIntent().getExtras();

        int numero = dados.getInt("numero");

        if (numero == 0){
            imageResultado.setImageResource(R.drawable.moeda_cara);


        }else {
            imageResultado.setImageResource(R.drawable.moeda_coroa);

        }
        imageButtonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }
}