package eeecs.qub.ac.uk.gp13;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;

public class ScrollingBackground extends View {

	Bitmap bg;
	
	/**
	 * This is the constructor for this particular view
	 * 
	 * @param context the current context of android
	 * @param attrs a variable requied by the view superclass
	 */
	public ScrollingBackground(Context context, AttributeSet attrs) {
		super(context, attrs);
		bg = BitmapFactory.decodeResource(getResources(),
                R.drawable.canvasbg);
	}
	
	@Override
	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
		setBackgroundColor(Color.CYAN);
		
	}
}

