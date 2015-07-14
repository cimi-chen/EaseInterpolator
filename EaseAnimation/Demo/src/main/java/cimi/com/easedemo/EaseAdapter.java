package cimi.com.easedemo;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.TranslateAnimation;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;

import java.util.List;

import cimi.com.easedemo.view.CursorView;
import cimi.com.easedemo.view.EaseView;

/**
 * Created by cimi on 15/7/7.
 */

public class EaseAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private List<String> mNameList;
    private List<Interpolator> mInterpolatorList;
    private long duration;
    private int selectIndex = -1;

    public EaseAdapter(Context context, List<String> nameList, List<Interpolator> interpolatorList, long duration) {
        mContext = context;
        mInflater = LayoutInflater.from(context);
        mNameList = nameList;
        mInterpolatorList = interpolatorList;
        this.duration = duration;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            mHolder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.adapter, null);
            convertView.setBackgroundColor(Color.WHITE);
            mHolder.easeName = (TextView) convertView.findViewById(R.id.easeName);
            mHolder.easeView = (EaseView) convertView.findViewById(R.id.easeView);
            mHolder.cursor = (CursorView) convertView.findViewById(R.id.cursor);
            convertView.setTag(mHolder);
        }else {
            mHolder = (ViewHolder) convertView.getTag();
        }

        final Interpolator interpolator = mInterpolatorList.get(position);
        mHolder.easeName.setText(mNameList.get(position));
        mHolder.easeView.setDurationAndInterpolator(duration, interpolator);

        int bottomMargin = mHolder.easeView.blankTB - mHolder.cursor.height / 2;
        LayoutParams params = (LayoutParams)mHolder.cursor.getLayoutParams();
        params.addRule(RelativeLayout.ALIGN_BOTTOM, R.id.easeView);
        params.bottomMargin = bottomMargin;
        mHolder.cursor.setLayoutParams(params);


        if (position == selectIndex) {
            //选定项开始做Ease动画
            selectIndex = -1;
            int toYDelta = mHolder.easeView.height - 2 * mHolder.easeView.blankTB;
            Animation anim = new TranslateAnimation(0, 0, 0, -toYDelta);
            anim.setDuration(duration);
            anim.setInterpolator(interpolator);
            anim.setFillAfter(true);
            anim.setFillBefore(true);
            anim.setStartOffset(300);
            mHolder.cursor.startAnimation(anim);
        } else {
            //非选定项的游标回到原处
            Animation anim = new TranslateAnimation(0, 0, 0, 0);
            anim.setDuration(0);
            anim.setFillAfter(true);
            anim.setFillBefore(true);
            mHolder.cursor.startAnimation(anim);
        }

        return convertView;
    }

    public void setSelectIndex(int index) {
        selectIndex = index;
        notifyDataSetChanged();
    }

    private ViewHolder mHolder = null;
    private class ViewHolder {
        public TextView easeName;
        public EaseView easeView;
        public CursorView cursor;
    }


    @Override
    public int getCount() {
        return mInterpolatorList == null ? 0 : mInterpolatorList.size();
    }

    @Override
    public Object getItem(int arg0) {
        return null;
    }

    @Override
    public long getItemId(int arg0) {
        return 0;
    }


}