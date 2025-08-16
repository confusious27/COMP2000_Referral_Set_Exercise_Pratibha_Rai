package com.example.comp2000referral;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ForgetActivity extends AppCompatActivity {

    EditText email;
    Button verifyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget);

        email = findViewById(R.id.forgotEmail);
        verifyButton = findViewById(R.id.verifyButton);

        verifyButton.setOnClickListener(v -> {
            String emailText = email.getText().toString().trim();

            if (emailText.isEmpty()) {
                Toast.makeText(ForgetActivity.this, "Email is required!", Toast.LENGTH_SHORT).show();
            } else { // this doesn't do anything without an api and email connection
                Toast.makeText(ForgetActivity.this, "Verification Email sent!", Toast.LENGTH_SHORT).show();

                // navigates to login
                startActivity(new Intent(ForgetActivity.this, LoginActivity.class));
            }
        });
    }
}