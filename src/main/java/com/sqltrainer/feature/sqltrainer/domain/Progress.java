package com.sqltrainer.feature.sqltrainer.domain;

import java.time.Instant;

public record Progress(
    long userId,
    long levelId,
    long taskId,
    Instant createdAt,
    ProgressStatus status,
    Instant updatedAt
) {
}
