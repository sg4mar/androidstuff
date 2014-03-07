package com.example.secondapp;

import java.util.Random;

import android.R;
import android.R.color;
import android.R.string;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class walle extends Activity implements View.OnClickListener {
	
	Button chkbd;
	 ToggleButton tgb;
	 EditText input;
	 TextView display;
	

	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		method1();
		tgb.setOnClickListener(this);
		chkbd.setOnClickListener(this); 
		
	}


	private void method1() {
		// TODO Auto-generated method stub
		
		chkbd=(Button) findViewById(R.id.bresults); 
		tgb=(ToggleButton) findViewById(R.id.tbresults);
		input=(EditText)findViewById(R.id.etcommand);
		 display=(TextView)findViewById(R.id.tvresults);
		
		
	}

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		switch(view.getId()){
		case R.id.bresults:
		 
			// TODO Auto-generated method stub
				String check=input.getText().toString();
				display.setText(check);
				if(check.contentEquals("left")){
					display.setGravity(Gravity.LEFT);
				}else if(check.contains("right")){
					display.setGravity(Gravity.RIGHT);
				}else if(check.contains("center")){
					display.setGravity(Gravity.CENTER);
				}else if(check.contains("green")){
					display.setTextColor(Color.GREEN);
				}else if(check.contains("blue")){
					display.setTextColor(Color.BLUE);
					
				}else if(check.contains("omg")){
					Random crazy= new Random();
					display.setText("EUREKA");
				    display.setTextSize(crazy.nextInt(80));
				    display.setTextColor(Color.rgb(crazy.nextInt(265), crazy.nextInt(265),crazy.nextInt(265)));
				    switch(crazy.nextInt(3)){
				    case 0:
				    display.setGravity(Gravity.CENTER);
				    
				    break;
				    case 1:
				    display.setGravity(Gravity.LEFT);
				    break;
				    case 2:
				    display.setGravity(Gravity.RIGHT);
				    break;
				    
				    
				    }
				    
				   
				}
				
				
				else{
					display.setText("invalid");
					display.setGravity(Gravity.CENTER);
					display.setTextColor(Color.BLACK);
					
				}
					
			
			
			
		break;
		case R.id.tabcontent:
			// TODO Auto-generated method stub
			if(tgb.isChecked()){
				input.setInputType(InputType.TYPE_CLASS_TEXT|InputType.TYPE_TEXT_VARIATION_PASSWORD);
				
				
			}else{
				input.setInputType(InputType.TYPE_CLASS_TEXT);
				
				
			
			
			
			
			break;
		
		
		
		}
		
	

}
		
	}
}