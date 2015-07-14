package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseQuintInInterpolator implements Interpolator {

	public EaseQuintInInterpolator() {}

    public EaseQuintInInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return input * input * input * input * input;
	}
}
