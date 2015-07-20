package com.learning.stepone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PhotoDetailsFragment extends Fragment {

    // Put views here that will be used here
    // NetworkImageView?
    // TextView?

    public static PhotoDetailsFragment newInstance() {
        return new PhotoDetailsFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.photo_details, container);
        return view;
    }


}
