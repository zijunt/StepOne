package com.learning.stepone;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.learning.stepone.model.Photo;

import java.util.List;

public class PhotoListAdapter extends BaseAdapter {

    public PhotoListAdapter(List<Photo> photos) {
        // TODO fill in
    }

    @Override
    public int getCount() {
        // TODO fill in
        return 0;
    }

    @Override
    public Object getItem(int position) {
        // TODO fill in
        return null;
    }

    @Override
    public long getItemId(int position) {
        // TODO fill in
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO fill in
        View view = null;
        if (convertView == null) {
            // inflate new view
        }

        // bind data to view


        return convertView;
    }
}
