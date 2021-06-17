package com.example.mtc.sb_examination;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;



public class startnow extends Activity {
    DatabaseHelper myDb;
    EditText e1, e2;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startnow);
        e1 = (EditText) findViewById(R.id.editText);
        e2 = (EditText) findViewById(R.id.editText2);
        myDb = new DatabaseHelper(this);
        b1 = (Button) findViewById(R.id.button2);

    }


    public void sub(View v)

    {

        if (e1.getText().toString().equals("") || e2.getText().toString().equals("")) {
            Toast.makeText(this, "Please enter the value", Toast.LENGTH_LONG).show();
        } else {
            boolean b = myDb.detail_table_insertdata(e1.getText().toString(), e2.getText().toString());
            if (b == true) {

                Toast.makeText(this, "success", Toast.LENGTH_LONG).show();
                {
                    Intent intent = new Intent(this, submit.class);
                    startActivity(intent);
                }

            } else {
                Toast.makeText(this, "same roll no", Toast.LENGTH_LONG).show();
                {

                }

            }

        }


    }
}


