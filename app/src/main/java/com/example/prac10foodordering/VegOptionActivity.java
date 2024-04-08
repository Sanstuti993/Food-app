package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
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
        restaurantList.add(new Restaurant(R.drawable.bambayya_pav_bhaji, "pav Bhaji", "₹100"));
        restaurantList.add(new Restaurant(R.drawable.dosa, "Dosa", "₹150"));
        restaurantList.add(new Restaurant(R.drawable.cholebhature,  "Chole Bhature", "₹200"));
        restaurantList.add(new Restaurant(R.drawable.chaat,  "Chaat corner", "₹250"));


        adapter = new RestaurantAdapter(restaurantList, new RestaurantAdapter.OnBuyNowClickListener() {
            @Override
            public void onBuyNowClick(int position) {

                Intent intent;
                intent = new Intent(VegOptionActivity.this, PavbhajiPage.class);
                startActivity(intent);
            }
        });

        recyclerView.setAdapter(adapter);

    }
    public void onBack3ButtonClick(View view) {
        startActivity(new Intent(this, FoodChoiceActivity.class));
        finish();
    }

}
