package com.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class SimpleDb {
    private final String address;
    private final String user;
    private final String password;
    private final String database;
    private final boolean devMode = false;


    public void setDevMode(boolean b) {
    }

    public void run(String query) {
    }

    public void run(String query, String title, String body, boolean isBlind) {
    }

    public Sql genSql() {// SQL 객체 반환
        return new SqlImpl();
    }

    public void close() {
    }

    public void startTransaction() {
    }

    public void commit() {
    }

    public void rollback() {
    }
}
