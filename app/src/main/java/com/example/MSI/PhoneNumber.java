package com.example.MSI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class PhoneNumber extends AppCompatActivity {
    EditText editTextNumber3;
    Button button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        int background = PhoneNumber.this.getResources().getColor(R.color.splashAbar);
        getWindow().setStatusBarColor(background);
        setContentView(R.layout.phonenumber);

        editTextNumber3 = findViewById(R.id.editTextNumber3);
        button6 = findViewById(R.id.button6);

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhoneNumber.this,Otp.class);
                intent.putExtra("mobile", editTextNumber3.getText().toString().trim());
                startActivity(intent);
            }
        });
    }
}