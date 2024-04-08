package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Burger extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);
    }
    public void onbutton11Click(View view) {
        Toast.makeText(this,"Your order is on the way",Toast.LENGTH_LONG).show();
    }
    public void onBack14ButtonClick(View view) {
        startActivity(new Intent(this, MixOptionActivity.class));
        finish();
    }
}