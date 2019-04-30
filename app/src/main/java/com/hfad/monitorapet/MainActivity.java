package com.hfad.monitorapet;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    private EditText user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

          user = (EditText) findViewById(R.id.user);
        Monitoria.Inicializar();
    }

    public void clicar (View v){

        String valor=user.getText().toString();

        if(Monitoria.validarMonitor(valor)){
            Monitoria.setMonitor(valor);
            Intent intent = new Intent(getApplicationContext(), listaP.class);
            startActivity(intent);
        }
        else{

            Toast.makeText(MainActivity. this,"Usuário não cadastrado!", LENGTH_LONG). show();
        }


    }
    public void clicar2 (View v){
            Intent intent = new Intent(getApplicationContext(), visitanteP.class);
            startActivity(intent);
    }


}