package com.example.dailyquotes;

import java.util.Timer;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	String[] qu;
	String[] qa;
	String[] qb;


	@SuppressWarnings("deprecation")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ImageButton tehno = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton glazba = (ImageButton) findViewById(R.id.imageButton2);
        ImageButton politika = (ImageButton) findViewById(R.id.imageButton4);
        
        politika.setBackgroundResource(R.drawable.politika);
        glazba.setBackgroundResource(R.drawable.glazba);
        tehno.setBackgroundResource(R.drawable.tehnika);
        
        ImageView knjizevnost = (ImageView) findViewById(R.id.imageView1);
        knjizevnost.setBackgroundResource(R.drawable.banner);
        ImageButton jos = (ImageButton) findViewById(R.id.imageButton7);
        jos.setBackgroundResource(R.drawable.more);
        
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.mjuz);
        
        Toast.makeText(getApplicationContext(), "Your daily dose of quotes", Toast.LENGTH_LONG).show();
        
        tehno.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) { //pokretanje novog Activity-ja
				// TODO Auto-generated method stub
				
				int id = 0;
				Intent intent = new Intent(v.getContext(), Prvi.class);
				intent.putExtra("id", id);                 //slanje ID kako ne bi morao raditi poseban activity za svaku osobu
				startActivityForResult(intent, 0);
				
				mp.start();
			
			}

			
		});
        
politika.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				int id = 1;
				Intent intent = new Intent(v.getContext(), Prvi.class);
				intent.putExtra("id", id);
				startActivityForResult(intent, 0);
				mp.start();
				
				 
			}
		});
glazba.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		int id = 2;
		Intent intent = new Intent(v.getContext(), Prvi.class);
		intent.putExtra("id", id);
		startActivityForResult(intent, 0);
		mp.start();
		
		 
	}
});
jos.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Uri uri = Uri.parse("http://www.goodreads.com/quotes");
		Intent intent = new Intent(Intent.ACTION_VIEW, uri);
		startActivity(intent);
		mp.start();
		 
	}
});
		
        	
        ImageButton Random =  (ImageButton) findViewById(R.id.imageButton1);
        Random.setBackgroundResource(R.drawable.radi);
        
        qa = new String[18];
        qa[0] = getResources().getString(R.string.Lennon);
        qa[1] = getResources().getString(R.string.Bethoven);
        qa[2] = getResources().getString(R.string.Dylan);
        qa[3] = getResources().getString(R.string.Gates);
        qa[4] = getResources().getString(R.string.Cukberger);
        qa[5] = getResources().getString(R.string.Jobs);
        qa[6] = getResources().getString(R.string.Napoleon);
        qa[7] = getResources().getString(R.string.Churchill);
        qa[8] = getResources().getString(R.string.book1);
        qa[9] = getResources().getString(R.string.book2);
        qa[10] = getResources().getString(R.string.book3);
        qa[11] = getResources().getString(R.string.book4);
        qa[12] = getResources().getString(R.string.book5);
        qa[13] = getResources().getString(R.string.love);
        qa[14] = getResources().getString(R.string.love1);
        qa[15] = getResources().getString(R.string.love2);
        qa[16] = getResources().getString(R.string.love3);
        qa[17] = getResources().getString(R.string.love4);
    
     
       

       
        Random.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int x = 0 + (int)(Math.random() * ((17 - 0) + 1));
	            String lista = qa[x];
	            Toast.makeText(getApplicationContext(), lista, Toast.LENGTH_LONG).show();
	            mp.start();
				
			}
		});
        
       
        
        
        
        t1.start();
        t2.start();
     
      
       
    }
	
	Thread t1 = new Thread(){
	public void run(){
		runOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				ImageButton knjizevnost = (ImageButton) findViewById(R.id.imageButton5);
				AnimationDrawable animation2 = new AnimationDrawable();
		        animation2.addFrame(getResources().getDrawable(R.drawable.knjiga11), 3400);
		        animation2.addFrame(getResources().getDrawable(R.drawable.knjiga22), 3400);
		        animation2.addFrame(getResources().getDrawable(R.drawable.knjiga33), 3400);
		        animation2.addFrame(getResources().getDrawable(R.drawable.knjiga55), 3400);
		        animation2.setOneShot(false);
		        knjizevnost.setBackgroundDrawable(animation2);
		        animation2.start();
		        
		      
		       
		        
		        qb = new String[5];
		        qb[0] = getResources().getString(R.string.book2);
		        qb[1] = getResources().getString(R.string.book1);
		        qb[2] = getResources().getString(R.string.book3);
		        qb[3] = getResources().getString(R.string.book4);
		        qb[4] = getResources().getString(R.string.book5);
		  
		       

		       
		        knjizevnost.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						int x = 0 + (int)(Math.random() * ((4 - 0) + 1));
			            String lista = qb[x];
			            Toast.makeText(getApplicationContext(), lista, Toast.LENGTH_LONG).show();
			           
					}});
		        
			}
		});
	}
	};


 Thread t2=new Thread(){
	public void run(){
		runOnUiThread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				ImageButton ljubav = (ImageButton) findViewById(R.id.imageButton3);
				AnimationDrawable animation1 = new AnimationDrawable();
		        animation1.addFrame(getResources().getDrawable(R.drawable.ljubav11), 3100);
		        animation1.addFrame(getResources().getDrawable(R.drawable.ljubav22), 3100);
		        animation1.addFrame(getResources().getDrawable(R.drawable.ljubav33), 3100);
		        animation1.addFrame(getResources().getDrawable(R.drawable.ljubav44), 3100);
		        animation1.setOneShot(false);
		        ljubav.setBackgroundDrawable(animation1);
		        animation1.start();
		        
		        qu = new String[5];
		        qu[0] = getResources().getString(R.string.love);
		        qu[1] = getResources().getString(R.string.love1);
		        qu[2] = getResources().getString(R.string.love2);
		        qu[3] = getResources().getString(R.string.love3);
		        qu[4] = getResources().getString(R.string.love4);
		  
		       

		       
		        ljubav.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						int x = 0 + (int)(Math.random() * ((4 - 0) + 1));
			            String lista = qu[x];
			            Toast.makeText(getApplicationContext(), lista, Toast.LENGTH_LONG).show();
			          
						
					}
				});
		        
			}
		});
	}};

		

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
