package com.jialili.video.pojo;


public class Videoinfo {

    private long id;
    private String title;
    private String text;
    private long upfileuserid;
    private String upfilelocalurl;
    private String upfileweburl;
    private java.sql.Timestamp upfiledatetime;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public long getUpfileuserid() {
        return upfileuserid;
    }

    public void setUpfileuserid(long upfileuserid) {
        this.upfileuserid = upfileuserid;
    }


    public String getUpfilelocalurl() {
        return upfilelocalurl;
    }

    public void setUpfilelocalurl(String upfilelocalurl) {
        this.upfilelocalurl = upfilelocalurl;
    }


    public String getUpfileweburl() {
        return upfileweburl;
    }

    public void setUpfileweburl(String upfileweburl) {
        this.upfileweburl = upfileweburl;
    }


    public java.sql.Timestamp getUpfiledatetime() {
        return upfiledatetime;
    }

    public void setUpfiledatetime(java.sql.Timestamp upfiledatetime) {
        this.upfiledatetime = upfiledatetime;
    }

}
