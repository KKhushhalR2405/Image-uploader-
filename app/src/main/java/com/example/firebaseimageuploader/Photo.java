package com.example.firebaseimageuploader;

public class Photo {
    private String mPhotoUrl;

    public Photo() {
    }

    public Photo(String mPhotoUrl) {
        this.mPhotoUrl = mPhotoUrl;
    }

    public String getmPhotoUrl() {
        return mPhotoUrl;
    }

    public void setmPhotoUrl(String mPhotoUrl) {
        this.mPhotoUrl = mPhotoUrl;
    }
}
