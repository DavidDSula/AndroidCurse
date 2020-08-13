package com.example.cources;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRegBtnClick(View view){

        EditText editName     = findViewById(R.id.editTxtName);
        EditText editLastName = findViewById(R.id.editTxtLastName);
        EditText editEmail    = findViewById(R.id.editTxtEmail);

        String name     = editName.getText().toString();
        String lastName = editLastName.getText().toString();
        String email    = editEmail.getText().toString();



        TextView txtName      = findViewById(R.id.txtFirstName);
        TextView txtLastName  = findViewById(R.id.txtLastName);
        TextView txtEmail     = findViewById(R.id.txtEmail);


        txtName.setText("First Name: " + name);
        txtLastName.setText("Last Name: " + lastName);
        txtEmail.setText("Email: " + email);
    }
}