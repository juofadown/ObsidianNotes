# Button
```jsx
import styles from "./Button.module.css"

  

export default function Button({ children, secondary, danger, onClick, ...props }) {

    const classes =

        styles.button +

        (secondary ? ` ${styles.secondary}` : "") +

        (danger ? ` ${styles.danger}` : "")

  

    return (

        <button className={classes} onClick={onClick} {...props}>

            {children}

        </button>

    )

}
```
## Button Css:
```jsx
:root {

    --button-bg-color: var(--primary);

    --button-hover-bg-color: var(--primary-hover);

    --button-fg-color: #fff;

}

  

.button {

    background-color: var(--button-bg-color);

    color: var(--button-fg-color);

    padding: 10px 20px;

    border: none;

    border-radius: 6px;

    cursor: pointer;

    transition:

        background-color 0.3s ease,

        transform 0.3s ease;

}

  

.button:hover {

    background-color: var(--button-hover-bg-color);

    transform: scale(1.05);

}

  

.button:active {

    transform: scale(1);

}

  

.secondary {

    --button-bg-color: var(--base-100);

    --button-hover-bg-color: var(--base-200);

    --button-fg-color: var(--body);

}
  
.danger {
    --button-bg-color: #be281d;
    --button-hover-bg-color: #a52219;
    --button-fg-color: #fff;
}
```

# LinkButton
```jsx
import { Link } from "react-router"

  

import styles from "./LinkButton.module.css"

  

export default function LinkButton({ to, secondary, children }) {

    const classes = styles.button + (secondary ? ` ${styles.secondary}` : "")

  

    return (

        <Link to={to} className={classes}>

            {children}

        </Link>

    )

}
```

## LinkButton Css
```css
:root {

    --link-button-bg-color: var(--primary);

    --link-button-hover-bg-color: var(--primary-hover);

    --link-button-fg-color: #fff;

}

  

.button {

    display: inline-block;

    background-color: var(--link-button-bg-color);

    color: var(--link-button-fg-color);

    padding: 10px 20px;

    border: none;

    border-radius: 6px;

    cursor: pointer;

    text-decoration: none;

    transition:

        background-color 0.3s ease,

        transform 0.3s ease;

}

  

.button:hover {

    background-color: var(--link-button-hover-bg-color);

    transform: scale(1.05);

}

  

.button:active {

    transform: scale(1);

}

  

.secondary {

    --link-button-bg-color: var(--base-100);

    --link-button-hover-bg-color: var(--base-200);

    --link-button-fg-color: var(--body);

}
```
# TextArea
```jsx
import styles from "./Textarea.module.css";

  

export default function Textarea({ label, error, rows = 10, ...props }) {

  return (

    <div className={styles.wrapper}>

      <label className={styles.label}>

        {label}

        <textarea className={styles.textarea} rows={rows} {...props} />

        {error && <div className={styles.error}>{error}</div>}

      </label>

    </div>

  );

}
```

## TextArea Css
```css
.wrapper {

    margin-bottom: 15px;

}

  

.label {

    display: block;

    font-size: 14px;

    margin-bottom: 5px;

}

  

.textarea {

    width: 100%;

    padding: 10px;

    border: 1px solid var(--base-300);

    border-radius: 5px;

    transition: border-color 0.3s ease;

    resize: vertical;

}

  

.textarea:focus {

    border-color: var(--primary);

    outline: none;

}

  

.error {

    color: firebrick;

}
```
# Input.jsx
```jsx
import styles from "./Input.module.css"

  

export default function Input({ label, error, ...props }) {

    return (

        <div className={styles.wrapper}>

            <label className={styles.label}>

                {label}

                <input className={styles.input} {...props} />

                {error && <div className={styles.error}>{error}</div>}

            </label>

        </div>

    )

}
```

## Input Css
```css
.wrapper {

    margin-bottom: 15px;

}

  

.label {

    display: block;

    font-size: 14px;

    margin-bottom: 5px;

}

  

.input {

    width: 100%;

    padding: 10px;

    border: 1px solid var(--base-300);

    border-radius: 5px;

    transition: border-color 0.3s ease;

}

  

.input-field:focus {

    border-color: var(--primary);

    outline: none;

}

  

.error {

    color: firebrick;

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

```css
.nav {

  display: flex;

  justify-content: flex-end;

}
```
# ButtonGroup
```jsx
import styles from "./ButtonGroup.module.css"

  

export default function ButtonGroup({ children }) {

    return <div className={styles.buttons}>{children}</div>

}
```

```css
.buttons {

    display: flex;

    align-items: center;

    gap: 16px;

}
```

# Chronicle.jsx
```jsx
import { Link } from "react-router";

  

import styles from "./Chronicle.module.css";

  

export default function Chronicle({ title, text, url }) {

  return (

    <article className={styles.card}>

      <h3 className={styles.title}>{title}</h3>

      <p className={styles.text}>{text}</p>

      <Link to={url} className={styles.link}>

        Details anzeigen

      </Link>

    </article>

  );

}
```

```css
.card {

  background-color: var(--base-100);

  border: 1px solid var(--base-300);

  border-radius: 8px;

  padding: 20px;

  margin: 20px 0;

  box-shadow: 0 4px 8px var(--shadow-light);

  transition: transform 0.3s ease, box-shadow 0.3s ease;

}

  

.card:hover {

  transform: scale(1.01);

  box-shadow: 0 8px 16px var(--shadow-dark);

}

  

.title {

  margin-bottom: 10px;

  text-shadow: 0 1px 1px rgba(176, 191, 214, 0.7);

}

  

.text {

  line-height: 1.6;

  margin-bottom: 16px;

  line-height: 1.6;

  display: -webkit-box;

  -webkit-box-orient: vertical;

  overflow: hidden;

  text-overflow: ellipsis;

  max-height: calc(1.6em * 3);

  white-space: normal;

}

  

.link {

  color: var(--primary);

  text-decoration: underline;

  cursor: pointer;

  transition: color 0.3s ease;

  background: none;

  padding: 0;

  border: none;

  display: inline;

}

  

.link:hover {

  color: var(--primary-hover);

}
```