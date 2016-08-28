package com.louisgeek.louischainingmethod;

/**
 * Created by louisgeek on 2016/8/1.
 */
public class NewsBean {
    private int newsID;
    private String newsTitle;
    private String newsContent;

    @Override
    public String toString() {
        return "NewsBean{" +
                "newsID=" + newsID +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", newsImgUrl='" + newsImgUrl + '\'' +
                '}';
    }

    private String newsImgUrl;

    public int getNewsID() {
        return newsID;
    }

    public void setNewsID(int newsID) {
        this.newsID = newsID;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }

    public String getNewsImgUrl() {
        return newsImgUrl;
    }

    public void setNewsImgUrl(String newsImgUrl) {
        this.newsImgUrl = newsImgUrl;
    }
}
