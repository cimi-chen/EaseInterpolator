package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 */

public class EaseBackInOutInterpolator implements Interpolator {

	public EaseBackInOutInterpolator() {}

    public EaseBackInOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		float s = 1.70158f;
		if((input *= 2) < 1) {
			return 0.5f * (input * input * (((s *= (1.525f)) + 1) * input - s));
		}

		return 0.5f * ((input -= 2) * input * (((s *= (1.525f)) + 1) * input + s) + 2);
	
	}

}
