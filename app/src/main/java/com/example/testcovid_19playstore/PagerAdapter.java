package com.example.testcovid_19playstore;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int tabsNumber;

    public PagerAdapter(@NonNull FragmentManager fm, int beg_behavior, int beg_tabs) {
        super(fm, beg_behavior);
        this.tabsNumber = beg_tabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();

            case 1 :
                return new SecondFragment();

            case 2:
                return new ThirdFragment();

                default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabsNumber;
    }
}
