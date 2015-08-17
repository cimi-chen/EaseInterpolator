package cimi.com.easedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import cimi.com.easeinterpolator.EaseBackInInterpolator;
import cimi.com.easeinterpolator.EaseBackInOutInterpolator;
import cimi.com.easeinterpolator.EaseBackOutInterpolator;
import cimi.com.easeinterpolator.EaseBounceInInterpolator;
import cimi.com.easeinterpolator.EaseBounceInOutInterpolator;
import cimi.com.easeinterpolator.EaseBounceOutInterpolator;
import cimi.com.easeinterpolator.EaseBreathInterpolator;
import cimi.com.easeinterpolator.EaseCircularInInterpolator;
import cimi.com.easeinterpolator.EaseCircularInOutInterpolator;
import cimi.com.easeinterpolator.EaseCircularOutInterpolator;
import cimi.com.easeinterpolator.EaseCubicInInterpolator;
import cimi.com.easeinterpolator.EaseCubicInOutInterpolator;
import cimi.com.easeinterpolator.EaseCubicOutInterpolator;
import cimi.com.easeinterpolator.EaseElasticInInterpolator;
import cimi.com.easeinterpolator.EaseElasticInOutInterpolator;
import cimi.com.easeinterpolator.EaseElasticOutInterpolator;
import cimi.com.easeinterpolator.EaseExponentialInInterpolator;
import cimi.com.easeinterpolator.EaseExponentialInOutInterpolator;
import cimi.com.easeinterpolator.EaseExponentialOutInterpolator;
import cimi.com.easeinterpolator.EaseQuadInInterpolator;
import cimi.com.easeinterpolator.EaseQuadInOutInterpolator;
import cimi.com.easeinterpolator.EaseQuadOutInterpolator;
import cimi.com.easeinterpolator.EaseQuartInInterpolator;
import cimi.com.easeinterpolator.EaseQuartInOutInterpolator;
import cimi.com.easeinterpolator.EaseQuartOutInterpolator;
import cimi.com.easeinterpolator.EaseQuintInInterpolator;
import cimi.com.easeinterpolator.EaseQuintInOutInterpolator;
import cimi.com.easeinterpolator.EaseQuintOutInterpolator;
import cimi.com.easeinterpolator.EaseSineInInterpolator;
import cimi.com.easeinterpolator.EaseSineInOutInterpolator;
import cimi.com.easeinterpolator.EaseSineOutInterpolator;

public class MainActivity extends AppCompatActivity {
    private static final long DURATION = 1200;

    private ListView listView;
    private EaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        listView = (ListView) findViewById(R.id.list);
        adapter = new EaseAdapter(this, nameList, interpolatorList, DURATION);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                adapter.setSelectIndex(position);
            }
        });
    }


    private List<String> nameList = new ArrayList<>();
    private List<Interpolator> interpolatorList = new ArrayList<>();
    private void init() {
        interpolatorList.add(new EaseBreathInterpolator());

        interpolatorList.add(new EaseBackInInterpolator());
        interpolatorList.add(new EaseBackOutInterpolator());
        interpolatorList.add(new EaseBackInOutInterpolator());

        interpolatorList.add(new EaseBounceInInterpolator());
        interpolatorList.add(new EaseBounceOutInterpolator());
        interpolatorList.add(new EaseBounceInOutInterpolator());

        interpolatorList.add(new EaseCircularInInterpolator());
        interpolatorList.add(new EaseCircularOutInterpolator());
        interpolatorList.add(new EaseCircularInOutInterpolator());

        interpolatorList.add(new EaseCubicInInterpolator());
        interpolatorList.add(new EaseCubicOutInterpolator());
        interpolatorList.add(new EaseCubicInOutInterpolator());

        interpolatorList.add(new EaseElasticInInterpolator(DURATION));
        interpolatorList.add(new EaseElasticOutInterpolator(DURATION));
        interpolatorList.add(new EaseElasticInOutInterpolator(DURATION));

        interpolatorList.add(new EaseExponentialInInterpolator());
        interpolatorList.add(new EaseExponentialOutInterpolator());
        interpolatorList.add(new EaseExponentialInOutInterpolator());

        interpolatorList.add(new EaseQuadInInterpolator());
        interpolatorList.add(new EaseQuadOutInterpolator());
        interpolatorList.add(new EaseQuadInOutInterpolator());

        interpolatorList.add(new EaseQuartInInterpolator());
        interpolatorList.add(new EaseQuartOutInterpolator());
        interpolatorList.add(new EaseQuartInOutInterpolator());

        interpolatorList.add(new EaseQuintInInterpolator());
        interpolatorList.add(new EaseQuintOutInterpolator());
        interpolatorList.add(new EaseQuintInOutInterpolator());

        interpolatorList.add(new EaseSineInInterpolator());
        interpolatorList.add(new EaseSineOutInterpolator());
        interpolatorList.add(new EaseSineInOutInterpolator());

        for (Interpolator interpolator : interpolatorList) {
            nameList.add(interpolator.getClass().getSimpleName().replace("Interpolator", ""));
        }
    }

}
