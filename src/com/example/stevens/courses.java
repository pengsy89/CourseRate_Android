package com.example.stevens;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class courses {
	public static final String keyname = "course";
	
	private static final String databasename = "stevens";
	private static final String databasetable1 = "courses";
	private static final String databasetable2 = "mycourses";
	private static final int databaseversion = 1;
	
	private dbhelper ourhelper;
	private final Context ourcontext;
	private SQLiteDatabase ourdatabase;
	
	private static class dbhelper extends SQLiteOpenHelper {

		public dbhelper(Context context) {
			super(context, databasename, null, databaseversion);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			db.execSQL("CREATE TABLE " + databasetable1 + "(" + keyname + 
					" TEXT NOT NULL);");
			
			db.execSQL("CREATE TABLE " + databasetable2 + "(" + keyname + 
					" TEXT NOT NULL);");
			
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee503');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee507');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee509');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee510');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee515');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee516');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee517');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee541');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee542');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee548');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee556');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee560');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee561');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee562');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee568');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee575');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee583');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee584');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee585');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee586');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee587');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee588');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee589');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee590');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee595');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee596');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee599');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee602');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee603');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee605');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee606');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee608');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee609');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee610');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee611');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee612');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee613');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee615');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee616');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee617');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee619');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee620');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee621');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee626');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee627');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee628');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee631');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee647');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee651');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee653');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee663');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee664');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee666');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee670');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee672');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee673');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee674');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee681');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee683');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee684');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee685');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee686');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee690');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee693');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee695');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee700');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee701');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee710');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee740');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee775');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee787');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee800');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee801');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee810');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee900');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee950');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('ee960');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe514');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe517');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe521');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe533');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe536');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe537');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe540');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe542');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe545');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe548');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe550');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe555');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe556');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe558');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe560');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe563');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe565');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe579');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe580');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe585');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe590');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe591');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe592');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe593');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe599');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe600');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe602');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe604');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe608');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe610');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe612');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe619');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe625');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe631');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe636');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe638');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe640');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe642');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe643');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe644');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe645');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe646');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe654');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe655');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe656');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe658');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe664');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe668');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe671');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe678');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe679');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe680');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe682');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe685');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe686');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe690');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe691');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe693');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe695');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe700');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe701');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe702');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe732');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe765');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe800');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe810');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe900');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe950');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('cpe960');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis505');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis514');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis521');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis536');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis545');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis560');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis561');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis563');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis565');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis583');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis584');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis586');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis591');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis592');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis593');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis599');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis602');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis604');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis605');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis608');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis609');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis610');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis611');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis612');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis619');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis626');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis630');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis631');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis632');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis633');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis645');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis651');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis653');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis654');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis655');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis656');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis672');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis674');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis678');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis679');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis691');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis700');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis765');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis770');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis800');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis810');");
			db.execSQL("INSERT INTO " + databasetable1 + "(" + keyname + ") VALUES ('nis900');");			
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXITS " + databasetable1);
			db.execSQL("DROP TABLE IF EXITS " + databasetable2);
			onCreate(db);
		}
	}
	
	public courses(Context c) {
		ourcontext = c;
	}
	
	public courses open() throws SQLException {
		ourhelper = new dbhelper(ourcontext);
		ourdatabase = ourhelper.getWritableDatabase();
		return this;
	}
	
	public void close() {
		ourhelper.close();
	}

	public long creatEntry(String course) {
		ContentValues cv = new ContentValues();
		cv.put(keyname, course);
		return ourdatabase.insert(databasetable2, null, cv);
	}

	public String getData() {
		String[] columns = new String[]{keyname};
		Cursor c = ourdatabase.query(databasetable2, columns, null, null, null, null, null);
		String result = "";
		
		int nameindex = c.getColumnIndex(keyname);
		
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
			result += c.getString(nameindex) + " ";
		}
		
		return result;
	}
	
	public String getData(String s) {
		String[] columns = new String[]{keyname};
		Cursor c = ourdatabase.query(databasetable1, columns, keyname + " LIKE " + "'%" + s + "%'", null, null, null, null);
		String result = "";
		
		int nameindex = c.getColumnIndex(keyname);
		
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
			result += c.getString(nameindex) + " ";
		}
		
		return result;
	}
	
	public void deleteEntry(String s) {
		ourdatabase.delete(databasetable2, keyname + " = '" + s + "'", null);
	}
	
	public boolean contains(String s) {
		String[] columns = new String[]{keyname};
		Cursor c = ourdatabase.query(databasetable2, columns, null, null, null, null, null);
		
		int iname = c.getColumnIndex(keyname);
		
		for (c.moveToFirst(); !c.isAfterLast(); c.moveToNext()) {
			if (c.getString(iname).equals(s)) {
				return true;
			}
		}
		
		return false;
	}
}
