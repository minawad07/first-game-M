package com.example.game1_mina;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button upBtn;
    private Button downBtn;
    private Button leftBtn;
    private Button rightBtn;
    private ImageView img;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        upBtn=findViewById(R.id.buttonUp);
        downBtn=findViewById(R.id.buttonDown);
        leftBtn=findViewById(R.id.buttonLeft);
        rightBtn=findViewById(R.id.buttonRight);
        img=findViewById(R.id.imageView2);

        upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setY(img.getY() -20);
            }
            if(getY())
        });

        downBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setY(img.getY() +20);
            }
        });

        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setX(img.getX()-20);
            }
        });

        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                img.setX(img.getX()+20);
            }
        });










    }
}