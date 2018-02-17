package com.example.nico.nicoalmansya_1202152181_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Toast.makeText(SplashScreen.this,"Nico Almansya - 1202152181",Toast.LENGTH_LONG).show(); // menampilkan toast Nama - NIM
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 3000L); //lama splash screen 3000 L = 3 detik
    }
}
