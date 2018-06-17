package com.namyoon.flukey;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class InstantChatActivity extends AppCompatActivity {
    private String uuid;
    private DatabaseReference reference = FirebaseDatabase.getInstance().getReference().child("InstantChat");
    private Map<String, Object> map = new HashMap<String, Object>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instant_chat);
        InstantUser instantUser = new InstantUser();
        Context context = getApplicationContext();
        uuid = instantUser.getUuid(context);
        map.put(uuid, "");
        reference.updateChildren(map);
        Toast.makeText(context, uuid, Toast.LENGTH_LONG).show();
    }
}
