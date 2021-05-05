package com.example.androidtp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InfoURLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_url);

        Intent intent = getIntent();
        Article article = intent.getParcelableExtra("article");

        TextView urlTextView = findViewById(R.id.urlTextView);
        urlTextView.setText(article.getUrl());
    }
}