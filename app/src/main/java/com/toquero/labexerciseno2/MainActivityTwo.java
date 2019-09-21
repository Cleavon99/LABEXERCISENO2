package com.toquero.labexerciseno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityTwo extends AppCompatActivity {

    EditText verifySchool;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maintwo);
        verifySchool = findViewById(R.id.verifySchool);

    }
    public void verify(View v) {

        sp = getSharedPreferences("data2", MODE_PRIVATE);
        String s1SP = sp.getString("s1", null);
        String s2SP = sp.getString("s2", null);
        String s3SP = sp.getString("s3", null);
        String s4SP = sp.getString("s4", null);
        String s5SP = sp.getString("s5", null);
        String s6SP = sp.getString("s6", null);
        String s7SP = sp.getString("s7", null);
        String s8SP = sp.getString("s8", null);
        String ver = verifySchool.getText().toString();
        if (s1SP.equals(ver) || s2SP.equals(ver) || s3SP.equals(ver) || s4SP.equals(ver)
        || s5SP.equals(ver) || s6SP.equals(ver) || s7SP.equals(ver) || s8SP.equals(ver)) {
            Toast.makeText(this, "this school is competing in UAAP....", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "this school is not part of UAAP....", Toast.LENGTH_LONG).show();
        }
    }
}
