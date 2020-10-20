/**
 * ClassName:sql_learnDao
 * Author:
 * Date:2020/10/20
 * Description:TODO
 */

package com.cxy.sqllearn.dao;


import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public interface sql_learnDao {

    /**
    * @Description: //TODO  根据学号查询姓名 年龄
    * @Param: [requestJson]
    * @return: JSONObject
    * @Author: cxy
    * @Date: 2020/10/20
     */
    @Select("select * from student where sno=#{sno}")
    Map<String,Object> searchBySno(String sno);

    /**
     * @Description: //TODO  新增学生信息
     * @Param: [requestJson]
     * @return: JSONObject
     * @Author: cxy
     * @Date: 2020/10/20
     */
    @Select("insert into student VALUES(#{sno},#{name},#{age})")
    int insertStudent(String sno,String name,String age);

    /**
     * @Description: //TODO  新增学生信息
     * @Param: [requestJson]
     * @return: JSONObject
     * @Author: cxy
     * @Date: 2020/10/20
     */
    @Select("UPDATE student SET age=#{age} where #{sno}")
    int updateBySno(String sno,String age);


    /**
     * @Description: //TODO 根据学号删除学生信息
     * @Param: [requestJson]
     * @return: JSONObject
     * @Author: cxy
     * @Date: 2020/10/20
     */
    @Select("DELETE FROM student where sno=#{sno})")
    int DeleteBySno(String sno);
}
