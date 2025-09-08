# main.jsx
Bei Create von einem Eintrag in der Liste muss mit Action referenzeiert werden im main.
```jsx
const router = createBrowserRouter([
  {
      {
        path: "/chronicles/create",
        element: <ChronicleCreateRoute />,
        action: ChronicleCreateRoute.action,
        errorElement: <div>Oops! Ein Fehler ist aufgetreten</div>,
      },
    ],
  },
]);
```

# App.jsx
```jsx
import { Outlet } from "react-router";
import styles from "./App.module.css";
import Header from "./components/Header";

export default function App() {
  return (
    <>
      <main className={styles.main}>
        <Header />
        <Outlet />
      </main>
    </>
  );
}
```

# Header.jsx
```jsx
import LinkButton from "@/components/LinkButton.jsx";
import styles from "./Header.module.css";

export default function Header() {
  return (
    <header>
      <nav className={styles.nav}>
        <LinkButton to="/chronicles/create" secondary>
          Neue Chronik erstellen
        </LinkButton>
      </nav>
    </header>
  );
}
```
# ChronicleForm.jsx
```jsx
import { Form } from "react-router";
import Input from "./Input";
import Textarea from "./TextArea";
import Button from "./Button";
import ButtonGroup from "./ButtonGroup";

export default function ChronicleForm({ onCancel }) {
  return (

    <Form method="post">
      <Input
        label="Titel: *"
        type="text"
        name="title"
        placeholder="Bitte einen Titel eingeben"
      />

      <Textarea
        label="Text: *"
        name="text"
        placeholder="Bitte einen Text eingeben"
      />
      
      <ButtonGroup>
        <Button type="submit">Speichern</Button>
        <Button type="button" secondary onClick={onCancel}>
          Abbrechen
        </Button>
      </ButtonGroup>
    </Form>
  );
}
```

# Chronicles.js
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
  

export async function updateChronicle(chronicle) {

  if (!chronicle.id) {
    throw new Error("Chronik benötigt eine ID zum Aktualisieren!");
  }

  const response = await fetch(`${URL}/chronicles/${chronicle.id}`, {
    method: "PUT", // evtl. PATCH, falls dein Backend das nutzt
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