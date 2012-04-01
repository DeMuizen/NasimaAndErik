package com.main.HelloSolarSystem; //File name and location within file structure

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.*;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;

public class HelloSolarSystemActivity extends Activity {
	private ImageButton btnPlusLeft;
	private ImageButton btnPlusRight;
	private ImageButton btnMinusLeft;
	private ImageButton btnMinusRight;
	private TextView tvNumberLeft;
	private TextView tvNumberRight;
	private TextView tvAnswer;
	private int NumberOnScreenLeft = 10;
	private int NumberOnScreenRight = 10;
	public boolean FirstLoad = true;
	private String SpinnerChoice = "x";
	
	/////////////
	//MENU
	/////////////
	
	//Define menu layout
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
	    
	    MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.menu, menu);
	    return true;
	}
	
	//Define menu behavior when option is clicked
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    switch (item.getItemId()) {
	        case R.id.about_menuitem: 
	        startActivity(new Intent(this, About.class));
	        break;
	        case R.id.settings_menuitem:
	            startActivity(new Intent(this, Preferences.class));
	        break;
	        }
	    return true;
	}
	
	/////////////
	//MAIN CODE BODY
	/////////////
	
	@Override
    public void onCreate(Bundle savedInstanceState) { 					// I do not know what this does
	      super.onCreate(savedInstanceState); 							// I do not know what this does
	      setContentView(R.layout.main); 								// Connect this file to the interface xml file (in general)
	      btnPlusLeft = (ImageButton)findViewById(R.id.PlusLeft);		// Connect UI element in the interface file to a specific variable in this file
	      btnPlusRight = (ImageButton)findViewById(R.id.PlusRight);		// Connect UI element in the interface file to a specific variable in this file
	      btnMinusLeft = (ImageButton)findViewById(R.id.MinusLeft);		// Connect UI element in the interface file to a specific variable in this file
	      btnMinusRight = (ImageButton)findViewById(R.id.MinusRight);	// Connect UI element in the interface file to a specific variable in this file
	      tvNumberLeft = (TextView)findViewById(R.id.NumberLeft);		// Connect UI element in the interface file to a specific variable in this file
	      tvNumberRight = (TextView)findViewById(R.id.NumberRight);		// Connect UI element in the interface file to a specific variable in this file
	      tvAnswer = (TextView)findViewById(R.id.Answer);				// Connect UI element in the interface file to a specific variable in this file
	      final Spinner Spinner = (Spinner) findViewById(R.id.Spinner);
	      
	      //Spinner event handler
		  Spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
		      public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
		          SpinnerChoice = Spinner.getItemAtPosition(i).toString();                 
		          UpdateAnswer();		      
		      } // end of method
		      public void onNothingSelected(AdapterView<?> adapterView) {
		          return;
		      } // end of method 
		  }); //end of event handler
	      		  
	     btnPlusLeft.setOnClickListener(new OnClickListener() {	// Add event handler to buttons in UI
	    	  public void onClick(View v) {
	    		  String InterumLeft = tvNumberLeft.getText().toString();
	    		  NumberOnScreenLeft = Integer.valueOf(InterumLeft) + 1;  
	    		  tvNumberLeft.setText(Integer.toString(NumberOnScreenLeft));
	    		  UpdateAnswer();
	    	  } // end of method
	      }); //end of event handler
	      
	      btnMinusLeft.setOnClickListener(new OnClickListener() {	// Add event handler to buttons in UI
	    	  	public void onClick(View v) {
	    		  String InterumLeft = tvNumberLeft.getText().toString();
	    		  NumberOnScreenLeft = Integer.valueOf(InterumLeft) - 1;  
	    		  tvNumberLeft.setText(Integer.toString(NumberOnScreenLeft));
	    		  UpdateAnswer();
	    	  } // end of method
	      }); //end of event handler
	      
	      btnPlusRight.setOnClickListener(new OnClickListener() {	// Add event handler to buttons in UI
	    	  public void onClick(View v) {
	    		  String InterumRight = tvNumberRight.getText().toString();
	    		  NumberOnScreenRight = Integer.valueOf(InterumRight) + 1;  
	    		  tvNumberRight.setText(Integer.toString(NumberOnScreenRight));
	    		  UpdateAnswer();
	    	  } // end of method
	      }); //end of event handler
	      
	      btnMinusRight.setOnClickListener(new OnClickListener() {	// Add event handler to buttons in UI
	    	  	public void onClick(View v) {
	    		  String InterumRight = tvNumberRight.getText().toString();
	    		  NumberOnScreenRight = Integer.valueOf(InterumRight) - 1;  
	    		  tvNumberRight.setText(Integer.toString(NumberOnScreenRight));
	    		  UpdateAnswer();
	    	  } // end of method
	      }); //end of event handler
	} //end of OnCreate Bundle method      

    public void UpdateAnswer(){
		if (SpinnerChoice.toString().equals("add") ) { 
		      tvAnswer.setText(Integer.toString(NumberOnScreenRight + NumberOnScreenLeft));  
	    } else if (SpinnerChoice.toString().equals("subtract") ) {
			  tvAnswer.setText(Integer.toString(NumberOnScreenLeft - NumberOnScreenRight));  
		} else if (SpinnerChoice.toString().equals("multiply") ) {
			  tvAnswer.setText(Integer.toString(NumberOnScreenRight * NumberOnScreenLeft));
	    } else if (SpinnerChoice.toString().equals("divide") ) {
			  if ((NumberOnScreenRight == 0) || (NumberOnScreenLeft ==0)) {
				  tvAnswer.setText(Integer.toString(0));
			  } else {
				  tvAnswer.setText(Integer.toString(NumberOnScreenLeft / NumberOnScreenRight));
			  }
		 }	
	} //end of method
} //end of Hello SolarSystem class/file