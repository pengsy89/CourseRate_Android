package com.example.stevens;

import android.app.ActionBar;
import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.view.WindowManager;

public class mmm extends FragmentActivity{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		
		System.out.println("MainActivity--->onCreate");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab);

		// 得到Activity的ActionBar
		ActionBar actionBar = getActionBar();
		// 设置AcitonBar的操作模型
		actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
		// 将Activity的头部去掉
		actionBar.setDisplayShowTitleEnabled(false);
		actionBar.setDisplayOptions(Window.FEATURE_NO_TITLE);
		// 生成Tab
		Tab ee = actionBar.newTab().setText("EE");
		Tab cpe = actionBar.newTab().setText("CPE");
		Tab nis = actionBar.newTab().setText("NIS");
		Tab search = actionBar.newTab().setText("More");
		
		// 为每个Tab添加Listener
		ee.setTabListener(new MyTabListener(new ee_courses()));
		cpe.setTabListener(new MyTabListener(new cpe_courses()));
		nis.setTabListener(new MyTabListener(new nis_courses()));
		search.setTabListener(new MyTabListener(new searchfragment()));
		// 将Tab加入ActionBar中
		actionBar.addTab(ee);
		actionBar.addTab(cpe);
		actionBar.addTab(nis);
		actionBar.addTab(search);
	}

	@Override
	protected void onStop()
	{
		System.out.println("MainActivity--->onStop");
		super.onStop();
	}
	
	class MyTabListener implements TabListener
	{
		private Fragment fragment;
		
		public MyTabListener(Fragment fragment) {
			this.fragment = fragment;
		}

		// 接收每个Tab对应的Fragment，操作


		public void onTabReselected(Tab tab, FragmentTransaction ft)
		{
		}

		// 当Tab被选中的时候添加对应的Fragment
		public void onTabSelected(Tab tab, FragmentTransaction ft)
		{
			ft.add(R.id.tab, fragment, null);
		}

		// 当Tab没被选中的时候删除对应的此Tab对应的Fragment
		public void onTabUnselected(Tab tab, FragmentTransaction ft)
		{
			ft.remove(fragment);
		}


	}
}
