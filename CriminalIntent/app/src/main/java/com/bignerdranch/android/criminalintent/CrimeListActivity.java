package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by echenyu on 11/13/18.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    public Fragment createFragment() {
        return new CrimeListFragment();
    }
}
