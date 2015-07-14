package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 */

public class EaseCubicInInterpolator implements Interpolator {
	
    public EaseCubicInInterpolator() {}
	
    public EaseCubicInInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return input * input * input;
	}
}
