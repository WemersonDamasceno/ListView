package com.example.listview.adpters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.listview.R;
import com.example.listview.model.Escola;

import java.util.ArrayList;

public class EscolaAdapter extends ArrayAdapter<Escola> {
    private final Context context;
    ArrayList<Escola> elementos;

    public EscolaAdapter(Context context, ArrayList<Escola> elementos) {
        super(context, R.layout.list_item, elementos);
        this.context = context;
        this.elementos = elementos;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        @SuppressLint("ViewHolder") View rowView = inflater.inflate(R.layout.list_item, parent, false);

        TextView nomeEscola = (TextView) rowView.findViewById(R.id.nome);
        TextView endereco = (TextView) rowView.findViewById(R.id.endereco);

        nomeEscola.setText(elementos.get(position).getNome());
        endereco.setText(elementos.get(position).getEndereco());

        return rowView;
    }


}
