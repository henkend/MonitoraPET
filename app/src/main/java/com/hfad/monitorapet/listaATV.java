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

import java.text.Normalizer;

public class listaATV extends AppCompatActivity {
    ListView listaATV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_p);
        listaATV = (ListView) findViewById(R.id.list1);
        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, Monitoria.getAtvItens());
        listaATV.setAdapter(meuAdaptador);

        listaATV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Monitoria.setAtividade(position);
                Intent i = new Intent(getApplicationContext(), FormaActivity.class);
                startActivity(i);
            }
        });
    }
}
