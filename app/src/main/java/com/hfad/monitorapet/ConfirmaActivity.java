package com.hfad.monitorapet;

import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
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
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ConfirmaActivity extends AppCompatActivity {

    private String DATA_FILE = "credenciamento.txt";
    private String dados = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirma);

        TextView tvNome = (TextView) findViewById(R.id.confirmaNome);

        if (Monitoria.validarParticipante()) {
            tvNome.setText(Monitoria.getParticipanteNome());
        } else {
            tvNome.setText("Não registrado");
        }

        TextView tvCpf = (TextView) findViewById(R.id.confirmaCpf);
        tvCpf.setText(Monitoria.getParticipanteCPF());
    }

    public void onConfirmar(View view) {
        // Recebe os dados salvos
        lerArquivo();

        // Adiciona o novo registro
        switch (Monitoria.getCredenciar()) {
            case Monitoria.ATIVIDADE:
                dados = dados + "Atividade;";

                switch (Monitoria.getAtividade()) {
                    case Monitoria.ATV_ABERTURA:
                        dados = dados + "Abertura;";
                        break;
                    case Monitoria.ATV_ED_ED:
                        dados = dados + "ED/ED;";
                        break;
                    case Monitoria.ATV_MESA_1:
                        dados = dados + "Mesa Redonda 1;";
                        break;
                    case Monitoria.ATV_MESA_2:
                        dados = dados + "Mesa Redonda 2;";
                        break;
                    case Monitoria.ATV_APS_BANNER:
                        dados = dados + "Apresentacao de Banner;";
                        break;
                    case Monitoria.ATV_EA_EIMCLAA:
                        dados = dados + "EA/EIMCLAA;";
                        break;
                    case Monitoria.ATV_MOBILIZA:
                        dados = dados + "Mobiliza PET;";
                        break;
                    case Monitoria.ATV_APS_ORAL:
                        dados = dados + "Apresentacao Oral;";
                        break;
                    case Monitoria.ATV_MINI_OFI:
                        dados = dados + "Minicursos / Oficinas;";
                        break;
                    case Monitoria.ATV_BOLO:
                        dados = dados + "Tcha com bolo;";
                        break;
                    case Monitoria.ATV_GDT:
                        dados = dados + "GDT's;";
                        break;
                    case Monitoria.ATV_ASSEMBLEIA:
                        dados = dados + "Assembleia Final;";
                        break;
                }
            break;

            case Monitoria.REFEICOES:
                dados = dados + "Refeicoes\t";

                switch (Monitoria.getRefeicoes()) {
                    case Monitoria.REF_2_4_CAFE:
                        dados = dados + "02/04 - Cafe da manha;";
                        break;
                    case Monitoria.REF_2_4_ALMOCO:
                        dados = dados + "02/04 - Almoco;";
                        break;
                    case Monitoria.REF_2_4_JANTAR:
                        dados = dados + "02/04 - Jantar;";
                        break;
                    case Monitoria.REF_3_4_CAFE:
                        dados = dados + "03/04 - Cafe da manha;";
                        break;
                    case Monitoria.REF_3_4_ALMOCO:
                        dados = dados + "03/04 - Almoco;";
                        break;
                    case Monitoria.REF_3_4_JANTAR:
                        dados = dados + "03/04 - Jantar;";
                        break;
                    case Monitoria.REF_4_4_CAFE:
                        dados = dados + "04/04 - Cafe da manha;";
                        break;
                    case Monitoria.REF_4_4_ALMOCO:
                        dados = dados + "04/04 - Almoco;";
                        break;
                    case Monitoria.REF_4_4_JANTAR:
                        dados = dados + "04/04 - Jantar;";
                        break;
                }
            break;
        }

        // Adiciona o participante desse registro
        dados = dados + Monitoria.getParticipanteCPF() + ";" + Monitoria.getParticipanteNome();

        // Salva os dados
        salvarArquivo();

        // Finaliza a atividade
        Intent i = new Intent(this, FormaActivity.class);
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    public void onVoltar(View view){
        finish();
    }

    private void lerArquivo(){
        try {
            File storage = Environment.getExternalStoragePublicDirectory(Environment.MEDIA_SHARED);
            File directory = new File(storage.getAbsolutePath() + "/ECOPET");
            directory.mkdirs();
            File file = new File(directory, DATA_FILE);

            FileInputStream fIn = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fIn);

            byte[] buffer = new byte[ fIn.available() ];
            fIn.read(buffer);
            fIn.close();
            dados = new String(buffer, "UTF-8");
        } catch (FileNotFoundException e) {
            // Exibe erro em caso o arquivo não exista
            Log.e("FILE", "Não foi possível encontrar o arquivo credenciamento.txt");
            e.printStackTrace();
        } catch (IOException e) {
            // Exibe erro em caso tente saber o tamanho do arquivo que não existe
            Log.e("FILE", "Erro ao ler o tamanho do arquivo credenciamento.txt");
            e.printStackTrace();
        }
    }

    private void salvarArquivo() {
        try{
            File storage = Environment.getExternalStoragePublicDirectory(Environment.MEDIA_SHARED);
            File directory = new File(storage.getAbsolutePath() + "/ECOPET");
            directory.mkdirs();
            File file = new File(directory, DATA_FILE);
            FileOutputStream fOut = new FileOutputStream(file);

            OutputStreamWriter osw = new OutputStreamWriter(fOut);

            osw.write(dados);
            osw.flush();
            osw.write("\r\n");
            osw.flush();
            osw.close();

            // Tell the media scanner about the new file so that it is
            // immediately available to the user.
            MediaScannerConnection.scanFile(this, new String[] { file.toString() }, null,
                new MediaScannerConnection.OnScanCompletedListener() {
                    public void onScanCompleted(String path, Uri uri) {
                        Log.i("ExternalStorage", "Scanned " + path + ":");
                        Log.i("ExternalStorage", "-> uri=" + uri);
                    }
                });
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
