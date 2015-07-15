package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 */

public class EaseCircularInInterpolator implements Interpolator {
	
    public EaseCircularInInterpolator() {}
	
    public EaseCircularInInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return (float) (-1 * (Math.sqrt(1 - input * input) - 1.0f));
	}
}
