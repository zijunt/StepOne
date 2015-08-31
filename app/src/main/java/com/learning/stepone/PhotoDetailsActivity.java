package com.learning.stepone;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class PhotoDetailsActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.basic_fragment_activity);

        Bundle bundle = getIntent().getExtras();



        // create fragment instance

        // set fragment data
        String mPhotoTitle = getIntent().getExtras().getString("title");
        bundle.putString("title",mPhotoTitle);

        PhotoDetailsFragment fragobj = new PhotoDetailsFragment();
        fragobj.setArguments(bundle);

        // start the fragment PhotoDetailsFragment
        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction ft = fragmentManager.beginTransaction();

        ft.replace(R.id.content, new PhotoDetailsFragment());
    }
}
