package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Buena práctica
        * Separar la capa de presentación y la capa de funcionalidad
        * XML es unicamente para definir la presentación
        * Java es para definir el funcionamiento
        * */

        //Se obtiene el elemento de la vista, en este caso el boton
        btn = (Button) findViewById(R.id.btnBueno);

        /*A dicho boton se le asigna la funcionalidad haciendo uso de los listeners
        * En este caso el escucha de click, existen muchos otros tipos de eventos
        * setOnClickListener recibe como parametro un objeto anonimo (No es obligatorio que sea anonimo)
        * que implementa la interfaz OnClickListener que define el metodo onClick
        * En este metodo se maneja las instrucciones que se quieren ejecutar cuando al boton se le hace click
        * */
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "Buena práctica!", Snackbar.LENGTH_LONG).show();
            }
        });
    }

    /*
    * Mala práctica
    * Mezclar el XML con nombres de funciones en Java
    * Trabajar de esta manera provoca una alta acoplacion, lo cual es necesario evitar en todas las
    * formas de desarrollo de software
    * */
    public void showMessage(View view){
        Snackbar.make(view, "Mala práctica", Snackbar.LENGTH_LONG).show();
    }
}