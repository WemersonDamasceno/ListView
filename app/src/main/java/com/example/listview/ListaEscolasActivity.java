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

public class ListaEscolasActivity extends AppCompatActivity {
EditText nomeEscola;
Button btVoltar;
EditText enderecoEscola;
 private static ArrayList<Escola> escolas = new ArrayList<Escola>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_escolas);

        nomeEscola = findViewById(R.id.nomeEscola);
        enderecoEscola = findViewById(R.id.enderecoEscola);
        btVoltar = findViewById(R.id.btVoltar);

        ListView lista = (ListView) findViewById(R.id.lvEscolas);
        ArrayList<Escola> escolas = getEscola();
        ArrayAdapter adapter = new EscolaAdapter(ListaEscolasActivity.this, escolas);
        EscolaAdapter escolaAdapter = new EscolaAdapter(ListaEscolasActivity.this, escolas);
        lista.setAdapter(adapter);


        btVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), addEscolaActivity.class);
                startActivity(intent);
            }
        });
    }

    private ArrayList<Escola> getEscola() {
        Bundle bundleRec = getIntent().getExtras();
        if(bundleRec!=null){
            String nome = bundleRec.getString("nome");
            String endereco = bundleRec.getString("endereco");
            Escola e = new Escola(nome, endereco);
            escolas.add(e);

        }
        return escolas;
    }
}
