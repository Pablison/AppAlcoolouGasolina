package br.com.alcoolougasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declarando os componentes da View
    EditText editAlcool;
    EditText editGasolina;
    TextView textResultado;
    Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = findViewById(R.id.editAlcool);
        editGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);

    }
        //Método para realizar o cálculo
     public void calcular(View view){

    Double precoAlcool = Double.parseDouble(editAlcool.getText().toString());
    Double precoGasolina = Double.parseDouble(editGasolina.getText().toString());

    //Se o resultado da divisão for >=0.7 então melhor usar gasolina;
        Double resultado = precoAlcool / precoGasolina;

        if(resultado >=0.7){
            textResultado.setText("Melhor usar Gasolina");
        }else{
            textResultado.setText("Melhor usar Álcool");
        }
    }
}