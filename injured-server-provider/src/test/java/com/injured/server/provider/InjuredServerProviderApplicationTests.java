package com.injured.server.provider;

import com.injured.commons.redis.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class InjuredServerProviderApplicationTests {

    @Autowired
    private RedisUtil redisUtil;
    @Test
    public void contextLoads() {
        //System.out.println(redisUtil.lGet("CE_DICT_LIST_KEY",0,-1));
        //System.out.println(redisUtil.get("a"));
        List<Object> redis = redisUtil.lGet("CE_DICT_LIST_KEY",0,5);
        System.out.println(redis);
    }

}
