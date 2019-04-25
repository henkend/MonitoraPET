package com.hfad.monitorapet;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConfirmaActivity extends AppCompatActivity {

    private String DATA_FILE = "credenciamento.txt";
    private String dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirma);

        System.out.println("Validar CPF:"+Monitoria.getParticipanteCPF());

        if (Monitoria.validarParticipante()) {
            TextView tvNome = (TextView) findViewById(R.id.confirmaNome);
            TextView tvCpf = (TextView) findViewById(R.id.confirmaCpf);

            tvNome.setText(Monitoria.getParticipanteNome());
            tvCpf.setText(Monitoria.getParticipanteCPF());
        }

    }

    public void onConfirmar(View view) {
        // Recebe os dados salvos
        lerArquivo();

        // Adiciona o novo registro
        dados = dados + Monitoria.getParticipanteCPF() + "\t" + Monitoria.getParticipanteNome() + "\n";

        // Salva os dados
        salvarArquivo();

        // Finaliza a atividade
        Intent i = new Intent(this, FormaActivity.class);
        startActivity(i);
    }

    public void onVoltar(View view){
        finish();
    }

    private void lerArquivo(){
        // Leitura do arquivo existente
        FileInputStream in = null;
        try {
            // Efetua a leiura do arquivo existente
            in = new FileInputStream(DATA_FILE);
            byte[] buffer = new byte[ in.available() ];
            in.read(buffer);
            in.close();
            dados = new String(buffer, "UTF-8");
        } catch (FileNotFoundException e) {
            // Exibe erro em caso o arquivo não exista
            Log.e("FILE", "Não foi possível encontrar o arquivo credenciamento.txt");
            e.printStackTrace();
        } catch (IOException e) {
            // Exibe erro em caso tente saber o tamanho do arquivo que não existe
            Log.e("FILE", "Erro ao ler o tamanho do arquivo credenciamento.txt");
            e.printStackTrace();
        } finally {
            if ( in != null ) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private void salvarArquivo() {

        FileOutputStream out = null;

        try{
            out = new FileOutputStream(DATA_FILE);
            out.write(dados.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
