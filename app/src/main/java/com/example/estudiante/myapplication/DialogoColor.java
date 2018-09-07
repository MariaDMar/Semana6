package com.example.estudiante.myapplication;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class DialogoColor extends AppCompatDialogFragment {

    //Observable

    //2. Crear objeto como variable global
    MiListener listener;

    //1. Crear interface
    interface MiListener{
    void onChangeColor(String color);

    //3. Metodo de set para el listener (abajo)

    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Cambiar Color");
        builder.setMessage("Seleccione un color");
        builder.setPositiveButton("Blanco", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Blanco");
            }
        });

        builder.setNeutralButton("Negro", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Negro");
            }
        });
        builder.setNegativeButton("Azul", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                listener.onChangeColor("Azul");

            }
        });

        return builder.create();
    }

    public void setListener(MiListener listener){
        this.listener = listener;
    }
}
