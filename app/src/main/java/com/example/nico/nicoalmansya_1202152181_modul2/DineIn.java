package com.example.nico.nicoalmansya_1202152181_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity implements
        AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        Spinner spinner = (Spinner) findViewById(R.id.spinner_table); //Membuat spinner


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.tables_array, android.R.layout.simple_spinner_item);
        //Membuat ArrayAdapter menggunakan string array dan default spinner layout.

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); //Menentukan layout ketika list pilihan dimunculkan

        if (spinner != null) {
            spinner.setAdapter(adapter); //Menggunakan adapter pada spinner.
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void pesan(View view) {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent); //untuk memulai activity baru pada class Menu, setelah klik button pilih pesanan
    }
}
