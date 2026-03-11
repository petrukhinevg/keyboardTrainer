import { NavLink, Outlet } from "react-router-dom";

const navigationItems = [
    { label: "Workspace", to: "/workspace" },
    { label: "Progress", to: "/progress" }
];

export function AppShell() {
    return (
        <div className="shell">
            <header className="shell__header">
                <div>
                    <p className="shell__eyebrow">SQL trainer</p>
                    <h1 className="shell__title">keyboardTrainer</h1>
                </div>
                <nav className="shell__nav" aria-label="Primary">
                    {navigationItems.map((item) => (
                        <NavLink
                            key={item.to}
                            className={({ isActive }) =>
                                isActive ? "shell__nav-link shell__nav-link--active" : "shell__nav-link"
                            }
                            to={item.to}
                        >
                            {item.label}
                        </NavLink>
                    ))}
                </nav>
            </header>
            <main className="shell__content">
                <Outlet />
            </main>
        </div>
    );
}
