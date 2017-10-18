package com.example.palakjain.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9;
    public static boolean symbol;
    public boolean checkWin;
    //public int countNoOfFilledBoxes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                if (TextUtils.isEmpty(tv1.getText().toString())) {
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
                checkPlayer1Win();
                checkMatchDraw();
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(tv2.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv2.setText("O");
                    } else {
                        symbol = true;
                        tv2.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                checkPlayer2Win();
                checkMatchDraw();
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(tv3.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv3.setText("O");
                    } else {
                        symbol = true;
                        tv3.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                checkPlayer3Win();
                checkMatchDraw();
            }
        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(tv4.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv4.setText("O");
                    } else {
                        symbol = true;
                        tv4.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                checkPlayer4Win();
                checkMatchDraw();
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(tv5.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv5.setText("O");
                    } else {
                        symbol = true;
                        tv5.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                checkPlayer5Win();
                checkMatchDraw();
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(tv6.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv6.setText("O");
                    } else {
                        symbol = true;
                        tv6.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                checkPlayer6Win();
                checkMatchDraw();
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(tv7.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv7.setText("O");
                    } else {
                        symbol = true;
                        tv7.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                checkPlayer7Win();
                checkMatchDraw();
            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(tv8.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv8.setText("O");
                    } else {
                        symbol = true;
                        tv8.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                checkPlayer8Win();
                checkMatchDraw();
            }
        });
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(tv9.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv9.setText("O");
                    } else {
                        symbol = true;
                        tv9.setText("X");
                    }
                }
                //countNoOfFilledBoxes++;
                checkPlayer9Win();
                checkMatchDraw();
            }
        });

        //checkMatchDraw();

    }

    private void checkMatchDraw() {
        if (!TextUtils.isEmpty(tv1.getText().toString()) && !TextUtils.isEmpty(tv2.getText().toString())
                && !TextUtils.isEmpty(tv3.getText().toString()) && !TextUtils.isEmpty(tv4.getText().toString())
                && !TextUtils.isEmpty(tv5.getText().toString()) && !TextUtils.isEmpty(tv6.getText().toString())
                && !TextUtils.isEmpty(tv7.getText().toString()) && !TextUtils.isEmpty(tv8.getText().toString())
                && !TextUtils.isEmpty(tv9.getText().toString()) && checkWin == false ){
                        Toast.makeText(MainActivity.this, "DRAW", Toast.LENGTH_SHORT).show();
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
            }
        });
        AlertDialog alertDialog = alertBuilder.create();
        alertDialog.setTitle("GAME OVER!!");
        alertBuilder.show();
    }

    public void checkPlayer1Win() {
        if (!TextUtils.isEmpty(tv2.getText().toString()) && !TextUtils.isEmpty(tv3.getText().toString())) {
            if (tv2.getText().toString().equals(tv3.getText().toString()) && tv2.getText().toString().equals(tv1.getText().toString())) {
                checkWin= true;
                if (tv1.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }
                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }
            }
        } else if (!TextUtils.isEmpty(tv4.getText().toString()) && !TextUtils.isEmpty(tv7.getText().toString())) {
            if (tv4.getText().toString().equals(tv7.getText().toString()) && tv4.getText().toString().equals(tv1.getText().toString())) {
                checkWin= true;
                if (tv1.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }
            }
        } else if (!TextUtils.isEmpty(tv5.getText().toString()) && !TextUtils.isEmpty(tv9.getText().toString())) {
            if (tv5.getText().toString().equals(tv9.getText().toString()) && tv5.getText().toString().equals(tv1.getText().toString())) {
                checkWin= true;
                if (tv1.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }
                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }
            }
        }
    }

    public void checkPlayer2Win() {
        if (!TextUtils.isEmpty(tv2.getText().toString()) && !TextUtils.isEmpty(tv3.getText().toString())) {
            if (tv2.getText().toString().equals(tv3.getText().toString()) && tv2.getText().toString().equals(tv1.getText().toString())) {
                checkWin= true;
                if (tv2.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }
                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }
            }
        } else if (!TextUtils.isEmpty(tv5.getText().toString()) && !TextUtils.isEmpty(tv8.getText().toString())) {
            if (tv5.getText().toString().equals(tv8.getText().toString()) && tv5.getText().toString().equals(tv2.getText().toString())) {
                checkWin= true;
                if (tv2.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }
                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }
            }
        }
    }

    public void checkPlayer3Win() {
        if (!TextUtils.isEmpty(tv2.getText().toString()) && !TextUtils.isEmpty(tv3.getText().toString())) {
            if (tv2.getText().toString().equals(tv3.getText().toString()) && tv2.getText().toString().equals(tv1.getText().toString())) {
                checkWin= true;
                if (tv3.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }
                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }
            }
        } else if (!TextUtils.isEmpty(tv6.getText().toString()) && !TextUtils.isEmpty(tv9.getText().toString())) {
            if (tv6.getText().toString().equals(tv9.getText().toString()) && tv6.getText().toString().equals(tv3.getText().toString())) {
                checkWin= true;
                if (tv3.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }
                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        } else if (!TextUtils.isEmpty(tv5.getText().toString()) && !TextUtils.isEmpty(tv7.getText().toString())) {
            if (tv5.getText().toString().equals(tv7.getText().toString()) && tv5.getText().toString().equals(tv3.getText().toString())) {
                checkWin= true;
                if (tv3.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        }
    }

    public void checkPlayer4Win() {
        if (!TextUtils.isEmpty(tv1.getText().toString()) && !TextUtils.isEmpty(tv7.getText().toString())) {
            if (tv1.getText().toString().equals(tv7.getText().toString()) && tv1.getText().toString().equals(tv4.getText().toString())) {
                checkWin= true;
                if (tv4.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else {
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }
            }
        } else if (!TextUtils.isEmpty(tv5.getText().toString()) && !TextUtils.isEmpty(tv6.getText().toString())) {
            if (tv5.getText().toString().equals(tv6.getText().toString()) && tv5.getText().toString().equals(tv4.getText().toString())) {
                checkWin= true;
                if (tv4.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        }
    }

    public void checkPlayer5Win() {
        if (!TextUtils.isEmpty(tv2.getText().toString()) && !TextUtils.isEmpty(tv8.getText().toString())) {
            if (tv5.getText().toString().equals(tv8.getText().toString()) && tv2.getText().toString().equals(tv5.getText().toString())) {
                checkWin= true;
                if (tv1.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        } else if (!TextUtils.isEmpty(tv4.getText().toString()) && !TextUtils.isEmpty(tv6.getText().toString())) {
            if (tv4.getText().toString().equals(tv6.getText().toString()) && tv4.getText().toString().equals(tv5.getText().toString())) {
                checkWin= true;
                if (tv5.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        } else if (!TextUtils.isEmpty(tv1.getText().toString()) && !TextUtils.isEmpty(tv9.getText().toString())) {
            if (tv1.getText().toString().equals(tv9.getText().toString()) && tv1.getText().toString().equals(tv5.getText().toString())) {
                checkWin= true;
                if (tv5.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        } else if (!TextUtils.isEmpty(tv3.getText().toString()) && !TextUtils.isEmpty(tv7.getText().toString())) {
            if (tv3.getText().toString().equals(tv7.getText().toString()) && tv3.getText().toString().equals(tv5.getText().toString())) {
                checkWin= true;
                if (tv5.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        }
    }

    public void checkPlayer6Win() {
        if (!TextUtils.isEmpty(tv3.getText().toString()) && !TextUtils.isEmpty(tv9.getText().toString())) {
            if (tv3.getText().toString().equals(tv9.getText().toString()) && tv3.getText().toString().equals(tv6.getText().toString())) {
                checkWin= true;
                if (tv6.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        } else if (!TextUtils.isEmpty(tv4.getText().toString()) && !TextUtils.isEmpty(tv5.getText().toString())) {
            if (tv4.getText().toString().equals(tv5.getText().toString()) && tv4.getText().toString().equals(tv6.getText().toString())) {
                checkWin= true;
                if (tv6.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        }
    }

    public void checkPlayer7Win() {
        if (!TextUtils.isEmpty(tv1.getText().toString()) && !TextUtils.isEmpty(tv4.getText().toString())) {
            if (tv1.getText().toString().equals(tv4.getText().toString()) && tv1.getText().toString().equals(tv7.getText().toString())) {
                checkWin= true;
                if (tv7.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        } else if (!TextUtils.isEmpty(tv8.getText().toString()) && !TextUtils.isEmpty(tv9.getText().toString())) {
            if (tv8.getText().toString().equals(tv9.getText().toString()) && tv8.getText().toString().equals(tv7.getText().toString())) {
                checkWin= true;
                if (tv7.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        } else if (!TextUtils.isEmpty(tv5.getText().toString()) && !TextUtils.isEmpty(tv3.getText().toString())) {
            if (tv5.getText().toString().equals(tv3.getText().toString()) && tv5.getText().toString().equals(tv7.getText().toString())) {
                checkWin= true;
                if (tv7.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        }
    }

    public void checkPlayer8Win() {
        if (!TextUtils.isEmpty(tv2.getText().toString()) && !TextUtils.isEmpty(tv5.getText().toString())) {
            if (tv2.getText().toString().equals(tv5.getText().toString()) && tv2.getText().toString().equals(tv8.getText().toString())) {
                checkWin= true;
                if (tv8.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            }
        } else if (!TextUtils.isEmpty(tv7.getText().toString()) && !TextUtils.isEmpty(tv9.getText().toString())) {
            if (tv7.getText().toString().equals(tv9.getText().toString()) && tv7.getText().toString().equals(tv8.getText().toString())) {
                checkWin= true;
                if (tv8.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }
                else {
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }
            }
        }
    }

    public void checkPlayer9Win() {
        if (!TextUtils.isEmpty(tv3.getText().toString()) && !TextUtils.isEmpty(tv6.getText().toString())) {
            if (tv3.getText().toString().equals(tv6.getText().toString()) && tv3.getText().toString().equals(tv9.getText().toString())) {
                checkWin= true;
                if (tv9.getText().toString().equals("O")){
                    Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                    displayAlertDialog();
                }

                else{
                    Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                    displayAlertDialog();
                }

            } else if (!TextUtils.isEmpty(tv7.getText().toString()) && !TextUtils.isEmpty(tv8.getText().toString())) {
                if (tv7.getText().toString().equals(tv8.getText().toString()) && tv7.getText().toString().equals(tv9.getText().toString())) {
                    checkWin= true;
                    if (tv9.getText().toString().equals("O")){
                        Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                        displayAlertDialog();
                    }

                    else{
                        Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                        displayAlertDialog();
                    }

                }
            } else if (!TextUtils.isEmpty(tv5.getText().toString()) && !TextUtils.isEmpty(tv1.getText().toString())) {
                if (tv5.getText().toString().equals(tv1.getText().toString()) && tv5.getText().toString().equals(tv9.getText().toString())) {
                    checkWin= true;
                    if (tv9.getText().toString().equals("O")){
                        Toast.makeText(MainActivity.this, "Player 2 won!!", Toast.LENGTH_SHORT).show(); //symbol O
                        displayAlertDialog();
                    }

                    else{
                        Toast.makeText(MainActivity.this, "Player 1 won!!", Toast.LENGTH_SHORT).show(); //symbol X
                        displayAlertDialog();
                    }

                }
            }
        }
    }
}

