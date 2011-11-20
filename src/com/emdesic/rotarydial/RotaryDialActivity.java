package com.emdesic.rotarydial;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class RotaryDialActivity extends Activity  {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
			Typeface myTypeface = Typeface.createFromAsset(this.getAssets(),"fonts/" +
					"digital.ttf");
			TextView dialvalue = (TextView) findViewById(R.id.dialvalue);
			dialvalue.setTypeface(myTypeface);
			
			RelativeLayout dial=(RelativeLayout)findViewById(R.id.DialContainer);
				
			
			
		dial.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
				
				
				v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_indefinitely));

				return false;
			}
		});
		

        // Start animating the image
       
    }

	
}