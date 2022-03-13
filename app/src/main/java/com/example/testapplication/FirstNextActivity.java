package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstNextActivity extends AppCompatActivity {

    Button Next;
    Button Skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_next);
        Next = (Button) findViewById(R.id.Next);
        Skip = (Button) findViewById(R.id.Skip);
        ViewPager2 DogsView = findViewById(R.id.RecView);
        AdapterClass adapter = new AdapterClass();
        DogsView.setAdapter(adapter);
        Intent relocate = new Intent(FirstNextActivity.this, MainActivity.class);
        Next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DogsView.setCurrentItem(DogsView.getCurrentItem()+1);
            }
        });
        Skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(relocate);
            }
        });
    }

}