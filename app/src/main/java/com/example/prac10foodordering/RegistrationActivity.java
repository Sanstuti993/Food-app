package com.example.prac10foodordering;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Calendar;

public class RegistrationActivity extends AppCompatActivity {
    private ImageButton selectedDate;
    private TextView Date;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        EditText usernameEditText = findViewById(R.id.editTextTextEmailAddress2);
        EditText passwordEditText = findViewById(R.id.Password);
        Button registerButton = findViewById(R.id.RegisterButton);
        Date= findViewById(R.id.Date);
        selectedDate = findViewById(R.id.DOB);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                User user = new User(username, password);
                UserManager.getInstance().addUser(user);

                startActivity(new Intent(RegistrationActivity.this, LoginActivity.class));
                finish();
            }
        });

        selectedDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final Calendar c = Calendar.getInstance();


                int year = c.get(Calendar.YEAR);
                int month = c.get(Calendar.MONTH);
                int day = c.get(Calendar.DAY_OF_MONTH);


                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        RegistrationActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year,
                                                  int monthOfYear, int dayOfMonth) {
                                // on below line we are setting date to our text view.
                                Date.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                            }
                        },

                        year, month, day);

                datePickerDialog.show();
            }
        });
    }

    public void onBackButtonClick(View view) {
        startActivity(new Intent(this, LoginRegisterOption.class));
        finish();
    }
}