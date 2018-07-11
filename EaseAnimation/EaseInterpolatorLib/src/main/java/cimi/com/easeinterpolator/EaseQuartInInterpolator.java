package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 * <img src="../../../../../../docs/images/EaseQuartInInterpolator.png"/>
 */

public class EaseQuartInInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return input * input * input * input;
    }
}
