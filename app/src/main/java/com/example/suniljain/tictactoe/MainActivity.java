package com.example.suniljain.tictactoe;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Vibrator;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    EditText etPlayer1, etPlayer2;
    ToggleButton toggleVibration;
    Button btnPlay;
    String player1Name, player2Name;
    public static boolean isVibrate;

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9;
    public static boolean symbol;
    public boolean checkWin;
    //public int countNoOfFilledBoxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        etPlayer1 = (EditText) findViewById(R.id.etPlayer1);
        etPlayer2 = (EditText) findViewById(R.id.etPlayer2);
        toggleVibration = (ToggleButton) findViewById(R.id.toggleVibration);
        btnPlay = (Button) findViewById(R.id.btnPlay);

        player1Name = etPlayer1.getText().toString();
        player2Name = etPlayer2.getText().toString();

        isVibrate = false;
        toggleVibration.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {              //toggle enabled
                    isVibrate = true;
                }
            }
        });

        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //send player names also with intent
                Intent i = new Intent(MainActivity.this, PlayGame.class);
                startActivity(i);
            }
        });
    }
}