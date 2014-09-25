package com.orobator.android.scenerecon.view.activities;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

import com.orobator.android.scenerecon.R;
import com.orobator.android.scenerecon.view.customviews.SceneReconCameraView;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewListener2;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;
import org.opencv.core.Mat;

public class HelloOpenCvActivity extends Activity implements CvCameraViewListener2 {
    private static final String TAG = "HelloOpenCvActivity";
    private BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(this) {
        @Override
        public void onManagerConnected(int status) {
            switch (status) {
                case LoaderCallbackInterface.SUCCESS:
                    Log.i(TAG, "OpenCV loaded successfully");
                    sceneReconCameraView.enableView();
                    break;
                default: {
                    super.onManagerConnected(status);
                }
                break;
            }
        }
    };
    private SceneReconCameraView sceneReconCameraView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the window title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // Hide the status bar and other OS-level chrome
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_hello_open_cv);

        sceneReconCameraView = (SceneReconCameraView) findViewById(R.id.JavaCameraView);
        sceneReconCameraView.setCvCameraViewListener(this);

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (sceneReconCameraView != null)
            sceneReconCameraView.disableView();
    }

    @Override
    public void onPause() {
        super.onPause();
        if (sceneReconCameraView != null) {
            sceneReconCameraView.disableView();
        }

    }

    @SuppressLint("NewApi")
    @Override
    public void onResume() {
        super.onResume();
        OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_2_4_9, this, mLoaderCallback);

    }

    public void onCameraViewStarted(int width, int height) {
    }

    public void onCameraViewStopped() {
    }

    public Mat onCameraFrame(CvCameraViewFrame inputFrame) {
        return inputFrame.rgba();
    }

}
