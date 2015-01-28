package com.example.carender;

import java.util.Calendar;

import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class CalendarSetting extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        Button b1 = (Button)findViewById(R.id.Button1);
        b1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent1 = new Intent(CalendarSetting.this,CalendarSetting2.class);
				startActivity(intent1);

            }
        });
			final Calendar calendar = Calendar.getInstance();
			final int hour = calendar.get(Calendar.HOUR_OF_DAY);
			final int minute = calendar.get(Calendar.MINUTE);



        final TimePickerDialog timePickerDialog = new TimePickerDialog(this,new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                    Toast.makeText(CalendarSetting.this,String.valueOf(hourOfDay) + ":" + String.valueOf(minute),
                        Toast.LENGTH_SHORT).show();
                }
            }, hour, minute, true);
        timePickerDialog.show();

    }
   }


