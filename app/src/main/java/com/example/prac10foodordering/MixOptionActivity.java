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
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 1", "Mix Food 1", "₹100"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 2", "Mix Food 2", "₹150"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 3", "Mix Food 3", "₹200"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 4", "Mix Food 4", "₹250"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 5", "Mix Food 5", "₹300"));

        // Create RecyclerView adapter
        adapter = new RestaurantAdapter(restaurantList);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
