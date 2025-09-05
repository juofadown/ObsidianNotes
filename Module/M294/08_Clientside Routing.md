#### Neues Projekt erstellen
1. Projektordner erstellen
```bash
npm create vite@latest <project-name> -- --template react
```

2.  In erstellen Ordner wechseln und npm installieren.
```bash
cd <project-name>
npm install
```
3. Projekt in VS Code öffnen
```bash
. code
```
4. Ersetzte folgende Dateien mit diesem Inhalt
 **index.html**  

   ```HTML
    <!DOCTYPE html>
    <html lang="en">
    <head>
      <meta charset="UTF-8" />
      <link rel="icon" type="image/svg+xml" href="/vite.svg" />
      <meta name="viewport" content="width=device-width, initial-scale=1.0" />
      <link rel="preconnect" href="https://fonts.googleapis.com" />
      <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
      <link href="https://fonts.googleapis.com/css2?family=Inter:ital,opsz,wght@0,14..32,100..900;1,14..32,100..900&family=Open+Sans:ital,wght@0,300..800;1,300..800&family=Urbanist:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet"
      />
      <title>Clientside Routing</title>
    </head>
    <body>
    <div id="root"></div>
    <script type="module" src="/src/main.jsx"></script>
    </body>
    </html>
    ```
    
- **src/index.css**  
    
    ```css
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
    }
    
    img, picture, video, canvas, svg {
      display: block;
      max-width: 100%;
    }
    ```
**src/App.jsx**  
    
    ```jsx
    export default function App() {
        return (
            <main>Inhalt</main>
        )
    }
    ```
    
- **vite.config.js**  
    
    ```js
    import { defineConfig } from "vite"
    import react from "@vitejs/plugin-react"
    import { fileURLToPath } from "url"
    
    // https://vitejs.dev/config/
    export default defineConfig({
        plugins: [react()],
        resolve: { alias: [{ find: "@", replacement: fileURLToPath(new URL("./src", import.meta.url)) }],
       },
  })
   ```
   
 **jsconfig.json** (Im Root Verzeichnis neu erstellen)  
   
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
bei tryCatch immer async await nutzen

wenn ich fetch muss in der funktion in der ich fetche ein try catch sein

formular zum server laden -> .action nutzen

im action kunnt im loader redirect

bi komponente und hook s navigate