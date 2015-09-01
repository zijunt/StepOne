package com.learning.stepone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.google.gson.Gson;
import com.learning.stepone.model.Photo;
import com.learning.stepone.model.PhotoPage;
import com.learning.stepone.model.TestData;

public class PhotoDetailsFragment extends Fragment {

    // Put views here that will be used here
    // NetworkImageView?
    NetworkImageView mImage;
    // TextView?
    TextView mPhotoTitle;
    TextView mIsPublic;

    public static PhotoDetailsFragment newInstance() {
        return new PhotoDetailsFragment();
    }

    public static PhotoDetailsFragment newInstance(String url, String title, boolean isPublic) {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.photo_details, container, false);


        Bundle b = getArguments();

        mPhotoTitle = b.getString("title");
        return view;
    }


}
