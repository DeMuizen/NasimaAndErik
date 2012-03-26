package com.main.HelloSolarSystem;

//import com.call.contact.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.*;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
//import android.view.KeyEvent;
//import android.widget.EditText;
//import android.widget.TextView;

public class HelloSolarSystemActivity extends Activity {
	  
//	  RadioButton myOption1, myOption2, myOption3;
	  private Button btnplus;
	  private Button btnminus;
	  private TextView tvnumber;
	  
	  /** Called when the activity is first created. */  
	  
	@Override
    public void onCreate(Bundle savedInstanceState) {
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.main);
	      btnplus = (Button)findViewById(R.id.plus);
	      btnminus = (Button)findViewById(R.id.minus);
	      tvnumber = (TextView)findViewById(R.id.number);
	      btnplus.setOnClickListener(new OnClickListener() {
	    	  	public void onClick(View v) {
	    		  Toast.makeText(HelloSolarSystemActivity.this, "plus button pressed", Toast.LENGTH_SHORT).show();
	    		  tvnumber.setText("99");
	    	  }
	      });
	      
	      btnminus.setOnClickListener(new OnClickListener() {
	    	  	public void onClick(View v) {
	    		  Toast.makeText(HelloSolarSystemActivity.this, "minus button pressed", Toast.LENGTH_SHORT).show();
	    		  tvnumber.setText("00");
	    	  }
	      });

	
	
	}
	  
}
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
