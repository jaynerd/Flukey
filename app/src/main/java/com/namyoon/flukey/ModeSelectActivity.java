package com.namyoon.flukey;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ModeSelectActivity extends AppCompatActivity {
    private Button btn_instant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_select);
        btn_instant = findViewById(R.id.btn_instant);
        btn_instant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModeSelectActivity.this, InstantChatActivity.class);
                startActivity(intent);
            }
        });
    }
}
