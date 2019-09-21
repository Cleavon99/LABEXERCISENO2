package com.toquero.labexerciseno2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText school_1, school_2, school_3, school_4, school_5, school_6, school_7, school_8;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        school_1 = findViewById(R.id.school1);
        school_2 = findViewById(R.id.school2);
        school_3 = findViewById(R.id.school3);
        school_4 = findViewById(R.id.school4);
        school_5 = findViewById(R.id.school5);
        school_6 = findViewById(R.id.school6);
        school_7 = findViewById(R.id.school7);
        school_8 = findViewById(R.id.school8);

    }

    public void save(View v) {
        sp = getSharedPreferences("data2", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        String s1 = school_1.getText().toString();
        String s2 = school_2.getText().toString();
        String s3 = school_3.getText().toString();
        String s4 = school_4.getText().toString();
        String s5 = school_5.getText().toString();
        String s6 = school_6.getText().toString();
        String s7 = school_7.getText().toString();
        String s8 = school_8.getText().toString();

        editor.putString("s1", s1);
        editor.putString("s2", s2);
        editor.putString("s3", s3);
        editor.putString("s4", s4);
        editor.putString("s5", s5);
        editor.putString("s6", s6);
        editor.putString("s7", s7);
        editor.putString("s8", s8);
        editor.commit();
        Toast.makeText(this, "data saved in the local disk...", Toast.LENGTH_LONG).show();
    }


    protected void next(View v) {
        Intent i = new Intent(MainActivity.this, MainActivityTwo.class);
        startActivity(i);
    }
}
