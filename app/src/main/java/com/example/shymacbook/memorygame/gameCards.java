package com.example.shymacbook.memorygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class gameCards extends AppCompatActivity {


    private TextView mShowName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_cards);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mShowName = (TextView) findViewById(R.id.showName);
        Intent fromMain = getIntent();
        if (fromMain.hasExtra(Intent.EXTRA_TEXT)) {
            String textEntered = fromMain.getStringExtra(Intent.EXTRA_TEXT);
            mShowName.setText(textEntered);
        }
    }

}
