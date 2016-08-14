package com.example.popup;
import android.app.Activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;


public class MainActivity extends Activity {
	Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				PopupMenu popup=new PopupMenu(MainActivity.this,v);
	             popup.getMenuInflater().inflate(R.menu.pop,popup.getMenu());
	             popup.setOnMenuItemClickListener(new onMenuItemClickListener(){
	            	 public boolean onMenuItemClick(MenuItem item){
	            		 Toast.makeText(getApplicationContext(),item.getTitle(), Toast.LENGTH_LONG).show();
	            	     
	        return true;
	            	 
	             }   	 
	             
	               popup.show();
	             
	             
			});    
			
            
        	
        
        
        
        
             
        
        
        

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
			}
			
