package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Biryani extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biryani);
    }

    public void onbutton10Click(View view) {
        Toast.makeText(this,"Your order is on the way",Toast.LENGTH_LONG).show();
    }

    public void onBack12ButtonClick(View view) {
        startActivity(new Intent(this, NonVegOptionActivity.class));
        finish();
    }
}