package cn.fjmx.mapper;

import cn.fjmx.entity.News;

import java.util.List;

/**
 * 新闻相关持久层相关接口
 */
public interface NewsMapper {

    /**
     * 获取首页顶部标题
     * @return
     */
    public List<News> findHomepageTopTitle();

    /**
     * 根据上级新闻id获取底部首页的数据
     * @return
     */
    public List<News> findHomepageNewsTitleByNId(Integer nid);

    /**
     * 根据上级新闻id获取底部数据
     * @return
     */
    public List<News> findByUpMenuId(Integer nid);


}
