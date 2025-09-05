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

