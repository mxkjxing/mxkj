package cn.fjmx.vo;

import cn.fjmx.entity.News;

import java.util.List;

public class NewsVO {

    private String TopTitle;    //顶部标题
    private String url;         //链接
    private List<News> news;    //底部新闻的集合

    public String getTopTitle() {
        return TopTitle;
    }

    public void setTopTitle(String topTitle) {
        TopTitle = topTitle;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    @Override
    public String toString() {
        return "NewsVO{" +
                "TopTitle='" + TopTitle + '\'' +
                ", url='" + url + '\'' +
                ", news=" + news +
                '}';
    }
}
