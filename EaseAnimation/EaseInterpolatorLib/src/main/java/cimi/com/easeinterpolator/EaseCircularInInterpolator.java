package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 * <img src="../../../../../../docs/images/EaseCircularInInterpolator.png"/>
 */

public class EaseCircularInInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return (float) (-1 * (Math.sqrt(1 - input * input) - 1.0f));
    }
}
