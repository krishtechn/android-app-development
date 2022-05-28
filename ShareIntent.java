package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class ShareIntent extends AppCompatActivity {
 Button share;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_intent);

        share = findViewById(R.id.share);

        Intent intent = getIntent();
        String text = intent.getStringExtra("text");
        getSupportActionBar().setTitle("Share intent"+text);

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shareIntent = new Intent();
                shareIntent.setAction(shareIntent.ACTION_SEND);
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Text to share.");
                shareIntent.setType("text/plain");
                startActivity(shareIntent);
            }
        });
    }
}