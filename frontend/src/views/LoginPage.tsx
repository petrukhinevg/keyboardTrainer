import { Link } from "react-router-dom";

export function LoginPage() {
    return (
        <main className="login-page">
            <section className="login-card">
                <p className="shell__eyebrow">Session entry</p>
                <h1 className="login-card__title">Login placeholder</h1>
                <p className="login-card__text">
                    This route is reserved for the future login flow. The SPA router is already wired.
                </p>
                <Link className="login-card__link" to="/workspace">
                    Open workspace
                </Link>
            </section>
        </main>
    );
}
