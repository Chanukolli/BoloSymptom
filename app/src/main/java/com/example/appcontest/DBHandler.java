package com.example.appcontest;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DBHandler extends SQLiteOpenHelper {


    public DBHandler(@Nullable Context context) {
        super(context, "ONE_HEALTH.db", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String createQueryStmnt = "CREATE TABLE ONE_HEALTH(" +
                "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NAME TEXT," +
                "EMAIL TEXT," +
                "PASSWORD TEXT," +
                "VISIT_COUNT INT," +
                "HEALTH_CONDITION BOOL" +
                ")";

        ContentValues cv = new ContentValues();
        cv.put("NAME","ADMIN");
        cv.put("EMAIL","admin");
        cv.put("PASSWORD",String.valueOf(6145));
        cv.put("VISIT_COUNT",0);
        cv.put("HEALTH_CONDITION",false);

        long rowsEffected= db.insert("ONE_HEALTH",null,cv);

        db.execSQL(createQueryStmnt);
        db.insert("ONE_HEALTH",null,cv);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean addUser(OneHealthUser user){
        SQLiteDatabase sqldb = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("NAME",user.getName());
        cv.put("EMAIL",user.getEmail());
        cv.put("PASSWORD",user.getPassword());
        cv.put("VISIT_COUNT",user.getNoOfVisits());
        cv.put("HEALTH_CONDITION",user.isHealthy());

        long rowsEffected= sqldb.insert("ONE_HEALTH",null,cv);
        long inserted = sqldb.insert("ONE_HEALTH",null,cv);
        if(rowsEffected == -1) {
            return false;
        }
        return true;
    }

    public boolean validateUser(OneHealthUser candidate){

        String getPass = "SELECT PASSWORD " +
                "FROM ONE_HEALTH " +
                "WHERE EMAIL = '"+candidate.getEmail()+"'";
        SQLiteDatabase sqldb = this.getReadableDatabase();
        Cursor resultSet = sqldb.rawQuery(getPass,null);
        String origPassword="";


            if(resultSet.moveToFirst()){
                do{

                    origPassword = resultSet.getString(0);


                    Log.d("Password", origPassword);

                }while(resultSet.moveToNext());
            }
            else{

            }



        if(origPassword.equals(candidate.getPassword())){
            return true;
        }
        resultSet.close();
        sqldb.close();
        return false;
    }
}
