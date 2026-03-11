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

## Why This Frontend Stack

- `React + TypeScript + Vite` keeps the frontend fast to develop and easy to scale.
- `Tailwind CSS` is enough for the first version and avoids premature design-system work.
- `Zustand` fits local UI state and training-session state without Redux overhead.
- `Motion` is enough for transitions between menu, level screen, and task results.
- `Recharts` should be added only when statistics screens actually appear.
- `Web Audio API` is enough for lightweight success and error feedback.

## MVP Scope

The first working version should include:

- login screen
- level selection screen
- sequential level unlocks
- SQL task page
- SQL answer validation
- progress saving
- return to main menu after task completion

## Roadmap

### Phase 1. Foundation

- set up backend API structure
- set up frontend app with React and Vite
- define domain model: user, level, task, submission, progress
- keep H2 as the initial database

### Phase 2. Authentication

- implement login flow
- keep the first version simple: local auth or mocked auth
- store current user session

### Phase 3. Level Map

- build the main screen with available levels
- lock levels until previous ones are completed
- show completion state for each level

### Phase 4. SQL Task Engine

- define task format
- prepare seed data for levels and tasks
- execute user SQL against training datasets in H2
- validate result sets, not only raw query text

### Phase 5. Progress Tracking

- save completed tasks
- unlock next tasks and levels
- keep attempt history and basic stats

### Phase 6. UX Polish

- add animated transitions
- add success and error feedback
- add basic sounds through Web Audio API

### Phase 7. Analytics

- add user progress dashboard
- add charts for completion rate and weak areas
- introduce `Recharts` only at this stage

### Phase 8. Database Migration

- replace H2 with a production-ready database
- adapt SQL validation and seed scripts
- keep repository and service boundaries stable during migration

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
