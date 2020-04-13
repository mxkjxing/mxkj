package cn.fjmx.service.impl;

import cn.fjmx.entity.Slideshow;
import cn.fjmx.mapper.SlideshowMapper;
import cn.fjmx.service.ISlideshowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 轮播图业务层实现类
 */
@Service
public class SlideshowServiceImpl implements ISlideshowService {

    @Autowired
    private SlideshowMapper mapper;

    /**
     * 获取所有轮播图
     * @return 所有的轮播图
     */
    public List<Slideshow> slideshows(){
        List<Slideshow> list = mapper.findAll();
        for (Slideshow ss: list
             ) {
            ss.setCreatedUser(null);
            ss.setCreatedTime(null);
            ss.setModifiedUser(null);
            ss.setModifiedTime(null);

        }
        return list;
    }

}
