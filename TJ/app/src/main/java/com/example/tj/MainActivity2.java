package com.example.tj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private EditText Gmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView) findViewById(R.id.textView2);
        Gmail = (EditText) findViewById(R.id.editTextTextEmailAddress);
        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
                validateGmailAddress(Gmail);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    public void openActivity3() {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void openActivity4() {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }

    private boolean validateGmailAddress(EditText Gmail) {
        String gmailInput = Gmail.getText().toString();
        if (!gmailInput.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(gmailInput).matches()) {
            Toast.makeText(this, "Gmail Validated Successfully!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Invalid Gmail Address!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}