package com.example.a03_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SecondActivityMain extends AppCompatActivity {
    private ImageView setImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_main);
        setImage = findViewById(R.id.imgFlagBz);
        setImage.setImageResource(R.drawable.br);
    }
    public void backToApp(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}