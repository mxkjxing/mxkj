package cn.fjmx.mapper;

import cn.fjmx.entity.Slideshow;

import java.util.List;

/**
 * 轮播图持久层相关接口
 */
public interface SlideshowMapper {

    /**
     * 获取所有轮播图
     * @return
     */
    public List<Slideshow> findAll();

    /**
     * 插入轮播图数据
     * @param slideshow 轮播图数据
     * @return 受影响行数
     */
    public Integer insert(Slideshow slideshow);


}
