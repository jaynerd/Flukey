package com.namyoon.flukey;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.UUID;

public class InstantUser {
    private static String uuid = null;
    private static final String PREF_UNIQUE_ID = "PREF_UNIQUE_ID";

    public synchronized static String getUuid(Context context) {
        if (uuid == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(PREF_UNIQUE_ID, Context.MODE_PRIVATE);
            uuid = sharedPreferences.getString(PREF_UNIQUE_ID, null);
            if (uuid == null) {
                uuid = UUID.randomUUID().toString();
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString(PREF_UNIQUE_ID, uuid);
                editor.commit();
            }
        }
        return uuid;
    }
}
