package com.example.tj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity4 extends AppCompatActivity {
    private ImageView AimageView;
    private ImageView BimageView;
    private ImageView CimageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        AimageView = findViewById(R.id.imageView6);
        BimageView = findViewById(R.id.imageView3);
        CimageView = findViewById(R.id.imageview4);

        CimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity7();
            }
        });
        BimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAcivity6();
            }
        });

        AimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAcivity5();
            }
        });


    }

    public void startAcivity5() {
        Intent intent = new Intent(this, MainActivity5.class);
        startActivity(intent);
    }

    public void startAcivity6() {
        Intent intent = new Intent(this, MainActivity6.class);
        startActivity(intent);
    }



    public void startActivity7() {
        Intent intent = new Intent(this, MainActivity7.class);
        startActivity(intent);


    }



}











