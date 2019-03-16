package com.unam.fesar.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    CheckBox chkCasado;
    Button btnEnviar;
    RadioButton radioHombre;
    RadioButton radioMujer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chkCasado = (CheckBox)findViewById(R.id.chkCasado);
        btnEnviar = (Button)findViewById(R.id.btnEnviar);
        radioHombre = (RadioButton)findViewById(R.id.radioHombre);
        radioMujer = (RadioButton)findViewById(R.id.radioMujer);

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

            }
        });

    }
}
