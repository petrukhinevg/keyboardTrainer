# Repository Agent Instructions

At the start of each new chat for this repository:

1. Read `LOCAL_AGENT_START.md` first.
2. Read `docs/ROADMAP.md`.
3. Check `.local.keys.env` only when the task needs local credentials or tokens.

Additional rules:

- Do not commit `LOCAL_AGENT_START.md` or `.local.keys.env`.
- Prefer `GITHUB_AGENT_TOKEN` for GitHub access.
- Use `GITHUB_AGENT_LOGIN` only when the task explicitly needs a login value.
- Do not rely on `GITHUB_AGENT_PASSWORD` unless the task explicitly requires it.
- Perform git and GitHub actions under the `AGENT` account using `GITHUB_AGENT_LOGIN` and `GITHUB_AGENT_TOKEN`.
- Do not push to `origin` until the user explicitly asks for it.
- Before each `git push`, run backend checkstyle via `./gradlew checkstyleMain checkstyleTest`.
- If a task changes backend code, prefer `./gradlew check` before push when time allows.
- If there are already many local changes, or work is about to switch to a different task, commit the current logical unit before continuing.
- Do not create several small commits for one task without a clear reason.
- When review fixes belong to the same topic, prefer one consolidated follow-up commit.
- For larger changes, avoid putting all logic in one file; prefer clear package boundaries and simple extensible structure.
- Do not introduce Lombok unless there is a concrete need that outweighs the extra dependency and hidden code generation.
- Follow `docs/ARCHITECTURE.md` for backend package placement and frontend/backend boundaries.
