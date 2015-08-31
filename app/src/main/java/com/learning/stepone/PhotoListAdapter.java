package com.learning.stepone;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.toolbox.NetworkImageView;
import com.learning.stepone.model.Photo;

import java.net.URL;
import java.util.List;

public class PhotoListAdapter extends BaseAdapter {
    private List<Photo> mPhoto;
    private final Context context;

    public PhotoListAdapter(Context context, List<Photo> photos) {
        // TODO fill in
        this.context = context;
        mPhoto = photos;
    }

    @Override
    public int getCount() {
        // TODO fill in
        return mPhoto.size();
    }

    @Override
    public Object getItem(int position) {
        // TODO fill in
        return mPhoto.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO fill in
        return 0;
    }

    public class Holder
    {
        TextView title;
        NetworkImageView img;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO fill in

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = null;
        if (convertView == null) {
            // inflate new view
            convertView = inflater.inflate(R.layout.photo_row, parent, false);
        }

        // bind data to view
        TextView textView = (TextView) convertView.findViewById(R.id.photoTitle);
        NetworkImageView imageView = (NetworkImageView) convertView.findViewById(R.id.photoImageView);
        textView.setText(mPhoto.get(position).getTitle());
        Uri myUri = Uri.parse(mPhoto.get(position).getPhotoUrlThumbNail());
        imageView.setImageURI(myUri);



        return convertView;
    }
}
