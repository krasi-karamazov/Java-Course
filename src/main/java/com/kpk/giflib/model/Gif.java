package com.kpk.giflib.model;

import java.util.Date;

/**
 * Created by krasi on 3/8/2017.
 */
public class Gif {
    private String name;
    private Date dateUploaded;
    private String userName;
    private boolean isFavorite;
    private int categoryId;

    public Gif(String name, Date dateUploaded, String userName, boolean isFavorite, int categoryId) {
        this.name = name;
        this.dateUploaded = dateUploaded;
        this.userName = userName;
        this.isFavorite = isFavorite;
        this.categoryId = categoryId;
    }

    public Gif() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateUploaded() {
        return dateUploaded;
    }

    public void setDateUploaded(Date dateUploaded) {
        this.dateUploaded = dateUploaded;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
