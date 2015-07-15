package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseQuadOutInterpolator implements Interpolator {

	public EaseQuadOutInterpolator() {}

    public EaseQuadOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		return -input * (input - 2);
	}
}
