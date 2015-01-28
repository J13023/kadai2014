package com.example.carender;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BankActivity extends Activity{
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_bank);
	    Button b1 = (Button)findViewById(R.id.Button01);
	    b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO 自動生成されたメソッド・スタブ
				Intent intent1 = new Intent(BankActivity.this,MainActivity.class);
				startActivity(intent1);

			}


		});


	}

}
