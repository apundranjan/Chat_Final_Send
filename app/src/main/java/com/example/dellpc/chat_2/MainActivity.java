package com.example.dellpc.chat_2;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {
    Button bt_login;
    EditText et_username;
    EditText et_password;
    Button registerlink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button bt_login = (Button) findViewById(R.id.bt_login);
        final EditText et_username = (EditText) findViewById(R.id.et_UserName);
        final EditText et_password = (EditText) findViewById(R.id.et_password);
        final Button registerlink = (Button) findViewById(R.id.registerLink);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                User user = new User(username, password);
                startActivity(new Intent(MainActivity.this, Login_page.class));
            }

        });

        registerlink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Registration_Page.class));

            }
        });

    }
}
