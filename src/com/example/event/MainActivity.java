package com.example.event;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
float total;
float avg;
EditText t1,t2,t3;
float num1,num2,num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
                b1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
					 t1=(EditText) findViewById(R.id.editText1);
			        t2=(EditText) findViewById(R.id.editText2);
			         t3=(EditText) findViewById(R.id.editText3);
				
				num1 = Float.parseFloat(t1.getText().toString());
				num2 = Float.parseFloat(t1.getText().toString());
				num3 = Float.parseFloat(t1.getText().toString());
				total =num1+num2+num3;
				Toast.makeText(getBaseContext(), "Total is:" +total, Toast.LENGTH_SHORT).show();
				
				
			}
		});
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				avg = total/3;
				Toast.makeText(getBaseContext(), "Average is:"+avg, Toast.LENGTH_SHORT).show();
			}
		});
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
