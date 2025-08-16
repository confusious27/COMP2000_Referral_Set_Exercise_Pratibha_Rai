package com.example.comp2000referral;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    // need to add in code here to distinguish between user and admin (So the menus can swap accordingly)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bottom nav bar
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigation);
        bottomNavigationView.setSelectedItemId(R.id.bottom_catalogue);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
                if (id == R.id.bottom_catalogue) {
                    return true;
                } else if (id == R.id.bottom_requests) {
                    startActivity(new Intent(getApplicationContext(), UserRequestActivity.class));
                    finish();
                    return true;
                } else if (id == R.id.bottom_profile) {
                    startActivity(new Intent(getApplicationContext(), UserProfileActivity.class));
                    finish();
                    return true;
                }

            return false;
        });
    }
}