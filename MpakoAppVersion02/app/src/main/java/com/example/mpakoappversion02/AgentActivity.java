package com.example.mpakoappversion02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class AgentActivity extends AppCompatActivity {
    private TextView InfosUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agent);

        InfosUser = findViewById(R.id.idTextViewPageAgent);

        Bundle bundle = getIntent().getExtras();
        String UserName = bundle.getString("EmailAgent");
        String PasswordUser = bundle.getString("PasswordAgent");

        InfosUser.setText("User name: "+UserName+"  Password: "+PasswordUser);
    }
}