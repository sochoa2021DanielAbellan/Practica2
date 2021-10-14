package net.iessochoa.danielabellan.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AgendaActivity extends AppCompatActivity {

    private TextView tvContacto;
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

        tvContacto = findViewById(R.id.tvContacto);
        etNombre = findViewById(R.id.etNombre);
        etApellidos = findViewById(R.id.etApellidos);
        etEmail = findViewById(R.id.etEmail);
        etTelefono = findViewById(R.id.etTelefono);
        etNotas = findViewById(R.id.etNotas);
        btnAceptar = findViewById(R.id.btnAceptar);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        btnSalir = findViewById(R.id.btnSalir);

        btnAceptar.setOnClickListener(view -> {
            tvContacto.setText(etNombre.getText() + " " + etApellidos.getText());
        });

        btnReiniciar.setOnClickListener(view -> {
            etNombre.setText("");;
            etApellidos.setText("");
            etEmail.setText("");
            etTelefono.setText("");
            etNotas.setText("");
        });

        btnSalir.setOnClickListener(view -> {
            this.finish();
        });
    }
}