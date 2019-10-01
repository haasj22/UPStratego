package com.example.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

public class CreatingBoardSurfaceView extends SurfaceView {
    public CreatingBoardSurfaceView(Context context, AttributeSet attr) {
        super(context, attr);
        setWillNotDraw(false);
    }

     @Override
     public void onDraw(Canvas canvas) {
        int imgWidth=canvas.getWidth();
        int imgHeight=canvas.getHeight();

        Bitmap boardImage = BitmapFactory.decodeResource(getResources(), R.drawable.creating_board);
        Bitmap usableBoardImage =
                Bitmap.createScaledBitmap(boardImage, imgWidth, imgHeight, false);
        canvas.drawBitmap(usableBoardImage, 0, 0, null);
     }
}
