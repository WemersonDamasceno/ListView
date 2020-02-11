package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.listview.adpters.EscolaAdapter;
import com.example.listview.model.Escola;

import java.util.ArrayList;

public class addEscolaActivity extends AppCompatActivity {
    EditText nomeEscola;
    EditText enderecoEscola;
    Button btSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_escola);

        nomeEscola = findViewById(R.id.nomeEscola);
        enderecoEscola = findViewById(R.id.enderecoEscola);
        btSalvar = findViewById(R.id.buttonSalvarEscola);


        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundleDados = new Bundle();
                bundleDados.putString("nome", nomeEscola.getText().toString());
                bundleDados.putString("endereco", enderecoEscola.getText().toString());

                Intent intent = new Intent(v.getContext(), ListaEscolasActivity.class);

                intent.putExtras(bundleDados);
                startActivity(intent);
            }
        });


    }
}
