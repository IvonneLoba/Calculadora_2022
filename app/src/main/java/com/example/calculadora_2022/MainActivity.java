package com.example.calculadora_2022;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button  b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;
    TextView v2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        v2 = findViewById(R.id.vw2);

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        b10 = findViewById(R.id.btn10);
        b11 = findViewById(R.id.btn11);
        b12 = findViewById(R.id.btn12);
        b13 = findViewById(R.id.btn13);
        b14 = findViewById(R.id.btn14);
        b15 = findViewById(R.id.btn15);
        b16 = findViewById(R.id.btn16);
        b17 = findViewById(R.id.btn17);
        b18 = findViewById(R.id.btn18);
        b19 = findViewById(R.id.btn19);
        b20 = findViewById(R.id.btn20);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b10.setOnClickListener(this);
        b11.setOnClickListener(this);
        b12.setOnClickListener(this);
        b13.setOnClickListener(this);
        b14.setOnClickListener(this);
        b15.setOnClickListener(this);
        b16.setOnClickListener(this);
        b17.setOnClickListener(this);
        b18.setOnClickListener(this);
        b19.setOnClickListener(this);
        b20.setOnClickListener(this);

        v2.setText("0");
    }

    Boolean next = true;
    String cadena = "", operacion = "", num = "", num2 = "";
    @Override
    public void onClick(View view) {
        Button btn = (Button)view;

        switch (btn.getText().toString()){
            case "+":
                if(next){
                    cadena += "+";
                    v2.setText(cadena);
                    operacion="+";
                }
                next = false;
                break;
            case "-":
                if (next){
                    cadena += "-";
                    v2.setText(cadena);
                    operacion = "-";
                }
                next = false;
                break;
            case "X":
                if (next){
                    cadena += "X";
                    v2.setText(cadena);
                    operacion = "X";
                }
                next = false;
                break;
            case "/":
                if (next){
                    cadena += "/";
                    v2.setText(cadena);
                    operacion = "/";
                }
                next = false;
                break;
            case "%":
                if (next){
                    v2.setText(cadena);
                    operacion = "%";
                    Double r1 = 0.0;
                    Double n1;
                    n1 = Double.valueOf(num);
                    r1 = n1/100;
                    v2.setText(r1.toString());
                }
                next = false;
                break;
            case "=":
                Double n1;
                Double n2;
                Double res = 0.0;
                n1 = Double.valueOf(num);
                n2 = Double.valueOf(num2);

                switch (operacion){
                    case "+":
                        res = n1+n2;
                        break;
                    case "-":
                        res = n1-n2;
                        break;
                    case "*":
                        res = n1*n2;
                        break;
                    case "/":
                        res = n1/n2;
                        break;
                }
                v2.setText(res.toString());
                break;
            case "AC":
                String borrar="0";
                num = "";
                num2 = "";
                cadena = "";
                operacion="";
                v2.setText(borrar.toString());
                v2.setText("0");

                next = true;
                break;

            default:
                cadena += btn.getText();
                v2.setText(cadena);

                if(next){
                    num += btn.getText();
                }
                else {
                    num2 += btn.getText();
                }
                break;
        }
    }
}
