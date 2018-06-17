package com.namyoon.flukey;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ModeSelectActivity extends AppCompatActivity {
    private String uuid;
    private Button btn_instant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_select);

        Context context = getApplicationContext();
        uuid = UUIDGenerator.getUUID(context);

        btn_instant = findViewById(R.id.btn_instant);

        AddButtonListeners();

        Toast.makeText(context, uuid, Toast.LENGTH_LONG).show();
    }

    private void AddButtonListeners() {
        btn_instant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModeSelectActivity.this, InstantChatActivity.class);
                intent.putExtra("UUID", uuid);
                startActivity(intent);
            }
        });
    }
}
