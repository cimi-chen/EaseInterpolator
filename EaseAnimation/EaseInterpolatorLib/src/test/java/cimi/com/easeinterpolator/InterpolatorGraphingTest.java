package cimi.com.easeinterpolator;

import android.view.animation.Interpolator;
import org.junit.Before;
import org.junit.Test;

public class InterpolatorGraphingTest {

    @Before
    public void setUp() {
        System.out.println("\n");
    }

    @Test
    public void testEaseBackInInterpolator() {
        final EaseBackInInterpolator interpolator = new EaseBackInInterpolator();
        System.out.println("EaseBackInInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseBackInOutInterpolator() {
        final EaseBackInOutInterpolator interpolator = new EaseBackInOutInterpolator();
        System.out.println("EaseBackInOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseBackOutInterpolator() {
        final EaseBackOutInterpolator interpolator = new EaseBackOutInterpolator();
        System.out.println("EaseBackOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseBounceInInterpolator() {
        final EaseBounceInInterpolator interpolator = new EaseBounceInInterpolator();
        System.out.println("EaseBounceInInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseBounceInOutInterpolator() {
        final EaseBounceInOutInterpolator interpolator = new EaseBounceInOutInterpolator();
        System.out.println("EaseBounceInOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseBounceOutInterpolator() {
        final EaseBounceOutInterpolator interpolator = new EaseBounceOutInterpolator();
        System.out.println("EaseBounceOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseBreathInterpolator() {
        final EaseBreathInterpolator interpolator = new EaseBreathInterpolator();
        System.out.println("EaseBreathInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseCircularInInterpolator() {
        final EaseCircularInInterpolator interpolator = new EaseCircularInInterpolator();
        System.out.println("EaseCircularInInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseCircularInOutInterpolator() {
        final EaseCircularInOutInterpolator interpolator = new EaseCircularInOutInterpolator();
        System.out.println("EaseCircularInOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseCircularOutInterpolator() {
        final EaseCircularOutInterpolator interpolator = new EaseCircularOutInterpolator();
        System.out.println("EaseCircularOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseCubicInInterpolator() {
        final EaseCubicInInterpolator interpolator = new EaseCubicInInterpolator();
        System.out.println("EaseCubicInInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseCubicInOutInterpolator() {
        final EaseCubicInOutInterpolator interpolator = new EaseCubicInOutInterpolator();
        System.out.println("EaseCubicInOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseCubicOutInterpolator() {
        final EaseCubicOutInterpolator interpolator = new EaseCubicOutInterpolator();
        System.out.println("EaseCubicOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseElasticInInterpolator() {
        final EaseElasticInInterpolator interpolator = new EaseElasticInInterpolator(1000f);
        System.out.println("EaseElasticInInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseElasticInOutInterpolator() {
        final EaseElasticInOutInterpolator interpolator = new EaseElasticInOutInterpolator(1000f);
        System.out.println("EaseElasticInOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseElasticOutInterpolator() {
        final EaseElasticOutInterpolator interpolator = new EaseElasticOutInterpolator(1000f);
        System.out.println("EaseElasticOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseExponentialInInterpolator() {
        final EaseExponentialInInterpolator interpolator = new EaseExponentialInInterpolator();
        System.out.println("EaseExponentialInInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseExponentialInOutInterpolator() {
        final EaseExponentialInOutInterpolator interpolator = new EaseExponentialInOutInterpolator();
        System.out.println("EaseExponentialInOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseExponentialOutInterpolator() {
        final EaseExponentialOutInterpolator interpolator = new EaseExponentialOutInterpolator();
        System.out.println("EaseExponentialOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseQuadInInterpolator() {
        final EaseQuadInInterpolator interpolator = new EaseQuadInInterpolator();
        System.out.println("EaseQuadInInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseQuadInOutInterpolator() {
        final EaseQuadInOutInterpolator interpolator = new EaseQuadInOutInterpolator();
        System.out.println("EaseQuadInOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseQuadOutInterpolator() {
        final EaseQuadOutInterpolator interpolator = new EaseQuadOutInterpolator();
        System.out.println("EaseQuadOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseQuartInInterpolator() {
        final EaseQuartInInterpolator interpolator = new EaseQuartInInterpolator();
        System.out.println("EaseQuartInInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseQuartInOutInterpolator() {
        final EaseQuartInOutInterpolator interpolator = new EaseQuartInOutInterpolator();
        System.out.println("EaseQuartInOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseQuartOutInterpolator() {
        final EaseQuartOutInterpolator interpolator = new EaseQuartOutInterpolator();
        System.out.println("EaseQuartOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseQuintInInterpolator() {
        final EaseQuintInInterpolator interpolator = new EaseQuintInInterpolator();
        System.out.println("EaseQuintInInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseQuintInOutInterpolator() {
        final EaseQuintInOutInterpolator interpolator = new EaseQuintInOutInterpolator();
        System.out.println("EaseQuintInOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseQuintOutInterpolator() {
        final EaseQuintOutInterpolator interpolator = new EaseQuintOutInterpolator();
        System.out.println("EaseQuintOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseSineInInterpolator() {
        final EaseSineInInterpolator interpolator = new EaseSineInInterpolator();
        System.out.println("EaseSineInInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseSineInOutInterpolator() {
        final EaseSineInOutInterpolator interpolator = new EaseSineInOutInterpolator();
        System.out.println("EaseSineInOutInterpolator");
        runInterpolator(interpolator);
    }

    @Test
    public void testEaseSineOutInterpolator() {
        final EaseSineOutInterpolator interpolator = new EaseSineOutInterpolator();
        System.out.println("EaseSineOutInterpolator");
        runInterpolator(interpolator);
    }

    private void runInterpolator(final Interpolator interpolator) {
        System.out.println("t\tx");
        for (float t = 0.0f; t <= 1.01f; t += 0.02f) {
            System.out.println(t + "\t" + interpolator.getInterpolation(t));
        }
    }
}