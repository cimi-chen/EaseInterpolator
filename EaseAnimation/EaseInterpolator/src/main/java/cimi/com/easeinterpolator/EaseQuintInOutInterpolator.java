package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseQuintInOutInterpolator implements Interpolator {

	public EaseQuintInOutInterpolator() {}

    public EaseQuintInOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		if((input /= 0.5f) < 1) {
			return 0.5f * input * input * input * input * input;
		}
		return 0.5f * ((input -= 2) * input * input * input * input + 2);
	}
}
