package com.song.demo.config;

import com.song.demo.bean.ApplicationConfig;
import com.song.demo.repository.ApplicationConfigRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class ApplicationConfigInit implements CommandLineRunner {

    @Autowired
    private ApplicationConfigRepository applicationConfigRepository;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    public void run(String... args) throws Exception {
        List<ApplicationConfig> all = applicationConfigRepository.findAll();
        if(null!=all&&!all.isEmpty()){
            Map<String,String> map=new LinkedHashMap<>();
            for (ApplicationConfig applicationConfig : all) {
                map.put(applicationConfig.getKeyCode(),applicationConfig.getKeyValue());
            }
            stringRedisTemplate.opsForHash().putAll("stat:config",map);
        }

    }
}
