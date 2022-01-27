package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.Serializable;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView btnImgJogar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnImgJogar = findViewById(R.id.btnImgJogar);


        btnImgJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext()
                        , MoedaActivity.class);
                int numero = new Random().nextInt(2);
                intent.putExtra("numero", numero);
                startActivity(intent);
            }
        });

    }
}