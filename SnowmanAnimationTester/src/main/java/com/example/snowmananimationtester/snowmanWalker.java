package com.example.snowmananimationtester;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Pete on 15.8.2013.
 */
public class snowmanWalker extends View {

    public snowmanWalker (Context context) {
        super(context);

        init();
    }

    // Constructor needed for the xml to be rendered
    public snowmanWalker(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    // Constructor needed for the xml to be rendered
    public snowmanWalker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle );
        init();
    }

    public void init(){
    //   bball = BitmapFactory.decodeResource(getResources(), R.drawable.orangeball);
     //   this.oldPosition = 0;
       // this.ballIsMoving = false;
    }

    @Override
    protected void onDraw(Canvas canvas){
        Rect ourRect = new Rect();
        ourRect.set(0, 0, canvas.getWidth(), canvas.getHeight());

        Paint grey = new Paint();
        grey.setColor(Color.GRAY);
        grey.setStyle(Paint.Style.FILL);

        canvas.drawRect(ourRect, grey);
    }

}
