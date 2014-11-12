package com.example.stevens;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class rate extends Activity implements OnClickListener {
	private ProgressDialog pdialog;
	
	private static String url = "http://" + setip.getip() + "/stevens/add.php";
	
	EditText textin;
	RadioGroup speed;
	RadioGroup content;
	RadioGroup method;

	String evaluation;
	String s;
	String c;
	String m;
	String course;
	
	Button add;
	boolean contains;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.rate);
		
		Intent i = getIntent();
		course = i.getStringExtra("course");
		LinearLayout layout1=(LinearLayout)findViewById(R.id.background1);
		LinearLayout layout2=(LinearLayout)findViewById(R.id.background2);
		
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		tv1.setText(course);
		if(course.startsWith("ee")){
			layout1.setBackgroundColor(Color.parseColor("#fa6b64"));
			layout2.setBackgroundColor(Color.parseColor("#fa6b64"));
		}else if(course.startsWith("cpe")){
			layout1.setBackgroundColor(Color.parseColor("#eccc4b"));
			layout2.setBackgroundColor(Color.parseColor("#eccc4b"));
		}else if(course.startsWith("nis")){
			layout1.setBackgroundColor(Color.parseColor("#69a825"));
			layout2.setBackgroundColor(Color.parseColor("#69a825"));
		}
		
		textin = (EditText) findViewById(R.id.textin);
		speed = (RadioGroup) findViewById(R.id.speed);
		content = (RadioGroup) findViewById(R.id.content);
		method = (RadioGroup) findViewById(R.id.method);
		Button submit = (Button) findViewById(R.id.submit);
		Button result = (Button) findViewById(R.id.result);
		add = (Button)findViewById(R.id.add);
		
		submit.setOnClickListener(this);
		result.setOnClickListener(this);
		add.setOnClickListener(this);
		
		contains = false;
		
		courses info = new courses(this);
		info.open();
		if (info.contains(course)) {
			add.setText("Unfollow");
			contains = true;
		}
		info.close();
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()) {
		case R.id.submit:
			evaluation = textin.getText().toString();
							
			switch(speed.getCheckedRadioButtonId()) {
				case R.id.radioButton1:
					s = "1";
					break;
				case R.id.radioButton2:
					s = "2";
					break;
				case R.id.radioButton3:
					s = "3";
					break;
				case R.id.radioButton4:
					s = "4";
					break;
				case R.id.radioButton5:
					s = "5";
					break;
			}
			
			switch(content.getCheckedRadioButtonId()) {
				case R.id.radioButton1:
					c = "1";
					break;
				case R.id.radioButton2:
					c = "2";
					break;
				case R.id.radioButton3:
					c = "3";
					break;
				case R.id.radioButton4:
					c = "4";
					break;
				case R.id.radioButton5:
					c = "5";
					break;
			}
			
			switch(method.getCheckedRadioButtonId()) {
				case R.id.radioButton1:
					m = "1";
					break;
				case R.id.radioButton2:
					m = "2";
					break;
				case R.id.radioButton3:
					m = "3";
					break;
				case R.id.radioButton4:
					m = "4";
					break;
				case R.id.radioButton5:
					m = "5";
					break;
			}
			
			new addnew().execute();
			break;
			
		case R.id.result:
			Intent i = new Intent(getApplicationContext(), result.class);
			i.putExtra("course", course);
			startActivity(i);
			break;
			
		case R.id.add:
			if (!contains) {
				boolean work = true;
				try {
					courses entry = new courses(rate.this);
					entry.open();
					entry.creatEntry(course);
					entry.close();
				}
				catch(Exception e) {
					work = false;
					String error = e.toString();
					Dialog d = new Dialog(this);
					d.setTitle("Error");
					TextView tv = new TextView(this);
					tv.setText(error);
					d.setContentView(tv);
					d.show();
				}
				finally {
					if (work) {
						Toast.makeText(getApplicationContext(), "Success!",
							     Toast.LENGTH_LONG).show();
					}
				}
				
				add.setText("Unfollow");
				contains = true;
			}
			else {
				boolean work = true;
				try {
					courses entry = new courses(rate.this);
					entry.open();
					entry.deleteEntry(course);
					entry.close();
				}
				catch(Exception e) {
					work = false;
					String error = e.toString();
					Dialog d = new Dialog(this);
					d.setTitle("Error");
					TextView tv = new TextView(this);
					tv.setText(error);
					d.setContentView(tv);
					d.show();
				}
				finally {
					if (work) {
						Toast.makeText(getApplicationContext(), "Success!",
							     Toast.LENGTH_LONG).show();
					}
				}
				
				add.setText("Follow");
				contains = false;
			}
		}	
	}
	
	class addnew extends AsyncTask<String, String, String> {
		protected void onPreExecute() {
			super.onPreExecute();
			pdialog = new ProgressDialog(rate.this);
			pdialog.setMessage("Adding...");
			pdialog.setIndeterminate(false);
			pdialog.setCancelable(true);
			pdialog.show();
		}
		
		protected String doInBackground(String... args) {
			List<NameValuePair> params = new ArrayList<NameValuePair>();
			params.add(new BasicNameValuePair("speed", s));
			params.add(new BasicNameValuePair("content", c));
			params.add(new BasicNameValuePair("method", m));
			params.add(new BasicNameValuePair("evaluation", evaluation));
			params.add(new BasicNameValuePair("course", course));
			
			try {
				DefaultHttpClient httpclient = new DefaultHttpClient();
				HttpPost httppost = new HttpPost(url);
				httppost.setEntity(new UrlEncodedFormEntity(params));
				httpclient.execute(httppost);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			
			Intent i = new Intent(getApplicationContext(), result.class);
			i.putExtra("course", course);
			startActivity(i);
			finish();
			
			return null;
		}
		
		protected void onPostExecute(String file_url) {
			pdialog.dismiss();
		}
	}
}
