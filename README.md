# keyboardTrainer

Spring Boot backend for a SQL training application.

## Stack

- Java 21
- Spring Boot
- H2 database for local development
- GitHub Projects as the task tracker

## Local run

```bash
./gradlew bootRun
```

Application endpoints:

- `GET /api/health`
- `H2 console: /h2-console`

## Task tracking

The project uses GitHub Projects for a free visual task tracker tightly integrated with the repository:

- repository: `petrukhinevg/keyboardTrainer`
- board type: Kanban
- suggested columns: `Backlog`, `Ready`, `In Progress`, `Review`, `Done`

## Initial structure

```text
src/main/java/ru/petrukhinevg/keyboardtrainer
  app
  common
  feature/sqltrainer
```
