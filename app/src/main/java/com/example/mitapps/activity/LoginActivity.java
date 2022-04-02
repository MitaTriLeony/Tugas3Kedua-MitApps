package com.example.mitapps.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mitapps.R;

public class LoginActivity extends AppCompatActivity {
    Button login;
    EditText Username, password;

    protected void onCreate(Bundle saveInstancesState) {
        super.onCreate(saveInstancesState);
        setContentView(R.layout.login_relatve);
        login = findViewById(R.id.btnLogin);
        Username = findViewById(R.id.etUsername);
        password = findViewById(R.id.etPassword);
        login.setOnClickListener(view -> {
            if (password.getText().toString().equalsIgnoreCase("TESTI")) {
                login_sukses();
            } else {
                Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void login_sukses() {
        String user_login = Username.getText().toString();
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("USERNAME", user_login);
        startActivity(i);
    }
}
