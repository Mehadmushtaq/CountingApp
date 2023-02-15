package com.example.counting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button incBtn,decBtn,resBtn;
    TextView textView;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        incBtn=findViewById(R.id.incBtn);
        decBtn=findViewById(R.id.decBtn);
        resBtn=findViewById(R.id.resetBtn);
        textView=findViewById(R.id.textView);

        incBtn.setOnClickListener(this);
        decBtn.setOnClickListener(this);
        resBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.incBtn:                   //convert into string
                counter++;
                textView.setText(String.valueOf(counter));
                break;
            case R.id.decBtn:
                counter--;
                if(counter<0){
                    counter=0;
                }
                textView.setText(String.valueOf(counter));
                break;
            case R.id.resetBtn:
                counter=0;
                textView.setText(String.valueOf(counter));
                break;
            default:
                break;
        }
    }
}