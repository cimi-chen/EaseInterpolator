package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseQuintOutInterpolator implements Interpolator {

	public EaseQuintOutInterpolator() {}

    public EaseQuintOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return (input - 1) * (input - 1) * (input - 1) * (input - 1) * (input - 1) + 1;
	}
}
