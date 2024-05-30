package com.example.a03_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ThirdActivityMain extends AppCompatActivity {
    private ImageView setImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_main);
        setImage = findViewById(R.id.imageCol);
        setImage.setImageResource(R.drawable.cl);
    }
    public void backToApp(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}