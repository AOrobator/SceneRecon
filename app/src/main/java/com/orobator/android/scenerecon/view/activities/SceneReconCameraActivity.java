package com.orobator.android.scenerecon.view.activities;

import android.app.Fragment;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.orobator.android.scenerecon.view.fragments.SceneReconCameraFragment;

/**
 * SceneReconCameraActivity is the Activity that holds the main view fragment
 */
public class SceneReconCameraActivity extends SingleFragmentActivity {

    @Override
    Fragment createFragment() {
        return new SceneReconCameraFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        // Hide the window title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Hide the status bar and other OS-level chrome
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        super.onCreate(savedInstanceState);
    }
}
