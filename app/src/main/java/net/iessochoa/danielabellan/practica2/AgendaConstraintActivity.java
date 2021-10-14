package net.iessochoa.danielabellan.practica2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgendaConstraintActivity extends AppCompatActivity {

    private EditText etNombreAC;
    private Button btnOK;
    private Button btnCancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agenda_constraint);

        etNombreAC = findViewById(R.id.etNombreAC);
        btnOK = findViewById(R.id.btnOK);
        btnCancelar = findViewById(R.id.btnCancelar);

        btnOK.setOnClickListener(view -> {
            Context contexto = getApplicationContext();
            CharSequence mensaje = etNombreAC.getText();
            int tiempoDeMuestra = Toast.LENGTH_SHORT;

            Toast miToast = Toast.makeText(contexto, mensaje, tiempoDeMuestra);
            miToast.show();
        });

        btnCancelar.setOnClickListener(view -> {
            this.finish();
        });
    }
}