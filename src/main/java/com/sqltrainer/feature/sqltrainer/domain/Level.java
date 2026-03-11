package com.sqltrainer.feature.sqltrainer.domain;

public record Level(
    Long id,
    String code,
    String title,
    int orderIndex
) {
}
