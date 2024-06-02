package com.example.simplemediaapp;

public class Player {
    private String name;
    private int imageResourceId;
    private int videoResourceId;
    private String info;

    public Player(String name, int imageResourceId, int videoResourceId, String info) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.videoResourceId = videoResourceId;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public int getVideoResourceId() {
        return videoResourceId;
    }

    public String getInfo() {
        return info;
    }
}
