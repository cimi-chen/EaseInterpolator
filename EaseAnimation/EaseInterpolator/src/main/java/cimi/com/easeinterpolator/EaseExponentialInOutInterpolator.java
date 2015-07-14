package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */


public class EaseExponentialInOutInterpolator implements Interpolator {
	
    public EaseExponentialInOutInterpolator() {}
	
    public EaseExponentialInOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		if(input == 0) {
			return 0;
		}
		if(input == 1) {
			return 1;
		}
		if((input /= 0.5f) < 1) {
			return (float) (0.5f * Math.pow(2, 10 * (input - 1)));
		}
		return (float) (0.5f * (-Math.pow(2, -10 * --input) + 2));
	}
}
