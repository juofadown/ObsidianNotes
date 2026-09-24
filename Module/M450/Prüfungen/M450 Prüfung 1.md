**Datum: 25.09.2026**
# Lernziele
Die Lernenden...
#### Lernziel 1: erläutern die Begriffe Fehler, Fehlerwirkung, Fehlerzustand, Fehlermaskierung, Fehlerhandlung
- **Fehler**: Ein Fehler ist die nichterfüllung einer festgelegten Anforderung. Wenn das Istverhalten nicht dem Sollverhalten entspricht.
- **Fehlerwirkung:** Eine Fehlerwirkung ist das von aussen sichtbare Fehlverhalten der Software, das bei der Ausführung des Testobjekts auf dem Rechner oder im Betrieb auftritt. Sie entsteht erst dann, wenn ein im Programmcode vorhandener Fehlerzustand bei der Ausführung durchlaufen wird.
- **Fehlerzustand:** Ein Fehlerzustand ist die konkrete Ursache im Arbeitsergebnis, die zu einer Fehlerwirkung führen kann. *Fehlerzustände können nicht nur im Programmcode sein sondern auch in Entwicklungsdokumenten oder in der Architektur enthalten sein*
- **Fehlermaskierung:** Eine Fehlermaskierung ist wenn ein Fehlerzustand so mit einem weiteren Fehlerzustand überdeckt wird, dass keine Fehlerwirkung sichtbar wird. *Beispiel: Ein Fehler transferiert einem Kontostand 10.- zu viel, ein weiterer Fehler zieht 10.- zu viel ab. So überdecken sich zwei Fehler*
- **Fehlhandlung:** Die Fehlerhandlung ist der menschliche Grund wieso es zum falschen Ergebnis oder Fehlerzustand kam. *Das kann wegen Zeitdruck, hohe Komplexität, Missverständnisse bei Anforderungen, Müdigkeit oder zu wenig Erfahrung sein.*

---
#### Lernziel 2: erklären die Begriffe falsch positives und falsch negatives Ergebnis
**Falsch Positives Ergebnis:** Ein falsch positives Ergebnis liegt vor wenn der Testfall fehlschlägt, obwohl sich das Testobjekt korrekt verhalten hat. 

**Falsch Negatives Ergebnis:** Ein falsch negatives Ergebnis liegt vor wenn der Testfall nicht fehlschlägt, aber trotzdem ein Fehlerzustand vorhanden ist.

---

#### Lernziel 3: nennen Testartefakte und deren Beziehungen
| Testartefakte       | Beziehung | Beschreibung                                                                                                                                                                                                    |
| ------------------- | --------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Testkonzept         |           | Hier wird alles festgelegt, was für die **Testdurchführung** erforderlich ist.                                                                                                                                  |
| Testausführungsplan |           | Im Testausführungplan wird der zeitliche Ablauf der Ausführung der **Testsuiten** festgelegt.                                                                                                                   |
| Testfall            |           | Auf Grundlage der **Testbasis** werden die Testfälle erstellt. Ein **Testobjekt** wird mit Testdaten versehen und durchgeführt. Mit dem Ergebnis wird sichtbar ob das Ist- mit dem Sollverhalten übereinstimmt. |
| Testbedingung       |           | Aus der Testbasis sind **Testbedingungen** abzuleiten. Sie sind für das Erreichen der **Testziele** relevant. Eine Testbedingung ist durch ein oder mehrere **Testfälle** zu prüfen.                            |
| Testbasis           |           | Grundlage für alle Überlegungen zum Testen.  Alles Infos die gebraucht werden können, um das Sollverhalten des **Testobjekts** festzulegen.                                                                     |
| Testsuite           |           | In Testsuiten werden **Testfälle** zusammengefasst, die in einem Testzyklus ausgeführt werden.                                                                                                                  |
| Testskript          |           | Das Testskript führt automatisch die **Testsuits** aus.                                                                                                                                                         |
| Testprotokoll       |           | Im Testprotokoll werden die Ergebnisse protokolliert.                                                                                                                                                           |
| Testelement         |           | Das Testelement ist die programmierte Methode. Sie überprüft die **Testbedingungen**.                                                                                                                           |
| Testobjekt          |           | Das Testobjekt ist der Teil des Systems der konkret getestet wird. Die zu prüfende Software. Wird in  **Testfällen** verwendet.                                                                                 |
![[Pasted image 20260924162225.png]]
#### Lernziel 4: nennen Beispiele für die 7 Grundsätze des Testens und bringen dazu je ein Beispiel aus Ihrer Erfahrung
**1. Grundsatz**: Testen zeigt die Anwesenheit von Fehlerzuständen
**Beispiel:**
Ein Team testet eine neue Banking-App. Bei 100 Testüberweisungen läuft alles glatt. Bei der 101. Überweisung wird jedoch ein negativer Betrag eingegeben, was zu einer Fehlermeldung führt

**Eigenes Beipsiel:**
Als ich getestet habe und ein SQL-Fehler kam, wusste ich das ein Fehler in meinem SQL-Select war.

**2. Grundsatz**: Vollständiges Testen ist nicht möglich
**Beispiel:**
Ein einfaches Passwortfeld erlaubt 8 Zeichen (Groß-/Kleinschreibung, Zahlen, Sonderzeichen). Es gäbe Milliarden von Kombinationsmöglichkeiten, um dieses Feld „vollständig“ zu prüfen

**Eigenes Beipsiel:**
Dazu fällt mir nichts ein. Musste glaub noch nie etwas vollständig testen. Ich hatte immer eine Testbedingung oder Ausgang der erfüllt werden musste und wenn er das war, dann war ich fertig. Es wäre unmöglich alle möglichen Situationen unserer riesigen Software komplett zu testen.

**3. Grundsatz**: Frühes Testen spart Zeit und Geld
**Beispiel:**
Ein Tester liest den ersten Entwurf einer Anforderung für ein neues Bezahlsystem und bemerkt, dass die Währung "Euro" vergessen wurde. Diesen Satz im Dokument zu ändern, kostet fast nichts. Hätte man den Fehler erst nach der Programmierung entdeckt, müssten Code, Datenbank und Schnittstellen mühsam umgebaut werden

**Eigenes Beipsiel:**
Ich habe mal einen Fehler in einem Teil vom Programm einprogrammiert den ich schon commitet habe. Als der Fehler dann hervorkam durch andere Nutzer des Programms musste ich den Fehler im Nachhinein anpassen und nochmal neu commiten.

**4. Grundsatz**: Häufung von Fehlerzuständen
**Beispiel:**
In einer neuen Smartphone-Software bemerkt das Team, dass 80 % der Abstürze nur in dem hochkomplexen Modul für die Kamera-Bildverarbeitung auftreten. Die einfache Taschenrechner-Funktion daneben hat hingegen fast nie Fehler. Man konzentriert die Tests nun verstärkt auf die Kamera

**Eigenes Beipsiel:**
Also bei uns sind Fehler nie gleichmässig verteilt. Ich musste oft schon im selben Modul / Teil in unserem Code Fehler beheben.

**5. Grundsatz**: Testfälle "nutzen sich ab"
**Beispiel:**
Ein Team führt seit einem Jahr jeden Montag dieselben 50 Klick-Tests in ihrem Onlineshop durch. Diese Tests finden keine Fehler mehr, weil sie immer nur die alten Pfade prüfen. Neue Fehler in einem kürzlich geänderten Layout werden so nicht entdeckt, bis die Testfälle angepasst und variiert werden

**Eigenes Beipsiel:**
Wir haben keine Testfälle bei uns. Wir testen immer von Hand. Aber ich mir denken das sich Code mit der Zeit auch ändern kann und dann neue Testfälle benötigt sind.

**6. Grundsatz**: Testen ist kontext abhängig
**Beispiel:**
Die Software für eine digitale Eieruhr testet man viel weniger streng als die Software zur Steuerung eines medizinischen Röntgengeräts. Während bei der Uhr ein kleiner Fehler nur ärgerlich ist, geht es beim Röntgengerät um Menschenleben, was eine viel höhere Testintensität erfordert

**Eigenes Beipsiel:**
Bei uns haben wir Aufträge. Ich muss auf verschiedene Weisen mit dem Auftrag umgehen je nach Status den der Auftrag hat.

**7. Grundsatz**: Trugschluss: Keine Fehler bedeutet ein brauchbares System
**Beispiel:**
Ein Entwickler baut eine neue Suchfunktion, die technisch perfekt funktioniert und bei den Tests 0 Fehler aufweist. Die Benutzer finden das Suchfeld jedoch nicht, weil es hinter einem unbeschrifteten Icon versteckt ist. Die Software ist fehlerfrei, erfüllt aber nicht die Bedürfnisse der Anwender

**Eigenes Beipsiel:**
Ich habe mal einen Dialog programmiert der keine Fehler hatte, aber ich hatte für Buttons Bilder verwendet die unsere Kunden im Bezug zu einer anderen Funktion kannten. Also sie dachten der Knopf macht was anderes als er gemacht hat, da ich einfach das erst beste Bild genommen habe.

---

#### Lernziel 5: erläutern die Eigenschaften des Produktqualitäts- und Nutzungsqualitätsmodells
**Eigenschaften Produktqualitäts**
- Funktionelle Eignung
- Leistungseffizienz
- Kompatibilität
- Gebrauchstauglichkeit
- Zuverlässigkeit
- Sicherheit
- Wartbarkeit
- Protabilität
**Eigenschaften Nutzungsqualitätsmodell**
- effektivität
- effizienz
- nutzungszufriedenheit
- risikofreiheit
- kontextabdeckung

---

#### Lernziel 6: erläutern die Zusammenhänge der 7 Aktivitäten des Testprozesses
1. Testplanung
2. Testüberwachung und -steuerung
3. Testanalyse
4. Testentwurf
5. Testrealisierung
6. Testdurchführung
7. Testabschluss

Obgleich die Aufgaben des Testprozesses in sequenzieller Reihenfolge angegeben sind und die einzelnen Aufgaben teilweise logisch aufeinander aufbauen, können und dürfen sie sich in der praktischen Anwendung überschneiden und teilweise auch gleichzeitig durchgeführt werden.
#### Lernziel 7: unterscheiden zwischen «Testobjekt», «Testbasis» und «Testorakel»

**Testobjekt**: Ist die zu prüfende Software.
**Testbasis**: Alle Dokumente und Informationen mit denen man entscheiden kann ob ein Test funktinoniert hat oder fehlgschlagen ist.
**Testorakel**: Ein Testorakel wird zur Ermittlung der Sollwerte verwendet.
#### Lernziel 8: nennen Einflussfaktoren der menschlichen Psychologie auf das Testen und erklären diese
Es kann destruktiv wirken wenn Tester Fehler in der Arbeit anderer suchen, deswegen sollen sie die Fehler normal und sachlich kommunizieren.

Menschen suchen oft unbewusst nach Informationen, die ihre eigene Meinung bestätigen. Entwickler können deshalb Fehler im eigenen Code leichter übersehen.

#### Lernziel 9: erläutern das allgemeine V-Modell und dessen Bedeutung für das Testen
#### Lernziel 10: erklären den Unterschied zwischen Verifizieren und Validieren
#### Lernziel 11: erklären die Unterschiede zwischen Blackbox- und Whitebox-Tests resp. Anforderungsbezogene Test und Strukturbezogene Tests
#### Lernziel 12: erklären TDD und wenden diesen Prozess an
#### Lernziel 13: erklären die Elemente des dynamischen Testens gemäss Abbildung 5-1 und 5-2 im Lehrmittel
#### Lernziel 14: nennen Methoden zur Ermittlung von positiven und negativen Testfällen und wenden diese an: Äquivalenzklassen, Grenzwertanalyse, Spezialfälle

# Fragen

| Frage | Antwort |
| ----- | ------- |
|       |         |
|       |         |
|       |         |

# Merken