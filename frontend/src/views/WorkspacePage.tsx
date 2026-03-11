import { NavLink } from "react-router-dom";

const levels = [
    {
        id: "level-1",
        title: "Level 1",
        tasks: [
            { id: "task-1", title: "Select basics", status: "available" },
            { id: "task-2", title: "Filtering", status: "locked" }
        ]
    },
    {
        id: "level-2",
        title: "Level 2",
        tasks: [{ id: "task-3", title: "Join intro", status: "locked" }]
    }
];

const resultPanels = [
    {
        title: "Execution result",
        description: "Result table area placeholder."
    },
    {
        title: "Validation feedback",
        description: "Status, hints and comparison output placeholder."
    }
];

export function WorkspacePage() {
    return (
        <div className="workspace">
            <aside className="panel panel--sidebar">
                <p className="panel__label">Levels</p>
                <div className="level-list">
                    {levels.map((level) => (
                        <section className="level-card" key={level.id}>
                            <h2 className="level-card__title">{level.title}</h2>
                            <div className="task-list">
                                {level.tasks.map((task) => (
                                    <NavLink
                                        key={task.id}
                                        className={({ isActive }) =>
                                            isActive ? "task-link task-link--active" : "task-link"
                                        }
                                        to={`/levels/${level.id}/tasks/${task.id}`}
                                    >
                                        <span>{task.title}</span>
                                        <span className={`task-link__status task-link__status--${task.status}`}>
                                            {task.status}
                                        </span>
                                    </NavLink>
                                ))}
                            </div>
                        </section>
                    ))}
                </div>
            </aside>
            <section className="panel panel--lesson">
                <p className="panel__label">Lesson</p>
                <h2 className="panel__title">Querying the training dataset</h2>
                <p className="panel__text">
                    Use the left sidebar to pick a task. This central area is reserved for lesson context,
                    task statement, schema notes and constraints.
                </p>
                <div className="lesson-block">
                    <h3 className="lesson-block__title">Task prompt</h3>
                    <p className="panel__text">
                        Return all employees from the sample dataset ordered by `last_name`.
                    </p>
                </div>
                <div className="lesson-block">
                    <h3 className="lesson-block__title">Notes</h3>
                    <ul className="lesson-list">
                        <li>Target screen is a single-page workspace.</li>
                        <li>Backend integration is intentionally deferred to later tasks.</li>
                        <li>This layout is the baseline shell for future lesson and task content.</li>
                    </ul>
                </div>
            </section>
            <section className="workspace__editor">
                <div className="panel panel--editor">
                    <div className="editor-toolbar">
                        <p className="panel__label">SQL editor</p>
                        <button className="editor-toolbar__button" type="button">
                            Run query
                        </button>
                    </div>
                    <textarea
                        aria-label="SQL query editor"
                        className="editor-textarea"
                        defaultValue={"select *\nfrom employees\norder by last_name;"}
                    />
                </div>
                <div className="result-grid">
                    {resultPanels.map((panel) => (
                        <section className="panel panel--result" key={panel.title}>
                            <p className="panel__label">{panel.title}</p>
                            <p className="panel__text">{panel.description}</p>
                        </section>
                    ))}
                </div>
            </section>
        </div>
    );
}
