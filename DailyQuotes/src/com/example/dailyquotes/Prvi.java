package com.example.dailyquotes;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class Prvi extends Activity {
	TextView text1;
	TextView text2;
	TextView text3;
	ImageButton slika1;
	ImageButton slika2;
	ImageButton slika3;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_prvi);
		
		Bundle b = getIntent().getExtras();
		int id = b.getInt("id");
		
		text1 = (TextView) findViewById(R.id.text1);
		text1.setMovementMethod(new ScrollingMovementMethod());
		
		text2 = (TextView) findViewById(R.id.text2);
		text2.setMovementMethod(new ScrollingMovementMethod());
		
		text3 = (TextView) findViewById(R.id.text3);
		text3.setMovementMethod(new ScrollingMovementMethod());
		
		slika1=(ImageButton) findViewById(R.id.slika1);
		slika2=(ImageButton) findViewById(R.id.slika2);
		slika3=(ImageButton) findViewById(R.id.slika3);
		
		 final MediaPlayer mp = MediaPlayer.create(this, R.raw.mjuz);
		
		
		
		if(id==0){
			
		
		 slika1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
		            Toast.makeText(getApplicationContext(), R.string.Gates, Toast.LENGTH_LONG).show();
		            mp.start();
					
				}
			});
		 slika2.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
		            Toast.makeText(getApplicationContext(), R.string.Cukberger, Toast.LENGTH_LONG).show();
		            mp.start();
				}
			});
		 slika3.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
		            Toast.makeText(getApplicationContext(), R.string.Jobs, Toast.LENGTH_LONG).show();
		            mp.start();
				}
			});
		
		 class  InspiringPerson {
			
			
			
			
		public  InspiringPerson ()
		{
			
			
		}
			public void ispis1()
			
			{	
			text1.setText(Html.fromHtml(getString(R.string.test)));
			slika1.setBackgroundResource(R.drawable.tehnologija1);
			}
			public void ispis2()
			{	
			slika2.setBackgroundResource(R.drawable.tehnologija);
			text2.setText(Html.fromHtml(getString(R.string.testtt)));
				
			}
			public void ispis3()
			{	
				text3.setText(Html.fromHtml(getString(R.string.testt)));
				slika3.setBackgroundResource(R.drawable.tehnologija2);
			}
		}
		
		InspiringPerson prvi = new InspiringPerson ();
		InspiringPerson drugi = new InspiringPerson ();
		InspiringPerson treci = new InspiringPerson ();
		prvi.ispis1();
		drugi.ispis2();
		treci.ispis3();
		}
		
		if(id==1){
			
			
			 slika1.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
			            Toast.makeText(getApplicationContext(), R.string.Napoleon, Toast.LENGTH_LONG).show();
			            mp.start();
					}
				});
			 slika2.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
			            Toast.makeText(getApplicationContext(), R.string.Churchill, Toast.LENGTH_LONG).show();
			            mp.start();
					}
				});
			 slika3.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
			            Toast.makeText(getApplicationContext(), R.string.Kennedy, Toast.LENGTH_LONG).show();
			            mp.start();
					}
				});
			
			 class  InspiringPerson {
				
				
				
			public  InspiringPerson ()
			{
				
				
				
			}
				public void ispis1()
				{	
					text1.setText(Html.fromHtml(getString(R.string.Napoleon1)));
					slika1.setBackgroundResource(R.drawable.lider2);
				}
				public void ispis2()
				{	
				slika2.setBackgroundResource(R.drawable.lider3);
					text2.setText(Html.fromHtml(getString(R.string.Churchill1)));
				}
				public void ispis3()
				{	
					text3.setText(Html.fromHtml(getString(R.string.Kennedy1)));
					slika3.setBackgroundResource(R.drawable.lider1);
				}
			}
			
			InspiringPerson prvi = new InspiringPerson ();
			InspiringPerson drugi = new InspiringPerson ();
			InspiringPerson treci = new InspiringPerson ();
			prvi.ispis1();
			drugi.ispis2();
			treci.ispis3();
			}
		if(id==2){
			
			
			 slika1.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
			            Toast.makeText(getApplicationContext(), R.string.Lennon, Toast.LENGTH_LONG).show();
			            mp.start();
					}
				});
			 slika2.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
			            Toast.makeText(getApplicationContext(), R.string.Bethoven, Toast.LENGTH_LONG).show();
			            mp.start();
					}
				});
			 slika3.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
			            Toast.makeText(getApplicationContext(), R.string.Dylan, Toast.LENGTH_LONG).show();
			            mp.start();
					}
				});
			
			 class  InspiringPerson {
			
				
				
				
			public  InspiringPerson ()
			{
				
				
				
			}
				public void ispis1()
				{	
					text1.setText(Html.fromHtml(getString(R.string.Lennon1)));
					slika1.setBackgroundResource(R.drawable.glazbenik1);
				}
				public void ispis2()
				{	
				slika2.setBackgroundResource(R.drawable.glazbenik2);
					text2.setText(Html.fromHtml(getString(R.string.Bethoven1)));
				}
				public void ispis3()
				{	
					text3.setText(Html.fromHtml(getString(R.string.Dylan1)));
					slika3.setBackgroundResource(R.drawable.glazbenik3);
				}
			}
			
			InspiringPerson prvi = new InspiringPerson ();
			InspiringPerson drugi = new InspiringPerson ();
			InspiringPerson treci = new InspiringPerson ();
			prvi.ispis1();
			drugi.ispis2();
			treci.ispis3();
			}
		
		
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.prvi, menu);
		return true;
	}


	

}
