package net.iessochoa.danielabellan.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AgendaActivity extends AppCompatActivity {

    private EditText etNombre;
    private EditText etApellidos;
    private EditText etEmail;
    private EditText etTelefono;
    private EditText etNotas;
    private Button btnAceptar;
    private Button btnReiniciar;
    private Button btnSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda);

        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etEmail = findViewById(R.id.etEmail);
        etTelefono = findViewById(R.id.etTelefono);
        etNotas = findViewById(R.id.etNotas);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        btnSalir = findViewById(R.id.btnSalir);
    }
}