package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 * <img src="../../../../../../docs/images/EaseElasticInInterpolator.png"/>
 */

public class EaseElasticInInterpolator implements Interpolator {

    private final float mDuration;

    /**
     * <img src="../../../../../../docs/images/EaseElasticInInterpolator.png"/>
     * @param durationMillis Duration in milliseconds. The duration cannot be negative.
     * @throws IllegalArgumentException if the duration is < 0
     */
    public EaseElasticInInterpolator(final float durationMillis) {
        if (durationMillis < 0) {
            throw new IllegalArgumentException("Animation duration cannot be negative");
        }
        mDuration = durationMillis / 1000f;
    }

    public float getInterpolation(float input) {
        float s;
        float p = 0.0f;
        float a = 0.0f;
        if (input == 0) {
            return 0;
        }
        if (input == 1) {
            return 1;
        }
        if (p == 0) {
            p = mDuration * 0.3f;
        }
        if (a == 0 || (1 > 0 && a < 1) || (1 < 0 /*&& a < -1*/)) {
            a = 1;
            s = p / 4;
        } else {
            s = (float) (p / MathConstants._2PI * Math.asin(1 / a));
        }
        return (float) (-(a * Math.pow(2, 10 * (input -= 1)) * Math.sin((input * mDuration - s) * MathConstants._2PI / p)) + 0);
    }
}
