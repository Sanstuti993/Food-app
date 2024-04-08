package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MixOptionActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RestaurantAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mix_option);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        List<Restaurant> restaurantList = new ArrayList<>();

        restaurantList.add(new Restaurant(R.drawable.pizza, "Pizza", "₹500"));
        restaurantList.add(new Restaurant(R.drawable.burger, "Burger", "₹250"));
        restaurantList.add(new Restaurant(R.drawable.wraps, "Wraps", "₹200"));
        restaurantList.add(new Restaurant(R.drawable.momos, "Momos", "₹250"));
        //restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Mix Food 5", "₹300"));


        // Create RecyclerView adapter
        adapter = new RestaurantAdapter(restaurantList);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }

    public void onBack4ButtonClick(View view) {
        startActivity(new Intent(MixOptionActivity.this, FoodChoiceActivity.class));
        finish();
    }
}
