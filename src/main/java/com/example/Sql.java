package com.example;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

// SQL을 직접 실행하는 주체
public interface Sql<T> {
    Sql append(String sql);

    Sql append(String sql, String... stringValues);

    Sql append(String sql, int... intValues);

    Sql appendIn(String s, Long[] values);

    Sql appendIn(String s, int... values);

    Sql appendIn(String s, String... values);

    long insert();

    int update();

    int delete();

    List<Map<String, T>> selectRows();

    Map<String, T> selectRow();

    T selectRow(Class<T> clazz);

    List<T> selectRows(T object);

    LocalDateTime selectDatetime();

    Long selectLong();

    String selectString();

    Boolean selectBoolean();

    List<Long> selectLongs();
}
