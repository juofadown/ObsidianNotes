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

_**von Oben nach Unten bei Ganzzahlen**_
### Negative Ganzzahl codieren

Wenn wir jetzt mit 7 weiter machen was in binär **0111** ist, müssen wir das **Zweierkomplement** herausfinden.

---
Für das muss man die Binär-Zahl invertieren. Dann sieht sie so aus:
**0111 -> 1000**, sprich alle Nullen zu Einsen machen und umgekehrt.
Dann muss man +1 addieren.

**1001**. So wird -7 im Computer abgespeichert. Wenn eine 1 vorne ist, heisst das das die Zahl negativ ist, wenn es eine 0 vorne hat, ist sie positiv.


### Positive und Negative Fliesskommazahl

Binäre Kommazahlen sind Gleitkommazahlen. Sie werden so codiert indem sie zuerst in die wissenschaftliche Schreibweise umgewandelt werden. 

Sie bestehen aus drei Teilen.



**32 Bit**

| Teil          | Bits | Beschreibung                                             |
| ------------- | ---- | -------------------------------------------------------- |
| 1. Vorzeichen | 1    | 0 = positive Gleitkommazahl, 1 = negative Gleitkommazahl |
| 2. Exponent   | 8    | Der Exponent wird hier in Binär gespeichert              |
| 3.            | 23   | Mantisse                                                 |

Bei 32 Bit ist der Bias 127 und bei 64 Bit ist der Bias 1023

$0.8 * 2 = 1 \quad Rest : 0.6$
$0.6 * 2 = 1 \quad Rest : 0.2$
$0.2 * 2 = 0 \quad Rest : 0.4$
$0.4 * 2 = 0 \quad Rest : 0.8$

= 1100........
_**von Unten nach Oben bei Fliesskommazahlen**_

Es gibt Zahlen die ins unendliche gehen, das ist auch der Grund wieso das der Computer manchmal zahlen nicht genau anzeigen kann, oder wieso manche Zahlen unendliche Nachkommastellen haben.

### 0.75 in eine Gleitkommazahl umwandeln


$0.75 * 2 = 1 \quad Rest : 0.5$
$0.5 * 2 = 1 \quad Rest : 0$

= 0.11
_**von Unten nach Oben bei Fliesskommazahlen**_

Dann in Wissenschaftliche Schreibweise machen.
0.11 --> $1.1^-1$
Das wird hier dann Mantisse genannt. Die Mantisse ist aber nicht 
## Sie können eine Ganzzahl im Zweierkomplement codieren und decodieren (4-Bit)
## Sie können eine 32-Bit Fliesskommazahl decodieren
# Bilder codieren
