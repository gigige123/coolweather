package com.bignerdranch.android.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by ericchen on 2016/11/21.
 */
public class CoolWeatherDB {
    //数据库名
    public static final String DB_NAME = "cool_weather";

    //数据库版本
    public static final int VERSION = 1;

    private static CoolWeatherDB coolWeatherDB;

    private SQLiteDatabase db;

    //将构造方法私有化
    private CoolWeatherDB(Context context){
        CoolWeatherOpenHelper dbHelper = new CoolWeatherOpenHelper(context,DB_NAME,null,VERSION);
        db = dbHelper.getWritableDatabase();
    }

    //获取CoolWeatherDB实例
    public synchronized static CoolWeatherDB getInstance(Context context){
        if(coolWeatherDB==null){
            coolWeatherDB = new CoolWeatherDB(context);
        }
        return coolWeatherDB;
    }

    //将
}
