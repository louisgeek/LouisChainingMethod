package com.louisgeek.louischainingmethod;

/**
 * Created by louisgeek on 2016/8/1.
 */
public class NewsBean_Chaining {


    private int newsID;
    private String newsTitle;

    @Override
    public String toString() {
        return "NewsBean_Chaining{" +
                "newsID=" + newsID +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", newsImgUrl='" + newsImgUrl + '\'' +
                '}';
    }

    private String newsContent;
    private String newsImgUrl;

    public int getNewsID() {
        return newsID;
    }

    public NewsBean_Chaining setNewsID(int newsID) {
        this.newsID = newsID;
        return this;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public NewsBean_Chaining setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
        return this;
    }

    public String getNewsContent() {
        return newsContent;
    }

    public NewsBean_Chaining setNewsContent(String newsContent) {
        this.newsContent = newsContent;
        return this;
    }

    public String getNewsImgUrl() {
        return newsImgUrl;
    }

    public NewsBean_Chaining setNewsImgUrl(String newsImgUrl) {
        this.newsImgUrl = newsImgUrl;
        return this;
    }
}
