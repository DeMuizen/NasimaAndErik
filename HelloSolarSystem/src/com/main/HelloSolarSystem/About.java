package com.main.HelloSolarSystem;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class About extends Activity { 

	public TextView tvAboutText;
	public ImageView ivAboutImage;
	public int intValue2;
	public String Value2;

	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
	      ivAboutImage = (ImageView)findViewById(R.id.about_image);		
	      tvAboutText = (TextView)findViewById(R.id.about_content1);
	      	      
	      SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
		  boolean bla = prefs.getBoolean( "preference2", true );
		  Toast.makeText(About.this, "value of preference: " + bla, Toast.LENGTH_LONG).show();
	      
	      //intValue2 = MyApp.getState();
		  //Value2 = String.valueOf(intValue2);
		  
	      //if (intValue2 == 0) {
	      //	  ivAboutImage.setVisibility(View.GONE);
	      //} else {
	      //	  ivAboutImage.setVisibility(View.VISIBLE);
	      //}
		  
		  //Toast.makeText(About.this, Value2, Toast.LENGTH_SHORT).show(); 
	      
	}
	
}
