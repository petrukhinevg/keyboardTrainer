package com.sqltrainer.feature.sqltrainer.domain;

public record TrainingTask(
    long id,
    long levelId,
    String title,
    String lessonText,
    String prompt,
    int orderIndex
) {
    public TrainingTask {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title must not be blank");
        }
        if (prompt == null || prompt.isBlank()) {
            throw new IllegalArgumentException("prompt must not be blank");
        }
        if (orderIndex <= 0) {
            throw new IllegalArgumentException("orderIndex must be positive");
        }
    }
}
