package com.example.prac10foodordering;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder> {
    private List<Restaurant> restaurantList;
    private OnBuyNowClickListener onBuyNowClickListener;

    public RestaurantAdapter(List<Restaurant> restaurantList,OnBuyNowClickListener onBuyNowClickListener) {
        this.restaurantList = restaurantList;
        this.onBuyNowClickListener = onBuyNowClickListener;
    }

    public interface OnBuyNowClickListener {
        void onBuyNowClick(int position);
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

        holder.buttonBuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onBuyNowClickListener != null) {
                    onBuyNowClickListener.onBuyNowClick(position);
                }
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
        public Button buttonBuyNow;

        public RestaurantViewHolder(View itemView) {
            super(itemView);
            imageRestaurant = itemView.findViewById(R.id.image_restaurant);
            foodName = itemView.findViewById(R.id.FoodName);
            textPrice = itemView.findViewById(R.id.text_price);
            buttonBuyNow = itemView.findViewById(R.id.BuyNow);
        }
    }
}
