package com.instalogger.helpers;

import org.jooq.Field;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.tools.json.JSONValue;
import org.vertx.java.core.json.JsonArray;
import org.vertx.java.core.json.JsonObject;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: andreytsarevskiy
 * Date: 24/11/13
 * Time: 16:43
 * To change this template use File | Settings | File Templates.
 */
public class JsonHelper {

    protected static SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static String formatJSON(Result<? extends Record> result) {
        List<Map<String, Object>> list = new ArrayList<>();

        for (Record record : result) {
            Map<String, Object> jRecord = new HashMap<>();
            for (Field<?> field : result.fields()) {
                Object value = record.getValue(field);
                if (value instanceof Date) {
                    value = formatter.format(value);
                }
                jRecord.put(field.getName(), value);
            }
            list.add(jRecord);

        }
        return JSONValue.toJSONString(list);
    }

    public static JsonObject getResultAsJsonObject(Result<? extends Record> result, String idField) {
        Map<String, Object> map = new HashMap<>();

        for (Record record : result) {
            Map<String, Object> jRecord = new HashMap<>();
            for (Field<?> field : result.fields()) {
                Object value = record.getValue(field);
                if (value instanceof Date) {
                    value = formatter.format(value);
                }
                jRecord.put(field.getName(), value);
            }
            map.put(jRecord.get(idField).toString(), jRecord);

        }
        return new JsonObject(map);
    }

    public static String formatJSON(Record record) {

        Map<String, Object> jRecord = new HashMap<>();
        for (Field<?> field : record.fields()) {
            Object value = record.getValue(field);
            if (value instanceof Date) {
                value = formatter.format(value);
            }
            jRecord.put(field.getName(), value);
        }

        return JSONValue.toJSONString(jRecord);
    }

    public static JsonObject formatJsonObject(Record record) {

        Map<String, Object> jRecord = new HashMap<>();
        for (Field<?> field : record.fields()) {
            Object value = record.getValue(field);
            if (value instanceof Date) {
                value = formatter.format(value);
            }
            jRecord.put(field.getName(), value);
        }

        return new JsonObject(jRecord);
    }
}
