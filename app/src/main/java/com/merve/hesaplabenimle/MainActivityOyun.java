package com.merve.hesaplabenimle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivityOyun extends AppCompatActivity {
    private Button buttonTahmin;
    private EditText editTextTahminSayi;
    private Button buttonRastgele;
    int rSayi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_oyun);

        buttonTahmin=findViewById(R.id.buttonTahmin);
        editTextTahminSayi=findViewById(R.id.editTextTahminSayi);
        buttonRastgele=findViewById(R.id.buttonRastgele);

        buttonRastgele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rastgele=new Random();
                rSayi=rastgele.nextInt(100);
                Toast.makeText(getApplicationContext(),"Tuttum!",Toast.LENGTH_LONG).show();
            }
        });
        buttonTahmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sayiTahmin=Integer.parseInt(editTextTahminSayi.getText().toString());
                if(sayiTahmin>100 || sayiTahmin<0){
                    Toast.makeText(getApplicationContext(),"Sayı 0 ile 1000 arasında olmalı!", Toast.LENGTH_LONG).show();
                }else if (sayiTahmin>rSayi){
                    Toast.makeText(getApplicationContext(),"Bilemedin ! Biraz küçük at :)",Toast.LENGTH_LONG).show();
                }else if (sayiTahmin<rSayi){
                    Toast.makeText(getApplicationContext(),"Bilemedin ! Biraz yükselt :)",Toast.LENGTH_LONG).show();
                }else if (sayiTahmin==rSayi){
                    Toast.makeText(getApplicationContext(),"Güzel attın, tebrikler! Tuttuğum sayı :"+rSayi+"  :)",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Bir şeyler ters gitmiş olmalı..",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
