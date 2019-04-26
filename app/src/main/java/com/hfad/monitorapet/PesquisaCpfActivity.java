package com.hfad.monitorapet;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class PesquisaCpfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesquisa_cpf);
    }

    public void onPesquisar(View view) {
        EditText editText = (EditText) findViewById(R.id.editCpf);
        Monitoria.setParticipanteCPF(editText.getText().toString());

        if ( Monitoria.validarParticipante() ) {
            Monitoria.setParticipanteCPF(editText.getText().toString());
            Intent i = new Intent(this, ConfirmaActivity.class);
            startActivity(i);
        }
        else {
            Toast.makeText(this, "CPF Inválido!", Toast.LENGTH_LONG ).show();
        }
    }
}
