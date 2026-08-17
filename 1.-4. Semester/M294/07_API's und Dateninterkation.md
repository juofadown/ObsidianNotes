#### Theorie
#####  **GET (= Daten lesen)**  
Mit GET-Requests werden Daten vom Server angefragt und gelesen.  
GET-Requests haben normalerweise keinen Body, da die Anfrageparameter meist in der URL übertragen werden.  
Parameter können via Query String (in der URL nach dem ?) übergeben werden.

```HTTP
GET /api/users/123 HTTP/1.1
Host: example.com
Authorization: Bearer token123
```

Ein Query String wird in der URL nach einem ? angegeben und dient dazu, Parameter an einen Server zu übermitteln. Mehrere Parameter werden mit & getrennt.

```HTTP
GET /api/users?name=Max&age=30 HTTP/1.1
Host: example.com
```

Hier werden die Parameter name=Max und age=30 an den Server gesendet, um z. B. nach Nutzern mit diesen Eigenschaften zu filtern.
```jsx
  
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

##### **POST (= Daten erstellen)**  
Mit POST-Requests werden neue Daten auf dem Server erstellt.  
POST-Requests haben typischerweise einen Body, um die neuen Daten zu übertragen.  
Parameter können im Body oder seltener via Query String übergeben werden.

```HTTP
POST /api/users HTTP/1.1
Host: example.com
Content-Type: application/json
Authorization: Bearer token123

{
  "name": "Max Mustermann",
  "email": "max@example.com",
  "age": 30
}
```

```jsx
```


#####  **PUT (= Daten ersetzen)**  
Mit PUT-Requests werden bestehende Daten auf dem Server komplett ersetzt.  
PUT-Requests haben immer einen Body, der die vollständigen neuen Daten der Ressource enthält.  
Parameter werden im Body oder seltener via Query String übergeben, aber die Ressource wird primär über die URL identifiziert.

```HTTP
PUT /api/users/123 HTTP/1.1
Host: example.com
Content-Type: application/json
Authorization: Bearer token123

{
  "name": "Maximilian Mustermann",
  "email": "maximilian@example.com",
  "age": 31
}
```

##### **PATCH (= Daten aktualisieren)**  
Mit PATCH-Requests werden Teile von bestehenden Daten auf dem Server aktualisiert.  
PATCH-Requests haben typischerweise einen Body, der nur die zu ändernden Felder und deren neue Werte enthält.  
Parameter werden im Body oder seltener via Query String übergeben, aber die Ressource wird primär über die URL identifiziert.

```HTTP
PATCH /api/users/123 HTTP/1.1
Host: example.com
Content-Type: application/json
Authorization: Bearer token123

{
  "age": 32
}
```

#####  **DELETE (= Daten löschen)**  
Mit DELETE-Requests werden Daten auf dem Server gelöscht.  
DELETE-Requests haben normalerweise keinen Body, da die zu löschende Ressource über die URL identifiziert wird.  
Parameter können seltener via Query String übergeben werden, um Löschoperationen zu beeinflussen (z.B. "force=true").

```HTTP
DELETE /api/users/123 HTTP/1.1
Host: example.com
Authorization: Bearer token123
```
##### JSON
Mit JSON.parse verwandelt man einen JSON-String zu einem JavaScript-Objekt:

```js
const jsonText = '{"name": "Alice", "city": "London"}';
const jsObject = JSON.parse(jsonText);
console.log(jsObject.name); // Ausgabe: Alice
```

Mit JSON.stringify verwandelt man ein JavaScript-Objekt in einen String:

```js
const person = { name: "Bob", profession: "Developer" };
const jsonString = JSON.stringify(person);
console.log(jsonString); // Ausgabe: {"name":"Bob","profession":"Developer"}
```

##### Beachte
- Die URLs in REST bestehen immer aus Nomen und sind das Plural der Ressource:
    - Pizza => [https://pizzalieferant.ch/pizzas](https://pizzalieferant.ch/pizzas) oder [https://pizzalieferant.ch/pizzas/23](https://pizzalieferant.ch/pizzas/23)
    - Customer (Kunde) => [https://pizzalieferant.ch/customers](https://pizzalieferant.ch/customers) oder [https://pizzalieferant.ch/customers/923](https://pizzalieferant.ch/customers/923)
- Verben gehören niemals in eine URL einer REST API
- Wir arbeiten fast immer mit JSON (Ausnahmen: Bilder, PDFs, etc.)


```jsx
async function macheAlles() {
  try {
    const daten = await holeDatenVomServer()
    const verarbeiteteDaten = await verarbeiteDaten(daten)
    const ergebnis = await speichereDaten(verarbeiteteDaten)
    const response = await sendeNachrichtAnUser(ergebnis)
    await aktualisiereUI(response)
    console.log("Endlich fertig!")
  } catch (fehler) {
    console.error("Ein Fehler ist aufgetreten:", fehler)
  }
}

// Funktion aufrufen
macheAlles()
```

```jsx
async function fetchAllUsers() {
    const response = await fetch("https://jsonplaceholder.typicode.com/users")

    if(!response.ok) {
        throw new Error(`HTTP Error: status ${response.status}`)
    }

    const data = await response.json()
    return data
}

async function main() {
    try {
        const users = await fetchAllUsers()
        console.log(users)
    } catch(e) {
        console.log(e)
    }
}

main()
```

Das erste Argument ist die Adresse des Servers, mit dem du kommunizieren möchtest. In unserem Fall handelt es sich um [https://jsonplaceholder.typicode.com/users](https://jsonplaceholder.typicode.com/users). Standardmässig werden GET-Anfragen gesendet.

**Umgang mit Responses (Antworten)**

Wenn der Server antwortet, erhälst du ein Response-Objekt zurück. Dieses Objekt enthält viele Informationen, aber die wichtigsten sind:

1. **response.ok:** Ein einfacher Wert (true oder false), der dir sagt, ob alles gut gelaufen ist (Statuscode 200-299).
    
2. **response.status:** Der HTTP-Statuscode (z.B. 200 für "OK", 404 für "Nicht gefunden").
    
3. **response.json():** Wenn du JSON-Daten erwartest (was bei den meisten APIs der Fall ist), wandelt diese Methode die Antwort in ein JavaScript-Objekt um. Wichtig: Das ist asynchron.
    


##### **GET BY ID**

```jsx
async function fetchUserById(id) {
    const response = await fetch(`https://jsonplaceholder.typicode.com/users/${id}`)

    if(!response.ok) {
        throw new Error(`HTTP Error: status ${response.status}`)
    }

    const data = await response.json()
    return data
}

async function main() {
    try {
        const user = await fetchUserById(1)
        console.log(user)
    } catch(e) {
        console.log(e)
    }
}

main()
```

##### **POST**

```jsx
async function createUser(user) {
    const response = await fetch(`https://jsonplaceholder.typicode.com/users`, {
        method: "POST",
        headers: {
            "content-type": "application/json"
        },
        body: JSON.stringify(user)
    })

    if(!response.ok) {
        throw new Error(`HTTP Error: status ${response.status}`)
    }

    const data = await response.json()
    return data
}

async function main() {
    try {
        const newUser = {
            name: "Tony Stark",
            username: "Iron Man",
            email: "tony@starkindustries.com"
        }

        const createdUser = await createUser(newUser)
        console.log(createdUser)
    } catch(e) {
        console.log(e)
    }
}

main()
```

Das zweite Argument ist ein Objekt, mit dem du spezielle Anweisungen für deine Anfrage festlegen kannst. Zum Beispiel:

- - **method**: Die HTTP-Methode (z.B. GET, POST, PUT, DELETE). 
        
    - **headers**: Die HTTP-Header. Mit dem content-type Header teilen wir dem Server mit, dass wir ihm JSON schicken.
        
    - **body**: Die eigentlichen Daten, die du an den Server sendest. Achtung: JavaScript-Objekte müssen mit JSON.stringify zu einem JSON-String konvertiert werden!
        

##### **PUT**

```jsx
async function updateUser(user) {
    const response = await fetch(`https://jsonplaceholder.typicode.com/users/${user.id}`, {
        method: "PUT",
        headers: {
            "content-type": "application/json"
        },
        body: JSON.stringify(user)
    })

    if(!response.ok) {
        throw new Error(`HTTP Error: status ${response.status}`)
    }

    const data = await response.json()
    return data
}

async function main() {
    try {
        const user = {
            id: 11,
            name: "Tony Stark",
            username: "Superior Iron Man", // Wir wollen den Usernamen ändern.
            email: "tony@starkindustries.com"
        }

        const updatedUser = await updateUser(user)
        console.log(updatedUser)
    } catch(e) {
        console.log(e)
    }
}

main()
```

##### **DELETE**

```jsx
async function deleteUserById(id) {
    const response = await fetch(`https://jsonplaceholder.typicode.com/users/${id}`, {
        method: "DELETE"
    })

    if(!response.ok) {
        throw new Error(`HTTP Error: status ${response.status}`)
    }
}

async function main() {
    try {
        await deleteUserById(1)
        console.log("User deleted!")
    } catch(e) {
        console.log(e)
    }
}

main()
```

```path
C:\Users\Uek Lernender 1\AppData\Local\Docker\wsl\disk
```
Hier disk löschen bei fehler docker
#### Chronicles Backend Aufgabe
##### Tests: 
✔ soll alle Chroniken mit korrekter Struktur laden (1.4525ms)

```jsx
export async function fetchChronicles() {
  const response = await fetch(URL + "/chronicles");
  const data = await response.json();
  return data;
}
```
