package com.example.semana7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnAceptar;
    private EditText etNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAceptar = findViewById(R.id.BtnAceptar);
        etNombre = findViewById(R.id.StNombre);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado = etNombre.getText().toString();
                Intent cambiarPantalla = new Intent(MainActivity.this, MainActivity2.class);
                cambiarPantalla.putExtra("Datos",resultado);
                startActivity(cambiarPantalla);
            }
        });
    }
}