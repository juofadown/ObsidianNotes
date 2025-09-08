# main.jsx
```jsx
import { StrictMode } from "react";
import { createRoot } from "react-dom/client";
import { createBrowserRouter, RouterProvider } from "react-router";
import "./index.css";
import App from "./App.jsx";
import ChronicleListRoute from "./routes/ChronicleListRoute.jsx";
import ChronicleDetailRoute from "./routes/ChronicleDetailRoute.jsx";
import ChronicleCreateRoute from "./routes/ChronicleCreateRoute.jsx";
import ChronicleEditRoute from "./routes/ChronicleEditRoute.jsx";
import ErrorRoute from "./routes/ErrorRoute.jsx";

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
      {
        path: "/chronicles/create",
        element: <ChronicleCreateRoute />,
        action: ChronicleCreateRoute.action,
        errorElement: <div>Oops! Ein Fehler ist aufgetreten</div>,
      },
      {
        path: "/chronicles/:id/edit",
        element: <ChronicleEditRoute />,
        loader: ChronicleEditRoute.loader,
        action: ChronicleEditRoute.action,
        errorElement: <ErrorRoute />,
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
# ChronicleEditRoute.jsx
```jsx
import { useParams, useLoaderData, useNavigate, redirect } from "react-router";
import ChronicleForm from "../components/ChronicleForm";
import { fetchChronicleById, updateChronicle } from "../lib/chronicles";

export async function clientLoader({ params }) {
  try {
    return await fetchChronicleById(params.id);
  } catch (error) {
    console.error("Error:", error);
    throw error;
  }
}

export async function clientAction({ request, params }) {
  try {
    const formData = await request.formData();
    const chronicle = Object.fromEntries(formData);
    chronicle.id = params.id;
    await updateChronicle(chronicle);
    return redirect(`/chronicles/${params.id}`);
  } catch (error) {
    console.error("Error: ", error);
    throw error;
  }
}

  

export default function ChronicleEditRoute() {
  const navigate = useNavigate();
  const params = useParams();
  const data = useLoaderData();
  const goBack = () => {
    navigate(`/chronicles/${params.id}`);
  };
  
  return (
    <main>
      <h2>Chronik Bearbeiten {params.id}</h2>
      <ChronicleForm chronicle={data} onCancel={goBack} />
    </main>
  );
}

ChronicleEditRoute.loader = clientLoader;
ChronicleEditRoute.action = clientAction;
```
# ErrorRoute.jsx
```jsx
import { useRouteError } from "react-router";

export default function ErrorRoute() {
  const error = useRouteError();
  console.error(error);
  
  return (
    <div>
      <h1>Hoppla, da ist etwas schiefgelaufen!</h1>
      <p>Wir bitten um Entschuldigung.</p>
    </div>
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
  
export default function ChronicleForm({ chronicle = {}, onCancel }) {
  return (
    <Form method="post">
      <Input
        label="Titel:"
        type="text"
        name="title"
        placeholder="Bitte einen Titel eingeben"
        defaultValue={chronicle.title}
      />

      <Textarea
        label="Text:"
        name="text"
        placeholder="Bitte einen Text eingeben"
        defaultValue={chronicle.text}
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
