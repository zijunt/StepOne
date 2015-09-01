package com.learning.stepone;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class PhotoDetailsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basic_fragment_activity);

        Bundle bundle = getIntent().getExtras();

        Log.i("ttt", bundle.getString("title"));
        Log.i("ttt", bundle.getString("imageUrl"));
        Log.i("ttt", "" + bundle.getInt("public"));


        // create fragment instance

        // set fragment data
        String mPhotoTitle = getIntent().getExtras().getString("title");
        bundle.putString("title", mPhotoTitle);

        PhotoDetailsFragment fragobj = new PhotoDetailsFragment();


        // start the fragment PhotoDetailsFragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        Fragment newFragment = new PhotoDetailsFragment();
        fragobj.setArguments(bundle);
        ft.add(R.id.content, newFragment);

        ft.commit();
    }
}
