package com.example.common.uts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    EditText EdUsername, EdPassword;
    Button BtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EdUsername = (EditText) findViewById(R.id.EdUsername);
        EdPassword = (EditText) findViewById(R.id.EdPassword);
        BtnLogin = (Button) findViewById(R.id.BtnLogin);
        BtnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (EdUsername.getText().toString().equals("admin") && EdPassword.getText().toString().equals("admin")){
            Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG);
            Intent loginsukses = new Intent(LoginActivity.this, MainActivity.class);
            startActivity(loginsukses);
        }else{
            Toast.makeText(getApplicationContext(), "Username atau Passowrd salah", Toast.LENGTH_SHORT).show();
        }

    }
}
