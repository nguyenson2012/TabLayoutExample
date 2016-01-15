package com.nguyenthanhson.tablayoutexample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by SON on 1/12/2016.
 */
public class PracticePagerAdapter extends FragmentPagerAdapter {
    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };
    private Context context;
    public PracticePagerAdapter(FragmentManager fm,Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PracticeSoundReadFragment();
            case 1:
                return new PracticeSoundReadFragment();
            case 2:
                return new PracticeSoundReadFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
