package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 * <img src="../../../../../../docs/images/EaseBackInInterpolator.png"/>
 */

public class EaseBackInInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return input * input * ((1.70158f + 1) * input - 1.70158f);
    }
}
