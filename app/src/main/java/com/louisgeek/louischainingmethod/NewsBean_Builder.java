package com.louisgeek.louischainingmethod;

/**
 * Created by louisgeek on 2016/8/1.
 */
public class NewsBean_Builder {
    private int newsID;
    private String newsTitle;
    private String newsContent;
    private String newsImgUrl;
//
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
    //
    @Override
    public String toString() {
        return "NewsBean_Builder{" +
                "newsID=" + newsID +
                ", newsTitle='" + newsTitle + '\'' +
                ", newsContent='" + newsContent + '\'' +
                ", newsImgUrl='" + newsImgUrl + '\'' +
                '}';
    }
//////
    private NewsBean_Builder(Builder builder) {
        this.newsID = builder.newsID;
        this.newsTitle = builder.newsTitle;
        this.newsContent = builder.newsContent;
        this.newsImgUrl = builder.newsImgUrl;
    }
    //
    public static class Builder{
        private int newsID;
        private String newsTitle;
        private String newsContent;
        private String newsImgUrl;

        public Builder newsID(int newsID) {
            this.newsID = newsID;
            return this;
        }

        public Builder newsTitle(String newsTitle) {
            this.newsTitle = newsTitle;
            return this;
        }

        public Builder newsContent(String newsContent) {
            this.newsContent = newsContent;
            return this;
        }
        public Builder newsImgUrl(String newsImgUrl) {
            this.newsImgUrl = newsImgUrl;
            return this;
        }

        ////
        public NewsBean_Builder build(){
            return new NewsBean_Builder(this);
        }
    }
}
