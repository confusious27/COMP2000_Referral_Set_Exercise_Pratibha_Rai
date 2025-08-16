package com.example.comp2000referral;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class BookDetailActivity extends AppCompatActivity {

    TextView titleView, authorView, descriptionView;
    Button requestButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_detail);

        titleView = findViewById(R.id.bookTitle);
        authorView = findViewById(R.id.bookAuthor);
        descriptionView = findViewById(R.id.bookDescription);
        requestButton = findViewById(R.id.requestButton);

        String title = getIntent().getStringExtra("title");
        String author = getIntent().getStringExtra("author");
        String description = getIntent().getStringExtra("description");

        titleView.setText(title);
        authorView.setText(author);
        descriptionView.setText(description);

        requestButton.setOnClickListener(v ->
                Toast.makeText(BookDetailActivity.this,
                        "Request sent for \"" + title + "\"", Toast.LENGTH_SHORT).show());
    }
}