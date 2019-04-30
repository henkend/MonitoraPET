package com.hfad.monitorapet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class listaP extends AppCompatActivity {

    final String DATA_FILE = "credenciamento.txt";
    String errorMsg = null;
    String dados = null;
    String serverURL;
    ListView listaP;
    listaAdapter adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_p);
        listaP = (ListView) findViewById(R.id.list2);
        ArrayAdapter<String> meuAdaptador = new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1, android.R.id.text1, Monitoria.getCredItens());
        listaP.setAdapter(meuAdaptador);

        serverURL = "http://ecopet2019.com.br/resources/php/checkin.php";

        String [] icons = {"@drawable/ic_directions_run_black_24dp", "@drawable/ic_restaurant_black_24dp", "@drawable/ic_cloud_upload_black_24dp"};

        adaptador = new listaAdapter(getApplicationContext(), R.layout.row, Monitoria.getCredItens(), icons);

        /*listaP = (ListView) findViewById(R.id.list1);*/
        listaP.setAdapter(adaptador);

        listaP.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Monitoria.setCredenciar(Monitoria.ATIVIDADE);
                    Intent intent = new Intent(getApplicationContext(), listaATV.class);
                    startActivity(intent);
                }
                else if (position == 1) {
                    Monitoria.setCredenciar(Monitoria.REFEICOES);
                    Intent intent = new Intent(getApplicationContext(), listaREF.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Por favor, permaneça conectado a internet", Toast.LENGTH_LONG);
                    lerArquivo();
                    if (dados != null) {
                        salvarDados();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Falha ao ler o registros salvos!", Toast.LENGTH_LONG);
                    }
                }
            }
        });
    }

    public void InsertData(final String cpf, final String tipo){

        class SendPostReqAsyncTask extends AsyncTask<String, Void, String> {

            @Override
            protected String doInBackground(String... params) {

                String cpfHolder = cpf ;
                String tipoHolder = tipo;

                List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();

                nameValuePairs.add(new BasicNameValuePair("user", cpfHolder));
                nameValuePairs.add(new BasicNameValuePair("type", tipoHolder));

                errorMsg = null;

                try {
                    HttpClient httpClient = new DefaultHttpClient();

                    HttpPost httpPost = new HttpPost(serverURL);

                    httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs));

                    HttpResponse httpResponse = httpClient.execute(httpPost);

                    HttpEntity httpEntity = httpResponse.getEntity();


                } catch (ClientProtocolException e) {
                    errorMsg = e.getMessage();
                    Log.e("HTTP", e.getMessage());
                } catch (IOException e) {
                    errorMsg = e.getMessage();
                    Log.e("HTTP", e.getMessage());
                }
                Log.i("HTTP", "Data Inserted Successfully");
                return "Data Inserted Successfully";
            }

            @Override
            protected void onPostExecute(String result) {

                super.onPostExecute(result);

                //Toast.makeText(listaP.this, "Data Submit Successfully", Toast.LENGTH_LONG).show();

            }
        }

        SendPostReqAsyncTask sendPostReqAsyncTask = new SendPostReqAsyncTask();
        sendPostReqAsyncTask.execute(cpf, tipo);
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
            Toast.makeText(getApplicationContext(), "Falha ao acessar o arquivo!", Toast.LENGTH_LONG).show();
            Log.e("FILE", "Não foi possível encontrar o arquivo credenciamento.txt");
            e.printStackTrace();
            errorMsg = e.getMessage();
        } catch (IOException e) {
            // Exibe erro em caso tente saber o tamanho do arquivo que não existe
            Toast.makeText(getApplicationContext(), "Falha ao acessar o arquivo!", Toast.LENGTH_LONG).show();
            Log.e("FILE", "Erro ao ler o tamanho do arquivo credenciamento.txt");
            e.printStackTrace();
            errorMsg = e.getMessage();
        }
    }

    private void salvarDados() {
        String [] lines = dados.split("\r\n");
        String [] line;

        System.out.println("Dados: "+dados);
        System.out.println("Linha 0:" +lines[0]);

        for(String register : lines){
            line = register.split(";");
            InsertData(line[1], line[0]);
        }

        Toast.makeText(getApplicationContext(), "Todos os dados foram salvos com sucesso! :D", Toast.LENGTH_LONG).show();
    }
}
