package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 */

public class EaseCircularOutInterpolator implements Interpolator {
	
    public EaseCircularOutInterpolator() {}
	
    public EaseCircularOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return (float) (Math.sqrt(1 - (input - 1) * (input - 1)));
	}
}
