package com.example.trangnho.databasep1.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import com.example.trangnho.databasep1.model.Student;

/**
 * Created by Trang Nho on 02/05/2017.
 */

public class DBManager extends SQLiteOpenHelper {
    private final String TAG="DBManager";
    private static final String DB_NAME="students_manager";
    private static final String TABLE_NAME="strudent";
    private static final String ID="id";
    private static final String NAME="name";
    private static final String NUMBER="number";
    private static final String ADDRESS="address";
    private static final String EMAIL="email";
    private static int VERSION = 1 ;
    private static Context context;
    private String sql="CREATE TABLE" +TABLE_NAME+" (" +
            ID + "INTEGER PRIMARY KEY, "+
            NAME + "TEXT, " +
            NUMBER + "TEXT, " +
            ADDRESS + "TEXT, " +
            EMAIL + "TEXT" + ")";
    public DBManager(Context context) {
        super(context, DB_NAME, null, VERSION);
        this.context = context;
        Log.d(TAG,"DBManager :");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(sql);
        Log.d(TAG,"onCreate :");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+TABLE_NAME);
        onCreate(db);

        Log.d(TAG,"onUpgrade :");
    }
   public void themSinhvien(Student student)
   {
       SQLiteDatabase data=this.getWritableDatabase();
       ContentValues values = new ContentValues();
       values.put(NAME,student.getmName());
       values.put(NUMBER,student.getmNumber());
       values.put(ADDRESS,student.getmAddress());
       values.put(EMAIL,student.getmEmail());
       data.insert(TABLE_NAME,null,values);
       data.close();
       Log.d(TAG,"themSinhvien thanh cong");

   }
}
