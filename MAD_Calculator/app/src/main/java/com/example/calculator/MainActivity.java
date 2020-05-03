
package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonDel, buttonEqual;
    TextView text_display, result1;
    float mValueOne, mValueTwo, Result;
    boolean Addition, Subtract, Multiplication, Division;

    int length1,i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text_display=(TextView) findViewById(R.id.txt_dis);
        result1=(TextView) findViewById(R.id.result);

        button0=(Button) findViewById(R.id.btn0);
        button1=(Button) findViewById(R.id.btn1);
        button2=(Button) findViewById(R.id.btn2);
        button3=(Button) findViewById(R.id.btn3);
        button4=(Button) findViewById(R.id.btn4);
        button5=(Button) findViewById(R.id.btn5);
        button6=(Button) findViewById(R.id.btn6);
        button7=(Button) findViewById(R.id.btn7);
        button8=(Button) findViewById(R.id.btn8);
        button9=(Button) findViewById(R.id.btn9);
        buttonAdd=(Button) findViewById(R.id.btnadd);
        buttonSub=(Button) findViewById(R.id.btnmin);
        buttonMul=(Button) findViewById(R.id.btnmul);
        buttonDivision=(Button) findViewById(R.id.btndiv);
        buttonEqual=(Button) findViewById(R.id.btnequal);
        buttonDel=(Button) findViewById(R.id.btndel);

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    mValueTwo=Float.parseFloat(text_display.getText().toString().substring(length1)+"");
                    if(Addition)
                    {
                        Result=mValueOne+mValueTwo;
                        Addition=false;
                        //result.setText(Float.toString(Result));

                    }
                    else if(Subtract)
                    {
                        Result=mValueOne-mValueTwo;
                        Subtract=false;
                        //result.setText(Float.toString(Result));

                    }
                    else if(Multiplication)
                    {
                        Result=mValueOne*mValueTwo;
                        Multiplication=false;
                        //result.setText(Float.toString(Result));

                    }
                    else if(Division)
                    {
                        Result=mValueOne/mValueTwo;
                        Division=false;
                        //result.setText(Float.toString(Result));

                    }
                    else
                    {

                    }
                    result1.setText("="+Float.toString(Result));

                }
                catch (Exception e)
                {

                }
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    result1.setText("");
                    String s= text_display.getText().toString().substring(0,text_display.getText().length()-1);
                    text_display.setText("");
                    text_display.setText(s);

                }
                catch (Exception e)
                {

                }

            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (result1.getText().toString().length() > 0) {
                        //Toast.makeText(getApplicationContext(), s2, Toast.LENGTH_SHORT).show();
                        String s1="";

                        s1=s1+result1.getText().toString().substring(1);
                        //i=(int)Float.parseFloat(s1);
                        text_display.setText(s1);
                        result1.setText("");
                    }

                }
                catch (Exception e) {
                    /*
                    String s1="";

                        s1=s1+result1.getText().toString().substring(1);
                        //i=(int)Float.parseFloat(s1);
                        text_display.setText(s1);
                        result1.setText("");
                     */
                }
                try {


                    if (text_display.getText().length() == 0) {
                        //text_display.setText(text_display.getText() + "-");
                    }
                }
                catch (Exception e)
                {
                    //text_display.setText(text_display.getText() + "/");
                }
                try {

                    if (text_display.getText().length() > 0) {
                        String s = text_display.getText().toString();
                        mValueOne = Float.parseFloat(s);

                        text_display.setText(text_display.getText().toString() + "/");
                        length1 = text_display.getText().length();
                        Division = true;
                    }
                }
                catch (Exception e)
                {

                }

            }
        });
        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (result1.getText().toString().length() > 0) {
                        //Toast.makeText(getApplicationContext(), s2, Toast.LENGTH_SHORT).show();
                        String s1="";

                        s1=s1+result1.getText().toString().substring(1);
                        //i=(int)Float.parseFloat(s1);
                        text_display.setText(s1);
                        result1.setText("");
                    }

                }
                catch (Exception e) {
                    /*
                    String s1="";

                        s1=s1+result1.getText().toString().substring(1);
                        //i=(int)Float.parseFloat(s1);
                        text_display.setText(s1);
                        result1.setText("");
                     */
                }
                try {


                    if (text_display.getText().length() == 0) {
                        //text_display.setText(text_display.getText() + "-");
                    }
                }
                catch (Exception e)
                {
                    //text_display.setText(text_display.getText() + "/");
                }
                try {

                    if (text_display.getText().length() > 0) {
                        String s = text_display.getText().toString();
                        mValueOne = Float.parseFloat(s);

                        text_display.setText(text_display.getText().toString() + "*");
                        length1 = text_display.getText().length();
                        Multiplication = true;
                    }
                }
                catch (Exception e)
                {

                }
            }
        });
        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {

                    if (result1.getText().toString().length() > 0) {
                        //Toast.makeText(getApplicationContext(), s2, Toast.LENGTH_SHORT).show();
                        String s1="";

                        s1=s1+result1.getText().toString().substring(1);
                        //i=(int)Float.parseFloat(s1);
                        text_display.setText(s1);
                        result1.setText("");
                    }

                }
                catch (Exception e) {
                    /*
                    String s1="";

                        s1=s1+result1.getText().toString().substring(1);
                        //i=(int)Float.parseFloat(s1);
                        text_display.setText(s1);
                        result1.setText("");
                     */
                }
                try {


                    if (text_display.getText().length() == 0) {
                        text_display.setText(text_display.getText() + "-");
                    }
                }
                catch (Exception e)
                {
                    text_display.setText(text_display.getText() + "-");
                }
                try {

                    if (text_display.getText().length() > 0) {
                        String s = text_display.getText().toString();
                        mValueOne = Float.parseFloat(s);

                        text_display.setText(text_display.getText().toString() + "-");
                        length1 = text_display.getText().length();
                        Subtract = true;
                    }
                }
                catch (Exception e)
                {

                }
            }
        });
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {


                    if (result1.getText().toString().length() > 0) {
                        //Toast.makeText(getApplicationContext(), s2, Toast.LENGTH_SHORT).show();
                        String s1="";

                        s1=s1+result1.getText().toString().substring(1);
                        //i=(int)Float.parseFloat(s1);
                        text_display.setText(s1);
                        result1.setText("");
                    }

                } catch (Exception e) {
                    /*
                    String s1="";

                        s1=s1+result1.getText().toString().substring(1);
                        //i=(int)Float.parseFloat(s1);
                        text_display.setText(s1);
                        result1.setText("");
                     */
                }

                try {


                    mValueOne = Float.parseFloat(text_display.getText() + "");

                    text_display.setText(text_display.getText().toString() + "+");

                    length1 = text_display.getText().length();
                    Addition = true;
                }
                catch (Exception e)
                {
                    // Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_SHORT).show();
                    text_display.setText(text_display.getText().toString()+"");

                }

            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1.getText().toString()!="")
                {
                    text_display.setText("");
                    result1.setText("");

                }
                else {
                    text_display.setText(text_display.getText().toString() + "0");
                }
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1.getText().toString()!="")
                {
                    text_display.setText("");
                    result1.setText("");
                }

                text_display.setText(text_display.getText().toString()+"1");

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1.getText().toString()!="")
                {
                    text_display.setText("");
                    result1.setText("");
                }

                text_display.setText(text_display.getText().toString()+"2");


            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1.getText().toString()!="")
                {
                    text_display.setText("");
                    result1.setText("");
                }

                text_display.setText(text_display.getText().toString()+"3");


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1.getText().toString()!="")
                {
                    text_display.setText("");
                    result1.setText("");
                }

                text_display.setText(text_display.getText().toString()+"4");


            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1.getText().toString()!="")
                {
                    text_display.setText("");
                    result1.setText("");
                }

                text_display.setText(text_display.getText().toString()+"5");


            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1.getText().toString()!="")
                {
                    text_display.setText("");
                    result1.setText("");
                }

                text_display.setText(text_display.getText().toString()+"6");


            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1.getText().toString()!="")
                {
                    text_display.setText("");
                    result1.setText("");
                }

                text_display.setText(text_display.getText().toString()+"7");


            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1.getText().toString()!="")
                {
                    text_display.setText("");
                    result1.setText("");
                }

                text_display.setText(text_display.getText().toString()+"8");


            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(result1.getText().toString()!="")
                {
                    text_display.setText("");
                    result1.setText("");
                }

                text_display.setText(text_display.getText().toString()+"9");


            }
        });


    }
}
