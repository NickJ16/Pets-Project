package com.lambdaschool.petsproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);
        textView.setText("Lion \n panther \n Grizzly Bear \n Ape \n Eagle \n Tiger \n Cheetah \n Kangaroo \n Shark \n Jelly Fish \n Squirrel \n Alligator \n Buck");
    }
}
