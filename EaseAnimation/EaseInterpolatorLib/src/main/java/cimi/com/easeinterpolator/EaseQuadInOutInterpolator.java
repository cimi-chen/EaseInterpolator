package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseQuadInOutInterpolator implements Interpolator {

	public EaseQuadInOutInterpolator() {}

    public EaseQuadInOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		if((input /= 0.5f) < 1) {
			return 0.5f * input * input;
		}
		return -0.5f * ((--input) * (input - 2) - 1);
	}
}
