package com.example.mtc.sb_examination;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import com.example.mtc.sb_examination.QuizContract.*;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by mtc on 2/26/2021.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "exam_db";
    private SQLiteDatabase db;

    public static final String DETAILTABLE = "detail_table";
    public static final String CoL_1 = "id";
    public static final String col_2 = "name";
    public static final String col_3 = "Rollno";
    public static final String col_4 = "marks";


    public DatabaseHelper(Context context)
    {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db = db;

        final String detail_table = "create table " + DETAILTABLE + "(ID INTEGER AUTO INCREMENT,NAME TEXT ,Rollno INTEGER UNIQUE, MARKS TEXT )";
        db.execSQL(detail_table);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int arg1, int arg2) {

        db.execSQL("DROP TABLE IF EXISTS " + DETAILTABLE);
        onCreate(db);
    }


    public boolean detail_table_insertdata(String name, String Rollno ) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(col_2, name);
        contentValues.put(col_3, Rollno);

        long a = db.insert(DETAILTABLE, null, contentValues);

        if (a == -1) {
            return false;
        } else {
            return true;
        }

    }

    public boolean detail_table(String Marks) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(col_4,Marks );
        db.update(DETAILTABLE, contentValues, null, null);
        return true;
    }


    public List<Question> getAllQuestions(String msg) {
        List<Question> questionList = new ArrayList<>();
        db = getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM quiz_questions_ne where lang   = '"+msg+"'" , null);
        if (c.moveToFirst()) {
            do {

                Question question = new Question();
                question.setQuestion(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_QUESTION)));
                question.setOption1(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION1)));
                question.setOption2(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION2)));
                question.setOption3(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION3)));
                question.setOption4(c.getString(c.getColumnIndex(QuestionsTable.COLUMN_OPTION4)));
                question.setAnswerNr(c.getInt(c.getColumnIndex(QuestionsTable.COLUMN_ANSWER_NR)));
                question.setHin(c.getString(c.getColumnIndex("lang")));
                questionList.add(question);
            } while (c.moveToNext());
        }
        c.close();
        return questionList;
    }

}







