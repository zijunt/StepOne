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

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.photo_details, container);

        mImage = (NetworkImageView) getView().findViewById(R.id.photoImageView);
        mPhotoTitle = (TextView) getView().findViewById(R.id.photoTitle);
        mIsPublic = (TextView) getView().findViewById(R.id.photoPublic);
//
//        mPhotoTitle.setText(getActivity().getIntent().getExtras().getString("title"));
//        mIsPublic.setText(getActivity().getIntent().getExtras().getString("public"));
        String title = getArguments().getString("title");
        Log.i("fragment",title);
        mPhotoTitle.setText(title);
        return view;
    }


}
