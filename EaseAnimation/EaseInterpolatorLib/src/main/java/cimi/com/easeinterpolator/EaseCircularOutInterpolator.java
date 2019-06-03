package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 * <img src="../../../../../../docs/images/EaseCircularOutInterpolator.png"/>
 */

public class EaseCircularOutInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return (float) (Math.sqrt(1 - (input - 1) * (input - 1)));
    }
}
