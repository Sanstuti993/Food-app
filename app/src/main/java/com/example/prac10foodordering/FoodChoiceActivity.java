package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FoodChoiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_choice);
    }

    public void onMixFoodButtonClick(View view) {
        startActivity(new Intent(this, MixOptionActivity.class));
    }

    public void onNonVegFoodButtonClick(View view) {

        startActivity(new Intent(this, NonVegOptionActivity.class));
    }

    public void onVegFoodButtonClick(View view) {

        startActivity(new Intent(this, VegOptionActivity.class));
    }
}