package com.namyoon.flukey;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class InstantChatActivity extends AppCompatActivity {
    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference("InstantChat").child("UserList");
    private Map<String, Object> map = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant_chat);

        Bundle extras=getIntent().getExtras();
        String uuid = extras.getString("UUID");
        InstantUser instantUser = new InstantUser();

        map.put(uuid, "");
        reference.updateChildren(map);
    }
}
