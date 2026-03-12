package com.sqltrainer.feature.sqltrainer.domain;

import org.junit.jupiter.api.Test;

import java.time.Instant;

class DomainModelTest {

    private static final long LEVEL_ID = 10L;
    private static final long TASK_ID = 100L;
    private static final long SUBMISSION_ID = 1000L;

    @Test
    void shouldRepresentMvpDomainRelationships() {
        User user = new User(1L, "neo", "Neo");
        Level level = new Level(LEVEL_ID, "select-basics", "Select basics", 1);
        TrainingTask task = new TrainingTask(
            TASK_ID,
            level.id(),
            "List all employees",
            "Intro lesson",
            "Return all employees ordered by last name",
            1
        );
        Submission submission = new Submission(
            SUBMISSION_ID,
            user.id(),
            task.id(),
            "select * from employees",
            SubmissionStatus.ACCEPTED,
            Instant.parse("2026-03-11T19:00:00Z")
        );
        Progress progress = new Progress(
            user.id(),
            level.id(),
            task.id(),
            ProgressStatus.COMPLETED,
            Instant.parse("2026-03-11T19:01:00Z")
        );

        if (!task.levelId().equals(level.id())) {
            throw new AssertionError("Task should belong to the selected level");
        }
        if (!submission.userId().equals(user.id())) {
            throw new AssertionError("Submission should belong to the selected user");
        }
        if (!progress.taskId().equals(task.id())) {
            throw new AssertionError("Progress should reference the selected task");
        }
    }
}
