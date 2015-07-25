package com.bytecode.explorer.views.activity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.bytecode.explorer.ExploraApp;
import com.bytecode.explorer.R;
import com.bytecode.explorer.utils.Constants;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import java.io.IOException;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Rakshith on 25-07-2015.
 */
public class TestActivity extends BaseActivity {

    @Bind(R.id.gcm_key)
    TextView gcm_key;
    ExploraApp mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        mContext = (ExploraApp) getApplicationContext();
        getInstanceId();
    }

    public void getInstanceId(){
        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                try {
                    String token = InstanceID.getInstance(mContext).getToken(Constants.SENDER_ID,GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);
                    if(token!=null){
                        gcm_key.setText(token);
                    }

                } catch (final IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }.execute();
    }

}
