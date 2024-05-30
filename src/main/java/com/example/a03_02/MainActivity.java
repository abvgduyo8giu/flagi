package com.example.a03_02;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModel;

public class MainActivity extends AppCompatActivity {
    private Button setBtnToArgentin, setBtnToBrazil, setBtnToChili, setBtnToColumbia, setBtnToUrugvay;
    private ImageView setFlagImages;
    private Button btnBack;
    private View layoutForSet;
    private TextView setFlagName;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void setToArgent(View v)
    {
        Intent intent1 = new Intent(MainActivity.this, FirstActivityMain.class);
        startActivity(intent1);
    }

    public void setToBrazil(View v)
    {
        Intent intent1 = new Intent(MainActivity.this, SecondActivityMain.class);
        startActivity(intent1);
    }

    public void setToChili(View v)
    {
        Intent intent1 = new Intent(MainActivity.this, ThirdActivityMain.class);
        startActivity(intent1);
    }

    public void setToColumbia(View v)
    {
        Intent intent1 = new Intent(MainActivity.this, FourActivityMain.class);
        startActivity(intent1);
    }

    public void setToUruguay(View v)
    {
        Intent intent1 = new Intent(MainActivity.this, FiveActivityMain.class);
        startActivity(intent1);
    }

}