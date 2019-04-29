package com.hfad.monitorapet;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class visitanteP extends AppCompatActivity {
    ListView visitanteP;
    private String[] ListaN = {"Cronograma", "Mapa", "Regulamento"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitante_p);
        visitanteP = (ListView) findViewById(R.id.list2);
        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, ListaN);
        visitanteP.setAdapter(meuAdaptador);

        visitanteP.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent intent = new Intent(getApplicationContext(), visitanteATV.class);
                    startActivity(intent);
                }
                if(position == 1) {
                    Intent intent = new Intent(getApplicationContext(), visitanteMAP.class);
                    startActivity(intent);
                }
                if(position == 2) {
                    Intent intent = new Intent(getApplicationContext(), visitanteREG.class);
                    startActivity(intent);
                }
            }
        });
    }
}
