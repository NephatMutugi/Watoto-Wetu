package com.nephat.watotowetu;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.nephat.watotowetu.fragments.HomeworksFragment;

public class HomeworkActivity extends AppCompatActivity {

    private static final String TAG = "HomeworkActivity";
    private HomeworksFragment homeworksFragment = new HomeworksFragment();

    private ImageView mBack;
    private Button mComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework);

        mBack = findViewById(R.id.imgBack);
        mComplete = findViewById(R.id.btnComplete);

        final Intent intent = new Intent(HomeworkActivity.this, MainActivity.class);



        mBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
