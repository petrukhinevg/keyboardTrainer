# keyboardTrainer

SQL trainer focused on progressive practice of query-writing skills.

## Product Flow

1. User logs in.
2. User opens the level selection screen.
3. Levels are unlocked in sequence as progress is completed.
4. User opens a task and submits an SQL query.
5. System checks the result and stores progress.
6. User continues to the next task or returns to the main level menu.

## Stack

### Backend

- Java 21
- Spring Boot
- Spring JDBC
- H2 for local development and early prototyping

Note: `Java 8` is not used in this project. The current backend is already based on `Spring Boot 4`, which requires a modern Java version.

### Frontend

- React
- TypeScript
- Vite
- Motion
- Tailwind CSS
- Zustand

### Optional additions

- Recharts for progress and statistics
- Web Audio API for short feedback sounds

### Infrastructure

- GitHub Projects for task tracking
- GitHub Issues for backlog items

## Local Environment

- JDK 21
- Gradle wrapper from the repository
- Node.js 22 for the future frontend app
- npm bundled with Node.js

Checks before push:

- `./gradlew test`
- `./gradlew checkstyleMain checkstyleTest`

## Why This Frontend Stack

- `React + TypeScript + Vite` keeps the frontend fast to develop and easy to scale.
- `Tailwind CSS` is enough for the first version and avoids premature design-system work.
- `Zustand` fits local UI state and training-session state without Redux overhead.
- `Motion` is enough for transitions between menu, level screen, and task results.
- `Recharts` should be added only when statistics screens actually appear.
- `Web Audio API` is enough for lightweight success and error feedback.

## Roadmap

Detailed roadmap lives in [docs/ROADMAP.md](/Users/petrukhinevg/IdeaProjects/keyboardTrainer/docs/ROADMAP.md).

## Commit Convention

Commits are numbered in order using this mask:

`NNN-short-description`

Rules:

- number grows sequentially
- description is short and no longer than 40 characters
- words are separated with hyphens

Current repository history already has 3 commits, so the next commit starts from `004-...`.

## Task Tracking

The project uses GitHub Projects:

- repository: `petrukhinevg/keyboardTrainer`
- board: `https://github.com/users/petrukhinevg/projects/1`
- suggested columns: `Backlog`, `Ready`, `In Progress`, `Review`, `Done`

## Local Run

Backend:

```bash
./gradlew bootRun
```

Available backend endpoints:

- `GET /api/health`
- `H2 console: /h2-console`

## Package Structure

```text
src/main/java/com/keyboardtrainer/sqltrainer
  app
  common
  feature/sqltrainer
```
