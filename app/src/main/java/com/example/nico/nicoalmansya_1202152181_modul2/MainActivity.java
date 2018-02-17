package com.example.nico.nicoalmansya_1202152181_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pesan(View view) {
        if (((RadioButton)findViewById(R.id.dineIn)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            startActivity(intent); //untuk memulai activity baru pada class Dine In, jika pada radio button dineIn yang dipilih
        }else if (((RadioButton)findViewById(R.id.takeAway)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            startActivity(intent); //untuk memulai activity baru pada class Take away, jika pada radio button takeAway yang dipilih
        }else{
            Toast.makeText(this,"Tentukan pilihan terlebih dahulu",Toast.LENGTH_SHORT).show(); // memunculkan toast jika belum memilih radio button
        }
    }
}
