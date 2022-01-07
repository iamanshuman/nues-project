package com.example.MSI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import Memes.MemeActivity;
import Teams.TeamMates;

public class SelectionPage extends AppCompatActivity {

    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        int background = SelectionPage.this.getResources().getColor(R.color.blue);
        getWindow().setStatusBarColor(background);
        setContentView(R.layout.activity_selection_page);

        LinearLayout ld1 = findViewById(R.id.ld1);
        LinearLayout ld2 = findViewById(R.id.ld2);
        LinearLayout ld3 = findViewById(R.id.ld3);
        LinearLayout ld4 = findViewById(R.id.ld4);
        LinearLayout ld5 = findViewById(R.id.ld5);
        LinearLayout ld6 = findViewById(R.id.ld6);
        LinearLayout ld7 = findViewById(R.id.ld7);
        LinearLayout ld8 = findViewById(R.id.ld8);
        LinearLayout ld9 = findViewById(R.id.ld9);

        TextView log  = findViewById(R.id.log);
        TextView team = findViewById(R.id.team);

        mAuth=FirebaseAuth.getInstance();

        ld1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent1 = new Intent(SelectionPage.this , Firstlink.class);
                startActivity(intent1);
            }
        });
        ld2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent2 = new Intent(SelectionPage.this , Secondlink.class);
                startActivity(intent2);
            }
        });
        ld3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                Intent intent3 = new Intent(SelectionPage.this , Thirdlink.class);
                startActivity(intent3);
            }
        });
        ld4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {
                Intent intent4 = new Intent(SelectionPage.this , Fourthlink.class);
                startActivity(intent4);
            }
        });
        ld5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {
                Intent intent5 = new Intent(SelectionPage.this , Fifthlink.class);
                startActivity(intent5);
            }
        });
        ld6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view6) {
                Intent intent6 = new Intent(SelectionPage.this , Sixthlink.class);
                startActivity(intent6);
            }
        });
        ld7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view7) {
                Intent intent7 = new Intent(SelectionPage.this , News.class);
                startActivity(intent7);
            }
        });
        ld8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view8) {
                Intent intent8 = new Intent(SelectionPage.this , Eighthlink.class);
                startActivity(intent8);
            }
        });
        ld9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view9) {
                Intent intent9 = new Intent(SelectionPage.this , MemeActivity.class);
                startActivity(intent9);
            }
        });
        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view12) {
                Intent tzt = new Intent(SelectionPage.this , TeamMates.class);
                startActivity(tzt);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SelectionPage.this, "Logged Out",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(SelectionPage.this, PhoneNumber.class);
                startActivity(intent);
                logOut();
                finish();
            }
        });
    }

    private void logOut() {
        FirebaseAuth.getInstance().signOut();
    }
}