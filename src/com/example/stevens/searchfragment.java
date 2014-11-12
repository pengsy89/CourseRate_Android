package com.example.stevens;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class searchfragment extends Fragment implements OnClickListener {

	String s=null;
	EditText et=null;
	@Override
	public void onStop()
	{
		System.out.println("ConputerFragment--->onStop");
		super.onStop();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		System.out.println("ConputerFragment--->onCreateView");
		View v=inflater.inflate(R.layout.searchfragment, container, false);
		et = (EditText)v.findViewById(R.id.textView1);
		Button search = (Button)v.findViewById(R.id.search);
		Button follow = (Button)v.findViewById(R.id.follow);
		search.setOnClickListener(this);
		follow.setOnClickListener(this);
		return v;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId()==R.id.search){
			s= et.getText().toString();
			et.setText("");
			Intent i = new Intent(getActivity().getApplicationContext(), search.class);
			i.putExtra("search", s);
			startActivity(i);
		}else if(v.getId()==R.id.follow){
			Intent i = new Intent(getActivity().getApplicationContext(), mycourses.class);
			startActivity(i);
			
		}

	}



	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);


	}
}
