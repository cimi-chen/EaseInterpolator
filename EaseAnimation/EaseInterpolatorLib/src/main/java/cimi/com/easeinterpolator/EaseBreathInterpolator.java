package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/8/17.
 * <img src="../../../../../../docs/images/EaseBreathInterpolator.png"/>
 */

public class EaseBreathInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        if (input < 0.333) {
            return (float) (0.5f + 0.5f * Math.sin(input * 3.0f * Math.PI - Math.PI * 0.5f));
        } else {
            return (float) Math.pow((0.5 * Math.sin(-3f * Math.PI * input * 0.5f + Math.PI) + 0.5f), 2);
        }
    }
}