package com.example.stevens;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class result extends Activity {
	private ProgressDialog pdialog;
	private TextView tv;
	ArrayList<HashMap<String, String>> list;
	private static String url = "http://" + setip.getip() + "/stevens/getall.php";
	
	private String course;
	
	JSONArray jsonarray = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.result);
		
		Intent i = getIntent();
		course = i.getStringExtra("course");
		
		TextView tv1 = (TextView)findViewById(R.id.textView1);
		tv1.setText("The result of the course " + course + ":");
		
		tv = (TextView)findViewById(R.id.result);
		list = new ArrayList<HashMap<String, String>>();
		
		new loadall().execute();
	}
	
	class loadall extends AsyncTask<String, String, String> {
		protected void onPreExecute() {
			super.onPreExecute();
			pdialog = new ProgressDialog(result.this);
			pdialog.setMessage("Loading data. Please wait...");
			pdialog.setIndeterminate(false);
			pdialog.setCancelable(false);
			pdialog.show();
		}
		
		protected String doInBackground(String... args) {
			JSONObject json = null;
			
			try {
				DefaultHttpClient httpclient = new DefaultHttpClient();
				HttpGet httpget = new HttpGet(url);
				
				HttpResponse httpresponse = httpclient.execute(httpget);
				HttpEntity httpentity = httpresponse.getEntity();
				InputStream is = httpentity.getContent();
			
				BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
				StringBuilder sb = new StringBuilder();
				String line = null;
				while ((line = reader.readLine()) != null) {
					sb.append(line + "\n");
				}
				is.close();
				String jsonstring = sb.toString();
				System.out.println(jsonstring);
				json = new JSONObject(jsonstring);
			}
			
			
			catch(Exception e) {
				Log.e("GET JSON ", "Error: " + e.toString());
			}
			
			Log.d("All data: ", json.toString());
			
			try {
				jsonarray = json.getJSONArray("data");
				
				for (int i = 0; i < jsonarray.length(); i ++) {
					JSONObject c = jsonarray.getJSONObject(i);
					
					String course2 = c.getString("course");
					if (!course2.equals(course)) {
						continue;
					}
					
					String id = c.getString("id");
					String speed = c.getString("speed");
					String content = c.getString("content");
					String method = c.getString("method");
					String evaluation = c.getString("evaluation");
					
					HashMap<String, String> map = new HashMap<String, String>();
					map.put("id", id);
					map.put("speed", speed);
					map.put("content", content);
					map.put("method", method);
					map.put("evaluation", evaluation);
					map.put("course", course2);
					
					list.add(map);
				}
			}
			catch(JSONException e) {
				e.printStackTrace();
			}
			
			return null;
		}
		
		protected void onPostExecute(String file_url) {
			pdialog.dismiss();
			
			runOnUiThread(new Runnable() {
				public void run() {
					String result = "";
					float aves=0,avec=0,avem=0;
				
					for (int i = 0; i < list.size(); i ++) {
						result = "Student " + (i + 1) + ":\n" +
								"Speed:"+list.get(i).get("speed") + " " + 
								"Content:"+list.get(i).get("content") + " " + 
								"Method:"+list.get(i).get("method") + "\n" + 
								"Evaluation:"+list.get(i).get("evaluation") + "\n\n" + result;
						aves+=Float.parseFloat(list.get(i).get("speed"));
						avec+=Float.parseFloat(list.get(i).get("content"));
						avem+=Float.parseFloat(list.get(i).get("method"));						
					}
					String avess=String.valueOf(aves/list.size());
					String avecs=String.valueOf(avec/list.size());
					String avems=String.valueOf(avem/list.size());
					result="Average:\n"+
							"Speed:"+avess + " " + 
							"Content:"+avecs + " " + 
							"Method:"+avems + "\n" + "\n" + result;
					
					tv.setText(result);
				}
			});

		}
	}
	
}
