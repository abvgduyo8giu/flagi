package com.example.a03_02;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class FirstActivityMain extends AppCompatActivity {
    private ImageView setImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_main);
        setImage = findViewById(R.id.imgFlagAr);
        setImage.setImageResource(R.drawable.br);

    }
    public void backToApp(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}