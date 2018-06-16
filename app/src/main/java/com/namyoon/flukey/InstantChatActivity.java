package com.namyoon.flukey;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class InstantChatActivity extends AppCompatActivity {
    private String uuid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant_chat);
        InstantUser instantUser = new InstantUser();
        Context context = getApplicationContext();
        uuid = instantUser.getUuid(context);
        Toast.makeText(context, uuid, Toast.LENGTH_LONG).show();
    }
}
