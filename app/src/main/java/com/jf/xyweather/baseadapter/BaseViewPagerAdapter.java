package com.jf.xyweather.baseadapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Created by jf on 2016/6/22.
 * The base adapter for ViewPager that load fragment
 */
public class BaseViewPagerAdapter extends FragmentStatePagerAdapter{

    private List<Fragment> fragmentList;

    public BaseViewPagerAdapter(FragmentManager fm, List<Fragment> fragmentList){
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}