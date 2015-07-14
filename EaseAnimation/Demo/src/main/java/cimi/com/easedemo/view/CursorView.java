package cimi.com.easedemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by cimi on 15/7/6.
 */

public class CursorView extends View {
    public int width;
    public int height;

    private Context context;
    private Paint paint;
    private Path path;

    public CursorView(Context context) {
        this(context, null);
    }

    public CursorView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
        width = dip2px(20); //from layout
        height = dip2px(8); //from layout

        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.RED);

        path = new Path();
        path.moveTo(0, height / 2);
        path.lineTo(width / 5, 0);
        path.lineTo(width, 0);
        path.lineTo(width, height);
        path.lineTo(width / 5, height);
        path.close();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path, paint);
    }

    private int dip2px(float dpValue) {
        final float scale = context.getResources()
                .getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
