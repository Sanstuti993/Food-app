package com.example.prac10foodordering;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private List<Restaurant> restaurantList;

    public RestaurantAdapter(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }

    @NonNull
    @Override
    public RestaurantViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_item_restaurent, parent, false);
        return new RestaurantViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantViewHolder holder, int position) {
        Restaurant restaurant = restaurantList.get(position);
        holder.imageRestaurant.setImageResource(restaurant.getImageResource());
        holder.foodName.setText(restaurant.getFoodName());
        holder.textPrice.setText(restaurant.getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Start an implicit intent to open Google
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.zomato.com"));
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return restaurantList.size();
    }

    public static class RestaurantViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageRestaurant;
        public TextView restaurantName, foodName, textPrice;

        public RestaurantViewHolder(View itemView) {
            super(itemView);
            imageRestaurant = itemView.findViewById(R.id.image_restaurant);
            foodName = itemView.findViewById(R.id.FoodName);
            textPrice = itemView.findViewById(R.id.text_price);
        }
    }
}
