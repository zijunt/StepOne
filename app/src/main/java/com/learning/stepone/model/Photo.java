package com.learning.stepone.model;

public class Photo {

    // https://farm{farm-id}.staticflickr.com/{server-id}/{id}_{secret}.jpg

    private static final String PHOTO_URL_SUFFIX = ".jpg";
    private static final String PHOTO_URL_BASE = "https://farm%s.staticflickr.com/%s/%s_%s";
    private static final String PHOTO_URL_FORMAT = PHOTO_URL_BASE + PHOTO_URL_SUFFIX;
    private static final String PHOTO_URL_FORMAT_THUMBNAIL = PHOTO_URL_BASE + "_%s" + PHOTO_URL_SUFFIX;

    String id;
    String owner;
    String secret;
    String server;
    int farm;
    String title;
    int ispublic;
    int isfriend;
    int isfamily;

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }

    public String getSecret() {
        return secret;
    }

    public int getFarm() {
        return farm;
    }

    public String getTitle() {
        return title;
    }

    public int getIspublic() {
        return ispublic;
    }

    public int getIsfriend() {
        return isfriend;
    }

    public int getIsfamily() {
        return isfamily;
    }

    public String getServer() {
        return server;
    }

    public String getPhotoUrl() {
        String url = String.format(PHOTO_URL_FORMAT, getFarm(), getServer(), getId(), getSecret());
        return url;
    }

    public String getPhotoUrlThumbNail() {
        String url = String.format(PHOTO_URL_FORMAT_THUMBNAIL, getFarm(), getServer(), getId(), getSecret(), "t");
        return url;
    }


}
