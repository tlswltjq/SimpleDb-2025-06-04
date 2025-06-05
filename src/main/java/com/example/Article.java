package com.example;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
public class Article {
    private final long id;
    private final String title;
    private final String body;
    private final LocalDateTime createdDate;
    private final LocalDateTime modifiedDate;
    private final boolean isBlind;
}
