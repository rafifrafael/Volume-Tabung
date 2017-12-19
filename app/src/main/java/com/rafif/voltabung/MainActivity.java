package com.rafif.voltabung;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText input_jari, input_tinggi;
    TextView hasil;
    Button hitung;

    int phi = 22/7;
    double jari;
    double tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input_jari = (EditText)findViewById(R.id.input_jari);
        input_tinggi = (EditText)findViewById(R.id.input_tinggi);
        hasil= (TextView)findViewById(R.id.hasil);
        hitung = (Button)findViewById(R.id.hitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                volume();
            }
        });
    }

    public void volume() {
        if (input_jari.getText().toString().isEmpty())
        {
            Toast.makeText(this, "TIDAK BOLEH KOSONG SAYANG!", Toast.LENGTH_SHORT).show();
        }
        if(input_tinggi.getText().toString().isEmpty())
        {
            Toast.makeText(this, "TIDAK BOLEH KOSONG SAYANG!", Toast.LENGTH_SHORT).show();
        }
        try
        {
            jari = Double.parseDouble(input_jari.getText().toString());
        }catch (Exception e){}
        try
        {
            tinggi = Double.parseDouble(input_tinggi.getText().toString());
        }catch (Exception e){}

        double result = phi*(jari*jari*tinggi);
        hasil.setText(" Volume = "+String.valueOf(result));

    }
}
