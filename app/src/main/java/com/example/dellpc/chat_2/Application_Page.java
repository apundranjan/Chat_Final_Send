package com.example.dellpc.chat_2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Application_Page extends AppCompatActivity {

    EditText et_Name;
    EditText et_Email;
    EditText et_Phone;
    EditText et_pwd;
    EditText et_Company;
    EditText et_Field;
    Button bt_applyform;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application__page);

        final EditText et_Name = (EditText)findViewById(R.id.et_Name);
        final EditText et_Email = (EditText)findViewById(R.id.et_email);
        final EditText et_Phone = (EditText)findViewById(R.id.et_phone);
        final EditText et_pwd = (EditText)findViewById(R.id.et_pwd);
        final EditText et_Company = (EditText)findViewById(R.id.et_Company);
        final EditText et_Field = (EditText)findViewById(R.id.et_Field);
        final Button bt_applyform = (Button)findViewById(R.id.bt_appplyform);


        bt_applyform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_Name.getText().toString();
                String email = et_Email.getText().toString();
                String phone = et_Phone.getText().toString();
                String pwd = et_pwd.getText().toString();
                String company = et_Company.getText().toString();
                String field = et_Field.getText().toString();

                apply_user Apply_user = new apply_user(name,email,phone,pwd,company,field);
                Toast.makeText(Application_Page.this,"Application Processing",Toast.LENGTH_LONG).show();

            }


        });

    }
}
