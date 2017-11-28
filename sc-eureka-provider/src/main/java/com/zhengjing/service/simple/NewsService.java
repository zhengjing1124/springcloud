package com.zhengjing.service.simple;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.zhengjing.api.model.simple.News;

/**
 * @author 郑静
 * @Description 新闻接口类
 * @date Mar 16, 2017 5:19:14 PM
 */
public interface NewsService {

    public boolean addNews(News news);

    public boolean editNews(News news);

    public News findNewsById(String newsId);

    public List<News> findNewsByKeywords(String keywords);

    public PageInfo<News> findNewsByPage(Integer pageNum, String keywords);

    public News findNewsByTitle(String title);
}