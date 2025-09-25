# Iteration

Liste:

```jsx
export default function MapFunction() {
  const lists = [
    {
      id: "1",
      title: "Geheimnisvolle Nebel von Zeta Orionis",
      text: "Im Zeta Orionis Nebel wurden glühende Gase entdeckt, die einen neuen Stern formen könnten.",
      url: "/chronicles/1",
    },
    {
      id: "2",
      title: "Fortschrittliches Leben auf Galaxia Prime",
      text: "Galaxia Prime nutzt umweltfreundliche Technologie, mit Städten, die über der Oberfläche schweben",
      url: "/chronicles/2",
    },
    {
      id: "3",
      title: "Entdeckungen rund um Quasar 9",
      text: "Quasar 9 ist umgeben von Licht und Geheimnissen einer alten Zivilisation",
      url: "/chronicles/3",

    },
  ];
  return (
      <div>
      <h2>Liste der Chroniken</h2>
        {chronicles.map((chronicle) => (
          <Chronicle
            key={chronicle.id}
            title={chronicle.title}
            text={chronicle.text}
            url={chronicle.url}
          ></Chronicle>
        ))}
      </div>
  );
}
```


# CRUD
## Create
```jsx
export async function createChronicle(chronicle) {
  const response = await fetch(URL + "/chronicles", {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(chronicle),
  });
  
  if (!response.ok) {
    throw new Error("Konnte keine Chronik erstellen " + response.status);
  }

  return await response.json();
}
```
## Read
### Fetch All
```jsx
const URL = "http://localhost:8080";

export async function fetchChronicles() {
  const response = await fetch(URL + "/chronicles", { method: "GET" });

  if (!response.ok) {
    throw new Error(
      "Fehler: Es konnten nicht alle Chroniken geladen werden!" +
        response.status
    );
  }
  
  const data = response.json();
  return data;
}
```
#### Example Fetch All
```jsx
import Chronicle from "@/components/Chronicle"
import { fetchChronicles } from "@/lib/chronicles.js"

async function clientLoader() {
    return await fetchFunktion();
}

export default function ChronicleListRoute() {
    const arrayMitGefetchtedDaten = useLoaderData();
    map funktion 
}

ChronicleListRoute.loader = clientLoader
```
### Fetch by ID
```jsx
export async function fetchChronicleById(id) {
  const response = await fetch(URL + "/chronicles/" + id);

  if (!response.ok) {
    throw new Error(
      "Fehler: Die Chronik konnte nicht geladen werde!" + response.status
    );
  }

  const data = response.json();
  return data;

}
```
#### Example Fetch by ID
```jsx
/* import { useParams } from "react-router"; */
import { useLoaderData } from "react-router";
import { fetchChronicleById } from "@/lib/chronicles.js";

async function clientLoader({ params }) {
  return await fetchChronicleById(params.id);
}

export default function ChronicleDetailRoute() {
  /* const param = useParams(); */
  const chronicle = useLoaderData();
  return (
    <main>
      <h2>
        {chronicle.title} {/*{param.id}*/}
      </h2>
      <div>
        <p>{chronicle.text}</p>
      </div>
    </main>
  );
}

ChronicleDetailRoute.loader = clientLoader;
```
## Update
```jsx
export async function updateChronicle(chronicle) {

  if (!chronicle.id) {
    throw new Error("Chronik benötigt eine ID zum Aktualisieren!");
  }
  
  const response = await fetch(`${URL}/chronicles/${chronicle.id}`, {
    method: "PUT",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(chronicle),
  });
  
  if (!response.ok) {
    throw new Error(
      "Konnte die Chronik nicht aktualisieren. Status: " + response.status
    );
  }
  
  return await response.json();
}
```
## Delete
```jsx
export async function deleteChronicle(id) {
  const response = await fetch(`${URL}/chronicles/${id}`, {
    method: "DELETE",
  });
  
  if (!response.ok) {
    throw new Error(
      "Konnte die Chronik nicht löschen. Status: " + response.status
    );
  }

  return true;
}
```



# main.jsx
Denk dran das überall wo mit FetchFunktionen gearbeitet wird auch mit loader im main.jsx kommt.
```jsx
const router = createBrowserRouter([

  {
    path: "/",
    element: <App />,
    children: [
      {
        index: true,
        element: <ChronicleListRoute />,
        loader: ChronicleListRoute.loader,
      },
      {
        path: "/chronicles",
        element: <ChronicleListRoute />,
        loader: ChronicleListRoute.loader,
      },
      {
        path: "/chronicles/:id",
        element: <ChronicleDetailRoute />,
        loader: ChronicleDetailRoute.loader,
      },
    ],
  },
]);

createRoot(document.getElementById("root")).render(
  <StrictMode>
    <RouterProvider router={router} />
  </StrictMode>
);
```
# App.jsx
```jsx
import { Outlet } from "react-router";
import styles from "./App.module.css";

export default function App() {
  return (
    <>
      <header></header>
      <main className={styles.main}>
        <Outlet />
      </main>
    </>
  );
}
```