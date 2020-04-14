package cn.fjmx.mapper;

import cn.fjmx.entity.News;

import java.util.List;

/**
 * 新闻相关持久层相关接口
 */
public interface NewsMapper {

    /**
     * 获取顶部标题
     * @return
     */
    public List<News> findByTopTitle();

    /**
     * 根据上级标题获取底部数据
     * @return
     */
    public List<News> findByUpMenuTitle(String title);

}
