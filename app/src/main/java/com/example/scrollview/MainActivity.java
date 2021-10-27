package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //poner icono en actionbar
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }
    public void Seleccion(View view){
        switch(view.getId()){
            case R.id.fresas:
                Toast.makeText(this,"Estas son las fresas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.platanos:
                Toast.makeText(this,"Estos son las platanos",Toast.LENGTH_SHORT).show();
                break;
            case R.id.manzanas:
                Toast.makeText(this,"Estas son las manzanas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.mangos:
                Toast.makeText(this,"Estas son las mangos",Toast.LENGTH_SHORT).show();
                break;
            case R.id.sandia:
                Toast.makeText(this,"Esto es una sandía",Toast.LENGTH_SHORT).show();
                break;
            case R.id.melon:
                Toast.makeText(this,"Esto es un melón loco, echale vino",Toast.LENGTH_SHORT).show();
                break;
            case R.id.kiwis:
                Toast.makeText(this,"Estos son kiwis",Toast.LENGTH_SHORT).show();
                break;
            case R.id.uvas:
                Toast.makeText(this,"Estas son las uvas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.frambuesas:
                Toast.makeText(this,"Estas son las frambuesas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.cerezas:
                Toast.makeText(this,"Estas son las cerezas",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pera:
                Toast.makeText(this,"Andai con la pera longi",Toast.LENGTH_SHORT).show();
                break;
            case R.id.naranjas:
                Toast.makeText(this,"Estas son las naranjas loco",Toast.LENGTH_SHORT).show();
                break;
            case R.id.pina:
                Toast.makeText(this,"Esta es una pina chuchetumare",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}