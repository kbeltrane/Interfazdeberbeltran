package com.example.interfazdeber;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText txtcedula = findViewById(R.id.tcedula);
        txtcedula.setText("");
    }

    public void btnlimpiar(View view)
    {
        EditText txtcedula = findViewById(R.id.tcedula);
        txtcedula.setText("");
        EditText txtnombre = findViewById(R.id.tnombre);
        txtnombre.setText("");
        EditText txtfecha = findViewById(R.id.editTextDate);
        txtfecha.setText("");
        EditText txtciudad = findViewById(R.id.tciudad);
        txtciudad.setText("");
        EditText txttele = findViewById(R.id.editTextPhone);
        txttele.setText("");
        EditText txtco = findViewById(R.id.tcorreo);
        txtco.setText("");

    }
    public void btnaceptar(View view)
    {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        RadioButton radioButtonFemenino = findViewById(R.id.radioButtonFemenino);
        RadioButton radioButtonMasculino = findViewById(R.id.radioButtonMasculino);
        EditText txtcedula = findViewById(R.id.tcedula);
        EditText txtnombre = findViewById(R.id.tnombre);
        EditText txtfecha = findViewById(R.id.editTextDate);
        EditText txtciudad = findViewById(R.id.tciudad);
        EditText txttele = findViewById(R.id.editTextPhone);
        EditText txtco = findViewById(R.id.tcorreo);

        String cedula = txtcedula.getText().toString();
        String nombre = txtnombre.getText().toString();
        String fecha = txtfecha.getText().toString();
        String ciudad = txtciudad.getText().toString();
        String telefono = txttele.getText().toString();
        String correo = txtco.getText().toString();

        String genero;
        if (radioButtonMasculino.isChecked())
        {
            genero = "Masculino";
        } else
        {
            genero = "Femenino";
        }

        Bundle b = new Bundle();
        b.putString("CEDULA", cedula);
        b.putString("NOMBRE", nombre);
        b.putString("FECHA", fecha);
        b.putString("CIUDAD", ciudad);
        b.putString("TELEFONO", telefono);
        b.putString("CORREO", correo);
        b.putString("GENERO", genero);

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtras(b);
        startActivity(intent);
    }

}