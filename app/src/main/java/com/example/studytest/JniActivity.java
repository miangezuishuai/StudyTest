package com.example.studytest;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class JniActivity extends AppCompatActivity {

    static {
        System.loadLibrary("c-lib");
    }

    public native String stringFromJNIWithC();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jni);
        TextView textView = findViewById(R.id.textview);
        textView.setText(stringFromJNIWithC());
    }

    public static void actionStart(Activity activity) {
        activity.startActivity(new Intent(activity,JniActivity.class));
    }

}
