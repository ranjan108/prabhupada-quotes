package com.krishna.prabhupadaquotes;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class QuotesActivity extends Activity {
   
   TextView textView;
   ImageButton imageButton;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_quotes);
      
      textView = (TextView) findViewById(R.id.textView1);
      imageButton = (ImageButton) findViewById(R.id.imageButton1);
      
      imageButton.setOnClickListener(new OnClickListener() {
         
         @Override
         public void onClick(View arg0) {
            // TODO Auto-generated method stub
            textView.setText("Message refreshed");
         }
      });
   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.quotes, menu);
      return true;
   }

}
