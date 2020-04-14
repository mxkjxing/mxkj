package cn.fjmx.controller;

import cn.fjmx.service.INewsService;
import cn.fjmx.util.JsonResult;
import cn.fjmx.vo.NewsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 新闻动态相关的控制器类
 */
@RestController
@CrossOrigin
@RequestMapping("news")
public class NewsControllor extends BaseController {

    @Autowired
    private INewsService service;

    /**
     * 获取所有新闻动态
     */
    @GetMapping("show")
    public JsonResult<List<NewsVO>> showNews(){
        List<NewsVO> list = service.showNews();
        return new JsonResult<>(OK,list);
    }

}
