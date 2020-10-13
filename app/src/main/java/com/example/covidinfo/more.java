package com.example.covidinfo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.covidinfo.Adapter.MainRecyclerAdapter;
import com.example.covidinfo.Model.AllCategory;
import com.example.covidinfo.Model.CategoryItem;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class more extends AppCompatActivity {


    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more); //initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);


// added in Symtoms category
        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, R.drawable.black_background,"Hollywood"));
        categoryItemList.add(new CategoryItem(1, R.drawable.ic_chat,"Hollywood"));









        // added in Prevention category
        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1, R.drawable.ic_chat,"Hollywood"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.ic_chat,"Hollywood"));

        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Hollywood", categoryItemList));
        allCategoryList.add(new AllCategory("Best of Oscars", categoryItemList2));


        setMainCategoryRecycler(allCategoryList);


        //Set home Selected
        bottomNavigationView.setSelectedItemId(R.id.More_info);


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
                        startActivity(new Intent(getApplicationContext()
                                , Chat.class));
                        overridePendingTransition(0, 0);
                        return true;

                    case R.id.More_info:

                        return true;


                }

                return false;
            }
        });
    }

    private void setMainCategoryRecycler(List<AllCategory> allCategoryList) {

        mainCategoryRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);

    }
}
