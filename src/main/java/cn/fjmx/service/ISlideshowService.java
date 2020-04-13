package cn.fjmx.service;

import cn.fjmx.entity.Slideshow;

import java.util.List;

/**
 * 轮播图相关的业务层接口
 */

public interface ISlideshowService {

    /**
     * 获取所有轮播图
     * @return 所有的轮播图
     */
    public List<Slideshow> slideshows();

}
