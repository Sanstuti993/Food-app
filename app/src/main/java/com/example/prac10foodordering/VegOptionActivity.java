package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class VegOptionActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RestaurantAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veg_option);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Restaurant> restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant(R.drawable.bambayya_pav_bhaji, "Restaurant 1", "pav Bhaji", "₹100"));
        restaurantList.add(new Restaurant(R.drawable.dosa, "Restaurant 2", "Dosa", "₹150"));
        restaurantList.add(new Restaurant(R.drawable.cholebhature, "Restaurant 3", "Chole Bhature", "₹200"));
        restaurantList.add(new Restaurant(R.drawable.chaat, "Restaurant 4", "Chaat corner", "₹250"));
        //restaurantList.add(new Restaurant(R.drawable.ic_launcher_foreground, "Restaurant 5", "Veg Food 5", "₹300"));

        adapter = new RestaurantAdapter(restaurantList);

        recyclerView.setAdapter(adapter);
    }
}
