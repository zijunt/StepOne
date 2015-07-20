package com.learning.stepone.model;

import java.util.List;

public class PhotoPage {

    int page;
    int pages;
    int perpage;
    int total;
    String stat;

    List<Photo> photo;

    public int getPage() {
        return page;
    }

    public int getPages() {
        return pages;
    }

    public int getPerpage() {
        return perpage;
    }

    public int getTotal() {
        return total;
    }

    public String getStat() {
        return stat;
    }

    public List<Photo> getPhoto() {
        return photo;
    }
}
