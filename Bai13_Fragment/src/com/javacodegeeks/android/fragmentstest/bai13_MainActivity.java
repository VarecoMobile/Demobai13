package com.javacodegeeks.android.fragmentstest;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class bai13_MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.bai13_activity_main);
	}

	public void selectFrag(View view) {
		Fragment fr;

		if (view == findViewById(R.id.button2)) {
			fr = new bai13_FragmentTwo();

		} else {
			fr = new bai13_FragmentOne();
		}

		FragmentManager fm = getFragmentManager();
		FragmentTransaction fragmentTransaction = fm.beginTransaction();
		fragmentTransaction.replace(R.id.fragment_place, fr);
		fragmentTransaction.commit();

	}

}
