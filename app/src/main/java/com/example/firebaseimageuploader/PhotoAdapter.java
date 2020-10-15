package com.example.firebaseimageuploader;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.bumptech.glide.Glide;

import java.util.List;

public class PhotoAdapter extends ArrayAdapter<Photo> {
    public PhotoAdapter(@NonNull Context context, int resource, @NonNull List<Photo> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView==null){
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.photo_activity, parent, false);
        }
        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoView);
        Photo photo=getItem(position);
        Glide.with(photoImageView.getContext())
                .load(photo.getmPhotoUrl())
                .into(photoImageView);
        return convertView;
    }
}
