package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.nio.file.Files;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view){

        String[] valores={
                "Seja feliz",
                "Não desista",
                "Você é demais",
                "Incrivel isso que penso quando vejo vc",
                "mais um dia para tentar, se errar, mais um dia aprendeu"
        };

        int randomico= new Random().nextInt(5);

        TextView texto = findViewById(R.id.TextID1);
        texto.setText(valores[randomico]);

    }


}
