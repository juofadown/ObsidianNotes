1. **`required`:** Markiert ein Feld als Pflichtfeld, das nicht leer sein darf.
    
    - **Beispiel:** `<input type="text" name="username" required>`
2. **`pattern`:** Setzt einen regulären Ausdruck fest, dem die Eingabe entsprechen muss – ideal für spezifische Formatüberprüfungen.
    
    - **Beispiel:** `<input type="text" name="plz" pattern="\d{4}">`
3. **`min` und `max`:** Definiert Minimal- und Maximalwerte für numerische Eingaben.
    
    - **Beispiel:** `<input type="number" name="age" min="18" max="99">`
4. **`maxlength`:** Begrenzung der maximalen Anzahl von Zeichen für Texteingaben.
    
    - **Beispiel:** `<input type="text" name="name" maxlength="50">`
5. **`type`:** Verwendet spezialisierte Eingabetypen wie `email`, `url`, `number`, die eigene Validierungsregeln haben.
    
    - **Beispiel:** `<input type="email" name="userEmail">`

Browservalidierung ausschalten: 
```jsx
<form novalidate></form>
```

```jsx
export function validateChronicle(chronicle) {
    const errors = {
        title: "",
        text: "",
    }

    let isValid = true

    if (chronicle.title.trim().length === 0) {
        errors.title = "Titel darf nicht leer sein"
        isValid = false
    }

    if (chronicle.text.trim().length === 0) {
        errors.text = "Text darf nicht leer sein"
        isValid = false
    }

    return { errors, isValid }
}
```
Die Funktion mit dem Namen `validateChronicle` erhält als Parameter ein Objekt, das eine Chronik repräsentiert:

```
{
    title: "Fortschrittliches Leben....",
    text: "Galaxia Prime beeindruckt nicht nur..."
}
```

Am Schluss der Funktion wird wiederum ein Objekt als Resultat zurückgegeben:

```
{
    isValid: false,
    errors: {
        title: "Titel darf nicht leer sein", 
        text: "Text darf nicht leer sein"
    }
}
```

Im Resultat wird mit der Eigenschaft `isValid` festgehalten, ob die Daten valide sind oder nicht. Die Fehlermeldungen werden in der `errors` Eigenschaft wiederum als Objekt gespeichert. Wenn die Daten valide sind, wird folgendes Resultat zurückgegeben:

```
{
    isValid: true,
    errors: {
        title: "", 
        text: ""
    }
}
```
