package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MixOptionActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RestaurantAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_option);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Define data for each restaurant item
        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "@String/Restaurant 1", "@String/Mix Food 1", "@String/₹100"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "@String/Restaurant 2", "@String/Mix Food 2", "@String/₹150"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "@String/Restaurant 3", "@String/Mix Food 3", "@String/₹200"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "@String/Restaurant 4", "@String/Mix Food 4", "@String/₹250"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "@String/Restaurant 5", "@String/Mix Food 5", "@String/₹300"));

        // Create RecyclerView adapter
        adapter = new RestaurantAdapter(restaurantList);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
