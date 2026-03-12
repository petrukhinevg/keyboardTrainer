package com.sqltrainer.feature.sqltrainer.domain;

public record User(
    long id,
    String username,
    String displayName
) {
}
