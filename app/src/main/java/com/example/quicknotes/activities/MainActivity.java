package com.example.quicknotes.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.quicknotes.R;
import com.example.quicknotes.activities.CreateNoteActivity;


public class MainActivity extends AppCompatActivity {
    public static final int REQUEST_CODE_RETURN_BUTTON=1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView addnotemainactivityimage=findViewById(R.id.addnotebutton);




        addnotemainactivityimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivityForResult(
                       new Intent(getApplicationContext(), CreateNoteActivity.class), REQUEST_CODE_RETURN_BUTTON

               );


            }
        });
    }
}