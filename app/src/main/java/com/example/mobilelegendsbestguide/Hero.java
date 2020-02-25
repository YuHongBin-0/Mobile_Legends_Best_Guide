package com.example.mobilelegendsbestguide;

public class Hero {

    private String Title;
    private String Category ;
    private String Description ;
    private int Thumbnail ;
    private int Icon;

    public Hero() {
    }

    public Hero(String title, String category, String description, int thumbnail, int icon) {
        Title = title;
        Category = category;
        Description = description;
        Thumbnail = thumbnail;
        Icon = icon;
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

    public int getIcon() {
        return Icon;
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

    public void setIcon(int icon) {
        Icon = icon;
    }
}