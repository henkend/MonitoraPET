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

public class visitanteATV extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitante_atv);
        Button but2 = (Button) findViewById(R.id.button2);
        FrameLayout ff = (FrameLayout) findViewById(R.id.ff);

        ListView results = (ListView) findViewById(R.id.list1);
        HashMap<String, String> name = new HashMap<>();
        name.put("07:00h às 13:30h(FAMEVZ)", "Credenciamento");
        name.put("14:00h às 14:30h(Centro Cultural)", "Cerimônia de Abertura");
        name.put("14:30h às 15:00h(Centro Cultural)", "Apresentação Cultural");
        name.put("15:00h às 17:15h (Centro Cultural)", "Palestra de Abertura");
        name.put("17:15h às 18:45h(IGHD)", "Encontro de Discentes e Encontro de Docentes");
        name.put("18:45h em diante", "Livre (Bares, cinema)");

        List<HashMap<String, String>> listItems = new ArrayList<>();
        SimpleAdapter adapter = new SimpleAdapter(this, listItems, R.layout.list_item, new String[]{"First Line", "Second Line"}, new int[]{R.id.text1, R.id.text2});

        Iterator it = name.entrySet().iterator();
        while (it.hasNext()){
         HashMap<String,String> result = new HashMap<>();
            Map.Entry pair = (Map.Entry)it.next();
            result.put("First Line", pair.getKey().toString());
            result.put("Second Line", pair.getValue().toString());
            listItems.add(result);
        }
        results.setAdapter(adapter);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ff.setVisibility(View.INVISIBLE);
            }
        });

    }

    }

