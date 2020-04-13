package cn.fjmx.controller;

import cn.fjmx.entity.Slideshow;
import cn.fjmx.service.ISlideshowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 轮播图相关控制器类
 */
@RestController
@RequestMapping("slide")
public class SlideshowController {

    @Autowired
    private ISlideshowService service;

    @GetMapping("show")
    public List<Slideshow> slideshows(){
        List<Slideshow> list = service.slideshows();
        return list;
    }

}
