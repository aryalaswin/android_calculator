package com.aryal.aswincalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etfirstValue, etSecondValue;
    TextView tvAns;
    Button add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etfirstValue=findViewById(R.id.etFirstValue);
        etSecondValue=findViewById(R.id.etSecondValue);

        tvAns=findViewById(R.id.tvAns);
        add=findViewById(R.id.btnAdd);
        sub=findViewById(R.id.btnSub);
        mul=findViewById(R.id.btnMul);
        div=findViewById(R.id.btnDiv);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etfirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
            ans=firstvalue+secondvalue;
            tvAns.setText(("Answer is "+ans));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etfirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue-secondvalue;
                tvAns.setText(("Answer is "+ans));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etfirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue*secondvalue;
                tvAns.setText(("Answer is "+ans));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int firstvalue,secondvalue,ans;
                firstvalue=Integer.parseInt(etfirstValue.getText().toString());
                secondvalue=Integer.parseInt(etSecondValue.getText().toString());
                ans=firstvalue/secondvalue;
                tvAns.setText(("Answer is "+ans));
            }
        });



    }
}