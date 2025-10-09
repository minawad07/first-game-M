package com.example.game1_mina;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText lives;
    private Button upBtn, downBtn, leftBtn,rightBtn;
    private ImageView img;


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //***************************************

        upBtn=findViewById(R.id.buttonUp);
        downBtn=findViewById(R.id.buttonDown);
        leftBtn=findViewById(R.id.buttonLeft);
        rightBtn=findViewById(R.id.buttonRight);
        img=findViewById(R.id.imageView2);
        lives=findViewById(R.id.textCount);
        int [] count = new int [1];
        count[0]=5;

        upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cord=(int) img.getY()-20;
                if(cord>20){
                img.setY(cord);
                img.setImageResource(R.drawable.hkh);}
                else {
                    img.setImageResource(R.drawable.hks);
                    count[0]--;
                    lives.setText("Lives : "+ count[0]);
                }
            }
        });

        downBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //int cord=(int) img.getY()+20;
                if((img.getY()+20)<546){
                    img.setY(img.getY()+20);
                    img.setImageResource(R.drawable.hkh);
                }
                else{
                    img.setImageResource(R.drawable.hks);
                    count[0]--;
                    lives.setText("Lives : "+ count[0]);
                    }
            }
        });

        leftBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cord=(int) img.getX()-20;
                if(cord>10){
                    img.setX(cord);
                    img.setImageResource(R.drawable.hkh);}
                else{
                    img.setImageResource(R.drawable.hks);
                    lives.setText("Lives : "+ count[0]);
                    count[0]--;}

            }
        });

        rightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int cord=(int) img.getX()+20;
                if(cord<700){
                    img.setX(cord);
                    img.setImageResource(R.drawable.hkh);}
                else{
                    img.setImageResource(R.drawable.hks);
                    count[0]--;}
                lives.setText("Lives : "+ count[0]);
            }
        });














    }
}