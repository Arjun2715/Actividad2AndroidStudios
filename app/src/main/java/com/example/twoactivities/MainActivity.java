package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    //----------------------------------------------------------------------------------------------------
    //wrong path to get string from text feild
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.message";//error here <----------------
    //----------------------------------------------------------------------------------------------------
    private Button btnSend;
    private EditText mMessageEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSend =  findViewById(R.id.send);
        btnSend.setOnClickListener(view -> openActivityTwo());


    }
    public void openActivityTwo(){
        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, Activity2.class);
        mMessageEditText = findViewById(R.id.editText_main);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(mMessageEditText.getText().toString(), message);
        startActivity(intent);
    }

}