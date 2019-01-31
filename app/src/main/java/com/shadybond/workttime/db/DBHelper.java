package com.shadybond.workttime.db;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.shadybond.workttime.db.model.DailyDataDBHelper;
import com.shadybond.workttime.db.model.WeeklyDataDBHelper;
import com.shadybond.workttime.db.model.RegisteredUserDBHelper;
import com.shadybond.workttime.db.model.LoggedUserDBHelper;

public class DBHelper extends SQLiteOpenHelper{
    public DBHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
