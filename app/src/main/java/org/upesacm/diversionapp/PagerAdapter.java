package org.upesacm.diversionapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class PagerAdapter extends FragmentStatePagerAdapter{
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new page1();
            case 1:return new page2();
            case 2:return new page3();
            case 3:return new page4();
            case 4: return new page5();
            case 5:return new page6();
            case 6:return new page7();

        }
        return new Fragment();
    }

    @Override
    public float getPageWidth(int position) {
        return 0.55f;
    }

    @Override
    public int getCount() {
        return 7;
    }
}
