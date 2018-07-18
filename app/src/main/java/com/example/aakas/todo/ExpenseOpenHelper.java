package com.example.aakas.todo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ExpenseOpenHelper extends SQLiteOpenHelper {

    public static final String name= "expense_db";
    public static final int version= 1;


    public ExpenseOpenHelper(Context context) {
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String expenseSql = "CREATE TABLE expense_table(" +
                Contract.expense.COLUM_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                Contract.expense.COLUM_NAME + " TEXT, " +
                Contract.expense.COLUM_AMOUNT + " INTEGER)" ;

        sqLiteDatabase.execSQL(expenseSql);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
