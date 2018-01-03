package com.example.student.l2018010301;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView2);
    }

    public void click1(View v)
    {
        img.setImageResource(R.drawable.forest);


    }

    public  void click2(View v)
    {
        Picasso.with(MainActivity.this).load("http://square.github.io/picasso/static/sample.png")
                .into(img);
    }

    public  void click3(View v)
    {
        img.setVisibility(View.INVISIBLE);
    }
}
