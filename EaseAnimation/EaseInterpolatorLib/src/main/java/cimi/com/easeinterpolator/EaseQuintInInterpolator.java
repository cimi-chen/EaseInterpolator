package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 * <img src="../../../../../../docs/images/EaseQuintInInterpolator.png"/>
 */

public class EaseQuintInInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return input * input * input * input * input;
    }
}
