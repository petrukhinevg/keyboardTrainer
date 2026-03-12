package com.sqltrainer.feature.sqltrainer.domain;

import java.time.Instant;

public record Progress(
    Long userId,
    Long levelId,
    Long taskId,
    ProgressStatus status,
    Instant updatedAt
) {
}
