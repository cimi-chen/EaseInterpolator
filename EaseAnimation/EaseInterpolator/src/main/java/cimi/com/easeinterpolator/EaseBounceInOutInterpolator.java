package cimi.com.easeinterpolator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Interpolator;

/**
 * Created by cimi on 15/7/2.
 */

public class EaseBounceInOutInterpolator implements Interpolator {

    public EaseBounceInOutInterpolator() {
    }

    public EaseBounceInOutInterpolator(Context context, AttributeSet attrs) {
    }

    public float getInterpolation(float input) {
        if ((input) < 0.5f) {
            // EaseBounceInInterpolator
            input = input * 2;
            input = 1 - input;
            if (input < (1 / 2.75))
                return (1 - (7.5625f * input * input)) * 0.5f;
            else if (input < (2 / 2.75))
                return (1 - (7.5625f * (input -= (1.5f / 2.75f)) * input + 0.75f)) * 0.5f;
            else if (input < (2.5 / 2.75))
                return (1 - (7.5625f * (input -= (2.25f / 2.75f)) * input + 0.9375f)) * 0.5f;
            else
                return (1 - (7.5625f * (input -= (2.625f / 2.75f)) * input + 0.984375f)) * 0.5f;
        } else {
            // EaseBounceOutInterpolator
            input = input * 2 - 1;
            if (input < (1 / 2.75))
                return ((7.5625f * input * input)) * 0.5f + 1 * 0.5f;
            else if (input < (2 / 2.75))
                return ((7.5625f * (input -= (1.5f / 2.75f)) * input + 0.75f)) * 0.5f + 1 * 0.5f;
            else if (input < (2.5 / 2.75))
                return ((7.5625f * (input -= (2.25f / 2.75f)) * input + 0.9375f)) * 0.5f + 1 * 0.5f;
            else
                return ((7.5625f * (input -= (2.625f / 2.75f)) * input + 0.984375f)) * 0.5f + 1 * 0.5f;
        }
    }
}
