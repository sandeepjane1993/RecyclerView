package com.example.sande.recyclerview;

public class MyDataClass {

    String title;
    String subTitle;
    String message;

    public MyDataClass(String title, String subTitle, String message) {
        this.title = title;
        this.subTitle = subTitle;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
