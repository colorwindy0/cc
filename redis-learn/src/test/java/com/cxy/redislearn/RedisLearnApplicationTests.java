package com.cxy.redislearn;

import com.cxy.redislearn.dao.sql_learnDao;
import com.cxy.redislearn.redis.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
class RedisLearnApplicationTests {
    @Autowired
    private sql_learnDao learnDao;
    @Autowired
    private  RedisUtil redis;

    /**
    * @Description: //TODO  实现对key：sno1的删除和保存
    * @Param: [requestJson]
    * @return: JSONObject
    * @Author: cxy
    * @Date: 2020/10/20
     */
    @Test
    void RedisLoads() {
        //保存缓存
      boolean bool =  redis.set("sno1","测试");
      if (bool==true){
          System.out.println("保存redis成功");
      }else {
          System.out.println("保存redis失败");
      }
      //根据key获取上一步保存的值
        Object value =  redis.get("sno1");
        System.out.println("新增key值"+value);
        //根据key值删除
        redis.del ("sno1");
        //查询key值是否被删除
        Object value1 =  redis.get("sno1");
        System.out.println("删除后"+value1);
    }

    /**
     * @Description: //TODO  练习三 先从redis中查询缓存，如果没有查询到该值，则从数据库查询并将结果缓存到redis中（保留时间30分钟）
     * @Param: [requestJson]
     * @return: JSONObject
     * @Author: cxy
     * @Date: 2020/10/20
     */
    @Test
    void searchBySnoRedis() {
        String sno = "110"; //学号

        Object value =  redis.get(sno); //先查询redis是否有值
        if (value==null){ //当redis缓存没有这个sno这个值的时候查询数据库并保存到redis
            Map<String,Object> studentInfo = learnDao.searchBySno(sno);

            redis.set(sno,studentInfo); //保存redis

            redis.expire(sno,1800);//设置过期时间

            System.out.println("数据库查出的信息"+studentInfo);
        }else {
            System.out.println("Redis查出的信息"+value);
        }


    }
}
