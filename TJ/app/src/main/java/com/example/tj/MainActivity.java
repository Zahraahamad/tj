package com.example.tj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         button = (Button) findViewById(R.id.button);
         textView = (TextView) findViewById(R.id.textView3);
         textView2 = (TextView) findViewById(R.id.textView2);
         textView2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openTermsAndConditions();
             }
         });

         textView.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openActivity3();
             }
         });
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 openActivity2();

             }

         });

    }
    public void openActivity2(){
        Intent intent = new Intent(this,MainActivity2.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void openTermsAndConditions(){
        Intent intent = new Intent(this,TermsAndConditions.class);
        startActivity(intent);
    }
}