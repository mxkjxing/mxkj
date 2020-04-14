package cn.fjmx.service.impl;

import cn.fjmx.entity.News;
import cn.fjmx.mapper.NewsMapper;
import cn.fjmx.service.INewsService;
import cn.fjmx.vo.NewsVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewsServiceImpl implements INewsService {

    @Autowired
    private NewsMapper mapper;

    /**
     * 获取所有新闻动态
     * @return
     */
    public List<NewsVO> showNews(){
        //需要返回的集合
        List<NewsVO> list = new ArrayList<>();
        //所有顶部标题
        List<News> topTitles = mapper.findByTopTitle();
        //遍历顶部标题
        for (News top : topTitles){
            //获取所有子新闻
            List<News> ns = mapper.findByUpMenuTitle(top.getTitle());
            int index = 1;
            //遍历子新闻
            for (News n : ns){
                //去除多余数据
                n.setUpMenuTitle(null);
                n.setCreatedUser(null);
                n.setCreatedTime(null);
                n.setModifiedUser(null);
                n.setHeatPress(null);
                if(index > 1){
                    n.setImg(null);
                }
                index++;
            }
            //实例化一个vo类准备填充数据
            NewsVO vo = new NewsVO();
            vo.setTopTitle(top.getTitle());
            vo.setUrl(top.getUrl());
            vo.setNews(ns);
            //加入数据
            list.add(vo);
        }
        return list;
    }

}
