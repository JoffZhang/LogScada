package com.hx.vr.logscada.common.utils;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
import java.util.Map;
@Slf4j
public class JSONUtils {

    /**
     * json转List<T>
     * @param jsonStr
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> List<T> jsonToList(String jsonStr, Class<T> clazz){
        try {
            return JSONArray.parseArray(jsonStr, clazz);
        }catch (Exception e){
            log.warn("jsonToList : jsonStr = " + jsonStr +" , clazz = "+ clazz);
        }
        return null;
    }

    /**
     * List 转json
     * @param ts
     * @param <T>
     * @return
     */
    public static <T> String listToJson(List<T> ts){
        return JSON.toJSONString(ts);
    }
    /**
     * JSON 转 POJO
     */
    public static <T> T jsonToObj(String pojo,Class<T> clazz){
        try{
            return JSONObject.parseObject(pojo,clazz);
        }catch (Exception e){
            log.warn("jsonToObj : pojo = " + pojo +" , clazz = "+ clazz);
        }
        return null;
    }
    /**
     * POJO 转 JSON
     */
    public static <T> String getJson(T tResponse){
        String pojo = JSONObject.toJSONString(tResponse);
        return pojo;
    }

    /**
     * 功能描述：把JSON数据转换成较为复杂的List<Map<K, V>>
     * @param jsonStr JSON数据
     * @return List<Map<K, V>>
     */
    public static <K,V> List<Map<K,V>> jsonToListMap(String jsonStr){
        try {
            return JSON.parseObject(jsonStr,new TypeReference<List<Map<K,V>>>(){});
        }catch (Exception e){
            log.warn("jsonToListMap : pojo = " + jsonStr +" , clazz = List<Map<K,V>>");

        }
        return null;
    }

    /**
     * json字符串转化为map
     * @param s
     * @return
     */
    public static <K, V> Map<K, V>  jsonToMap(String s) {
        Map<K, V> m = (Map<K, V>) JSONObject.parseObject(s);
        return m;
    }
}
