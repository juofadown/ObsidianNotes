# Projekt erstellen

```bash
npm create vite@latest <projekt-name> -- --template react
```

 ```bash
 cd <projekt-name>
 ```
 
```bash
npm install
```

```bash
npm i react-router
```


## Ordner Struktur erstellen
# Inhalt Dateien
## src/main.jsx:
```jsx
import { createBrowserRouter, RouterProvider } from "react-router"
{/*Hier kommen imports von Routes hin*/}
```

```jsx
const router = createBrowserRouter([
    {
        path: "/",
        element: <App />,
        children: [
            {
                index: true,
                element: <div>routes element</div>
            },
        ],
    },
])
```
	

Diesen Befehl
```jsx
<RouterProvider router={router} />
```
Hier einfügen: 
```jsx
createRoot(document.getElementById("root")).render(
    <StrictMode>
        <RouterProvider router={router} />
    </StrictMode>
)
```

## src/App.jsx

Alles mit folgendem ersetzen: 
```jsx
import { Outlet } from "react-router"

export default function App() {
    return (
        <>
            <main>
                <Outlet />
            </main>
        </>
    )
}
```
## src/App.css
***Löschen.***
## vite.config.js
```js
import { defineConfig } from "vite"
import react from "@vitejs/plugin-react"
import { fileURLToPath } from "url"

// https://vitejs.dev/config/
export default defineConfig({
    plugins: [react()],
    resolve: {
        alias: [{ find: "@", replacement: fileURLToPath(new URL("./src", import.meta.url)) }],
    },
})
```

## jsconfig.json
Diese Datei neu im root erstellen.
```json
{
    "compilerOptions": {
        "baseUrl": ".",
        "paths": {
            "@/*": ["./src/*"]
        }
    }
}
```

## Fallstudien spezifisch

### index.html
```html
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <link rel="icon" type="image/svg+xml" href="/vite.svg"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>

    <link rel="preconnect" href="https://fonts.googleapis.com"/>
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin/>
    <link
            href="https://fonts.googleapis.com/css2?family=Inter:ital,opsz,wght@0,14..32,100..900;1,14..32,100..900&family=Orbitron:wght@400..900&display=swap"
            rel="stylesheet"
    />
    <title>Chronicles UI</title>
</head>
<body>
<div id="root"></div>
<script type="module" src="/src/main.jsx"></script>
</body>
</html>
```

### src/index.css
```css
:root {
    --base-100: #f5f7fa;
    --base-200: #e1ecf4;
    --base-300: #d1d9e6;
    --body: #2c3e50;
    --primary: #1e70bf;
    --primary-hover: #0a4c8a;
    --shadow-light: rgba(0, 0, 0, 0.1);
    --shadow-dark: rgba(0, 0, 0, 0.2);
}

*, *::before, *::after {
    box-sizing: border-box;
}

* {
    margin: 0;
}

body {
    line-height: 1.5;
    font-family: "Inter", serif;
    font-optical-sizing: auto;
    font-weight: 400;
    font-style: normal;
    -webkit-font-smoothing: antialiased;
    color: var(--body);
}

img, picture, video, canvas, svg {
    display: block;
    max-width: 100%;
}

input, button, textarea, select {
    font: inherit;
}

h1, h2, h3, h4, h5, h6 {
    font-family: "Orbitron", sans-serif;
}
```


# Docker Backend
Irgendwo sind die Backend Daten gespeichert.
Im Terminal in Speicherort gehen.

Überprüfen ob docker installiert ist: 
```bash
docker --version
```

```bash
docker compose version
```

ich glaube das ist wenn noch nicht alles installiert wurde.
```bash
docker compose up --build
```

## Backend starten

Falls du das Backend gerade erst im vorherigen Abschnitt gestartet hast, kannst du die Lektion beenden. 

Diese Anleitung zeigt dir, wie du nach einem System Neustart das Backend erneut starten kannst.

👉 Öffne ein Terminal Fenster und wechsle in das Verzeichnis, wo die Dateien für das Backend gespeichert sind. 

```
cd C:\DEV\294\Chronicles-Backend
```

👉 Docker Compose starten

```
docker compose up -d --build
```

Das `-d` bei `docker compose up` steht für "detached mode". Wenn du den Befehl mit `-d` ausführst, wird Docker Compose die Container im Hintergrund starten und du erhältst die Kontrolle über die Kommandozeile zurück. Ohne das `-d` würdest du die Logs der Container direkt in der Konsole sehen, und die Konsole wäre blockiert, bis du den Prozess manuell stoppst.

👉 Öffne die Url [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html) und vergewissere dich, dass du Daten (GET /chronicles) anzeigen kannst.

