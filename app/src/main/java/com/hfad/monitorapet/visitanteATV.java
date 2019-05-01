package com.hfad.monitorapet;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import static java.util.Map.*;

public class visitanteATV extends AppCompatActivity {
    listaAdapter2 adaptador;
    private String[] hora1 = {"07:00h às 13:30h", "14:00h às 14:30h", "14:30h às 15:00h", "15:00h às 17:15h", "17:15h às 18:45h","18:45h em diante"};
    private String[] atv1 = {"Credenciamento", "– Cerimônia de Abertura", "Apresentação Cultural", "Palestra de Abertura", "Encontro de Discentes e Encontro de Docentes", "Livre (Bares, cinema)"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitante_atv);
        Button but1 = (Button) findViewById(R.id.button);
         Button but2 = (Button) findViewById(R.id.button2);
         Button but3 = (Button) findViewById(R.id.button3);
        Button but4 = (Button) findViewById(R.id.button4);
        final ListView l1 = (ListView) findViewById(R.id.list1);
        final ListView l2 = (ListView) findViewById(R.id.list2);
        final ListView l3 = (ListView) findViewById(R.id.list3);
        final ListView l4 = (ListView) findViewById(R.id.list4);
        final FrameLayout f1 = (FrameLayout) findViewById(R.id.f1);
        final FrameLayout f2 = (FrameLayout) findViewById(R.id.f2);
        final FrameLayout f3 = (FrameLayout) findViewById(R.id.f3);
        final FrameLayout f4 = (FrameLayout) findViewById(R.id.f4);

        adaptador = new listaAdapter2(getApplicationContext(), R.layout.list_item, hora1 ,atv1 );
        l1.setAdapter(adaptador);

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f1.setVisibility(View.VISIBLE);
                f2.setVisibility(View.INVISIBLE);
                f3.setVisibility(View.INVISIBLE);
                f4.setVisibility(View.INVISIBLE);
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f2.setVisibility(View.VISIBLE);
                f1.setVisibility(View.INVISIBLE);
                f3.setVisibility(View.INVISIBLE);
                f4.setVisibility(View.INVISIBLE);
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f3.setVisibility(View.VISIBLE);
                f1.setVisibility(View.INVISIBLE);
                f2.setVisibility(View.INVISIBLE);
                f4.setVisibility(View.INVISIBLE);
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                f4.setVisibility(View.VISIBLE);
                f1.setVisibility(View.INVISIBLE);
                f3.setVisibility(View.INVISIBLE);
                f2.setVisibility(View.INVISIBLE);
            }
        });

    }

    }

