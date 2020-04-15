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
     * 获取所有首页的新闻动态
     * @return
     */
    public List<NewsVO> showHomepageNews(){
        //需要返回的集合
        List<NewsVO> list = new ArrayList<>();
        //获取首页顶部标题
        List<News> homepageTopTitle = mapper.findHomepageTopTitle();
        for (News topTitle : homepageTopTitle) {
            //获取顶部标题id
            Integer topNid = topTitle.getNid();
            //根据顶部标题id获取底部数据
            List<News> newsList = mapper.findHomepageNewsTitleByNId(topNid);
            int index = 0;
            for (News n :newsList){
                index++;
                if (index > 1){
                    n.setImg(null);
                }
                n.setCreatedUser(null);
                n.setModifiedUser(null);
                n.setModifiedTime(null);
                n.setUpMeunId(null);
                n.setIsHomepage(null);
                n.setHeatPress(null);
            }
            NewsVO vo = new NewsVO();
            //补全数据
            vo.setTopTitleId(topTitle.getNid());
            vo.setTopTitle(topTitle.getTitle());
            vo.setTopTitleUrl(topTitle.getUrl());
            vo.setNews(newsList);
            list.add(vo);
        }
        return list;
    }

}
