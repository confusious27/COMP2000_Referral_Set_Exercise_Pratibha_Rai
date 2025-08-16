package com.example.comp2000referral;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RequestsActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RequestAdapter adapter;
    List<Request> requestList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_requests);

        recyclerView = findViewById(R.id.adminRequestsView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        requestList = new ArrayList<>();
        requestList.add(new Request("The Hobbit", "John Doe"));
        requestList.add(new Request("1984", "Jane Smith"));
        requestList.add(new Request("Brave New World", "Alice Johnson"));

        adapter = new RequestAdapter(this, requestList);
        recyclerView.setAdapter(adapter);
    }
}