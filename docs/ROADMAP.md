# Roadmap

## Product Goal

Build a training application for practicing SQL skills through sequential levels and tasks.

## User Flow

1. User logs in.
2. User opens the level selection screen.
3. Levels are unlocked in sequence as progress is completed.
4. User opens a task and submits an SQL query.
5. System checks the result and stores progress.
6. User continues to the next task or returns to the main level menu.

## MVP Scope

The first working version should include:

- login screen
- level selection screen
- sequential level unlocks
- SQL task page
- SQL answer validation
- progress saving
- return to main menu after task completion

## Phase 1. Foundation

- set up backend API structure
- set up frontend app with React and Vite
- define domain model: user, level, task, submission, progress
- keep H2 as the initial database

## Phase 2. Authentication

- implement login flow
- keep the first version simple: local auth or mocked auth
- store current user session

## Phase 3. Level Map

- build the main screen with available levels
- lock levels until previous ones are completed
- show completion state for each level

## Phase 4. SQL Task Engine

- define task format
- prepare seed data for levels and tasks
- execute user SQL against training datasets in H2
- validate result sets, not only raw query text

## Phase 5. Progress Tracking

- save completed tasks
- unlock next tasks and levels
- keep attempt history and basic stats

## Phase 6. UX Polish

- add animated transitions
- add success and error feedback
- add basic sounds through Web Audio API

## Phase 7. Analytics

- add user progress dashboard
- add charts for completion rate and weak areas
- introduce `Recharts` only at this stage

## Phase 8. Database Migration

- replace H2 with a production-ready database
- adapt SQL validation and seed scripts
- keep repository and service boundaries stable during migration
