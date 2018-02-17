package com.example.nico.nicoalmansya_1202152181_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenu extends AppCompatActivity {

    TextView tv_makanan, tv_harga, tv_komposisi;
    ImageView iv_foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        Intent intent = getIntent();
        String makanan = intent.getStringExtra("makanan");
        Integer harga = intent.getIntExtra("harga",0);
        Integer foto = intent.getIntExtra("foto",0);
        String komposisi = intent.getStringExtra("komposisi");

        Log.d("getIntExtra", ""+harga+foto+komposisi);

        tv_makanan = (TextView)findViewById(R.id.tv_detailMakanan);
        tv_harga = (TextView)findViewById(R.id.tv_detailHarga);
        iv_foto = (ImageView)findViewById(R.id.iv_detailFoto);
        tv_komposisi = (TextView)findViewById(R.id.tv_detailKomposisi);

        tv_makanan.setText(makanan);
        tv_harga.setText("Rp. "+harga);
        iv_foto.setImageResource(foto);
        tv_komposisi.setText(komposisi);
    }
}
