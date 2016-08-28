package com.louisgeek.louischainingmethod;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewsBean newsBean=new NewsBean();
        newsBean.setNewsID(1);
        newsBean.setNewsTitle("TITLE1");
        newsBean.setNewsContent("CONTENT1");
        newsBean.setNewsImgUrl("IMAGEURL1");

        Log.d(TAG, "onCreate: newsBean:"+newsBean.toString());

        NewsBean_Chaining newsBean_chaining=new NewsBean_Chaining();
        newsBean_chaining.setNewsID(2)
                .setNewsTitle("TITLE2")
                .setNewsContent("CONTENT2")
                .setNewsImgUrl("IMAGEURL2");

        Log.d(TAG, "onCreate: newsBean_chaining:"+newsBean_chaining.toString());

        NewsBean_Builder.Builder news_B_Builder=new NewsBean_Builder.Builder();
        NewsBean_Builder newsBean_B=news_B_Builder.newsID(3)
                .newsTitle("TITLE3")
                .newsContent("CONTENT3")
                .newsImgUrl("IMAGEURL3")
                .build();

        Log.d(TAG, "onCreate: newsBean_B:"+newsBean_B.toString());
        //newsBean_B.getNewsContent()

    }
}
