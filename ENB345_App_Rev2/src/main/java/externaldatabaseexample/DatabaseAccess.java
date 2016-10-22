package externaldatabaseexample;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David-Laptop on 21/10/2016.
 */

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;



    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    /**
     * Private constructor to aboid object creation from outside classes.
     *
     * @param context
     */

    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    /**
     * Return a singleton instance of DatabaseAccess.
     *
     * @param context the Context
     * @return the instance of DabaseAccess
     */
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    /**
     * Open the database connection.
     */
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    /**
     * Close the database connection.
     */
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    /**
     * Read all quotes from the database.
     *
     * @return a List of quotes
     */
    public List<String> getName() {
        List<String> list = new ArrayList<>();

        String ID_TAG;
        ID_TAG = "1234567";

        Cursor cursor = database.rawQuery("SELECT name FROM store WHERE id=" + ID_TAG, null);

        cursor.moveToFirst();

        // This loop is finding all the data in the table (we won't need it)
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(0));
            cursor.moveToNext();
        }
        // Finalising the cursor/finding the data
        cursor.close();
        // Send the list once it's finished
        return list;
    }

    public SQLiteDatabase getDatabase() {
        return database;
    }

}
