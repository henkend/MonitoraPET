package com.hfad.monitorapet;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class visitanteATV extends AppCompatActivity {
    ListView visitante1;
    ListView visitante2;
    ListView visitante3;
    ListView visitante4;

    private String[] Lista1 = {"Credenciamento", "Cerimônia de Abertura", "Apresentação Cultural", "Palestra de Abertura", "Encontro de Discentes e Encontro de Docentes", " Livre (Bares, cinema)"};
    private String[] Lista2 = {"Café da manhã", "Mesa Redonda", "Apresentação de Banner", "Almoço", "Encontros por Atividade / Encontro de Interlocutores e Membros do CLAA", " Intervalo", "Mobiliza PET", "Jantar","Livre (Bares, Cinema)"};
    private String[] Lista3 = {"Café da manhã", "Mesa Redonda", "Apresentação Oral", "Almoço", "– Minicursos / Oficinas", " “Tchá com Bolo”", "Grupos de Discussão de Trabalho", "Jantar", "em diante – Festa Oficial – “Chuça e Rebuça”"};
    private String[] Lista4 = {"Café da manhã", "Assembleia Final", "Almoço", "Assembleia Final", "Livre (Bares, cinema)"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visitante_atv);
        visitante1 = (ListView) findViewById(R.id.list1);
        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, Lista1);
        visitante1.setAdapter(meuAdaptador);

        visitante2 = (ListView) findViewById(R.id.list2);
        ArrayAdapter<String> meuAdaptador2 = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, Lista2);
        visitante2.setAdapter(meuAdaptador2);

        visitante3 = (ListView) findViewById(R.id.list3);
        ArrayAdapter<String> meuAdaptador3 = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, Lista3);
        visitante3.setAdapter(meuAdaptador3);

        visitante4 = (ListView) findViewById(R.id.list4);
        ArrayAdapter<String> meuAdaptador4 = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, Lista4);
        visitante4.setAdapter(meuAdaptador4);
    }
}
