package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 * <img src="../../../../../../docs/images/EaseCubicInInterpolator.png"/>
 */

public class EaseCubicInInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return input * input * input;
    }
}
