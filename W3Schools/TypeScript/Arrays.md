 Mehr oder weniger eine Liste. Hat natürlich wieder Indexes, also Mario ist 0, Travis 1 usw.
 ```TypeScript
 const drummers: string[]=["Mario Duplantier", "Travis Barker", "Danny Carey"];
 ```

Praktisch wenn man eine Liste hat mit mehr als 3 Namen, mit irgendwie 400. Dann ist es schlauer die 400 Namen in einem Array statt alle einzeln abzuspeichern.

---
```TypeScript
const array_name: type[] = [item1, item2, ...];
```
Es ist best practice es mit const zu deklarieren. Es ist auch möglich einen Array leer zu erstellen und später Werte hinzuzufügen. Das kann mit For-Schleifen sehr gut kombiniert werden. 

Beispiel: Gibt alle Namen in drummers aus.
```TypeScript
 const drummers: string[]=["Mario Duplantier", "Travis Barker", "Danny Carey"];
 
for (var i in drummers) {
  console.log(drummers[i]);
}
```


