package com.unam.fesar.checkbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    CheckBox chkCasado;
    Button btnEnviar;
    RadioButton radioHombre;
    RadioButton radioMujer;
    Spinner spinIdioma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkCasado = (CheckBox)findViewById(R.id.chkCasado);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);
        radioHombre = (RadioButton)findViewById(R.id.radioHombre);
        radioMujer = (RadioButton)findViewById(R.id.radioMujer);
        spinIdioma = (Spinner)findViewById(R.id.spinIdioma);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkCasado.isChecked()){
                    Log.e("CheckBox", "Eres Casado");
                }
                else {
                    Log.w("CheckBox", "Eres Feliz");
                }

                if (radioHombre.isChecked()){
                    Log.e("Genero","Masculino");
                }
                else{
                    Log.e("Genero", "Femenino");
                }

                Log.e("Idioma",spinIdioma.getSelectedItem().toString());

                Intent i = new Intent(getBaseContext(), SegundaActividad.class);

                i.putExtra("nombre", "Marco Nava");
                startActivity(i);

            }
        });
    }
}
