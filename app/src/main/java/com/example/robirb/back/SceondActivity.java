package com.example.robirb.back;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SceondActivity extends AppCompatActivity {
    private Button button,button_bk;
    private TextView tvName,tvEmail,tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sceond);

        tvName= (TextView) findViewById(R.id.tv_name);
        tvEmail= (TextView) findViewById(R.id.tv_email);
        tvAddress= (TextView) findViewById(R.id.tv_address);
        button = (Button) findViewById(R.id.button);
        button_bk= (Button) findViewById(R.id.button_bk);

        button_bk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SceondActivity.this.finish();
            }
        });

        Intent intent=getIntent();

        String name = intent.getStringExtra("A");
        String email = intent.getStringExtra("B");
        String address = intent.getStringExtra("C");

        tvName.setText(name);
        tvEmail.setText(email);
        tvAddress.setText(address);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ThirdActivity.class);
                startActivity(intent);
            }
        });
    }
}
