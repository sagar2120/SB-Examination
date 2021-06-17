package com.example.mtc.sb_examination;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;


public class submit extends Activity {

    SQLiteDatabase sqLiteDatabaseObj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        sqLiteDatabaseObj = openOrCreateDatabase("exam_db", Context.MODE_PRIVATE, null);
        sqLiteDatabaseObj.execSQL("CREATE TABLE IF NOT EXISTS quiz_questions_ne(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL ,question VARCHAR, option1 VARCHAR , option2 VARCHAR, option3 VARCHAR , option4 VARCHAR,answer_nr INTEGER,lang VARCHAR)");

        final Cursor c3 = sqLiteDatabaseObj.rawQuery("SELECT *  from quiz_questions_ne ", null);

        if(c3.getCount() > 0) {
        }
        else{


        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' Name the python module which supports regular expressions.','regex',' re',' pyre','pyregex' ,2 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which among them is used to create an object?','A class','A function','A method','A constructor' ,4 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which operator is right-associative',' *','=','+','%' ,2, 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which of the following is a Python tuple?','[1, 2, 3]','(1, 2, 3)','{1, 2, 3}','{}' ,2 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('What is the maximum value for an integer in Python 3?','2^63-1','32767','65536','No limit' ,4 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('What is the type of each element in sys.argv?','set','list','tuple','string' ,4 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('What is the length of sys.argv?','number of arguments','number of arguments + 1','number of arguments – 1','none of the mentioned' ,2 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('What does the function re.search do?','matches a pattern at the start of the string','matches a pattern at any position in the string','such a function does not exist','none of the mentioned' ,2 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('The readlines() method returns','str',' a list of lines','a list of single characters','a list of integers' ,2 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which one of the following represents the tab?','n','t','r','None of the above' ,2 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which of the following creates a pattern object?','re.create(str)','re.regex(str)','re.compile(str)','re.assemble(str)' ,3 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('What is the maximum possible length of an identifier?','16','32','64','None of these above' ,4 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Who developed the Python language?','Zim Den','Guido van Rossum','Niene Stom','Wick van Rossum' ,2 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('In which year was the Python language developed?','1995','1972','1981','1989' ,4 , 'python')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('In which language is Python written?','English','PHP','C','All of the above' ,3 , 'python')");


        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which one of the following represents the tab?','n','t','r','None of the above' ,2 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('C++ is a ___ type of language.','High-level Language','Low-level language','Middle-level language','None of the above' ,3 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('The C++ language is ______ object-oriented language.','Pure Object oriented','Not Object oriented','Semi Object-oriented or Partial Object-oriented','None of the above' ,3 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which of the following is the address operator?','@','#','&','%' ,3 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which of the following is the correct identifier?','$var_name','VAR_123','varname@','None of the above' ,2 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('How many types of elements can an array store?','Same types of elements','Char and int type','Only char types','All of the above' ,1 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('What is the size of wchar_t in C++?','2','4','2 or 4','Based on the number of bits in the system' ,4 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Pick the odd one out.','array type','character type','boolean type','integer type' ,1 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('What does a escape code represent?','alert','backslash','tab','form feed ' ,1 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which of the following is the correct identifier?','$var_name','VAR_123','varname@','None of the above' ,2 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('The programming language that has the ability to create new data types is called___.','Overloaded','Encapsulated','Reprehensible','Extensible' ,4 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which of the following is the original creator of the C++ language?','Dennis Ritchie','Ken Thompson','Bjarne Stroustrup','Brian Kernighan' ,3 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('For inserting a new line in C++ program, which one of the following statements can be used?','n','r','a','None of the above' ,1 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which of the following comment syntax is correct to create a single-line comment','//Comment','/Comment/','Comment//','None of the above' ,1 , 'cpp')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' C++ does not supports the following','Multilevel inheritance','Hierarchical inheritance',' Hybrid inheritance',' None of the above.' ,4 , 'cpp')");


        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which of the following is not a Java features?','Dynamic','Architecture Neutral','Use of pointers','Object-oriented' ,3 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('The article referred to as a','Unicode escape sequence','Octal escape','Hexadecimal','Line feed' ,1 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('_____ is used to find and fix bugs in the Java programs.','JVM','JRE','JDK','JDB' ,4 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('What is the return type of the hashCode() method in the Object class?','Object','int','long','void' ,2 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which of the following is a valid long literal?','ABH8097','L990023','904423','0xnf029L' ,4 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('What does the expression float a = 35 / 0 return?','0','Not a Number','Infinity','Run time exception' ,3 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which package contains the Random class?t','java.util package','java.lang package','java.awt package','java.io package' ,1 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('An interface with no fields or methods is known as a ','Runnable Interface','Marker Interface','Abstract Interface','CharSequence Interface' ,2 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' Which of the following is an immediate subclass of the Panel class?','Applet class','Window class','Frame class','Dialog class' ,1 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('Which keyword is used for accessing the features of a package?','export','import','package','extends' ,2 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES('  Which of the following is a mutable class in java?','java.lang.String','java.lang.Byte','java.lang.Short','java.lang.StringBuilder' ,4 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' Which of the following is a marker interface?','Runnable interface','Remote interface','Readable interface','Result interface' ,2 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' Which of the following is a reserved keyword in Java?','object','strictfp','main','system' ,2 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' How many primitive data types are there','6','7','8','9' ,3 , 'java')");
        sqLiteDatabaseObj.execSQL("INSERT INTO quiz_questions_ne(question,option1,option2,option3,option4,answer_nr,lang) VALUES(' size of int in this is ?','16bit','32bit','64bit','Depend on environment' ,2 , 'java')");


    }

    }


    public void python(View v)
    {
        Intent intent = new Intent(this, python.class);
        startActivity(intent);
    }

    public void cpp(View v)
    {
        Intent intent = new Intent(this, cpp.class);
        startActivity(intent);
    }
    public void java(View v)
    {
        Intent intent = new Intent(this, java.class);
        startActivity(intent);
    }

}
