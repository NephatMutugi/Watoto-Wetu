package com.nephat.watotowetu.authentication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nephat.watotowetu.HomeworkActivity;
import com.nephat.watotowetu.MainActivity;
import com.nephat.watotowetu.R;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "LoginActivity";

    //Widgets
    private EditText mPhoneNumber;
    private EditText mPassword;
    private Button mLogin;
    private TextView mLinkForgotPassword;
    private TextView mLinkRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        hideSoftKeyboard();


        mPhoneNumber = findViewById(R.id.phoneNumber);
        mPassword = findViewById(R.id.inputPass);
        mLogin = findViewById(R.id.buttonLogin);
        mLinkForgotPassword = findViewById(R.id.forgotPassText);
        mLinkRegister = findViewById(R.id.linkRegister);

        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        mLinkForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(intent);
            }
        });

        mLinkRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }

    private void hideSoftKeyboard()
    {
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
}
