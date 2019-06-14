package com.example.marco.app_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText edt1, edt2;
    private TextView tvresultado;
    private RadioButton rbsum, rbres, rbmul, rbdiv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt1 = (EditText)findViewById(R.id.edt1);
        edt2 = (EditText)findViewById(R.id.edt2);
        tvresultado = (TextView)findViewById(R.id.tvresultado);
        rbsum = (RadioButton)findViewById(R.id.rbsum);
        rbres = (RadioButton)findViewById(R.id.rbres);
        rbmul = (RadioButton)findViewById(R.id.rbmul);
        rbdiv = (RadioButton)findViewById(R.id.rbdiv);
    }
    public void calcular(View v) {
        String n1 = edt1.getText().toString();
        String n2 = edt2.getText().toString();

        if (n1.isEmpty()) {
            Toast.makeText(this, "El campo 1 esta vacio", Toast.LENGTH_SHORT).show();
        } else if (n2.isEmpty()) {
            Toast.makeText(this, "El campo 2 esta vacio", Toast.LENGTH_SHORT).show();
        } else {

            int num1 = Integer.parseInt(n1);
            int num2 = Integer.parseInt(n2);


            if (rbsum.isChecked() == true) {
                int suma = num1 + num2;
                String result = String.valueOf(suma);
                tvresultado.setText("El resultado es: "+result);

            }else if(rbres.isChecked()==true){
                int resta = num1-num2;
                String result = String.valueOf(resta);
                tvresultado.setText("El resultado es: "+result);

            }else if(rbmul.isChecked()==true){
                int multiplicacion = num1*num2;
                String result=String.valueOf(multiplicacion);
                tvresultado.setText("El resultado es: "+result);

            }else if(rbdiv.isChecked()==true){
                if(num2<=0) {
                    Toast.makeText(this,"No se puede dividir entre 0",Toast.LENGTH_SHORT).show();
                }else{
                    int division=num1/num2;
                    String result=String.valueOf(division);
                    tvresultado.setText("El resultado es: "+result);
                }
            }
        }
    }
}
