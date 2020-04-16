package cn.fjmx.entity;

import java.util.Objects;

/**
 * 新闻相关的实体类
 */
public class News extends BaseEntity{
    /**
	 * 
	 */
	private static final long serialVersionUID = 6938515768541045592L;
	private Integer nid;    // 新闻id
    private String title;   // 标题
    private String img;     // 图片
    private String url;     // 地址
    private Integer heatPress; //热度
    private Integer upMeunId; //上级菜单id
    private Integer isHomepage; //是否在首页 0-否  1-是

    public Integer getUpMeunId() {
        return upMeunId;
    }

    public void setUpMeunId(Integer upMeunId) {
        this.upMeunId = upMeunId;
    }

    public Integer getIsHomepage() {
        return isHomepage;
    }

    public void setIsHomepage(Integer isHomepage) {
        this.isHomepage = isHomepage;
    }

    public Integer getHeatPress() {
        return heatPress;
    }

    public void setHeatPress(Integer heatPress) {
        this.heatPress = heatPress;
    }

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
                ", heatPress=" + heatPress +
                ", upMeunId=" + upMeunId +
                ", isHomepage=" + isHomepage +
                "} " + super.toString();
    }
}
