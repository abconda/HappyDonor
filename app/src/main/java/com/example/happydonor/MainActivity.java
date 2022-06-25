package com.example.happydonor;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView benefits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        benefits = (TextView) findViewById(R.id.txtBenefits);

        Button loginButton = findViewById(R.id.btnLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent viewLoginActivity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(viewLoginActivity);
            }
        });

        Button registerButton = findViewById(R.id.btnRegister);
        registerButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent viewRegisterActivity = new Intent(getApplicationContext(), RegisterActivity.class);
                startActivity(viewRegisterActivity);
            }
        });

        benefits.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BenefitsActivity.class));
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}