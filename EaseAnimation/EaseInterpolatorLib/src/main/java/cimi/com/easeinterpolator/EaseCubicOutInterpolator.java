package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 * <img src="../../../../../../docs/images/EaseCubicOutInterpolator.png"/>
 */

public class EaseCubicOutInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return (input - 1) * (input - 1) * (input - 1) + 1;
    }
}
