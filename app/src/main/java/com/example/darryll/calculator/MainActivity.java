package com.example.darryll.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private double result = 0;
    private String firstNum = "";
    private String currentNum = "";
    private double firstNumDbl = 0;
    private double currentNumDbl = 0;
    private char arithOp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btn0 = (Button) findViewById(R.id.btn_0);
        final Button btn1 = (Button) findViewById(R.id.btn_1);
        final Button btn2 = (Button) findViewById(R.id.btn_2);
        final Button btn3 = (Button) findViewById(R.id.btn_3);
        final Button btn4 = (Button) findViewById(R.id.btn_4);
        final Button btn5 = (Button) findViewById(R.id.btn_5);
        final Button btn6 = (Button) findViewById(R.id.btn_6);
        final Button btn7 = (Button) findViewById(R.id.btn_7);
        final Button btn8 = (Button) findViewById(R.id.btn_8);
        final Button btn9 = (Button) findViewById(R.id.btn_9);
        final Button btnPosNeg = (Button) findViewById(R.id.btnPosNeg);
        final Button btnDecimal = (Button) findViewById(R.id.btnDecimal);

        final Button btnPlus = (Button) findViewById(R.id.btnPlus);
        final Button btnMinus = (Button) findViewById(R.id.btnMinus);
        final Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        final Button btnDivide = (Button) findViewById(R.id.btnDivide);

        final Button btnResult = (Button) findViewById(R.id.btnResult);
        final Button btnClear = (Button) findViewById(R.id.btnClear);

        final TextView resultView = (TextView) findViewById(R.id.resultViewer);

        /********************** NUMBER BUTTONS /START ***********************/
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btn0.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btn1.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
                //Toast toast = Toast.makeText(getApplicationContext(), currentNum, Toast.LENGTH_SHORT);
                //toast.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btn2.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btn3.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btn4.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btn5.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btn6.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btn7.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btn8.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btn9.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });
        /********************** NUMBER BUTTONS /END ***********************/

        // Button to set number as negative
        btnPosNeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btnPosNeg.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });

        // Button to add decimal point to number
        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentNum = setCurrentNumOnClick(btnDecimal.getText().toString(), currentNum, result);
                resultView.setText(currentNum);
            }
        });


        /********************** ARITHMETIC OPERATOR BUTTONS /START ***********************/
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btnInput = btnPlus.getText().toString();

                if(currentNum != "" && arithOp == '\0') {
                    firstNum = currentNum;
                    firstNumDbl = Double.parseDouble(firstNum);
                    arithOp = btnInput.charAt(0);
                    currentNum = "";
                    resultView.setText(btnInput);
                } else if (firstNum != "" && arithOp != '\0') {
                    arithOp = btnInput.charAt(0);
                    resultView.setText(btnInput);
                }

                Toast toast = Toast.makeText(getApplicationContext(), btnInput, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btnInput = btnMinus.getText().toString();

                if(currentNum != "" && arithOp == '\0') {
                    firstNum = currentNum;
                    firstNumDbl = Double.parseDouble(firstNum);
                    arithOp = btnInput.charAt(0);
                    currentNum = "";
                    resultView.setText(btnInput);
                } else if (firstNum != "" && arithOp != '\0') {
                    arithOp = btnInput.charAt(0);
                    resultView.setText(btnInput);
                }

                Toast toast = Toast.makeText(getApplicationContext(), btnInput, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btnInput = btnMultiply.getText().toString();

                if(currentNum != "" && arithOp == '\0') {
                    firstNum = currentNum;
                    firstNumDbl = Double.parseDouble(firstNum);
                    arithOp = btnInput.charAt(0);
                    currentNum = "";
                    resultView.setText(btnInput);
                } else if (firstNum != "" && arithOp != '\0') {
                    arithOp = btnInput.charAt(0);
                    resultView.setText(btnInput);
                }

                Toast toast = Toast.makeText(getApplicationContext(), btnInput, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String btnInput = btnDivide.getText().toString();

                if(currentNum != "" && arithOp == '\0') {
                    firstNum = currentNum;
                    firstNumDbl = Double.parseDouble(firstNum);
                    arithOp = btnInput.charAt(0);
                    currentNum = "";
                    resultView.setText(btnInput);
                } else if (firstNum != "" && arithOp != '\0') {
                    arithOp = btnInput.charAt(0);
                    resultView.setText(btnInput);
                }

                Toast toast = Toast.makeText(getApplicationContext(), btnInput, Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        /********************** ARITHMETIC OPERATOR BUTTONS /END ***********************/

        // Button to clear all inputs and stored values
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = 0.0;
                firstNum = "";
                currentNum = "";
                firstNumDbl = 0.0;
                currentNumDbl = 0.0;
                arithOp = '\0';
                resultView.setText("0.0");
            }
        });

        // Button to calculate final result
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //currentNum = setCurrentNumOnClick(btnResult.getText().toString(), currentNum, result);
                //resultView.setText(currentNum);

                if(currentNum != "" && firstNum != "" && arithOp != '\0') {
                    currentNumDbl = Double.parseDouble(currentNum);
                    switch (arithOp) {
                        case '+':   result = firstNumDbl + currentNumDbl;
                                    break;
                        case '-':   result = firstNumDbl - currentNumDbl;
                                    break;
                        case '*':   result = firstNumDbl * currentNumDbl;
                                    break;
                        case '/':   if(currentNumDbl == 0.0) {
                                        result = 0.0;
                                        currentNum = "";
                                        firstNum = "";
                                        arithOp = '\0';
                                        //resultView.setText("0");
                                    } else {
                                        result = firstNumDbl / currentNumDbl;
                                    }
                                    break;
                    }

                    resultView.setText(String.valueOf(result));
                }
            }
        });
    }

    /* Handles numbers, decimal and negative inputs */
    public static String setCurrentNumOnClick(String btnInput, String currentNum, double result) {

        if(currentNum == "" && result == 0) {
            if(btnInput == "+/-") {
                currentNum = "-";
            } else {
                currentNum = btnInput;
            }
        } else if (currentNum != "" && currentNum.length() <= 15) {
            switch (btnInput) {
                case "0":
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                case "8":
                case "9":   currentNum += btnInput;
                            break;
                case ".":   if(currentNum == "") {
                                currentNum = "0" + btnInput;
                            } else if(!currentNum.contains(btnInput)) {
                                currentNum += btnInput;
                            }
                            break;
                case "+/-": if(currentNum != "" && currentNum.contains("-")) {
                                currentNum = currentNum.substring(1);
                            } else if (currentNum == "") {
                                currentNum = "-";
                            } else {
                                currentNum = "-" + currentNum;
                            }
                            break;
                default:    break;
            }
        }

        return currentNum;
    }
}
