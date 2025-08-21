package com.example.comp2000referral;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText email;
    EditText password;
    Button loginButton;
    TextView forgotPass;
    TextView signupRedirect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // views by ID
        email = findViewById(R.id.emailAddress);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        forgotPass = findViewById(R.id.forgotPass);
        signupRedirect = findViewById(R.id.signupRedirect);

        // login button
        loginButton.setOnClickListener(v -> { //for 30% check, no API
            // user
            if (email.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();

                // Go to next screen (replace NextActivity.class with your actual class)
                Intent intent = new Intent(LoginActivity.this, UserBookActivity.class); // or MainActivity, DashboardActivity, etc.
                startActivity(intent);
                finish();
            } else if (email.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                Toast.makeText(LoginActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(LoginActivity.this, CatalogueActivity.class);
                startActivity(intent);
                finish();
            } else {
                Toast.makeText(LoginActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
            }
        });

        // redirects to forget password
        forgotPass.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, ForgetActivity.class);
            startActivity(intent);
        });

        // redirects to sign up
        signupRedirect.setOnClickListener(v -> {
            Intent intent = new Intent(LoginActivity.this, SignupActivity.class);
            startActivity(intent);
        });

//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

    }
}

