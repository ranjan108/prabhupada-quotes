package com.krishna.prabhupadaquotes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class QuotesActivity extends Activity {
   
   public static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("MMMM-dd");
   public static final Calendar CALENDAR = Calendar.getInstance();
   public static final Date NOW = CALENDAR.getTime();
   public TextView textView;
   public ImageButton imageButton;
   public TextView dateView;
   Calendar currentCalendar = null;
   public String currentDateString;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_quotes);
      
      textView = (TextView) findViewById(R.id.textView1);
      imageButton = (ImageButton) findViewById(R.id.imageButton1);
      dateView = (TextView) findViewById(R.id.date);
      
      currentCalendar = CALENDAR;
      currentDateString = SIMPLE_DATE_FORMAT.format(currentCalendar.getTime());
      dateView.setText(currentDateString);
      
      imageButton.setOnClickListener(new OnClickListener() {
         
         @Override
         public void onClick(View arg0) {
            textView.setText("Message refreshed");
            dateView.setText(SIMPLE_DATE_FORMAT.format(getNextCalendar(currentCalendar).getTime()));
         }
      });
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.quotes, menu);
      return true;
   }
   
   public Calendar getNextCalendar(Calendar currentCalendar){
      currentCalendar.add(Calendar.DAY_OF_YEAR, 1);
      return currentCalendar;
   }
   
   public Calendar getLastCalendar(Calendar currentCalendar){
      currentCalendar.add(Calendar.DAY_OF_YEAR, -1);
      return currentCalendar;
   }

}
