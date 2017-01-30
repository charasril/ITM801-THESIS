package com.akexorcist.googledirection.sample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.NoCopySpan;

/**
 * Created by win on 30/1/2560.
 */

public class MyOpenHelper extends SQLiteOpenHelper{
    //Explicit
    private Context context;
    public static final String database_name = "ITM801.db";
    private static final int database_version = 1;

    private static final String userTABLE_DETAIL = "create table userTABLE (" +
            "_id integer pimary key," +
            "OriginName text, " +
            "OriginLat text," +
            "OriginLng text," +
            "DetinationName text," +
            "DestinationLat text," +
            "DestinationLng text," +
            "Way text);";

    public MyOpenHelper(Context context) {
        super(context,database_name,null,database_version);
        this.context = context;
    } //Constructor

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(userTABLE_DETAIL);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}//Main Class
