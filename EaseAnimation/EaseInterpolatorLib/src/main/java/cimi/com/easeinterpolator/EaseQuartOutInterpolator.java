package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 * <img src="../../../../../../docs/images/EaseQuartOutInterpolator.png"/>
 */

public class EaseQuartOutInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return 1 - (input - 1) * (input - 1) * (input - 1) * (input - 1);
    }
}
