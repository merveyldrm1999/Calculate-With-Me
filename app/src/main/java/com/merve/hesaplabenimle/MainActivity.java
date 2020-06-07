package com.merve.hesaplabenimle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button buttonTopla;
    private Button buttonBol;
    private Button buttonCarp;
    private Button buttonCikar;
    private EditText sayi1;
    private EditText sayi2;
    private Button buttonOyun;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTopla=findViewById(R.id.buttonTopla);
        buttonBol=findViewById(R.id.buttonBol);
        buttonCarp=findViewById(R.id.buttonCarp);
        buttonCikar=findViewById(R.id.buttonCikar);
        sayi1=findViewById(R.id.sayi1);
        sayi2=findViewById(R.id.sayi2);
        buttonOyun=findViewById(R.id.buttonOyun);


        buttonTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayiA = Integer.parseInt(sayi1.getText().toString());
                int sayiB = Integer.parseInt(sayi2.getText().toString());
                Toast.makeText(MainActivity.this, "Sonuç : "+(sayiA+sayiB),Toast.LENGTH_LONG).show();
            }
        });

        buttonCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayiA = Integer.parseInt(sayi1.getText().toString());
                int sayiB = Integer.parseInt(sayi2.getText().toString());
                Toast.makeText(MainActivity.this, "Sonuç : "+(sayiA-sayiB),Toast.LENGTH_LONG).show();
            }
        });

        buttonCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayiA = Integer.parseInt(sayi1.getText().toString());
                int sayiB = Integer.parseInt(sayi2.getText().toString());
                Toast.makeText(MainActivity.this, "Sonuç : "+(sayiA*sayiB),Toast.LENGTH_LONG).show();
            }
        });

        buttonBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayiA = Integer.parseInt(sayi1.getText().toString());
                int sayiB = Integer.parseInt(sayi2.getText().toString());
                float sonucBol = (float)sayiA/(float)sayiB;
                Toast.makeText(MainActivity.this, "Sonuç : "+sonucBol,Toast.LENGTH_LONG).show();
            }
        });

        buttonOyun.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent yeniSayfa = new Intent(MainActivity.this,MainActivityOyun.class);
                startActivity(yeniSayfa);
            }
        });

    }
}
