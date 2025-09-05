### JSX
### Eigene Komponenten

##### Komponenten
Man kann Kompnenten als Funktion deklarieren:
```jsx
function Message() {
	return <h1>Hello World<h1/>
}
```
oder als Funktionsausdruck: (Arrow Function)
```jsx
const Message = () => {
	return <h1>Hello World<h1/>
}
```
---
Komponenten werden in React gross geschrieben. 
#### Props
Props ist die Abkürzung für *Properties*.
Es sind einfach Parameter die man einer Funktion mitgeben kann.
```jsx
function FunktionName(parameter) {
    const parameterInhalt = parameter.parameterInhalt
    return <p>{parameterInhalt}</p>
}
```
#### Destructing
Destructing ist das verkürzen von Code.
Man hat zum Beispiel diesen Code:
```jsx
function FunktionName(parameter) {
    const parameterInhalt = parameter.parameterInhalt
    return <p>{parameterInhalt}</p>
}
```
Den kann man aber auch so schreiben:
```jsx
function WelcomeGreeting(parameter) {
    const {parameterInhalt} = parameter
    return <p>{parameterInhalt}</p>
}
```
Das kann man weiter deconstructen und dann sieht es so aus:
```jsx
function WelcomeGreeting({parameterInhalt}) {
    return <p>{parameterInhalt}</p>
}
```
##### Default Wert
Hierbei kann man auch noch gleich den Defaultwert definieren:
Das geht ganz einfach wenn man hinter dem parameterInhalt noch ein **= "DefaultWert"** hinzufügt.
```jsx
function WelcomeGreeting({parameterInhalt = "DefaultWert"}) {
    return <p>{parameterInhalt}</p>
}
```

#### Children Props
Der Unterschied zwischen Props und Children Props ist der Ort wo die Informationen mitgegeben werden. 
Bei normalen **Props** sieht die Funktion so aus:

```jsx
function FunktionName(parameter) {
    const parameterInhalt = parameter.parameterInhalt
    return <p>{parameterInhalt}</p>
}
```
Die Funktion funktioniert nur wenn der parameterInhalt im **Tag** mitgegeben wird.
```jsx
<FunktionName parameter="sixseven"><FunktionName/>
```

Bei **Child Props** sieht es so aus:

```jsx
function WelcomeGreeting({children}) {
    return <p>{children}</p>
}```
Hier funktioniert die Funktion nur wenn der Parameter **zwischen** den **Tags** mitgegeben wird.
```jsx
<WelcomeGreeting>Parameter Inhalt<WelcomeGreeting/>
}
```


### Iteration
##### Array Iteration mit MAP
Es wird ein oder mehrere Werte einer Funktion mitgegeben.
Es wird dann für jeden Wert etwas mit dem Wert gemacht z.B. x2.
Bei Eingabe: 1, 3, 5 und der Funktion x2 ist die Ausgabe: 2, 6, 10.

```jsx
[2, 4, 8].map(x => x * 2)
```

```jsx
function App() {
    const fruits = ["Apple", "Kiwi", "Banana"]
    return (
        <main>
            {fruits.map((fruit) => <span>{fruit}</span>)}
        </main>
    )
}
```

```jsx
['Apple', 'Kiwi'].map(fruit => {
    const uppercasedFruit = fruit.toUpperCase()
    return <span>{uppercasedFruit}</span>
})
```
##### Keys
Bei einer Aufzählung / Liste braucht es immer den Key. Damit React besser die Elemente in der Liste verwalten kann. 

**Jedes Element in einer Auflistung sollte einen uniquen Key haben!!!**

**Der Key ist NICHT der Index im Array!!!**

##### Beispiel mit *map* und *key*

**Array:**
```jsx
const fruits = [
  {
    id: 1,
    text: "Apple",
    symbol: "🍏",
  },
  {
    id: 2,
    text: "Kiwi",
    symbol: "🥝",
  },
  {
    id: 3,
    text: "Banana",
    symbol: "🍌",
  },
];
```


### Conditional Rendering


