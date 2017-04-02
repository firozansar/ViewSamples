package info.firozansari.viewsamples;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by firoz on 02/04/2017.
 */

public class PagerAdapter2 extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter2(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                TabFragment4 tab1 = new TabFragment4();
                return tab1;
            case 1:
                TabFragment5 tab2 = new TabFragment5();
                return tab2;
            case 2:
                TabFragment6 tab3 = new TabFragment6();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}