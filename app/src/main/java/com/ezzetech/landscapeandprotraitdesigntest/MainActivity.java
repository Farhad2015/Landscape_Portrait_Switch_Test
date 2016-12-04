package com.ezzetech.landscapeandprotraitdesigntest;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText editTextTest;
    Button buttonTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        editTextTest = (EditText)findViewById(R.id.et_test);
        buttonTest = (Button)findViewById(R.id.button);
        buttonTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), editTextTest.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }

    //Sometimes not needed
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("arg1", editTextTest.getText().toString());
        super.onSaveInstanceState(savedInstanceState);
    }

    //sometimes not needed
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        editTextTest.setText(savedInstanceState.getString("arg1"));
        //Toast.makeText(getApplicationContext(), editTextProtrait.getText().toString(), Toast.LENGTH_SHORT).show();
        super.onRestoreInstanceState(savedInstanceState);
    }
}
