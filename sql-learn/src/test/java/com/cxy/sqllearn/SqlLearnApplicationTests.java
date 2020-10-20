package com.cxy.sqllearn;

import com.cxy.sqllearn.dao.sql_learnDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class SqlLearnApplicationTests {

    @Autowired
    private sql_learnDao learnDao;

    /**
     * @Description: //TODO  根据学号查询学生信息
     * @Param: [requestJson]
     * @return: JSONObject
     * @Author: cxy
     * @Date: 2020/10/20
     */
    @Test
    void searchBySno() {
      String sno = "110";

        Map<String,Object> studentInfo = learnDao.searchBySno(sno);
        System.out.println(studentInfo);
    }
    /**
     * @Description: //TODO  新增学生信息
     * @Param: [requestJson]
     * @return: JSONObject
     * @Author: cxy
     * @Date: 2020/10/20
     */
    @Test
    void insertStudent() {
        String sno = "111";
        String name = "张三";
        String age = "24";
       learnDao.insertStudent(sno,name,age);
       System.out.println("新增成功");

    }
    /**
     * @Description: //TODO  根据学号修改年龄
     * @Param: [requestJson]
     * @return: JSONObject
     * @Author: cxy
     * @Date: 2020/10/20
     */
    @Test
    void updateBySno() {
        String sno = "111";
        String age = "24";
       learnDao.updateBySno(sno,age);
            System.out.println("修改成功");
    }
    /**
     * @Description: //TODO 根据学号删除学生信息
     * @Param: [requestJson]
     * @return: JSONObject
     * @Author: cxy
     * @Date: 2020/10/20
     */
    @Test
    void DeleteBySno() {
        String sno = "110";
        learnDao.DeleteBySno(sno);
        System.out.println("删除成功");
    }
}
