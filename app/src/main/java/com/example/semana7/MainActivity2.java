package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String variable = getIntent().getStringExtra("Datos");
        TextView variable1 = findViewById(R.id.mensaje);
        variable1.setText("NombreFoto" + variable);
    }
}