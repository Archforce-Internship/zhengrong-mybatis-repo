package Dao;

import pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author 517
 * @date 2021-03-11 - 10:15
 */
public interface BlogMapper {
    int addBlog(Blog blog);
    List<Blog> queryBlog(Map map);
}
