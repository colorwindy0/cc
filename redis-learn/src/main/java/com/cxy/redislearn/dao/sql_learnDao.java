/**
 * ClassName:sql_learnDao
 * Author:
 * Date:2020/10/20
 * Description:TODO
 */

package com.cxy.redislearn.dao;


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


}
