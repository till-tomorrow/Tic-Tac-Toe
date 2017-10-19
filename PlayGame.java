package com.example.palakjain.tictactoe;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class PlayGame extends AppCompatActivity {

    //boolean isVibrate;

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9;
    public static boolean symbol;
    public boolean checkWin;
    //public int countNoOfFilledBoxes;

    private String text1;
    private String text2;
    private String text3;
    private String text4;
    private String text5;
    private String text6;
    private String text7;
    private String text8;
    private String text9;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //isVibrate = false;
        symbol = false;         //false is O and true is X
        checkWin = false;       //no initial winner
        //countNoOfFilledBoxes = 0;       //Initially, no TextView has any symbol

        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);
        tv3 = (TextView) findViewById(R.id.tv3);
        tv4 = (TextView) findViewById(R.id.tv4);
        tv5 = (TextView) findViewById(R.id.tv5);
        tv6 = (TextView) findViewById(R.id.tv6);
        tv7 = (TextView) findViewById(R.id.tv7);
        tv8 = (TextView) findViewById(R.id.tv8);
        tv9 = (TextView) findViewById(R.id.tv9);

        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateTheDevice();
                if (TextUtils.isEmpty(text1)) {
                    //Log.d("TAG", "null string found!!");
                    if (symbol) {
                        symbol = false;
                        tv1.setText("O");
                    } else {
                        symbol = true;
                        tv1.setText("X");
                    }
                }
                //countNoOfFilledBoxes += 1;
                getAllTextsInBoxes();
                checkPlayer1Win();
                checkMatchDraw();
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateTheDevice();
                if (TextUtils.isEmpty(text2)) {
                    if (symbol) {
                        symbol = false;
                        tv2.setText("O");
                    } else {
                        symbol = true;
                        tv2.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                getAllTextsInBoxes();
                checkPlayer2Win();
                checkMatchDraw();
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateTheDevice();
                if (TextUtils.isEmpty(text3)) {
                    if (symbol) {
                        symbol = false;
                        tv3.setText("O");
                    } else {
                        symbol = true;
                        tv3.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                getAllTextsInBoxes();
                checkPlayer3Win();
                checkMatchDraw();
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateTheDevice();
                if (TextUtils.isEmpty(text4)) {
                    if (symbol) {
                        symbol = false;
                        tv4.setText("O");
                    } else {
                        symbol = true;
                        tv4.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                getAllTextsInBoxes();
                checkPlayer4Win();
                checkMatchDraw();
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateTheDevice();
                if (TextUtils.isEmpty(text5)) {
                    if (symbol) {
                        symbol = false;
                        tv5.setText("O");
                    } else {
                        symbol = true;
                        tv5.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                getAllTextsInBoxes();
                checkPlayer5Win();
                checkMatchDraw();
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateTheDevice();
                if (TextUtils.isEmpty(text6)) {
                    if (symbol) {
                        symbol = false;
                        tv6.setText("O");
                    } else {
                        symbol = true;
                        tv6.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                getAllTextsInBoxes();
                checkPlayer6Win();
                checkMatchDraw();
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateTheDevice();
                if (TextUtils.isEmpty(text7)) {
                    if (symbol) {
                        symbol = false;
                        tv7.setText("O");
                    } else {
                        symbol = true;
                        tv7.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                getAllTextsInBoxes();
                checkPlayer7Win();
                checkMatchDraw();
            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateTheDevice();
                if (TextUtils.isEmpty(text8)) {
                    if (symbol) {
                        symbol = false;
                        tv8.setText("O");
                    } else {
                        symbol = true;
                        tv8.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                getAllTextsInBoxes();
                checkPlayer8Win();
                checkMatchDraw();
            }
        });
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vibrateTheDevice();
                if (TextUtils.isEmpty(text9)) {
                    if (symbol) {
                        symbol = false;
                        tv9.setText("O");
                    } else {
                        symbol = true;
                        tv9.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                getAllTextsInBoxes();
                checkPlayer9Win();
                checkMatchDraw();
            }
        });

        //checkMatchDraw();
    }

    private void vibrateTheDevice() {
        if (MainActivity.isVibrate) {
            Vibrator vib = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            vib.vibrate(400);
        }
    }

    private void checkMatchDraw() {
        if (!checkWin && !TextUtils.isEmpty(text1) && !TextUtils.isEmpty(text2)
                && !TextUtils.isEmpty(text3) && !TextUtils.isEmpty(text4)
                && !TextUtils.isEmpty(text5) && !TextUtils.isEmpty(text6)
                && !TextUtils.isEmpty(text7) && !TextUtils.isEmpty(text8)
                && !TextUtils.isEmpty(text9)) {
            Toast.makeText(PlayGame.this, "DRAW", Toast.LENGTH_SHORT).show();
            displayAlertDialog();

        }
//        if (countNoOfFilledBoxes == 9){
//            if(checkWin == false){
//                Toast.makeText(MainActivity.this, "DRAW", Toast.LENGTH_SHORT).show();
//                displayAlertDialog();
//            }
//        }
    }

    private void displayAlertDialog() {
        Snackbar.make(findViewById(R.id.activity_main), "GAME OVER", Snackbar.LENGTH_INDEFINITE).show();
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(this);
        alertBuilder.setMessage("Do you want to close this app?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                symbol = false;
                checkWin = false;
                tv1.setText("");
                tv2.setText("");
                tv3.setText("");
                tv4.setText("");
                tv5.setText("");
                tv6.setText("");
                tv7.setText("");
                tv8.setText("");
                tv9.setText("");

            }
        });
        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.setTitle("GAME OVER!!");
        alertBuilder.show();
    }

    private void getAllTextsInBoxes() {
        text1 = tv1.getText().toString();
        text2 = tv2.getText().toString();
        text3 = tv3.getText().toString();
        text4 = tv4.getText().toString();
        text5 = tv5.getText().toString();
        text6 = tv6.getText().toString();
        text7 = tv7.getText().toString();
        text8 = tv8.getText().toString();
        text9 = tv9.getText().toString();
    }

    public void checkPlayer1Win() {

        //boxes 1,2,3
        if (!TextUtils.isEmpty(text2) && !TextUtils.isEmpty(text3) && text1.equals(text2) && text1.equals(text3)) {
            checkWin = true;
            if (text1.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 1,4,7
        if (!TextUtils.isEmpty(text4) && !TextUtils.isEmpty(text7) && text1.equals(text4) && text1.equals(text7)) {
            checkWin = true;
            if (text1.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 1,5,9
        if (!TextUtils.isEmpty(text5) && !TextUtils.isEmpty(text9) && text1.equals(text5) && text1.equals(text9)) {
            checkWin = true;
            if (text1.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

    }

    public void checkPlayer2Win() {

        //boxes 1,2,3
        if (!TextUtils.isEmpty(text1) && !TextUtils.isEmpty(text3) && text2.equals(text1) && text2.equals(text3)) {
            checkWin = true;
            if (text2.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 2,5,8
        if (!TextUtils.isEmpty(text5) && !TextUtils.isEmpty(text8) && text2.equals(text5) && text2.equals(text8)) {
            checkWin = true;
            if (text2.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }
    }

    public void checkPlayer3Win() {

        //boxes 1,2,3
        if (!TextUtils.isEmpty(text2) && !TextUtils.isEmpty(text1) && text3.equals(text2) && text3.equals(text1)) {
            checkWin = true;
            if (text3.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 3,6,9
        if (!TextUtils.isEmpty(text6) && !TextUtils.isEmpty(text9) && text3.equals(text6) && text3.equals(text9)) {
            checkWin = true;
            if (text3.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 3,5,7
        if (!TextUtils.isEmpty(text5) && !TextUtils.isEmpty(text7) && text3.equals(text5) && text3.equals(text7)) {
            checkWin = true;
            if (text3.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }
    }

    public void checkPlayer4Win() {

        //boxes 1,4,7
        if (!TextUtils.isEmpty(text1) && !TextUtils.isEmpty(text7) && text4.equals(text1) && text4.equals(text7)) {
            checkWin = true;
            if (text4.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 4,5,6
        if (!TextUtils.isEmpty(text5) && !TextUtils.isEmpty(text6) && text4.equals(text5) && text4.equals(text6)) {
            checkWin = true;
            if (text4.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }
    }

    public void checkPlayer5Win() {

        //boxes 2,5,8
        if (!TextUtils.isEmpty(text2) && !TextUtils.isEmpty(text8) && text5.equals(text2) && text5.equals(text8)) {
            checkWin = true;
            if (text1.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 4,5,6
        if (!TextUtils.isEmpty(text4) && !TextUtils.isEmpty(text6) && text5.equals(text4) && text5.equals(text6)) {
            checkWin = true;
            if (text5.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 1,5,9
        if (!TextUtils.isEmpty(text1) && !TextUtils.isEmpty(text9) && text5.equals(text1) && text5.equals(text9)) {
            checkWin = true;
            if (text5.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 3,5,7
        if (!TextUtils.isEmpty(text3) && !TextUtils.isEmpty(text7) && text5.equals(text3) && text5.equals(text7)) {
            checkWin = true;
            if (text5.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }
    }

    public void checkPlayer6Win() {

        //boxes 3,6,9
        if (!TextUtils.isEmpty(text3) && !TextUtils.isEmpty(text9) && text6.equals(text3) && text6.equals(text9)) {
            checkWin = true;
            if (text6.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 4,5,6
        if (!TextUtils.isEmpty(text4) && !TextUtils.isEmpty(text5) && text6.equals(text4) && text6.equals(text5)) {
            checkWin = true;
            if (text6.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }
    }

    public void checkPlayer7Win() {

        //boxes 1,4,7
        if (!TextUtils.isEmpty(text1) && !TextUtils.isEmpty(text4) && text7.equals(text1) && text7.equals(text4)) {
            checkWin = true;
            if (text7.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 7,8,9
        if (!TextUtils.isEmpty(text8) && !TextUtils.isEmpty(text9) && text7.equals(text8) && text7.equals(text9)) {
            checkWin = true;
            if (text7.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 3,5,7
        if (!TextUtils.isEmpty(text5) && !TextUtils.isEmpty(text3) && text7.equals(text3) && text7.equals(text5)) {
            checkWin = true;
            if (text7.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }
    }

    public void checkPlayer8Win() {

        //boxes 2,5,8
        if (!TextUtils.isEmpty(text2) && !TextUtils.isEmpty(text5) && text8.equals(text2) && text8.equals(text5)) {
            checkWin = true;
            if (text8.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 7,8,9
        if (!TextUtils.isEmpty(text7) && !TextUtils.isEmpty(text9) && text8.equals(text7) && text8.equals(text9)) {
            checkWin = true;
            if (text8.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }
    }

    public void checkPlayer9Win() {

        //boxes 3,6,9
        if (!TextUtils.isEmpty(text3) && !TextUtils.isEmpty(text6) && text9.equals(text3) && text9.equals(text6)) {
            checkWin = true;
            if (text9.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 7,8,9
        if (!TextUtils.isEmpty(text7) && !TextUtils.isEmpty(text8) && text9.equals(text7) && text9.equals(text8)) {
            checkWin = true;
            if (text9.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }

        //boxes 1,5,9
        if (!TextUtils.isEmpty(text5) && !TextUtils.isEmpty(text1) && text9.equals(text1) && text9.equals(text5)) {
            checkWin = true;
            if (text9.equals("O")) {
                Toast.makeText(PlayGame.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                displayAlertDialog();
            } else {
                Toast.makeText(PlayGame.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                displayAlertDialog();
            }
        }
    }
}
