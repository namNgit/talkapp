package com.example.cabom.appchatmanhinhchinh2;

public class HistoryModel {
    private int image;
    private String name, message, call;

    public HistoryModel(int image, String name, String message, String call) {
        this.image = image;
        this.name = name;
        this.message = message;
        this.call = call;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }
}
