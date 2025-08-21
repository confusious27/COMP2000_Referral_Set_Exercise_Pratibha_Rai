package com.example.comp2000referral;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

// For admin catalogue (shud rename)
public class CatalogueActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    BookAdapter adapter;
    List<Book> bookList;
    Button addBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_books);

        //views by ID
        recyclerView = findViewById(R.id.adminBooksView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // sample books
        bookList = new ArrayList<>();
        bookList.add(new Book("1984", "George Orwell", "A dystopian novel about surveillance."));
        bookList.add(new Book("Brave New World", "Aldous Huxley", "A futuristic society based on control."));
        bookList.add(new Book("Fahrenheit 451", "Ray Bradbury", "A world where books are outlawed."));
        bookList.add(new Book("Omniscient Reader's Viewpoint", "SingShong", "Kim Dokja finds himself inside his favourite web novel 'Three Ways to Survive the Apocalypse'."));

        adapter = new BookAdapter(this, bookList);
        recyclerView.setAdapter(adapter);

    }
}
