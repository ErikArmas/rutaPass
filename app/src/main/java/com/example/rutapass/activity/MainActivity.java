package com.example.rutapass.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.rutapass.Principal;
import com.example.rutapass.R;
import com.example.rutapass.Register;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button log = findViewById(R.id.btn_register);
        log.setOnClickListener(this);

        Button In = findViewById(R.id.btn_InicioSesion);
        In.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_register:
                Intent I = new Intent(this, Register.class);
                startActivity(I);
                break;
            case R.id.btn_InicioSesion:
                Intent j = new Intent(this, Principal.class);
                startActivity(j);
                break;
        }
    }
}
