package com.example.mobilelegendsbestguide;

public class Hero {

    private String Title;
    private String Category ;
    private String Description ;
    private int Thumbnail ;
    private int Poster;

    public Hero() {
    }

    public Hero(String title, String category, String description, int thumbnail, int poster) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
        Poster = poster;
    }


    public String getTitle() {
        return Title;
    }

    public String getCategory() {
        return Category;
    }

    public String getDescription() {
        return Description;
    }

    public int getThumbnail() {
        return Thumbnail;
    }

    public int getPoster() {
        return Poster;
    }


    public void setTitle(String title) {
        Title = title;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setThumbnail(int thumbnail) {
        Thumbnail = thumbnail;
    }

    public void setPoster(int poster) {
        Poster = poster;
    }
}