# Abhängigkeit / Dependency
Klasse A ist abhängig von Klasse B. Wenn jetzt bei Klasse B eine Änderung passiert, wird auch etwas mit Klasse A passieren. Meistens sieht diese Abhängigkeit so aus, das die nicht-abhängige Klasse Klasse B als Parameter hat.

![[Pasted image 20260819115201.png]]
Klasse Car ist abhängig von Oil. 
# Assoziation / Association
Besagt das eine Klasse mit einer anderen in Verbindung steht. Es ist eine Assozation wenn eine Klasse eine Property hat die KLasse B referenziert. 

![[Pasted image 20260819211915.png]]

Dann gibt es noch die verschiedenen Arten wie viel es je von anderem haben kann.

| Number | Meaning                                                  |
| ------ | -------------------------------------------------------- |
| 1..1   | Genau eins                                               |
| 0..*   | Null oder mehr                                           |
| 1..*   | Eins oder mehr                                           |
| 0..1   | Null oder eins                                           |
| n..m   | n zu m. mindestens n, höchstens m, Mehr oder Mehr, `n<m` |

# Aggregation / Aggregation
# Komposition / Composition
# Vererbung / Inheritance