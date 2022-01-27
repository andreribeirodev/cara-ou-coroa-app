package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MoedaActivity extends AppCompatActivity {

    private ImageView btnImgVoltar;
    private ImageView imgResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moeda);
        btnImgVoltar = (ImageView) findViewById(R.id.btnImgVoltar);
        imgResultado = (ImageView) findViewById(R.id.imgResultado);

        Bundle bundle = getIntent().getExtras();
        int numero = bundle.getInt("numero");

        if (numero == 0) {
            imgResultado.setImageResource(R.drawable.moeda_cara);
        } else {
            imgResultado.setImageResource(R.drawable.moeda_coroa);
        }

        btnImgVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }


        });
    }

}