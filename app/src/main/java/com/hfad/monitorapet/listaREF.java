package com.hfad.monitorapet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class listaREF extends AppCompatActivity {
    ListView listaREF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_p);
        listaREF = (ListView) findViewById(R.id.list2);
        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, Monitoria.getRefItens());
        listaREF.setAdapter(meuAdaptador);

        listaREF.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Monitoria.setRefeicoes(position);
                Intent i = new Intent(getApplicationContext(), FormaActivity.class);
                startActivity(i);
            }
        });
    }
}