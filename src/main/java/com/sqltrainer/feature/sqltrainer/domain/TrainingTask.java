package com.sqltrainer.feature.sqltrainer.domain;

public record TrainingTask(
    Long id,
    Long levelId,
    String title,
    String lessonText,
    String prompt,
    int orderIndex
) {
}
