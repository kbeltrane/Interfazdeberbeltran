package com.example.interfazdeber;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView mensaje = findViewById(R.id.idtext);
        Bundle bundle = getIntent().getExtras();

        String cedula = bundle.getString("CEDULA");
        String nombre = bundle.getString("NOMBRE");
        String fecha = bundle.getString("FECHA");
        String ciudad = bundle.getString("CIUDAD");
        String telefono = bundle.getString("TELEFONO");
        String correo = bundle.getString("CORREO");
        String genero = bundle.getString("GENERO");

        String texto = cedula + "\n" + nombre + "\n" + fecha + "\n" + ciudad + "\n" + telefono + "\n" + correo + "\n" + genero;
        mensaje.setText(texto);
    }
}