### Installationsanleitung / Setup
#### Szenario
- Teammitglieder haben IDE unterschiedlich aufgesetzt
- für das Framework wird React benutzt
- für das Build-Tool wird Vite benutzt
- ausgehen das Lizenzen für JetBrains-Produkte existent sind
- Mitarbeiter haben Windowsgeräte
##### Wichtiges
- Node.js installieren
- React installieren
- Vite installieren
- VS Code installieren
- Git installieren
- Docker installieren

---
#### Anleitung
##### Projektstruktur
Um ein Projekt zu erstellen im Ziel-Ordner diesen Befehl ausführen:
```bash
npm create vite@latest my-react-app
```
1. Framework -> **React** auswählen
2. Variant -> **JavaScript** auswählen
Danach in den **my-react-app**-Ordner (**cd my-react-app**) navigieren und diesen Befehl ausführen:

```powershell
npm install
```
##### Linting
Im **package.json** muss unter **"scripts"** diese Zeile Code vorhanden sein: **"lint": "eslint ."**

```json
  "scripts": {
    "dev": "vite",
    "build": "vite build",
    "lint": "eslint .",
    "preview": "vite preview"
  }
```
Im Ordner **my-react-app** 
```powershell
npm run lint
```
##### Formatter
1. In VS Code die Extension **Prettier - Code formatter** von **Prettier** herunterladen.
2. Bei **Ctrl + P** nach "**Settings**" suchen. 
3. In den Settings nach "**format on save**" einschalten
##### Absoluter Pfad ???
Falls der Ordner **src** das Rootverzeichnis für Pfade sein soll, kann man diese Konfiguration erstellen.
```java
import { defineConfig } from "vite"
import react from "@vitejs/plugin-react"
import { fileURLToPath } from "url"

export default defineConfig({
    plugins: [react()],
    resolve: {
        alias: [{ find: "@", replacement: fileURLToPath(new URL("./src", import.meta.url)) }],
    },
})
```
##### Docker Installation
Docker installieren.
Mit diesem Befehl überprüfen ob Docker installiert ist:
```powershell
docker --version
```
