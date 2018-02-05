package com.example.shymacbook.memorygame;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button play;
    private EditText mNameEntry;
    private String nameEntered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        getActionBar().setDisplayHomeAsUpEnabled(true);

        //media player starts
//        mp= MediaPlayer.create(this, R.raw.jeopardy);
//        mp.start();

        play = (Button) findViewById(R.id.PLAYbutton);
        mNameEntry = (EditText) findViewById(R.id.editText);

        play.setOnClickListener(
            new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameEntered = mNameEntry.getText().toString();
                Intent startChildActivityIntent = new Intent(MainActivity.this, gameCards.class);
                startChildActivityIntent.putExtra(Intent.EXTRA_TEXT, nameEntered);
                startActivity(startChildActivityIntent);
                }
            }
        );



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
//        getActionBar().setDisplayHomeAsUpEnabled(true);
        return true;
    }



}
