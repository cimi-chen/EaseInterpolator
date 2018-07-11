package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 * <img src="../../../../../../docs/images/EaseExponentialInInterpolator.png"/>
 */

public class EaseExponentialInInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return (float) ((input == 0) ? 0 : 1 * Math.pow(2, 10 * (input - 1)) - 0.001f);
    }
}
