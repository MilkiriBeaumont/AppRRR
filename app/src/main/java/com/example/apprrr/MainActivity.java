package com.example.apprrr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.principal), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    public void login(View v) {
        EditText campo1 = this.findViewById(R.id.correo);
        String correo = campo1.getText().toString();
        EditText campo2 = this.findViewById(R.id.contraseña);
        String contraseña = campo2.getText().toString();

        if (correo.equals("c1") && contraseña.equals("123")) {
            Intent i = new Intent(this, Principal1.class);
            startActivity(i);
        } else {
            Toast.makeText(this, "Error en las redenciales", Toast.LENGTH_SHORT).show();
        }
    }

    public void crearCuenta(View v) {
        Intent i = new Intent(this, ReguistrarCuenta.class);
        startActivity(i);
    }


    }
