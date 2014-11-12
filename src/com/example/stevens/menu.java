package com.example.stevens;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class menu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.menu);
		
		Button ee = (Button) findViewById(R.id.ee);
		
		ee.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(getApplicationContext(), ee_courses.class);
				startActivity(i);
			}
		});
		
		Button cpe = (Button) findViewById(R.id.cpe);
		
		cpe.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(), cpe_courses.class);
				startActivity(i);
			}
		});
		
		Button nis = (Button) findViewById(R.id.nis);
		
		nis.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				Intent i = new Intent(getApplicationContext(), nis_courses.class);
				startActivity(i);
			}
		});
		
		Button mycourses = (Button)findViewById(R.id.mycourses);
		
		mycourses.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent i = new Intent(getApplicationContext(), mycourses.class);
				startActivity(i);
			}
		});
		
		final EditText et = (EditText)findViewById(R.id.textView1);
		Button search = (Button)findViewById(R.id.search);
		
		search.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
	
				String s= et.getText().toString();
				et.setText("");
				Intent i = new Intent(getApplicationContext(), search.class);
				i.putExtra("search", s);
				startActivity(i);
			}
		});
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

}
