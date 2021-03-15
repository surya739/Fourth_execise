package com.example.exe_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username,password;
    Button btn_signin;
    String E,D;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

       username = findViewById( R.id.editTextTextPersonName );
       password = findViewById( R.id.editTextTextPassword );
       btn_signin = findViewById( R.id.button );

       btn_signin.setOnClickListener( new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               D= username.getText().toString();
               E= password.getText().toString();

               if(E.equals( "surya" )&& D.equals( "username" )){

                   Intent i = new Intent(MainActivity.this,Sign_up_page.class);
                   startActivity( i );
                   Toast.makeText( getApplicationContext(),"Login Success",Toast.LENGTH_LONG ).show();



               }
               else {
                   Toast.makeText( getApplicationContext(),"Login Failed",Toast.LENGTH_LONG ).show();
               }
           }
       } );



    }
}