package com.cycleview.app;

import java.io.File;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class SplashScreen extends Activity{

	private static int timeout = 4000;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
	

		MediaPlayer mp = MediaPlayer.create(getApplicationContext(), R.raw.beep);
		
			mp.start();
			

		if(!Constants.imageRoot.exists()){
			Constants.imageRoot.mkdir();
		}
		//	deleting();
		new Handler().postDelayed(new Runnable() {
			@Override
			public void run() {
				startActivity(new Intent(SplashScreen.this, WifiScreen.class));
				finish();
			}
		}, timeout);
	}

	//	public void deleting(){
	//
	//		if (Constants.imageRoot.exists()){
	//			File [] photos = Constants.imageRoot.listFiles();
	//			DeletingPictures dp = null;
	//			if (photos != null){
	//				for (int i = 0; i < photos.length; i ++){
	//					try{
	//						dp = new DeletingPictures(photos[i].getName());
	//					}catch(Exception e){
	//						e.getStackTrace();
	//					}
	//					dp.setPath(photos[i].getPath());
	//					dp.deletingPhoto();
	//				}
	//			}
	//
	//		}
	//
	//	}
}
