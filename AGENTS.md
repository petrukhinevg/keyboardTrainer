# Repository Agent Instructions

At the start of each new chat for this repository:

1. Read `LOCAL_AGENT_START.md` first.
2. Read `docs/ROADMAP.md`.
3. Read `docs/ARCHITECTURE.md`.
4. Read `docs/TRACKER_WORKFLOW.md` when the task affects issue flow, task scope, review flow, or decomposition.
5. Choose `docs/BACKEND_ROADMAP.md` or `docs/FRONTEND_ROADMAP.md` when the task belongs to one side of the product.
6. Check `.local.keys.env` only when the task needs local credentials or tokens.

Additional rules:

- Do not commit `LOCAL_AGENT_START.md` or `.local.keys.env`.
- Use `GITHUB_AGENT_LOGIN` and `GITHUB_AGENT_TOKEN` for git and GitHub actions. Use admin credentials only for owner-level repository actions. Do not rely on password auth unless explicitly required.
- Do not push to `origin` until the user explicitly asks for it.
- Before each `git push`, run `./gradlew checkstyleMain checkstyleTest`. If backend code changed, prefer `./gradlew check`.
- When pushing a task branch to `origin`, create a PR for that branch and link it to the corresponding task on the board.
- If local changes are already large, or work is switching to another task, commit the current logical unit first.
- Keep commits scoped: do not split one task into noisy micro-commits, but do not batch unrelated work together.
- Keep review fixes in the same task branch. Do not create a separate review-fix branch. When needed, add one follow-up commit with a `review fix` postfix.
- For epic work, merge child task branches into the epic branch first, and merge the epic branch into `main` only after all included child tasks are ready.
- For larger changes, prefer clear package boundaries and simple extensible structure. Do not introduce Lombok unless there is a concrete need.
- Use `docs/ARCHITECTURE.md` for backend/frontend boundaries, and move tasks to `Review` once the branch is in a reviewable state.
