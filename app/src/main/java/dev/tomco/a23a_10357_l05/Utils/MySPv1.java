package dev.tomco.a23a_10357_l05.Utils;

import android.content.Context;
import android.content.SharedPreferences;

public class MySPv1 {
    private static final String DB_FILE = "DB_FILE";

    public static void putInt(Context context, String key, int value) {
        SharedPreferences preferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key, value);
        editor.apply();
    }

    public static int getInt(Context context, String key, int defValue) {
        SharedPreferences preferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
        return preferences.getInt(key, defValue);
    }

    public static void putString(Context context, String key, String value) {
        SharedPreferences preferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getString(Context context, String key, String defValue) {
        SharedPreferences preferences = context.getSharedPreferences(DB_FILE, Context.MODE_PRIVATE);
        return preferences.getString(key, defValue);
    }
}
