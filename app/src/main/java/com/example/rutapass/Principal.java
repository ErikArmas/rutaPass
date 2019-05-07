package com.example.rutapass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.rutapass.activity.adapter.EstacionAdapter;
import com.example.rutapass.activity.model.estacion;

import java.util.ArrayList;
import java.util.List;

public class Principal extends AppCompatActivity {

    private List<estacion> lst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        lst = new ArrayList<>();
        estacion EstacionObejeto = new estacion();
        estacion EstacionDos = new estacion();
        estacion EstacionTres = new estacion();
        estacion uno = new estacion();
        estacion dos = new estacion();
        estacion tres = new estacion();
        estacion cuatro = new estacion();
        estacion cinco = new estacion();
        estacion seis = new estacion();


        EstacionObejeto.setNombre("la paz");
        EstacionObejeto.setHora("12:30");
        lst.add(EstacionObejeto);

        EstacionDos.setNombre("Estacion 1");
        EstacionDos.setHora("13:20");
        lst.add(EstacionDos);

        EstacionTres.setNombre("Reforma");
        EstacionTres.setHora("15:00");
        lst.add(EstacionTres);

        uno.setNombre("Estacion 2");
        uno.setHora("2:30");
        lst.add(uno);

        dos.setNombre("Estacion 3");
        dos.setHora("2:30");
        lst.add(dos);

        tres.setNombre("Estacion 4");
        tres.setHora("2:30");
        lst.add(tres);


        cuatro.setNombre("Estacion 5");
        cuatro.setHora("2:30");
        lst.add(cuatro);

        cinco.setNombre("Estacion 6");
        cinco.setHora("2:30");
        lst.add(cinco);

        seis.setNombre("Estacion 7");
        seis.setHora("2:30");
        lst.add(seis);


        ListView lstEstacion = findViewById(R.id.lst_estaciones);
        EstacionAdapter Adaptador = new EstacionAdapter(this,lst);
        lstEstacion.setAdapter(Adaptador);
    }
}
