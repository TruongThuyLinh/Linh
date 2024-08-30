package com.example.xucxac_androi;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    Button button;
    Random rah=new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.dice);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int ra=rah.nextInt(5)+1;
                if(ra==1){
                   imageView.setImageResource(R.drawable.xucxac1);
                }
                if(ra==2){
                    imageView.setImageResource(R.drawable.xucxac2);
                }
                if(ra==3){
                    imageView.setImageResource(R.drawable.xucxac3);
                }
                if(ra==4){
                    imageView.setImageResource(R.drawable.xucxac4);
                }
                if(ra==5){
                    imageView.setImageResource(R.drawable.xucxac5);
                }

            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}