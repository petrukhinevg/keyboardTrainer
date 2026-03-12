package com.sqltrainer.feature.sqltrainer.domain;

import java.time.Instant;

public record Submission(
    Long id,
    Long userId,
    Long taskId,
    String sql,
    SubmissionStatus status,
    Instant submittedAt
) {
}
