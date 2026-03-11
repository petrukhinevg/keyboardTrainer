# keyboardTrainer

Тренажёр для последовательной практики навыков написания SQL-запросов.

## Пользовательский сценарий

1. Пользователь входит в систему.
2. Попадает на экран выбора уровней.
3. Уровни открываются последовательно по мере прохождения.
4. Пользователь открывает задание и отправляет SQL-запрос.
5. Система проверяет результат и сохраняет прогресс.
6. После этого пользователь либо идёт дальше, либо возвращается в главное меню выбора уровней.

## Стек

### Бэкенд

- Java 21
- Spring Boot
- Spring JDBC
- H2 для локальной разработки и раннего прототипирования

### Фронтенд

- React
- TypeScript
- Vite
- Motion
- Tailwind CSS
- Zustand

### Дополнительные инструменты

- Recharts для прогресса и статистики
- Web Audio API для коротких звуковых сигналов

### Инфраструктура

- GitHub Projects для ведения задач
- GitHub Issues для backlog-задач

## Локальное окружение

- JDK 21
- Gradle wrapper из репозитория
- Node.js 22 для будущего фронтенда
- npm, который идёт вместе с Node.js

Проверки перед push:

- `./gradlew test`
- `./gradlew checkstyleMain checkstyleTest`

## Фронтенд-стек

- `React + TypeScript + Vite` дают быструю разработку и простой рост проекта.
- `Tailwind CSS` достаточен для первой версии и позволяет не строить дизайн-систему слишком рано.
- `Zustand` подходит для локального UI state и состояния сессии тренировки без лишней нагрузки от Redux.
- `Motion` достаточно для анимаций переходов между меню, уровнями и результатами заданий.
- `Recharts` стоит подключать только тогда, когда реально появится экран статистики.
- `Web Audio API` достаточно для лёгкого звукового feedback.

## Роадмап

Подробный роадмап находится в [docs/ROADMAP.md](/Users/petrukhinevg/IdeaProjects/keyboardTrainer/docs/ROADMAP.md).

## Правило именования коммитов

Коммиты нумеруются по маске:

`NNN-short-description`

Правила:

- номер растёт последовательно
- описание короткое, не длиннее 40 символов
- слова разделяются дефисами

## Таск-трекинг

Для проекта используется GitHub Projects:

- repository: `petrukhinevg/keyboardTrainer`
- board: `https://github.com/users/petrukhinevg/projects/1`
- рекомендуемые колонки: `Backlog`, `Ready`, `In Progress`, `Review`, `Done`

## Рабочие ссылки

- GitHub-репозиторий: `https://github.com/petrukhinevg/keyboardTrainer`
- Доска задач: `https://github.com/users/petrukhinevg/projects/1`
- Issues репозитория: `https://github.com/petrukhinevg/keyboardTrainer/issues`
- Pull Requests: `https://github.com/petrukhinevg/keyboardTrainer/pulls`

Базовый workflow:

1. Задача создаётся в `Issues`.
2. Задача автоматически или вручную попадает в `GitHub Projects`.
3. Под задачу создаётся отдельная ветка.
4. Открывается `Pull Request`.
5. В описании PR указывается связанная задача, например: `Closes #15`.

## Локальный запуск

```bash
./gradlew bootRun
```

Доступные endpoints:

- `GET /api/health`
- `H2 console: /h2-console`

## Структура пакетов

```text
src/main/java/com/keyboardtrainer/sqltrainer
  app
  common
  feature/sqltrainer
```
