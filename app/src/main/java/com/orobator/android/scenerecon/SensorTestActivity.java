package com.orobator.android.scenerecon;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * SensorTestActivity displays the available sensors on the device as well shows
 * the current tilt of the device along its 3 axes
 */
public class SensorTestActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_test);

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment(getApplicationContext()))
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.sensor_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment implements SensorEventListener {
        private SensorManager mSensorManager;
        private Sensor mRotationVectorSensor;
        private TextView world_xAxisRotationTextView;
        private TextView world_yAxisRotationTextView;
        private TextView world_zAxisRotationTextView;
        private TextView phone_xAxisRotationTextView;
        private TextView phone_yAxisRotationTextView;
        private TextView phone_zAxisRotationTextView;

        public PlaceholderFragment(Context context) {
            mSensorManager = (SensorManager) context.getSystemService(Context.SENSOR_SERVICE);
            mRotationVectorSensor = mSensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR);
        }


        @Override
        public void onResume() {
            super.onResume();
            mSensorManager.registerListener(this, mRotationVectorSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }

        @Override
        public void onPause() {
            super.onPause();
            mSensorManager.unregisterListener(this);
        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_sensor_test, container, false);
            TextView sensorListTextView = (TextView) rootView.findViewById(R.id.sensorList_textView);
            SensorManager sensorManager = (SensorManager) getActivity().getSystemService(Context.SENSOR_SERVICE);
            List<Sensor> deviceSensors = sensorManager.getSensorList(Sensor.TYPE_ALL);
            String sensors = "\n";
            for (Sensor s : deviceSensors) {
                sensors = sensors + s.getName() + "\n";
            }
            sensors = getResources().getString(R.string.sensor_list, sensors);
            sensorListTextView.setText(sensors);

            world_xAxisRotationTextView = (TextView) rootView.findViewById(R.id.world_xAxisRotation_textView);
            world_yAxisRotationTextView = (TextView) rootView.findViewById(R.id.world_yAxisRotation_textView);
            world_zAxisRotationTextView = (TextView) rootView.findViewById(R.id.world_zAxisRotation_textView);

            phone_xAxisRotationTextView = (TextView) rootView.findViewById(R.id.phone_xAxisRotation_textView);
            phone_yAxisRotationTextView = (TextView) rootView.findViewById(R.id.phone_yAxisRotation_textView);
            phone_zAxisRotationTextView = (TextView) rootView.findViewById(R.id.phone_zAxisRotation_textView);

            return rootView;
        }

        @Override
        public void onSensorChanged(SensorEvent event) {

            if (event.sensor.getType() == Sensor.TYPE_ROTATION_VECTOR) {
                float[] axisOrientationValues = new float[3];
                float[] worldRotationVector = event.values;
                float[] worldRotationMatrix = new float[16];
                float[] phoneRotationMatrix= new float[16];

                // Get orientation on world axis
                mSensorManager.getRotationMatrixFromVector(worldRotationMatrix, worldRotationVector);
                mSensorManager.getOrientation(worldRotationMatrix, axisOrientationValues);

                double z_rotation_azimuth = Math.toDegrees(axisOrientationValues[0]);
                double x_rotation_pitch = Math.toDegrees(axisOrientationValues[1]);
                double y_rotation_roll = Math.toDegrees(axisOrientationValues[2]);

                String xAxisRotation = getString(R.string.x_axis_rotation, x_rotation_pitch);
                String yAxisRotation = getString(R.string.y_axis_rotation, y_rotation_roll);
                String zAxisRotation = getString(R.string.z_axis_rotation, z_rotation_azimuth);

                world_xAxisRotationTextView.setText(xAxisRotation);
                world_yAxisRotationTextView.setText(yAxisRotation);
                world_zAxisRotationTextView.setText(zAxisRotation);

                // Now get orientation on phone axis
                SensorManager.remapCoordinateSystem(worldRotationMatrix, SensorManager.AXIS_X, SensorManager.AXIS_Y, phoneRotationMatrix);
                mSensorManager.getOrientation(phoneRotationMatrix, axisOrientationValues);

                z_rotation_azimuth = Math.toDegrees(axisOrientationValues[0]);
                x_rotation_pitch = Math.toDegrees(axisOrientationValues[1]);
                y_rotation_roll = Math.toDegrees(axisOrientationValues[2]);

                xAxisRotation = getString(R.string.x_axis_rotation, x_rotation_pitch);
                yAxisRotation = getString(R.string.y_axis_rotation, y_rotation_roll);
                zAxisRotation = getString(R.string.z_axis_rotation, z_rotation_azimuth);

                phone_xAxisRotationTextView.setText(xAxisRotation);
                phone_yAxisRotationTextView.setText(yAxisRotation);
                phone_zAxisRotationTextView.setText(zAxisRotation);



            }
        }

        @Override
        public void onAccuracyChanged(Sensor sensor, int accuracy) {
        }
    }

}
