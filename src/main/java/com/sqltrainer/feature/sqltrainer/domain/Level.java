package com.sqltrainer.feature.sqltrainer.domain;

public record Level(
    long id,
    String code,
    String title,
    int orderIndex
) {
    public Level {
        if (code == null || code.isBlank()) {
            throw new IllegalArgumentException("code must not be blank");
        }
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title must not be blank");
        }
        if (orderIndex <= 0) {
            throw new IllegalArgumentException("orderIndex must be positive");
        }
    }
}
