//TODO Create a personal toast. http://www.androidpeople.com/android-custom-toast-tutorial 

package com.main.HelloSolarSystem; //File name and location within file structure

import android.R.string;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
// import android.widget.RadioButton; //Only required if radio buttons are needed

public class HelloSolarSystemActivity extends Activity {
	private ImageButton btnplusleft;
	private ImageButton btnplusright;
	private ImageButton btnminusleft;
	private ImageButton btnminusright;
	private TextView tvnumberleft;
	private TextView tvnumberright;
	private TextView tvanswer;
	private int NumberOnScreenleft = 35;
	private int NumberOnScreenright = 35;
	public boolean FirstLoad = true;
	private String SpinnerChoice = "x";
	  
	//RadioButton myOption1, myOption2, myOption3; //Only required if radio buttons are needed
		 	  
	@Override
    public void onCreate(Bundle savedInstanceState) { 					// I do not know what this does
	      super.onCreate(savedInstanceState); 							// I do not know what this does
	      setContentView(R.layout.main); 								// Connect this file to the interface xml file (in general)
	      btnplusleft = (ImageButton)findViewById(R.id.plusleft);		// Connect UI element in the interface file to a specific variable in this file
	      btnplusright = (ImageButton)findViewById(R.id.plusright);		// Connect UI element in the interface file to a specific variable in this file
	      btnminusleft = (ImageButton)findViewById(R.id.minusleft);		// Connect UI element in the interface file to a specific variable in this file
	      btnminusright = (ImageButton)findViewById(R.id.minusright);	// Connect UI element in the interface file to a specific variable in this file
	      tvnumberleft = (TextView)findViewById(R.id.numberleft);		// Connect UI element in the interface file to a specific variable in this file
	      tvnumberright = (TextView)findViewById(R.id.numberright);		// Connect UI element in the interface file to a specific variable in this file
	      tvanswer = (TextView)findViewById(R.id.answer);				// Connect UI element in the interface file to a specific variable in this file
	      final Spinner spinner = (Spinner) findViewById(R.id.spinner);
	      
	      //Spinner event handler
		  spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
		      public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
		          //if(FirstLoad){
		          //        FirstLoad = false;
		          //        return;                         
		          //}
		          SpinnerChoice = spinner.getItemAtPosition(i).toString();                 
		          UpdateAnswer();
				  //if (SpinnerChoice.toString().equals("+") ) {
				//	  Toast.makeText(HelloSolarSystemActivity.this, "String compare works", Toast.LENGTH_SHORT).show(); 
				//	  UpdateAnswer();
				//  }
		      
		      } // end of method
		      public void onNothingSelected(AdapterView<?> adapterView) {
		          return;
		      } // end of method 
		  }); //end of event handler
	      		  
	     btnplusleft.setOnClickListener(new OnClickListener() {	// Add event handler to buttons in UI
	    	  public void onClick(View v) {
	    		  //Toast.makeText(HelloSolarSystemActivity.this, "plus button pressed", Toast.LENGTH_SHORT).show(); // Show pop-up to verify it works
	    		  String interumleft = tvnumberleft.getText().toString();
	    		  NumberOnScreenleft = Integer.valueOf(interumleft) + 1;  
	    		  tvnumberleft.setText(Integer.toString(NumberOnScreenleft));
	    		  UpdateAnswer();
	    		  //tvanswer.setText(Integer.toString(NumberOnScreenright * NumberOnScreenleft));
	    	  } // end of method
	      }); //end of event handler
	      
	      btnminusleft.setOnClickListener(new OnClickListener() {	// Add event handler to buttons in UI
	    	  	public void onClick(View v) {
	    		  //Toast.makeText(HelloSolarSystemActivity.this, "minus button pressed", Toast.LENGTH_SHORT).show(); // Show pop-up to verify it works
	    		  String interumleft = tvnumberleft.getText().toString();
	    		  NumberOnScreenleft = Integer.valueOf(interumleft) - 1;  
	    		  tvnumberleft.setText(Integer.toString(NumberOnScreenleft));
	    		  UpdateAnswer();
	    		  //tvanswer.setText(Integer.toString(NumberOnScreenright * NumberOnScreenleft));
	    	  } // end of method
	      }); //end of event handler
	      
	      btnplusright.setOnClickListener(new OnClickListener() {	// Add event handler to buttons in UI
		      
	    	  public void onClick(View v) {
	    		  //Toast.makeText(HelloSolarSystemActivity.this, "plus button pressed", Toast.LENGTH_SHORT).show(); // Show pop-up to verify it works
	    		  String interumright = tvnumberright.getText().toString();
	    		  NumberOnScreenright = Integer.valueOf(interumright) + 1;  
	    		  tvnumberright.setText(Integer.toString(NumberOnScreenright));
	    		  UpdateAnswer();
	    		  //tvanswer.setText(Integer.toString(NumberOnScreenright * NumberOnScreenleft));
	    	  } // end of method
	      }); //end of event handler
	      
	      btnminusright.setOnClickListener(new OnClickListener() {	// Add event handler to buttons in UI
	    	  	public void onClick(View v) {
	    		  //Toast.makeText(HelloSolarSystemActivity.this, "minus button pressed", Toast.LENGTH_SHORT).show(); // Show pop-up to verify it works
	    		  String interumright = tvnumberright.getText().toString();
	    		  NumberOnScreenright = Integer.valueOf(interumright) - 1;  
	    		  tvnumberright.setText(Integer.toString(NumberOnScreenright));
	    		  UpdateAnswer();
	    		  //tvanswer.setText(Integer.toString(NumberOnScreenright * NumberOnScreenleft));
	    	  } // end of method
	      }); //end of event handler

	} //end of OnCreate Bundle method      

    public void UpdateAnswer(){
		if (SpinnerChoice.toString().equals("add") ) { 
		      tvanswer.setText(Integer.toString(NumberOnScreenright + NumberOnScreenleft));  
	    } else if (SpinnerChoice.toString().equals("subtract") ) {
			  tvanswer.setText(Integer.toString(NumberOnScreenright - NumberOnScreenleft));  
		} else if (SpinnerChoice.toString().equals("multiply") ) {
			  tvanswer.setText(Integer.toString(NumberOnScreenright * NumberOnScreenleft));
	    } else if (SpinnerChoice.toString().equals("divide") ) {
			  if ((NumberOnScreenright == 0) || (NumberOnScreenleft ==0)) {
				  tvanswer.setText(Integer.toString(0));
			  } else {
				  tvanswer.setText(Integer.toString(NumberOnScreenright / NumberOnScreenleft));
			  }
		 }	
	} //end of method

} //end of Hello SolarSystem class/file





///////// 
//Section goal - Previous exercises I'm keeping so I can lookup code solutions lateron
/////////

/*      
	      //get the two controls we created earlier, also with the resource reference and the id
	      final TextView tv_View = (TextView)findViewById(R.id.tv_View);
	      final EditText et_Text = (EditText)findViewById(R.id.et_Text);
	          
	      //add new KeyListener Callback (to record key input)
	      et_Text.setOnClickListener(new OnClickListener()
	      {
	          //function to invoke when a key is pressed
	          public boolean onKey(View v, int keyCode, KeyEvent event)
	          {
	              //check if there is 
	              if (event.getAction() == KeyEvent.ACTION_DOWN)
	              {
	                  //check if the right key was pressed
	                  if (keyCode == KeyEvent.KEYCODE_DPAD_CENTER)
	                  {
	                                      //add the text to the textview
	                      tv_View.setText(tv_View.getText() + ", " + 
	                                       et_Text.getText());
	                                      //and clear the EditText control
	                      et_Text.setText("");
	                      return true;
	                  }
	              }
	              return false;
	          }
			public void onClick(View v) {
				// TODO Auto-generated method stub	
			}
	      });
			
		//super.onCreate(savedInstanceState);
        //setContentView(R.layout.main);
        myOption1 = (RadioButton)findViewById(R.id.option1);
        myOption2 = (RadioButton)findViewById(R.id.option2);
        myOption3 = (RadioButton)findViewById(R.id.option3);
        myOption1.setOnClickListener(myOptionOnClickListener);
        myOption2.setOnClickListener(myOptionOnClickListener);
        myOption3.setOnClickListener(myOptionOnClickListener);
        myOption1.setChecked(true);
    }

 	RadioButton.OnClickListener myOptionOnClickListener =
    	new RadioButton.OnClickListener()
    	{
    		  public void onClick(View v) {
    		   	// TODO Auto-generated method stub
    		   	Toast.makeText(HelloSolarSystemActivity.this,
    		     	"Option 1 : " + myOption1.isChecked() + "\n" +
    		     	"Option 2 : " + myOption2.isChecked() + "\n" +
    		     	"Option 3 : " + myOption3.isChecked(),
    		     	Toast.LENGTH_LONG
    		    ).show();
    		   
    		    Toast eriksToast = new Toast(HelloSolarSystemActivity.this);
    		   		eriksToast.setDuration(5000);
    		   		eriksToast.setText(
    				"Option 1 : " + myOption1.isChecked() + "\n" +	
    		    	"Option 2 : " + myOption2.isChecked() + "\n" +
    		    	"Option 3 : " + myOption3.isChecked() 
    		    	);
    		    eriksToast.show();
    		  }
    	}; 		 
}
*/
