package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class LoginActivity extends AppCompatActivity {

    private EditText UsernameEditText ;
    private EditText PasswordEditText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Spinner spinner = findViewById(R.id.spinner);
        UsernameEditText = findViewById(R.id.UsernameLogin);
        PasswordEditText = findViewById(R.id.PasswordLogin);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.spinner_items,
                android.R.layout.simple_spinner_item
        );

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        findViewById(R.id.loginButtonLoginPage).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateCredentials();
            }
        });

    }
    public void onBack1ButtonClick(View view) {
        Intent intent = new Intent(this, LoginRegisterOption.class);
        startActivity(intent);
        finish();
    }
    private void validateCredentials() {
        boolean isValidUser = false;
        List<User> users = UserManager.getInstance().getUsers();
        String username = UsernameEditText.getText().toString();
        String password = UsernameEditText.getText().toString();

        for (User user : users) {

            if (user.getEmail().equals(username) && user.getPassword().equals(password)) {

                isValidUser = true;

                startActivity(new Intent(this, FoodChoiceActivity.class));
            }
        }
        if (!isValidUser) {
            Toast.makeText(LoginActivity.this, Boolean.toString(isValidUser), Toast.LENGTH_LONG).show();
        }
    }
}