package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/3.
 * <img src="../../../../../../docs/images/EaseQuadOutInterpolator.png"/>
 */

public class EaseQuadOutInterpolator implements Interpolator {

    public float getInterpolation(float input) {
        return -input * (input - 2);
    }
}
