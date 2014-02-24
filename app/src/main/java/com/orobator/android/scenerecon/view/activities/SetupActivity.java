package com.orobator.android.scenerecon.view.activities;

import android.app.Fragment;

import com.orobator.android.scenerecon.view.fragments.SetupFragment;

public class SetupActivity extends SingleFragmentActivity {

    @Override
    Fragment createFragment() {
        return new SetupFragment();
    }
}
