package cn.fjmx.controller;

import cn.fjmx.entity.Slideshow;
import cn.fjmx.service.ISlideshowService;
import cn.fjmx.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 轮播图相关控制器类
 */
@RestController
@RequestMapping("slide")
public class SlideshowController extends BaseController{

    @Autowired
    private ISlideshowService service;

    @GetMapping("show")
    public JsonResult<List<Slideshow>> slideshows(){
        List<Slideshow> list = service.slideshows();
        return new JsonResult<List<Slideshow>>(OK,list);
    }

}
