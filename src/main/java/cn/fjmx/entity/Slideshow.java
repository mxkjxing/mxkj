package cn.fjmx.entity;

import java.util.Objects;

/**
 * 轮播图相关的实体类
 */
public class Slideshow extends BaseEntity{
    private int sid;  //轮播图id
    private String imgSrc;     //图片资源路径
    private String url; 	    //图片跳转链接

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Slideshow slideshow = (Slideshow) o;
        return sid == slideshow.sid;
    }

    @Override
    public String toString() {
        return "Slideshow{" +
                "sid=" + sid +
                ", imgSrc='" + imgSrc + '\'' +
                ", url='" + url + '\'' +
                "} " + super.toString();
    }
}
