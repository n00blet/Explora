package com.bytecode.explorer.views.activity;

import android.os.Bundle;
import android.widget.TextView;
import com.bytecode.explorer.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Rakshith on 25-07-2015.
 */
public class MapsActivity extends BaseActivity {
    @Bind(R.id.gcm_key)
    TextView tv;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        getLatLong();
    }

    public void getLatLong(){

    }
}
