package com.Dao;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author 517
 * @date 2021-03-10 - 14:50
 */
public interface TeacherMapper {
    @Select("select *from teacher where id = #{tid}")
    Teacher getTeacher(@Param("tid") int id);

    Teacher getTeacher2(@Param("tid")int tid);
}
