package com.hfad.monitorapet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FormaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forma);
    }

    public void onQrCode(View view) {
        Intent i = new Intent(this, QrCodeActivity.class);
        startActivity(i);
    }

    public void onCpf(View view) {
        Intent i = new Intent(this, PesquisaCpfActivity.class);
        startActivity(i);
    }
}
