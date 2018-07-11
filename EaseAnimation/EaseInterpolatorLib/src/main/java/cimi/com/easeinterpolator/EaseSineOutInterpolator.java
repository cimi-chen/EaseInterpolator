package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 * <img src="../../../../../../docs/images/EaseSineOutInterpolator.png"/>
 */

public class EaseSineOutInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return (float) Math.sin(input * MathConstants._HALF_PI);
    }
}
