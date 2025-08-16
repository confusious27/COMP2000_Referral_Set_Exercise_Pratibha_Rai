package com.example.comp2000referral;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    EditText confirmPass;
    Button signButton;
    TextView loginRedirect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email = findViewById(R.id.signEmail);
        password = findViewById(R.id.choosePass);
        confirmPass = findViewById(R.id.confirmPass);
        signButton = findViewById(R.id.signButton);

        signButton.setOnClickListener(v -> {
            String emailText = email.getText().toString().trim();
            String passwordText = password.getText().toString();
            String confirmText = confirmPass.getText().toString();

            if (emailText.isEmpty() || passwordText.isEmpty() || confirmText.isEmpty()) {
                Toast.makeText(SignupActivity.this, "All fields are required!", Toast.LENGTH_SHORT).show();
            } else if (!passwordText.equals(confirmText)) {
                Toast.makeText(SignupActivity.this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(SignupActivity.this, "Registered Successfully!", Toast.LENGTH_SHORT).show();

                // navigates to login
                startActivity(new Intent(SignupActivity.this, LoginActivity.class));
            }
        });

        // redirects to login
        loginRedirect.setOnClickListener(v -> {
            Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
            startActivity(intent);
        });


    }
}

