package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ServiceConnection;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvResultado;
    float numero1 = 0.0f;
    float numero2 = 0.0f;
    String operador = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvResultado = findViewById(R.id.tvResultado);

    }

    public void EscribirCero(View view){
        if (tvResultado.getText().toString().equals("0")){
            tvResultado.setText("0");
        }else {
            tvResultado.setText(tvResultado.getText()+"0");
        }
    }

    public void EscribirUno(View view){
        if (tvResultado.getText().toString().equals("0")){
            tvResultado.setText("1");
        }else {
            tvResultado.setText(tvResultado.getText()+"1");
        }
    }
    public void EscribirDos(View view){
        if (tvResultado.getText().toString().equals("0")){
            tvResultado.setText("2");
        }else {
            tvResultado.setText(tvResultado.getText()+"2");
        }

    }public void EscribirTres(View view){
        if (tvResultado.getText().toString().equals("0")){
            tvResultado.setText("3");
        }else {
            tvResultado.setText(tvResultado.getText()+"3");
        }

    }public void EscribirCuatro(View view){
        if (tvResultado.getText().toString().equals("0")){
            tvResultado.setText("4");
        }else {
            tvResultado.setText(tvResultado.getText()+"4");
        }

    }public void EscribirCinco(View view){
        if (tvResultado.getText().toString().equals("0")){
            tvResultado.setText("5");
        }else {
            tvResultado.setText(tvResultado.getText()+"5");
        }

    }public void EscribirSeis(View view){
        if (tvResultado.getText().toString().equals("0")){
            tvResultado.setText("6");
        }else {
            tvResultado.setText(tvResultado.getText()+"6");
        }

    }public void EscribirSiete(View view){
        if (tvResultado.getText().toString().equals("0")){
            tvResultado.setText("7");
        }else {
            tvResultado.setText(tvResultado.getText()+"7");
        }

    }public void EscribirOcho(View view){
        if (tvResultado.getText().toString().equals("0")){
            tvResultado.setText("8");
        }else {
            tvResultado.setText(tvResultado.getText()+"8");
        }

    }public void EscribirNueve(View view){
        if (tvResultado.getText().toString().equals("0")){
            tvResultado.setText("9");
        }else {
            tvResultado.setText(tvResultado.getText()+"9");
        }
    }

    public void Dividir(View view){
        operador = "/";
        GuardarNumero1(view);
    }

    public void Multiplicar(View view){
        operador = "*";
        GuardarNumero1(view);
    }

    public void Sumar(View view){
        operador = "+";
        GuardarNumero1(view);
    }

    public void Restar(View view){
        operador = "-";
        GuardarNumero1(view);

    }

    public void LimpiarTv(View view) {
        tvResultado.setText("0");
        numero1 = 0.0f;
        numero2 = 0.0f;
        operador = "";
    }
    public void GuardarNumero1(View view){
        numero1 = Float.parseFloat(tvResultado.getText().toString());
        tvResultado.setText("0");
    }

    public void Borrar(View view) {
        String text = tvResultado.getText().toString();
        tvResultado.setText(text.substring(0, text.length() - 1));
    }

    public void ResultadoIgual(View view) {
        Float resultado = 0.0f;
        numero2 = Float.parseFloat(tvResultado.getText().toString());

        if (operador == "+"){
            resultado = numero1 + numero2;
        }
        else if (operador == "-"){
            resultado = numero1 - numero2;
        }
        else if (operador == "*"){
            resultado = numero1 * numero2;
        }
        else if (operador == "/"){
            if (numero2 !=0){
                resultado = numero1 / numero2;
            }else {
                tvResultado.setText("SINTAX ERROR");
                return;
            }
        }

        String resultadoEnString =String.valueOf(resultado);
        tvResultado.setText(resultadoEnString);
    }
}