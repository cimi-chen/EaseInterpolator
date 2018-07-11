package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 * <img src="../../../../../../docs/images/EaseSineInOutInterpolator.png"/>
 */

public class EaseSineInOutInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return (float) (-1 * 0.5f * (Math.cos(MathConstants.PI * input) - 1));
    }
}
