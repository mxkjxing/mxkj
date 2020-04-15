package cn.fjmx.vo;

import cn.fjmx.entity.News;

import java.util.List;
import java.util.Objects;

public class NewsVO {
    private Integer topTitleId; //顶部标题id
    private String topTitle;    //顶部标题
    private String topTitleUrl;         //链接
    private List<News> news;    //底部新闻的集合

    public String getTopTitle() {
        return topTitle;
    }

    public void setTopTitle(String topTitle) {
        this.topTitle = topTitle;
    }

    public String getTopTitleUrl() {
        return topTitleUrl;
    }

    public void setTopTitleUrl(String topTitleUrl) {
        this.topTitleUrl = topTitleUrl;
    }

    public List<News> getNews() {
        return news;
    }

    public void setNews(List<News> news) {
        this.news = news;
    }

    public Integer getTopTitleId() {
        return topTitleId;
    }

    public void setTopTitleId(Integer topTitleId) {
        this.topTitleId = topTitleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsVO newsVO = (NewsVO) o;
        return topTitleId.equals(newsVO.topTitleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topTitleId);
    }

    @Override
    public String toString() {
        return "NewsVO{" +
                "topTitleId=" + topTitleId +
                ", topTitle='" + topTitle + '\'' +
                ", topTitleUrl='" + topTitleUrl + '\'' +
                ", news=" + news +
                '}';
    }
}
