package com.example.mtc.sb_examination;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.System.exit;


public class activity_result extends Activity {
    public TextView display_res;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_result);
        display_res=(TextView)findViewById(R.id.textView5);
        String marks1 =getIntent().getStringExtra("marks");


        int m1=Integer.parseInt(marks1.toString());

        DatabaseHelper dbHelper = new DatabaseHelper(this);
        dbHelper.detail_table(marks1);





        if(m1<=5)
        {
            display_res.setText("Your are FAIL \n Your Final Score is = "+marks1.toString());
        }
        else if(m1>6 && m1 <10)
        {
            display_res.setText("Your are PASS \n Your Final Score is = "+marks1.toString());
        }
        else  if (m1>11 && m1 <= 15)
        {
            display_res.setText("Your Performance Is Excellent \n Your Final Score is = "+marks1.toString());
        }

    }


    public void exit1(View v)
    {
        Intent _result = new Intent();
        setResult(Activity.RESULT_OK, _result);
        finish();
    }

}
