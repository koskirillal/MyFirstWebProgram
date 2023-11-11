package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = "MainActiviti";
    private Button button_clickLeft;
    private Button button_clickRight;
    private Button button_clickReset;
    private TextView tvScore;
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        score = 0;
        setContentView(R.layout.activity_main);
        Log.e("","Hello");
        button_clickRight = findViewById(R.id.button9);
        button_clickLeft = findViewById(R.id.button8);
        button_clickReset = findViewById(R.id.button10);
        tvScore = findViewById(R.id.textView);

        button_clickRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score++;
                tvScore.setText(String.valueOf(score));
            }
        });
        button_clickLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score--;
                tvScore.setText(String.valueOf(score));
            }
        });
        button_clickReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                tvScore.setText(String.valueOf(score));
            }
        });
        Log.d(LOG_TAG,"onCreate");
        /*<Button
        android:id="@+id/button_click"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:layout_marginTop="150dp"
        android:text="Click me"
        android:textSize="100sp" />
        */
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
    

}