import { createBrowserRouter, Navigate } from "react-router-dom";
import { AppShell } from "./shell/AppShell";
import { LoginPage } from "./views/LoginPage";
import { ProgressPage } from "./views/ProgressPage";
import { WorkspacePage } from "./views/WorkspacePage";

export const appRouter = createBrowserRouter([
    {
        path: "/",
        element: <Navigate replace to="/workspace" />
    },
    {
        path: "/login",
        element: <LoginPage />
    },
    {
        element: <AppShell />,
        children: [
            {
                path: "/workspace",
                element: <WorkspacePage />
            },
            {
                path: "/levels/:levelId/tasks/:taskId",
                element: <WorkspacePage />
            },
            {
                path: "/progress",
                element: <ProgressPage />
            }
        ]
    }
]);
