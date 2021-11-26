package com.angel.saldivar.calcufinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.atomic.DoubleAccumulator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Double numero1, numero2, resultado;
    String operador;

    public void onClickButtonOne(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "1");
    }

    public void onClickButtonTwo(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "2");
    }

    public void onClickButtonThree(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "3");
    }

    public void onClickButtonFour(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "4");
    }

    public void onClickButtonFive(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "5");
    }

    public void onClickButtonSix(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "6");
    }

    public void onClickButtonSeven(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "7");
    }

    public void onClickButtonEight(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "8");
    }

    public void onClickButtonNine(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "9");
    }

    public void onClickButtonZero(View miView){
        TextView tv = findViewById(R.id.textView);
        String value = tv.getText().toString();
        tv.setText(value + "0");
    }

    public void onClickOperacionCapturaNumero1(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        numero1 = Double.parseDouble(tv.getText().toString());
        tv.setText("");
    }

    public void onClickSuma(View miView){
        operador="+";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickResta(View miView){
        operador="-";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickMulti(View miView){
        operador="*";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickDivide(View miView){
        operador="/";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickExpo(View miView){
        operador = "^";
        onClickOperacionCapturaNumero1(miView);
    }
    public void onClickAC(View miView){
        operador="AC";
        onClickOperacionCapturaNumero1(miView);
    }


    public void onClickRaiz(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        onClickOperacionCapturaNumero1(miView);
        resultado =Math.sqrt(numero1);
        tv.setText(resultado.toString());
    }

    public void onClickIgual(View miView){
        TextView tv = (TextView) findViewById(R.id.textView);
        numero2 = Double.parseDouble(tv.getText().toString());


        try{

            if (operador.equals("+")){
                resultado = numero1 + numero2;
            }
            if (operador.equals("-")){
                resultado = numero1 - numero2;
            }
            if (operador.equals("*")){
                resultado = numero1 * numero2;
            }
            if (operador.equals("/")){
                resultado = numero1 / numero2;
            }
            if(operador.equals("^")) {
                resultado = Math.pow(numero1, numero2);
            }
            if(operador.equals("AC")) {
                numero1 = null;
                numero2 = null;
                resultado = null;
            }
            tv.setText(resultado.toString());
        }catch(NumberFormatException nfe){
            Toast.makeText( this, "Numero Incorrecto", Toast.LENGTH_LONG).show();
        }
    }
}