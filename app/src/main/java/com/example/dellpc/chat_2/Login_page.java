package com.example.dellpc.chat_2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class Login_page extends AppCompatActivity {

    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;
    ArrayList<String> alName;
    ArrayList<String> alImage;
    Button bt_apply;
    Button bt_logout;
    Button bt_chat;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        final Button bt_apply = (Button)findViewById(R.id.bt_apply);
        final Button bt_chat = (Button)findViewById(R.id.bt_chat);
        final Button bt_logout = (Button)findViewById(R.id.bt_logout);


        bt_apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_page.this,Application_Page.class));
            }
        });

        bt_chat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_page.this,Chat_Page.class));
            }
        });

        bt_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login_page.this,MainActivity.class));
            }
        });



        alName = new ArrayList<>(Arrays.asList("Cheesy...", "Crispy... ", "Fizzy...", "Cool..."));
        alImage = new ArrayList<>(Arrays.asList("Company A..","Company B..","Company C..","Company D.."));


// Calling the RecyclerView
       final ListView mRecyclerView = (ListView) findViewById(R.id.recycler_view);


    }
}
