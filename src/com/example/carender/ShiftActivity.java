package com.example.carender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShiftActivity extends Activity {


	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_shift);
	    Button b1 = (Button)findViewById(R.id.Button01);
	    b1.setOnClickListener(new View.OnClickListener(){
	    	@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
	    		Intent intent1 = new Intent(ShiftActivity.this,MainActivity.class);
				startActivity(intent1);
			}
		});


	    Button b2 = (Button)findViewById(R.id.Button01x);
	    b2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent2 = new Intent(ShiftActivity.this,MainActivity.class);
				startActivity(intent2);
			}
		});

	    // TODO Auto-generated method stub
	}



}




