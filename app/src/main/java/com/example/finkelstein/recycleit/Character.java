package com.example.finkelstein.recycleit;

public class Character {

    private String name;
    private int photoID;

    public Character(String name, int photoID) {
        this.name = name;
        this.photoID = photoID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhotoID() {
        return photoID;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}
