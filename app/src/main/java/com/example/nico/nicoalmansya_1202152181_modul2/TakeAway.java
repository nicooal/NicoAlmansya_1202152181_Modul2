package com.example.nico.nicoalmansya_1202152181_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void pesan(View view) {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent); //untuk memulai activity baru pada class Menu, setelah klik button pilih pesanan
    }
}
