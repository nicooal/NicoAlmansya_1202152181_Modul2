package com.example.nico.nicoalmansya_1202152181_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    private final LinkedList<String> makanan = new LinkedList<>(); //Membuat list makanan berupa string
    private final LinkedList<Integer> harga = new LinkedList<>(); //Membuat list harga berupa integer
    private final LinkedList<Integer> foto = new LinkedList<>(); //Membuat list foto berupa integer
    private final LinkedList<String> komposisi = new LinkedList<>(); //Membuat list komposisi berupa string
    private int mCount = 0;

    private RecyclerView mRecyclerView; //Membuat baris item list
    private MenuAdapter mAdapter; //Membuat adapter penghubung

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Data(); //isi data pada RecyclerView
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview); //Membuat adapter dan menampilkan data
        mAdapter = new MenuAdapter(this, makanan, harga, foto, komposisi); // Menhubungkan adapter dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter); // Memberi RecyclerView layout default
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void Data() { //berisi data makanan
        for (int i = 0; i < 1; i++) { //isi list menu
            makanan.add("Steak");
            makanan.add("Ribs");
            makanan.add("French Fries");
            makanan.add("Latte");
            makanan.add("Black Coffee");
            makanan.add("Milkshake");;

            harga.add(125000); //list harga
            harga.add(120000);
            harga.add(40000);
            harga.add(35000);
            harga.add(30000);
            harga.add(30000);

            foto.add(R.drawable.steak); //isi list gambar yang akan ditampilkan
            foto.add(R.drawable.ribs);
            foto.add(R.drawable.kentang);
            foto.add(R.drawable.latte);
            foto.add(R.drawable.kopitem);
            foto.add(R.drawable.milkshake);

            komposisi.add("Daging sirloin/tenderloin pilihan"); // isi list komposisi
            komposisi.add("Daging iga pilihan");
            komposisi.add("Kentang organik pilihan");
            komposisi.add("Biji kopi pilihan dengan campuran susu");
            komposisi.add("Biji kopi hitam pilihan");
            komposisi.add("Susu sapi pilihan ditambah dengan kirim kocok");
        }
    }
}
