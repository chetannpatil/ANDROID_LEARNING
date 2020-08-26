package com.example.chetan.fragmentapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by chetan on 8/8/16.
 */
 public class DatabassHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME ="employee.db";
    public static final String TABLE_NAME ="employee_details";
    public static final String COL_1 = "emp_id";
    public static final String COL_2 = "name";
    public static final String COL_3 ="salary";

    public DatabassHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("create table"+TABLE_NAME+"(emp_id INTEGER PRIMARY KEY AUTOINCREMENT,name TEXT,salary INTEGER)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

        sqLiteDatabase.execSQL(" DROP TABLE IF EXISTS" +TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
