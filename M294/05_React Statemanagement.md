### Statemanagement 1: useState
Mit State beschreibt man Daten die innerhalb einer Komponente verwaltet werden und wenn diese Daten verändert werden, gibt es auch eine Änderung im UI.
##### Wie werden Komponenten dargestellt
Bei einer Komponente (Funktion?) wird mit return Javascript Code der aussieht wie HTML ins DOM geladen / gerendert.
##### Problem bei Komponenten mit Variablen
Beim Beispiel einer Komponente die eine Count Variable hat und es auf Buttonklick hochzählen soll wird im Hintergrund die Variable hochgezählt zeigt sie aber nicht an. 

Das ist weil die Komponente nur einmal "angezeigt" wird und nur einmal ins DOM gerendert wird. 

Wenn eine Variable in einem Komponent geändert wird, gibt es auf der Webseite trotzdem keine Änderung da es nicht gerendert wird. Es wird nur beim Aufrufen der Komponente gerendert. 

Bei dem Buttonklick wird ja der Komponent nicht aufgerufen sondern die Funktion dahinter.

Wenn die Komponente einfach ein zweites Mal aufgerufen wird, würde die Counter Variable auch wieder auf 0 gehen. 
##### Hooks
Hooks sind Funktionen in React die etwas möglich machen was in JavaScript nicht möglich ist, weil sie sich in Funktionen reinhaken. 
Hooks beginnen immer mit **use**.
##### useState
Um useState benutzen zu können muss es importiert werden. 
```jsx
import { useState } from "react"
```
Wenn jetzt ein State sich **ändert** checkt React das es das UI **neu** zeichnen muss.

```jsx
const [count, setCount] = useState(0)
```
Das initalisiert count mit 0.
Wenn ich jetzt count ändern möchte damit auch das UI neugezeichnet wird muss ich es so machen:
```jsx
const [count, setCount] = useState(0) // count ist 0

setCount(3) // count ist jetzt 3 UND wird von React im UI aktualisiert
```

##### Erklärung Beispiel mit useState


```jsx
import { useState } from "react"
function Counter() {
  const [count, setCount] = useState(0)
  const increment = () => setCount(count + 1)

  return (
    <div>
      Count: {count}
      <button onClick={increment}>Increment</button>
    </div>
  )
}
  
export default function App() {
  return <Counter />

}
```

**Importieren**:
```jsx
import { useState } from "react"
```
Als erstes wird useState importiert damit wir es überhaupt benutzen können.

**Funktion Counter:**
```jsx
function Counter() {
  const [count, setCount] = useState(0)
```
Hier wird mit useState(0) die Variable count auf 0 gesetzt und die Funktion wird bestummen mit der ich die count Variable ändern kann. Also mit setCount kann ich die Variable count ändern und React mekrt das es das UI ändern muss.

**Funktion increment:

```jsx
  const increment = () => setCount(count + 1)
```
Diese Funktino erhört count um 1. Das wird in einer Arrow Funktion gemacht wobei keine Parameter übergeben werden. 

**return**
```jsx
return (
    <div>
      Count: {count}
      <button onClick={increment}>Increment</button>
    </div>
  )
```
Jetzt kommt der return, das was auf der Webseite angezeigt wird. 
Er gibt einen Text/paragraph der "Count: " anzeigt. Danach kommt die Variable count.
Die geschweiften Klammern sind damit React checkt das es sich um eine Variable handelt und nicht um Text. 

Dann kommt der Knopf der onClick die Funktion increment ausführt und count erhöt sich um 1.

##### Gebrauch
useState muss immer am Anfang einer Funktion benutzt werden, sonst gibt es Fehler.

```jsx
function HookExample() {
  // Aufrufe von useState gehören hier hin
  const [count, setCount] = useState(0)
  const [isActive, setIsActive] = useState(true)
  
  // Das ist Verboten und wird einen Fehler werfen!
  if (someCondition) {
    const [count, setCount] = useState(0)
  }

  return (
      ...
  )
}
```

##### State und SetterFunktionen als Props
State und Setter Variablen können als Properties weitergegeben werden an andere 

#### Examples
A Counter using **useState**
```jsx
import { useState } from "react"
function Counter() {
  const [count, setCount] = useState(0)
  const increment = () => setCount(count + 1)

  return (
    <div>
      Count: {count}
      <button onClick={increment}>Increment</button>
    </div>
  )
}
  
export default function App() {
  return <Counter />

}
```
Changing a String using **useState**
```jsx
import "./styles.css";
import { useState } from "react";

export default function App() {
  // 1. Erstelle zwei Variablen für deinen Vor- und Nachnamen
  // Beide sollen am Anfang leer sein (leere Strings)
  const [vorname, setVorname] = useState("");
  const [nachname, setNachname] = useState("");

  // 2. Rufe die Setter-Funktionen mit den korrekt Werten auf

  const showName = () => {
    setVorname("Mario");
    setNachname("Duplantier");
  };
  
  return (
    <div className="App">
      {/* 3. Stelle hier den Vor- und Nachnamen dar */}
      <h1>Hello {vorname + nachname}</h1>
      <button onClick={showName}>Show Name</button>
    </div>
  );
}
```
Counter that can Increment, Decrement and Reset a Number:
```jsx
import { useState } from "react";

function Counter() {
  const [currentValue, setCount] = useState(10);
  const increment = () => setCount(currentValue + 1);
  const decrement = () => setCount(currentValue - 1);
  const reset = () => setCount(10);

  return (
    <div className="parent">
      <p>Count: {currentValue}</p>
      <button className="Button" onClick={increment}>
        Increment
      </button>
      <button className="Button" onClick={decrement}>
        Decrement
      </button>
      <button className="Button" onClick={reset}>
        Reset
      </button>
    </div>
  );
}
  
export default function App() {
  return <Counter />;
}
```

##### CSS for last Example:
```css
.parent {
  padding: 10px;
  display: flex;
  flex-direction: column;
  align-items: center;
}

p {
  margin: 10px;
}

button {
  margin: 10px;
  width: 100px;
  border-radius: 8px;
  border: 1px solid transparent;
  color: azure;
  font-family: sans-serif;
  background-color: #646cff;
  cursor: pointer;
}
```


### Statemanagement 2: Event Handling
#### on... Events

##### onClick

Häufig fürs Handling vom Drücken von Buttons, Links, etc. verwendet.
```jsx
function MyButton() {
  const handleClick = (e) => {
    // Diese Funktion wird ausgeführt, wenn der Button geklickt wird
    alert("Button clicked!") // Zeigt eine Benachrichtigung an
  }

  return (
      <button onClick={handleClick}>Click me!</button>
  )
}
```

##### onSubmit
##### onKeyDown
##### onKeyUp
##### onKeyPress
##### onMouseEnter
##### onMouseLeave

#### Funktionen
##### Funktionsdeklaration
```jsx
function EventHandlerExample() {
  // Funktionsdeklaration
  function handleClick(e) {
    
  }
  
  return (
      <button onClick={handleClick}>Click me!</button>
  )
}
```

##### Funktionsausdruck

```jsx
function EventHandlerExample() {
  // Funktionsausdruck
  const handleClick = (e) => {

  }

  return (
      <button onClick={handleClick}>Click me!</button>
  )
}
```
##### Arrow Function (oder auch Lambda / Anonyme Funktion)

```jsx
function EventHandlerExample() {
  return (
      <button onClick={(e) => console.log("clicked!")}>Click me!</button>
  )
}
```
#### Text Converter
