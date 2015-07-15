package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseSineOutInterpolator implements Interpolator {

	public EaseSineOutInterpolator() {}

    public EaseSineOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return (float) Math.sin(input * MathConstants._HALF_PI);
	}
}
