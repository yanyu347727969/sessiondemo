package com.york.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * Created by np0323 on 2017/7/27.
 */
public class redisTest {
    @Test
    public void test01(){
        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("192.168.226.128",6379);
        jedis.auth("yanyu930304");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        jedis.set("you", "123");
        System.out.println(jedis.get("you"));
    }

}