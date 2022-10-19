package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Button btnMaps, btnContact, btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMaps = findViewById(R.id.btnMaps);
        btnContact = findViewById(R.id.btnContact);
        btnEmail = findViewById(R.id.btnEmail);

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://maps.app.goo.gl/b2xA5vEk9bong4Cy7";
                Intent bukaMaps = new Intent(Intent.ACTION_VIEW);
                bukaMaps.setData(Uri.parse(url));
                startActivity(bukaMaps);
            }
        });
    }

    public void bukaTelepon(View view){
        String nomor = "088980101940";
        Intent memanggil = new Intent(Intent.ACTION_DIAL);
        memanggil.setData(Uri.fromParts("tel", nomor, null));
        startActivity(memanggil);
    }

    public void bukaEmail(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"yogapratama010503@gmail.com"});

        startActivity(Intent.createChooser(intent, "Kirim Email"));
    }

}