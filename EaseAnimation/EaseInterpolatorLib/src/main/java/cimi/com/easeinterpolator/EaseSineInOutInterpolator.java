package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseSineInOutInterpolator implements Interpolator {

	public EaseSineInOutInterpolator() {}

    public EaseSineInOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return (float) (-1 * 0.5f * (Math.cos(MathConstants.PI * input) - 1));
	}
}
