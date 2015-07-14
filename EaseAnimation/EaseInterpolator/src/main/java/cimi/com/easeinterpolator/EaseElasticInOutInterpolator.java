package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 */

public class EaseElasticInOutInterpolator implements Interpolator {

	
	private float mDuration;
	
	/**
     * @param durationMillis Duration in milliseconds. The duration cannot be negative.
     *
     * @throws IllegalArgumentException if the duration is < 0
     *
     */
	public EaseElasticInOutInterpolator(float durationMillis) {
		if (durationMillis < 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative");
        }
		mDuration = durationMillis / 1000f;
	}
	
    public EaseElasticInOutInterpolator(Context context, AttributeSet attrs) {}

	public float getInterpolation(float input) {
		float s;
		float p = 0.0f;
		float a = 0.0f;
		if(input == 0) {
			return 0;
		}
		if((input /= 0.5) == 2) {
			return 1;
		}
		if(p == 0) {
			p = mDuration * (0.3f * 1.5f);
		}
		if(a == 0 || (1 > 0 && a < 1) || (1 < 0 /*&& a < -1*/)) {
			a = 1;
			s = p / 4;
		} else {
			s = (float) (p / MathConstants._2PI * Math.asin(1 / a));
		}
		if(input < 1) {
			return (float) (-0.5 * (a * Math.pow(2, 10 * (input -= 1)) * Math.sin((input * mDuration - s) * MathConstants._2PI / p)) + 0);
		}
		return (float) (a * Math.pow(2, -10 * (input -= 1)) * Math.sin((input * mDuration - s) * MathConstants._2PI / p) * .5 + 1 + 0);
	}
}
