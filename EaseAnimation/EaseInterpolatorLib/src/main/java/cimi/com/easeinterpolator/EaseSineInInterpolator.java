package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 * <img src="../../../../../../docs/images/EaseSineInInterpolator.png"/>
 */

public class EaseSineInInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return (float) (-1 * Math.cos(input * MathConstants._HALF_PI) + 1);
    }
}
