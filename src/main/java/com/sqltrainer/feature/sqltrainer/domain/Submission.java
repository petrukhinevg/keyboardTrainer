package com.sqltrainer.feature.sqltrainer.domain;

import java.time.Instant;

public record Submission(
    long id,
    long userId,
    long taskId,
    String query,
    SubmissionStatus status,
    Instant submittedAt
) {
}
