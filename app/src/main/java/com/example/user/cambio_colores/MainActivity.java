package com.example.user.cambio_colores;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private LinearLayout linear1;
    private TextView tv1;
    private Button btnc;
    private RadioButton rbtn1, rbtn2, rbtn3, rbtn11, rbtn12;
    private CheckBox chb1, chb2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        linear1 = (LinearLayout)findViewById(R.id.linearlayout);
        tv1 = (TextView)findViewById(R.id.tv1);
        btnc = (Button)findViewById(R.id.btnc);
        btnc.setOnClickListener(this);
        rbtn1 = (RadioButton)findViewById(R.id.rbtn1);
        rbtn2 = (RadioButton)findViewById(R.id.rbtn2);
        rbtn3 = (RadioButton)findViewById(R.id.rbtn3);
        rbtn11 = (RadioButton)findViewById(R.id.rbtn11);
        rbtn12 = (RadioButton)findViewById(R.id.rbtn12);
        chb1 = (CheckBox)findViewById(R.id.chb1);
        chb2 = (CheckBox)findViewById(R.id.chb2);
    }
    @Override
    public void onClick(View view) {

        if(rbtn1.isChecked()) {
            linear1.setBackgroundColor(Color.GREEN);
        }
        else if (rbtn2.isChecked()){
            linear1.setBackgroundColor(Color.RED);
        }
        else if (rbtn3.isChecked()){
            linear1.setBackgroundColor(Color.BLUE);
        }


        if(rbtn11.isChecked()){
            tv1.setTextColor(Color.WHITE);
        }
        else if (rbtn12.isChecked()){
            tv1.setTextColor(Color.BLACK);
        }


        if(chb1.isChecked()){
            tv1.setTypeface(tv1.getTypeface(),Typeface.BOLD);
        }
        if (chb2.isChecked()){
            tv1.setTypeface(tv1.getTypeface(),Typeface.ITALIC);
        }
        if(chb1.isChecked() && chb2.isChecked()){
            tv1.setTypeface(tv1.getTypeface(),Typeface.BOLD_ITALIC);
        }
        else tv1.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));
    }
}
