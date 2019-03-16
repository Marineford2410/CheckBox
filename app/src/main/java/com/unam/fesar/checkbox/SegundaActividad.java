package com.unam.fesar.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SegundaActividad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segunda_actividad);

        Bundle costal = getIntent().getExtras();

        String nombre = costal.getString("nombre");
        Log.e("Nombre recibido", nombre);
    }
}
