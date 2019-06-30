package org.kevin.xspacecrack;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SqliteHelper extends SQLiteOpenHelper {

    private Context contextHolder;

    public SqliteHelper(Context context, String name, int version) {
        super(context, name, null, version);
        this.contextHolder = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public synchronized void insert(String sql) {
        getWritableDatabase().execSQL(sql);
    }

    public synchronized long insert(String table, ContentValues values) {
        return getWritableDatabase().insert(table, null, values);
    }

    public synchronized int update(String table, ContentValues values,
                                   String whereClause, String[] whereArgs) {
        return getWritableDatabase().update(table, values,
                whereClause, whereArgs);
    }

    public synchronized Cursor query(String table, String[] columns,
                                     String selection, String[] selectionArgs, String groupBy,
                                     String having, String orderBy) {
        return getReadableDatabase().query(table, columns,
                selection, selectionArgs, groupBy, having, orderBy);
    }

    public synchronized Cursor query(String sql) {
        return getReadableDatabase().rawQuery(sql, null);
    }

    public synchronized void execSQL(String sql) {
        getReadableDatabase().execSQL(sql);
    }

    public synchronized int delete(String table, String whereClause,
                                   String[] whereArgs) {
        return getReadableDatabase().delete(table, whereClause,
                whereArgs);
    }

    public synchronized void close() {
        close();
    }
}
