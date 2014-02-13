package com.orobator.android.scenerecon.view.activities;

import android.app.Fragment;

import com.orobator.android.scenerecon.view.fragments.SensorTestFragment;

/**
 * SensorTestActivity is the activity that hosts SensorTestFragment
 */
public class SensorTestActivity extends SingleFragmentActivity {

    @Override
    Fragment createFragment() {
        return new SensorTestFragment();
    }
}
