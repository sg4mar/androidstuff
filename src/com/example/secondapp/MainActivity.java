package com.example.secondapp;

import android.R;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
double x;
double y;
double z;	
	Button add;
	Button subtract;
    TextView display;
    
	

    @Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list_item);
	add = (Button) findViewById(R.id.addToDictionary);
		subtract = (Button) findViewById(R.id.addToDictionary);
		display=(TextView)findViewById(R.id.text1);
		
		add.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				x=(z-32)*5/9;				
				display.setText("temp is celsius "+x);
				z+=5;
			}
		});
		
subtract.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
	
				x=1.8*y+32;
				display.setText("temp in fahrenhiet "+x);
				y+=5;
			}
		});
		
	}

	
	
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
////		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.main, menu);
//		return true;
//	}

}
