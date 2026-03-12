package com.sqltrainer.feature.sqltrainer.domain;

public record User(
    Long id,
    String username,
    String displayName
) {
}
