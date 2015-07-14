package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseSineInInterpolator implements Interpolator {

	public EaseSineInInterpolator() {}

    public EaseSineInInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return (float) (-1 * Math.cos(input * MathConstants._HALF_PI) + 1);
	}
}
