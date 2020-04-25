package com.nephat.watotowetu.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nephat.watotowetu.MainActivity;
import com.nephat.watotowetu.R;

public class RegisterActivity extends AppCompatActivity {

    //Widgets
    private EditText fName;
    private EditText lName;
    private EditText mPhone;
    private EditText mPassword;
    private EditText mConfirmPass;
    private Button mRegBtn;
    private TextView mLinkLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        hideSoftKeyboard();


        fName = findViewById(R.id.firstName);
        lName = findViewById(R.id.lastName);
        mPhone = findViewById(R.id.enterPhone);
        mPassword = findViewById(R.id.enterPass);
        mConfirmPass = findViewById(R.id.confirmPass);
        mRegBtn = findViewById(R.id.regBtn);
        mLinkLogin = findViewById(R.id.linkLogin);

        mLinkLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


        mRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first_name = fName.getText().toString().trim();
                String last_name = lName.getText().toString().trim();
                String phone = mPhone.getText().toString().trim();
                String password = mPassword.getText().toString().trim();
                String confirm_pass = mConfirmPass.getText().toString().trim();

                if (TextUtils.isEmpty(first_name)){
                    fName.setError("First name is required");
                    return;
                }
                if (TextUtils.isEmpty(last_name)){
                    lName.setError("Last name is required");
                    return;
                }
                if (TextUtils.isEmpty(phone)){
                    mPhone.setError("Phone number is required");
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    mPassword.setError("Password is required");
                    return;
                }
                if (password.length()<6){
                    mPassword.setError("Password should be 6 or more characters");
                    return;
                }
                if (!TextUtils.equals(password,confirm_pass)){
                    mConfirmPass.setError("Passwords do not match");
                }else{
                    Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }

    private void hideSoftKeyboard()
    {
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }
}
