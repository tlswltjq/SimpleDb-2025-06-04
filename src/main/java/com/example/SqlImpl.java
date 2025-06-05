package com.example;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class SqlImpl<Article> implements Sql<Article> {

    public Sql append(String sql) {
        return null;
    }

    public Sql append(String sql, String... stringValues) {
        return null;
    }

    public Sql append(String sql, int... intValues) {
        return null;
    }

    public Sql appendIn(String s, Long[] values) {
        return null;
    }

    public Sql appendIn(String s, int... values) {
        return null;
    }

    public Sql appendIn(String s, String... values) {
        return null;
    }

    public long insert() {
        return 0;
    }

    public int update() {
        return 0;
    }

    public int delete() {
        return 0;
    }

    public List<Map<String, Article>> selectRows() {
        return List.of();
    }

    public Map<String, Article> selectRow() {
        return Map.of();
    }

    public Article selectRow(Class<Article> clazz) {
        return null;
    }

    public List<Article> selectRows(Article object) {
        return List.of();
    }

    public LocalDateTime selectDatetime() {
        return null;
    }

    public Long selectLong() {
        return 0L;
    }

    public String selectString() {
        return "";
    }

    public Boolean selectBoolean() {
        return null;
    }

    public List<Long> selectLongs() {
        return List.of();
    }
}
