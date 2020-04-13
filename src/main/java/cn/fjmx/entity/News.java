package cn.fjmx.entity;

import java.util.Objects;

/**
 * 新闻相关的实体类
 */
public class News extends BaseEntity{
    private Integer nid;//  新闻id
    private String title;// 标题
    private String img;// 图片
    private String url;// 地址
    private String up_menu_title; //上级菜单标题

    public Integer getNid() {
        return nid;
    }

    public void setNid(Integer nid) {
        this.nid = nid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUp_menu_title() {
        return up_menu_title;
    }

    public void setUp_menu_title(String up_menu_title) {
        this.up_menu_title = up_menu_title;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return nid.equals(news.nid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nid);
    }

    @Override
    public String toString() {
        return "News{" +
                "nid=" + nid +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", url='" + url + '\'' +
                ", up_menu_title='" + up_menu_title + '\'' +
                "} " + super.toString();
    }
}
