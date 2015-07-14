package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseQuartOutInterpolator implements Interpolator {

	public EaseQuartOutInterpolator() {}

    public EaseQuartOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return 1 - (input - 1) * (input - 1) * (input - 1) * (input - 1);
	}
}
