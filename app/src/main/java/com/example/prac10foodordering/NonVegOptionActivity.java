package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class NonVegOptionActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RestaurantAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_option);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 1", "Non Veg Food 1", "₹100"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 2", "Non Veg Food 2", "₹150"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 3", "Non Veg Food 3", "₹200"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 4", "Non Veg Food 4", "₹250"));
        restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 5", "Non Veg Food 5", "₹300"));

        adapter = new RestaurantAdapter(restaurantList);

        recyclerView.setAdapter(adapter);
    }
}
