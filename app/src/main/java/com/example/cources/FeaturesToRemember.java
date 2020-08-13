package com.example.cources;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

// Here i going to store Features that i should remember.
public class FeaturesToRemember extends AppCompatActivity {

    // ----------[ add event listener on click Feature ]-------------------
    //---------------------------------------------------------------------
    public void addClickEvent() {

        Button btn_ = findViewById(R.id.btnRegister);

        btn_.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("button clicked");
            }
        });
    }
    // ----------[ work with text ]-------------------
    //------------------------------------------------
    public void textOperations(){
        //----EditText feature
        EditText editName     = findViewById(R.id.editTxtName);
        EditText editLastName = findViewById(R.id.editTxtLastName);
        EditText editEmail    = findViewById(R.id.editTxtEmail);

        String name     = editName.getText().toString();
        String lastName = editLastName.getText().toString();
        String email    = editEmail.getText().toString();

        //----TextView feature
        TextView txtName      = findViewById(R.id.txtFirstName);
        TextView txtLastName  = findViewById(R.id.txtLastName);
        TextView txtEmail     = findViewById(R.id.txtEmail);

        txtName.setText("First Name: " + name);
        txtLastName.setText("Last Name: " + lastName);
        txtEmail.setText("Email: " + email);

        //------Toast Messages
        //------Toast.makeText( context:getActivity(), text, duration).show();
        Toast.makeText( this, "This is my Toast message!", Toast.LENGTH_LONG).show();
    }
}
