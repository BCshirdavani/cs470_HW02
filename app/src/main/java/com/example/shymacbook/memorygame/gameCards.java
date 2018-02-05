package com.example.shymacbook.memorygame;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class gameCards extends AppCompatActivity {


    private TextView mShowName;
    private String descript_1;
    private String descript_2;
    private ImageView card_1;
    private ImageView card_2;

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

    public void picShow(View view) {
//        card_1 = findViewById(R.id.card_r1c1);
        Log.d("testing", "\t\tclicked an image veiw " + descript_1);
        card_1 = (ImageView) view;
        descript_1 = card_1.getContentDescription().toString();
        if (descript_1 == "blastoise"){
//            card_1.setImageResource(R.drawable.blastoise);
            card_1.setBackgroundResource(R.drawable.blastoise);
            Log.d("testing", "\t\tblastoise " + descript_1);
        }
        else if (descript_1 == "charmander"){
//            card_1.setImageResource(R.drawable.charmander);
            card_1.setBackgroundResource(R.drawable.charmander);
            Log.d("testing", "\t\tcharmander " + descript_1);
        }
        else if (descript_1 == "squirtle"){
//            card_1.setImageResource(R.drawable.squirtle);
            card_1.setBackgroundResource(R.drawable.squirtle);
            Log.d("testing", "\t\tsquirtle " + descript_1);
        }
    }
}
