package com.zhengjing.mapper.simple;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.zhengjing.api.model.simple.News;
import com.zhengjing.mapper.BaseMapper;


/** 
 * @Description 新闻mapper接口
 * @author 郑静
 * @date Mar 16, 2017 3:35:19 PM  
 */
@Mapper
public interface NewsMapper extends BaseMapper<String, News> {

    List<News> findNewsByKeywords(@Param("keywords") String keywords);

    List<News> findNewsByPage(@Param("keywords") String keywords);

    List<News> findNewsByTitle(@Param("title")String title);
}
