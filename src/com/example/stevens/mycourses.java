package com.example.stevens;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class mycourses extends ListActivity {
	String[] courses;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.follow);
		courses info = new courses(this);
		info.open();
		String data = info.getData();
		info.close();
		
		courses = data.split(" ");
		
		setListAdapter(new ArrayAdapter<String>(mycourses.this, android.R.layout.simple_list_item_1, courses));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		Intent i = new Intent(getApplicationContext(), rate.class);
		i.putExtra("course", courses[position]);
		startActivity(i);
	}
	
	
}
