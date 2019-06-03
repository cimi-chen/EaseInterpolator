package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 * <img src="../../../../../../docs/images/EaseCircularInOutInterpolator.png"/>
 */

public class EaseCircularInOutInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        if ((input /= 0.5) < 1) {
            return (float) (-1 * 0.5 * (Math.sqrt(1 - input * input) - 1));
        }

        return (float) (0.5 * (Math.sqrt(1 - (input -= 2) * input) + 1));
    }
}
