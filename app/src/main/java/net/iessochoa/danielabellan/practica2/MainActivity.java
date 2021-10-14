package net.iessochoa.danielabellan.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAgenda;
    private Button btnAgendaConstraint;
    private Button btnReceta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAgenda = findViewById(R.id.btnAgenda);
        btnAgendaConstraint = findViewById(R.id.btnAgendaConstraint);
        btnReceta = findViewById(R.id.btnReceta);

        btnAgenda.setOnClickListener(view ->{
            Intent intent = new Intent(this, AgendaActivity.class);
            startActivity(intent);
        });

        btnAgendaConstraint.setOnClickListener(view -> {
            Intent intent = new Intent(this, AgendaConstraintActivity.class);
            startActivity(intent);
        });

        btnReceta.setOnClickListener(view -> {
            Intent intent = new Intent(this, RecetaActivity.class);
            startActivity(intent);
        });

    }
}