package com.example.cources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Realm.init(this);
        setContentView(R.layout.activity_main);

    }

    public void onSubmit(View view){

        TextView textCustom = findViewById(R.id.textView);

        EditText editName = findViewById( R.id.editTextTextPersonName);
        String name = editName.getText().toString();

        textCustom.setText("Hello " + name);
    }
}