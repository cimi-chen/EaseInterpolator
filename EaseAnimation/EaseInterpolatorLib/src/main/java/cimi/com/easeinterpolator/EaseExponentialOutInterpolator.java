package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseExponentialOutInterpolator implements Interpolator {
	
    public EaseExponentialOutInterpolator() {}
	
    public EaseExponentialOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return (float) ((input == 1) ? 1 : (-Math.pow(2, -10 * input) + 1));
	}
}
