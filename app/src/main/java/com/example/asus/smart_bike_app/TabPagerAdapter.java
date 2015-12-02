package com.example.asus.smart_bike_app;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class TabPagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public TabPagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }


    @Override
    public Fragment getItem(int arg0) {
        switch (arg0) {
            case 0:
                return new Home();
            case 1:
                return new Data();
            default:
                break;
        }
        return null;
    }
    @Override
    public int getCount() {
        return 2;
    }
}

