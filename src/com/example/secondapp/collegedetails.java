package com.example.secondapp;




import com.example.app.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class collegedetails extends Activity implements OnClickListener  {
	
	EditText personsemail,intro,personsname,stupidthings,action;
	String emailadd,beginning,name,stupidaction,hatefulact;
	Button sendemail;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		  setContentView(R.layout.email);
		  method1();
		sendemail.setOnClickListener(this);
		
		
	}
	private void method1() {
		// TODO Auto-generated method stub
		
		personsemail=(EditText)findViewById(R.id.etemails);
		intro=(EditText)findViewById(R.id.etintro);
		personsname=(EditText)findViewById(R.id.etname);
		stupidthings=(EditText)findViewById(R.id.etthings);
		action=(EditText)findViewById(R.id.etaction);
		
		sendemail=(Button)findViewById(R.id.bdetails);
		
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		yesThisIsTheMethodWeCreated();
		String ea []={emailadd};
		String message="hello"
				+ name
				
				+ beginning  
				
				+ stupidaction
			
				+ hatefulact;
			
		
		Intent emailIntent=new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, ea);
		emailIntent.setType("italic/text");
		
		startActivity(emailIntent);
		
		
	}
	private void yesThisIsTheMethodWeCreated() {
		// TODO Auto-generated method stub
		
		emailadd=personsemail.getText().toString();
		beginning=intro.getText().toString();
		name=personsname.getText().toString();
		stupidaction=stupidthings.getText().toString();
		hatefulact=action.getText().toString();
		
}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
	
	
	

}
