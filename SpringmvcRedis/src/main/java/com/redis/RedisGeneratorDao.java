//package com.redis;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.RedisSerializer;
//
//import javax.annotation.Resource;
//import java.io.Serializable;
//
///*
// * Redis工具Dao
// * @author X-rapido
// *
// * @param <K>
// * @param <V>
// */
//public abstract class RedisGeneratorDao<K extends Serializable, V extends Serializable> {
//
//    @Autowired
//    protected RedisTemplate<K,V> redisTemplate ;
//
//    /*
//     * 设置redisTemplate
//     * @param redisTemplate the redisTemplate to set
//     */
//    public void setRedisTemplate(RedisTemplate<K, V> redisTemplate) {
//        this.redisTemplate = redisTemplate;
//    }
//
//    /*
//     * 获取 RedisSerializer
//     * <br>------------------------------<br>
//     */
//    protected RedisSerializer<String> getRedisSerializer() {
//        return redisTemplate.getStringSerializer();
//    }
//
//}