package com.main.HelloSolarSystem;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public class MyApp extends Application {

	  private static int myState;

	  public static int getState(){
	    return myState;
	  }
	  public static void setState(int s){
	    myState = s;
	  }
	}

	class Blah extends Activity {

	  @Override
	  public void onCreate(Bundle b){
	    
	    MyApp appState = ((MyApp)getApplicationContext());
	    int state = appState.getState();
	    
	  }
	}