import static android.os.Build.VERSION_CODES.R;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editTextText2;
    private TextView textViewResultado;
    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextText2 = findViewById(R.id.editTextText2);
        textViewResultado = findViewById(R.id.textViewResultado);
        buttonCalcular = findViewById(R.id.buttonCalcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Hay que pasar lo que tiene el editTextText2 a int
                String s = editTextText2.getText().toString();
                int numero = Integer.parseInt(s);
                textViewResultado.setText("Resultado: " + Calculo.ButtonCalcular(numero));
            }
        });
    }




}