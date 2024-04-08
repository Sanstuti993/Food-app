package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class itemRestaurent extends AppCompatActivity implements RestaurantAdapter.OnBuyNowClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_restaurent);
    }

    @Override
    public void onBuyNowClick(int position) {
        startActivity(new Intent(itemRestaurent.this, VegFoodPageActivity.class));
        finish();
    }
}