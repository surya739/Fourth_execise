package com.example.exe_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_up_page extends AppCompatActivity {
Button btn_sign_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_sign_up_page );

        btn_sign_up = findViewById( R.id.button2 );

        btn_sign_up.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Sign_up_page.this,MainActivity.class);
                startActivity( i );
            }
        } );


    }
}