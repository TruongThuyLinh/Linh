package com.example.appcong_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText txtX,txtY;
    TextView txtkq;
    Button btnc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        innitcontrol();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    private void innitcontrol(){
        txtX=findViewById(R.id.txtX);
        txtY=findViewById(R.id.txtY);
        txtkq=findViewById(R.id.txtkq);
        btnc=findViewById(R.id.btnc);
       btnc.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v){
                int x=  Integer.parseInt(txtX.getText().toString());
                int y=  Integer.parseInt(txtY.getText().toString());
                int result =x+y;
                txtkq.setText(String.valueOf(result));

            }
        });
    }
}