package com.example.practical_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setsonet(View v){
        Intent i=new Intent(this,MainActivity2.class);
        i.putExtra("imagesrc","cat");
        startActivity(i);
    }

    public void setseltos(View V){
        Intent i=new Intent(this,MainActivity3.class);
        i.putExtra("imgsrc","seltos");
        startActivity(i);
    }

    public void setcarens(View V){
        Intent i=new Intent(this,MainActivity4.class);
        i.putExtra("imgsrc","seltos");
        startActivity(i);
    }
}