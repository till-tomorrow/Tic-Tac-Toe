package com.example.palakjain.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9;
    public static boolean symbol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        symbol = false;         //false is O and true is X

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
                if(TextUtils.isEmpty(tv1.getText().toString())){
                    Log.d("TAG", "null string found!!");
                    if (symbol) {
                        symbol = false;
                        tv1.setText("O");
                    } else {
                        symbol = true;
                        tv1.setText("X");
                    }
                }
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(tv2.getText().toString())){
                    if (symbol) {
                        symbol = false;
                        tv2.setText("O");
                    } else {
                        symbol = true;
                        tv2.setText("X");
                    }
                }
            }
        });
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(tv3.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv3.setText("O");
                    } else {
                        symbol = true;
                        tv3.setText("X");
                    }
                }
                }

        });
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(tv4.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv4.setText("O");
                    } else {
                        symbol = true;
                        tv4.setText("X");
                    }
                }
            }
        });
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(tv5.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv5.setText("O");
                    } else {
                        symbol = true;
                        tv5.setText("X");
                    }
                }
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(tv4.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv6.setText("O");
                    } else {
                        symbol = true;
                        tv6.setText("X");
                    }
                }
            }
        });
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(tv7.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv7.setText("O");
                    } else {
                        symbol = true;
                        tv7.setText("X");
                    }
                }
            }
        });
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(tv8.getText().toString())) {
                    if (symbol) {
                        symbol = false;
                        tv8.setText("O");
                    } else {
                        symbol = true;
                        tv8.setText("X");
                    }
                }
            }
        });
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              if(TextUtils.isEmpty(tv9.getText().toString())) {
                  if (symbol) {
                      symbol = false;
                      tv9.setText("O");
                  } else {
                      symbol = true;
                      tv9.setText("X");
                  }
              }
            }
        });
    }
}
