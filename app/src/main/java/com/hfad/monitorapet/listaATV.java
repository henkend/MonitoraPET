package com.hfad.monitorapet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listaATV extends AppCompatActivity {
    ListView listaATV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_p);

        listaAdapter adapter = new listaAdapter(this, R.layout.row, Monitoria.getAtvItens(), null);

        listaATV = (ListView) findViewById(R.id.list2);
        listaATV.setAdapter(adapter);


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
