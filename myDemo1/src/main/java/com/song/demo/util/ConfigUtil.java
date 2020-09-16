package com.song.demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.HashMap;
import java.util.Map;

public class ConfigUtil {

    @Autowired
    private static StringRedisTemplate stringRedisTemplate;

    private static Map<String,String> config=new HashMap<>();

    public static String getConfigValue(String keyCode,String... defaultValue){
        stringRedisTemplate.opsForHash();
        return null;
    }

}
