package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;

public class EggOptionActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RestaurantAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg_option);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Restaurant> restaurantList = new ArrayList<>();

        restaurantList.add(new Restaurant(R.drawable.omelett, "Omelette", "₹150"));
        restaurantList.add(new Restaurant(R.drawable.eggburji, "Egg Bhurji", "₹150"));
        restaurantList.add(new Restaurant(R.drawable.eggsscrambled, "Scrambled Eggs", "₹150"));
        //restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Mix Food 4", "₹250"));
       // restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Mix Food 5", "₹300"));


        // Create RecyclerView adapter
        adapter = new RestaurantAdapter(restaurantList, new RestaurantAdapter.OnBuyNowClickListener() {
            @Override
            public void onBuyNowClick(int position) {

                Intent intent = new Intent(EggOptionActivity.this, Omlette.class);
                startActivity(intent);
            }
        });

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }

    public void onBack7ButtonClick(View view) {
        startActivity(new Intent(EggOptionActivity.this, FoodChoiceActivity.class));
        finish();
    }
}