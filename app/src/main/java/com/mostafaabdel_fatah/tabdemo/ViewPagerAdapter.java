package com.mostafaabdel_fatah.tabdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Mostafa AbdEl_Fatah on 9/7/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    ArrayList<String> tabTitles = new ArrayList<>();
    ArrayList<Fragment> fragments = new ArrayList<>();

    public  void addFragment(Fragment fragment,String tabTitle){
        this.fragments.add(fragment);
        this.tabTitles.add(tabTitle);
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.tabTitles.get(position);
    }
}
