package com.example.user.ecart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView t;
    CardView c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i=0;

        t = (TextView) findViewById(R.id.text);
        c1 = (CardView) findViewById(R.id.cv1);
        c2 = (CardView) findViewById(R.id.cv2);
        c3 = (CardView) findViewById(R.id.cv3);
        c4 = (CardView) findViewById(R.id.cv4);
        c5 = (CardView) findViewById(R.id.cv5);
        c6 = (CardView) findViewById(R.id.cv6);
        c7 = (CardView) findViewById(R.id.cv7);
        c8 = (CardView) findViewById(R.id.cv8);
        c9 = (CardView) findViewById(R.id.cv9);
        c10 = (CardView) findViewById(R.id.cv10);
        c11 = (CardView) findViewById(R.id.cv11);
        c12 = (CardView) findViewById(R.id.cv12);
        c13 = (CardView) findViewById(R.id.cv13);
        c14 = (CardView) findViewById(R.id.cv14);
        c15 = (CardView) findViewById(R.id.cv15);

        c6.setVisibility(View.GONE);
        c7.setVisibility(View.GONE);
        c8.setVisibility(View.GONE);
        c9.setVisibility(View.GONE);
        c10.setVisibility(View.GONE);
        c11.setVisibility(View.GONE);
        c12.setVisibility(View.GONE);
        c13.setVisibility(View.GONE);
        c14.setVisibility(View.GONE);
        c15.setVisibility(View.GONE);

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(i==0) {


                    c6.setVisibility(View.VISIBLE);
                    c7.setVisibility(View.VISIBLE);
                    c8.setVisibility(View.VISIBLE);
                    c9.setVisibility(View.VISIBLE);
                    c10.setVisibility(View.VISIBLE);


                    Toast.makeText(MainActivity.this, "Loading...", Toast.LENGTH_SHORT).show();

                }
                else if(i==1) {
                    c11.setVisibility(View.VISIBLE);
                    c12.setVisibility(View.VISIBLE);
                    c13.setVisibility(View.VISIBLE);
                    c14.setVisibility(View.VISIBLE);
                    c15.setVisibility(View.VISIBLE);

                    Toast.makeText(MainActivity.this, "Loading...", Toast.LENGTH_SHORT).show();
                }
                else
                    Toast.makeText(MainActivity.this, "Sorry no more products!!!", Toast.LENGTH_SHORT).show();

                i++;
            }
        });
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Main2Activity.class);
                startActivity(intent);
            }
        });


    }
}
