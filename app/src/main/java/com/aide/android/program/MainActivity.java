package com.aide.android.program;

import android.app.*;
import android.os.*;
import android.graphics.*;
import android.widget.*;


public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Typeface face = Typeface.createFromAsset(getAssets(), "Vazir.ttf");
		
		TextView tv1 = (TextView) findViewById(R.id.mainTextView1);
		TextView tv2 = (TextView) findViewById(R.id.mainTextView2);
		TextView tv3 = (TextView) findViewById(R.id.mainTextView3);
		TextView tv4 = (TextView) findViewById(R.id.mainTextView4);
		
		tv1.setTypeface(face);
		tv2.setTypeface(face);
		tv3.setTypeface(face);
		tv4.setTypeface(face);
		
		Button btn1 = (Button) findViewById(R.id.mainButton1);
		
		btn1.setTypeface(face);
		
		EditText ed1 = (EditText) findViewById(R.id.mainEditText1);
		EditText ed2 = (EditText) findViewById(R.id.mainEditText2);
		
		ed1.setTypeface(face);
		ed2.setTypeface(face);
    }
}
