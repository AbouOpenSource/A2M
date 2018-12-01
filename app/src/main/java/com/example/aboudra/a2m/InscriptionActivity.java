package com.example.aboudra.a2m;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class InscriptionActivity extends AppCompatActivity {
    private EditText editLastName;
    private EditText editFirstName;
    private EditText editCellPhone;
    private EditText editPassword;
    private User mine;
    private DatabaseReference databaseUser;
    private DatabaseReference userEndPoint;
    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        databaseUser= FirebaseDatabase.getInstance().getReference("users");


        editFirstName=(EditText)findViewById(R.id.editFirstName);
        editLastName=(EditText)findViewById(R.id.editLastName);
        editCellPhone=(EditText)findViewById(R.id.editCellPhone);
        editPassword=(EditText)findViewById(R.id.editPassword);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addArtist();
                //Intent intent = new Intent(this,ListeProduitActivity::class) ;
                //startActivity(intent);



            }
        });


        }

    private void addArtist()
    {
       String id= databaseUser.push().getKey();
       String firstName= editFirstName.getText().toString().trim();
       String lastName= editLastName.getText().toString().trim();
       String password=editPassword.getText().toString().trim();
       String cellPhone=editCellPhone.getText().toString().trim();
       mine= new User(id,firstName,lastName,password,cellPhone);
       databaseUser.child(id).setValue(mine);

        Toast.makeText(this, "Succeful add", Toast.LENGTH_SHORT).show();
    }



}
