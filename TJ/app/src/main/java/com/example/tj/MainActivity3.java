package com.example.tj;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity3 extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private Button button;
    private EditText Name;
    private EditText Gmail;
    private EditText Password;
    private EditText Age;
    private EditText phoneNumber;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        mAuth = FirebaseAuth.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        progressBar = (ProgressBar) findViewById(R.id.pg);
        button = (Button) findViewById(R.id.button);
        Name = (EditText) findViewById(R.id.text1);
        Gmail = (EditText) findViewById(R.id.text6);
        Age = (EditText) findViewById(R.id.text2);
        Password = (EditText) findViewById(R.id.text7);
        phoneNumber = (EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateGmailAddress(Gmail);


                openActivity4();
            }


        });
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










