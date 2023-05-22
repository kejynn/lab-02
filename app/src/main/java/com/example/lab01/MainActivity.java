package com.example.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

   EditText ta;
   EditText tb;
   TextView tc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta = findViewById(R.id.ValueA);
        tb = findViewById(R.id.ValueB);
        tc = findViewById(R.id.ValueResult);
    }

    public void on_add_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);

        float fc = fa + fb;

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_sub_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);

        float fc = fa - fb;

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_mul_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);

        float fc = fa * fb;

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_div_click(View v)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);

        float fc = fa / fb;

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_Sin_click(View v)
    {
        float fc;
        String sa = ta.getText().toString();
        tb.setText("");

        float fa = Float.parseFloat(sa);

        fc = (float) Math.sin(fa);

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_Cos_click(View v)
    {
        float fc;
        String sa = ta.getText().toString();
        tb.setText("");

        float fa = Float.parseFloat(sa);

        fc = (float) Math.cos(fa);

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
    public void on_Degree_click(View v)
    {
        float fc;
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float fa = Float.parseFloat(sa);
        float fb = Float.parseFloat(sb);

        fc = (float) Math.pow(fa, fb);

        String sc = String.valueOf(fc);
        tc.setText(sc);
    }
}