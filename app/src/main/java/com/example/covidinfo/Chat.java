package com.example.covidinfo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Chat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat); //initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);


        //Set home Selected
        bottomNavigationView.setSelectedItemId(R.id.Chat);


        //perform ItemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.news:
                        startActivity(new Intent(getApplicationContext()
                                , News.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.Select_country:
                        startActivity(new Intent(getApplicationContext()
                                , AffectedCountries.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.Global_stats:
                        startActivity(new Intent(getApplicationContext()
                                , MainActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.Chat:

                        return true;

                    case R.id.More_info:
                        startActivity(new Intent(getApplicationContext()
                                , more.class));
                        overridePendingTransition(0, 0);
                        return true;


                }

                return false;
            }
        });
    }
}
