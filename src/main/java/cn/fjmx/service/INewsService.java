package cn.fjmx.service;

import cn.fjmx.mapper.NewsMapper;
import cn.fjmx.vo.NewsVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 新闻动态相关的业务层
 */
public interface INewsService {

    /**
     * 获取所有新闻动态
     * @return
     */
    public List<NewsVO> showNews();

}
