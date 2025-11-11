# Zahlen codieren
## Sie wissen wie Ganzzahlen und Fliesskommazahlen codiert werden

Um eine Zahl zu speichern muss sie in Binär umgewandelt werden damit der Computer sie speichern kann.

### Positive Ganzzahl codieren
Um eine positive Ganzzahl zu speichern muss man einfach in Binär umwandeln.
Beispiel: **7**
$7 / 2 = 3\quad Rest:1$
$3 / 2 = 1 \quad Rest: 1$
$1 / 2 = 0 \quad Rest:1$

= 0111

### Negative Ganzzahl codieren

Wenn wir jetzt mit 7 weiter machen was in binär **0111** ist, müssen wir das **Zweierkomplement** herausfinden.

---
Für das muss man die Binär-Zahl invertieren. Dann sieht sie so aus:
**0111 -> 1000**, sprich alle Nullen zu Einsen machen und umgekehrt.
Dann muss man +1 addieren.

**1001**. So wird -7 im Computer abgespeichert. Wenn eine 1 vorne ist, heisst das das die Zahl negativ ist, wenn es eine 0 vorne hat, ist sie positiv.


### Positive Gleitkommazahl