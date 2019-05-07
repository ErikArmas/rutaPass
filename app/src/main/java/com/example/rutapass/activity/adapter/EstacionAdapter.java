package com.example.rutapass.activity.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
//import android.widget.ImageView;
import android.widget.TextView;

import com.example.rutapass.R;
import com.example.rutapass.activity.model.estacion;

import java.util.List;

public class EstacionAdapter extends ArrayAdapter<estacion>{

    public EstacionAdapter(@NonNull Context context, List<estacion> items) {
        super(context, R.layout.estacion_row,items);
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        if (convertView== null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.estacion_row, null);
        }
        TextView Hora = convertView.findViewById(R.id.lba_hora);
        TextView lbaNombre = convertView.findViewById(R.id.lba_estacion);
        //ImageView icon = convertView.findViewById(R.id.img_estacion);

        estacion current = getItem(position);
        if (current != null){
            Hora.setText(current.getHora());
            lbaNombre.setText(current.getNombre());
        }
        return convertView;
    }
}
