# Architecture

## Goal

This document defines the minimum project structure for the MVP stage so that backend and frontend can grow without drifting into inconsistent package layout or unclear ownership.

## High-level structure

- Root Gradle project: Spring Boot backend, shared project docs, and repository-level automation.
- `frontend/`: standalone React + Vite client application.
- `docs/`: roadmap, workflow, and architecture decisions.

## Backend layers

Backend code lives under `src/main/java/com/sqltrainer`.

- `app`: cross-feature entrypoints and technical endpoints that are not part of a business feature.
  Examples: health checks, global configuration, exception handlers.
- `common`: shared primitives used by multiple features.
  Examples: shared errors, base DTO conventions, validation helpers, security utilities.
- `feature/<feature-name>`: all code for one business capability.
  Each feature should own its API models, use cases, domain objects, and persistence adapters.

## Feature package template

New backend business work should be placed under:

`com.sqltrainer.feature.<feature-name>`

Recommended internal structure:

- `domain`: core business entities, value objects, enums, domain services.
- `application`: use cases and orchestration logic.
- `api`: REST controllers, request DTOs, response DTOs.
- `infrastructure`: persistence, SQL access, external integrations, technical adapters.

Not every package is required on day one. Add a package only when the feature actually needs it, but keep the naming consistent.

## Package placement rules

- If code is business-specific, place it inside its feature package, not in `common`.
- If code is shared by multiple features and does not belong to one business area, place it in `common`.
- If code is only a framework or application bootstrap concern, place it in `app`.
- Avoid creating feature-independent service buckets such as `service`, `util`, `manager`, or `repository` directly under `com.sqltrainer`.
- Avoid mixing controller, persistence, and domain logic in one class.

## Feature naming

Use short, stable, business-oriented names for feature packages.

Good examples:

- `feature.auth`
- `feature.progress`
- `feature.exercise`
- `feature.submission`

Avoid vague or temporary names such as:

- `feature.core`
- `feature.main`
- `feature.impl`
- `feature.sqltrainer`

For the current MVP, the existing `feature.sqltrainer` package should be treated as a temporary seed package. New feature work should prefer explicit feature names instead of adding more unrelated logic there.

## Frontend/backend boundary

- Backend owns business rules, persistence, validation of incoming requests, SQL checking, authorization, and progress state.
- Frontend owns routing, view state, interaction flow, optimistic UI where appropriate, and presentation.
- Frontend should consume backend contracts explicitly; avoid duplicating backend business rules in the UI unless needed for immediate user feedback.
- If a feature requires changes on both sides, define the backend contract first, then wire the frontend to it.

## Testing guidance

- Backend domain and application logic should be covered with focused tests near the feature.
- API behavior should be tested at controller or integration level when endpoints appear.
- Frontend should keep UI concerns inside `frontend/` and not depend on backend implementation details.
