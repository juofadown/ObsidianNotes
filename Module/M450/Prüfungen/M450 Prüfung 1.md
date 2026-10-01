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

- **Fehler**: Ein Fehler ist das nichterfüllen einer Anforderung. Wenn das Istverhalten nicht dem Sollverhalten entspricht.
- **Fehlerwirkung**: Der konkrete Grund wieso das ein Fehlerzustand eingebaut wurde. Stress, Zeitdruck usw.
- **Fehlerzustand**: Ein Fehlerzustand ist die bei der Ausführung sichtbare Problem.
- **Fehlermaskierung**: Wenn 2 oder mehr Fehlerzustände sich so überlappen, dass es so wirkt, als gäbe es kein Fehler.
- **Fehlerbehandlung**: 

- **Fehler**: Das nichterfüllen einer Anforderung. Wenn das Istverhalten nicht dem Sollverhalten entspricht.
- **Fehlerwirkung**: Eine Fehlerwirkung ist die von aussen sichtbare Fehlermeldung die bei Ausführung des Tests entsteht.
- **Fehlerzustand**: Ein Fehlerzustand ist der effektive Grund im Code wieso das es das Problem gegeben hat. Zum Beispiel falsch eine While-Schleife programmiert. 
- **Fehlermaskierung**: Überlappen von Fehlerzuständen so dass keine Fehlerwirkung gefunden wird.
- **Fehlerbehandlung**: Gründe wieso Menschen im Code Fehler machen. Zb. Stress, Zeitdruck und Müdigkeit.

---

- Fehler: Ein Fehler ist nichterfüllung eines Sollzustands.
- Fehlerhandlung: Eine Fehlerhandlung ist der Grund warum ein Mensch ein Fehler macht. zB Stress.
- Fehlerwirkung: Eine Fehlerwirkung de teil im prgramm wo falsch.
- Fehlermaskierung: Zwei Fehler sich so überlapped, das me nid mekrt das en fehler het. bzw. kein fehlerzustand.
- Fehlerzustand ist der sichtbare teil des problems bei der ausführung.

- Fehler: Ein Fehler ist die Nichterfüllung einer Anforderung. Wenn das Istverhalten nicht dem Sollverhalten entspricht.
- Fehlerwirkung: Eine Fehlerwirkung
- Fehlerzustand: Ein Fehlerzustand ist der Fehler im Programmcode. Er wird sichtbar wenn man die Software im Betrieb oder auf dem Rechner laufen lässt.
- Fehlerhandlung: Grund wieso Fehler. zB. Stress
- Fehlermaskierung: Zwei Fehlerzustand überalppen. 

- Fehler: NIchterfüllung Anfoerdung, istverjhalten nicht sollverhatlen
- Fehlerwirkung: von aussen sichbarer fehler, erst bei progarmm ausführung sichtbar
- Fehlermaskierung: zwei überlappen fehler = null
- Fehlerzustand: konkreter fehler im programmcoe
- Fehlhandlung: menschlicher grund wie zb. stress
#### Lernziel 2: erklären die Begriffe falsch positives und falsch negatives Ergebnis
**Falsch Positives Ergebnis:** Ein falsch positives Ergebnis liegt vor wenn der Testfall fehlschlägt, obwohl sich das Testobjekt korrekt verhalten hat. 

**Falsch Negatives Ergebnis:** Ein falsch negatives Ergebnis liegt vor wenn der Testfall nicht fehlschlägt, aber trotzdem ein Fehlerzustand vorhanden ist.

---

Falsch Negatives Ergebnis:
Bei einem falsch negativem Ergebnis misglückt der Test, doch es war mit dem Code alles in Ordnung.

Falsch Positives Ergebnis:
Bei einem falsch positivem Ergebnis wird der Test zwar erfolgreich durchgeführt, doch es war trotzdem ein Fehlerzustand im Code vorhande.

falsch positiv:
bei einem falsch positivem ergebnis ist der Code fehlerfrei, doch der test schlägt fehl.

falsch negativ:
bei einem falsch negativen ergebnis ist der code fehlerhaft, doch der test ist erfolgreich.
#### Lernziel 3: nennen Testartefakte und deren Beziehungen

| Testartefakt            | Bedeutung / Beziehung                                                                                        |
| ----------------------- | ------------------------------------------------------------------------------------------------------------ |
| **Testbasis**           | Grundlage für die Überlegungen zum Testen. Daraus werden die **Testbedingungen** abgeleitet.                 |
| **Testbedingung**       | Beschreibt, was geprüft werden soll. Eine Testbedingung wird durch einen oder mehrere **Testfälle** geprüft. |
| **Testfall**            | Wird auf Basis der **Testbasis** erstellt. Enthält Testdaten und prüft das **Testobjekt**.                   |
| **Testobjekt**          | Der Teil der Software, der konkret getestet wird.                                                            |
| **Testsuite**           | Fasst mehrere **Testfälle** zusammen, die gemeinsam ausgeführt werden.                                       |
| **Testskript**          | Führt die **Testsuite** automatisch aus.                                                                     |
| **Testprotokoll**       | Dokumentiert die Ergebnisse der Testausführung.                                                              |
| **Testausführungsplan** | Legt den zeitlichen Ablauf der Testausführung fest.                                                          |
| **Testkonzept**         | Legt fest, was für die Testdurchführung benötigt wird.                                                       |
| **Testelement**         | Programmierte Methode, die die **Testbedingungen** überprüft.                                                |
![[Pasted image 20260924162225.png]]

---

- Testobjekt
- Testausführungsplan

- Testobjekt
- Testsuite
- Testfälle
- Testskript
- Protokoll
- Testausführungsplan


- Testbasis
- Testkonzept
- Testfall
- Testbedingung
- Testobjekt
- Testprotokoll
- Testskript
- Testsuite

1. Testobjekt
2. Testfall
3. Testsuite
4. Testskript

Testplanung, TestÜberwachung und Teststeuerung
Testrealisierung und Durchführung
Testanalyse und testentwurf

Testplanung, Testüberwachung
Testrealisierung Testdurchführung
Testplan, Testentwurf

Testplanung, Testüberwachung, Teststeuerung
Testrealisierung, Test
Testentwurf

Testplanung, Testüberwachung, Teststeuerung
Testrealisierung, Testdurchführung
Testentwurf und Testanalsye



![[Pasted image 20260925010050.png]]
![[Pasted image 20260925010438.png]]
![[Pasted image 20260925010748.png]]
![[Pasted image 20260925011059.png]]
![[Pasted image 20260925011750.png]]

#### Lernziel 4: nennen Beispiele für die 7 Grundsätze des Testens und bringen dazu je ein Beispiel aus Ihrer Erfahrung
##### **1. Grundsatz**: Testen zeigt die Anwesenheit von Fehlerzuständen
**Beispiel:**
Ein Team testet eine neue Banking-App. Bei 100 Testüberweisungen läuft alles glatt. Bei der 101. Überweisung wird jedoch ein negativer Betrag eingegeben, was zu einer Fehlermeldung führt

**Eigenes Beipsiel:**
Als ich getestet habe und ein SQL-Fehler kam, wusste ich das ein Fehler in meinem SQL-Select war.

##### **2. Grundsatz**: Vollständiges Testen ist nicht möglich
**Beispiel:**
Ein einfaches Passwortfeld erlaubt 8 Zeichen (Groß-/Kleinschreibung, Zahlen, Sonderzeichen). Es gäbe Milliarden von Kombinationsmöglichkeiten, um dieses Feld „vollständig“ zu prüfen

**Eigenes Beipsiel:**
Dazu fällt mir nichts ein. Musste glaub noch nie etwas vollständig testen. Ich hatte immer eine Testbedingung oder Ausgang der erfüllt werden musste und wenn er das war, dann war ich fertig. Es wäre unmöglich alle möglichen Situationen unserer riesigen Software komplett zu testen.

##### **3. Grundsatz**: Frühes Testen spart Zeit und Geld
**Beispiel:**
Ein Tester liest den ersten Entwurf einer Anforderung für ein neues Bezahlsystem und bemerkt, dass die Währung "Euro" vergessen wurde. Diesen Satz im Dokument zu ändern, kostet fast nichts. Hätte man den Fehler erst nach der Programmierung entdeckt, müssten Code, Datenbank und Schnittstellen mühsam umgebaut werden

**Eigenes Beipsiel:**
Ich habe mal einen Fehler in einem Teil vom Programm einprogrammiert den ich schon commitet habe. Als der Fehler dann hervorkam durch andere Nutzer des Programms musste ich den Fehler im Nachhinein anpassen und nochmal neu commiten.

#####  **4. Grundsatz**: Häufung von Fehlerzuständen
**Beispiel:**
In einer neuen Smartphone-Software bemerkt das Team, dass 80 % der Abstürze nur in dem hochkomplexen Modul für die Kamera-Bildverarbeitung auftreten. Die einfache Taschenrechner-Funktion daneben hat hingegen fast nie Fehler. Man konzentriert die Tests nun verstärkt auf die Kamera

**Eigenes Beipsiel:**
Also bei uns sind Fehler nie gleichmässig verteilt. Ich musste oft schon im selben Modul / Teil in unserem Code Fehler beheben.

##### **5. Grundsatz**: Testfälle "nutzen sich ab"
**Beispiel:**
Ein Team führt seit einem Jahr jeden Montag dieselben 50 Klick-Tests in ihrem Onlineshop durch. Diese Tests finden keine Fehler mehr, weil sie immer nur die alten Pfade prüfen. Neue Fehler in einem kürzlich geänderten Layout werden so nicht entdeckt, bis die Testfälle angepasst und variiert werden

**Eigenes Beipsiel:**
Wir haben keine Testfälle bei uns. Wir testen immer von Hand. Aber ich mir denken das sich Code mit der Zeit auch ändern kann und dann neue Testfälle benötigt sind.

##### **6. Grundsatz**: Testen ist kontext abhängig
**Beispiel:**
Die Software für eine digitale Eieruhr testet man viel weniger streng als die Software zur Steuerung eines medizinischen Röntgengeräts. Während bei der Uhr ein kleiner Fehler nur ärgerlich ist, geht es beim Röntgengerät um Menschenleben, was eine viel höhere Testintensität erfordert

**Eigenes Beipsiel:**
Bei uns haben wir Aufträge. Ich muss auf verschiedene Weisen mit dem Auftrag umgehen je nach Status den der Auftrag hat.

##### **7. Grundsatz**: Trugschluss: Keine Fehler bedeutet ein brauchbares System
**Beispiel:**
Ein Entwickler baut eine neue Suchfunktion, die technisch perfekt funktioniert und bei den Tests 0 Fehler aufweist. Die Benutzer finden das Suchfeld jedoch nicht, weil es hinter einem unbeschrifteten Icon versteckt ist. Die Software ist fehlerfrei, erfüllt aber nicht die Bedürfnisse der Anwender

**Eigenes Beipsiel:**
Ich habe mal einen Dialog programmiert der keine Fehler hatte, aber ich hatte für Buttons Bilder verwendet die unsere Kunden im Bezug zu einer anderen Funktion kannten. Also sie dachten der Knopf macht was anderes als er gemacht hat, da ich einfach das erst beste Bild genommen habe.

---
1. Trugschluss: Keine Fehler bedeutet tragbares System
2. Je früher ein FEhler gefunden wird, deso mehr Zeit und Geld gepsart
3. Alles Testen ist unmöglich
4. Testen ist kontextabhängig

1.Grundsatz: Testen zeigt die Anwesenheit von Fehlerzuständen
7.Grundsatz: Trugschluss: Keine Fehler heisst ein gutes System
- Testen ist kontext abhängig
- Früh fehler finden spart kosten und zeit

1.Grundsatz: Testen zeigt die Anwesenheit von Fehlerzuständen
7.Grundsatz: Trugschluss:

1.Grundsatz: Testen zeigt die Anwesenheit von Fehlerzuständen
2.Grundsatz: Vollständiges Testen ist unmöglich
7.Grundsatz: Trugschluss: Keine FEhler bedeutet ein brauchbares System
- Früh Fehler finden erspart Zeit und Geld
1.Grundsatz: Testen zeigt die Anwesenheit von Fehlerzuständen
2.Grundsatz: Es ist nicht möglich alles zu testen
3.Grundsatz: Früh Fehler finden erspart Zeit und Geld
4.Grundsatz: Häufung von Fehlern
5.Grundsatz: Testen ist kontext abhängig
7.Grundsatz: Trugschluss: Keine Fehler bedeutet ein brauchbares System

1.Grundsatz: Testen zeigt Fehlerzustände auf
2.Grundsatz: Vollständiges Testen ist unmöglich
3.Grundsatz: Früh Testen erspart Zeit und Geld
4.Grundsatz: Häufung von Fehlerzuständen
5.Grundsatz: 
6.Grundsatz: Testen ist kontext abhängig
7.Grundsatz: Trugschluss: Keine Fehler heisst ein brauchbares System

1.Grundsatz: Testen zeigt die Anwesenheit von Fehlerzuständen
2.Grundsatz: Früh Testen erspart Zeit und Geld
3.Grundsatz: 
4.Grundsatz: Häufung von Fehlerzuständen
5.Grundsatz: Testfälle nutzen sich ab
6.Grundsatz: 
7.Grundsatz: Trugschluss: Keine Fehler heisst brauchbares System

1.Grundsatz: Testen zeigt die Anwesenheit von Fehlerzuständen
2.Grundsatz: Vollständiges Testen ist nicht möglich
3.Grundsatz: Früh Testen erspart Zeit und Geld
4.Grundsatz: Häufung von Fehlerzuständen
5.Grundsatz: Testfälle nutzen sich ab
6.Grundsatz: 
7.Grundsatz: Trugschluss:

1.Grundsatz: Testen zeigt Fehlerzustände auf
2.Grundsatz: Vollständiges Testen ist unmöglcih
3.Grundsatz: Früh Testen erspart Zeit und Geld
4.Grundsatz: Häufung von Fehlerzuständen
5.Grundsatz: Testfälle nutzen sich ab
6.Grundsatz: Testen ist kontext abhängig
7.Grundsatz: Trugschluss: Keine Fehler heisst brauchbares System
#### Lernziel 5: erläutern die Eigenschaften des Produktqualitäts- und Nutzungsqualitätsmodells
**Eigenschaften Produktqualität**
- Funktionelle Eignung
- Leistungseffizienz
- Kompatibilität
- Gebrauchstauglichkeit
- Zuverlässigkeit
- Sicherheit
- Wartbarkeit
- Protabilität
**Eigenschaften Nutzungsqualität**
- effektivität
- effizienz
- nutzungszufriedenheit
- risikofreiheit
- kontextabdeckung

---

Produktqualität:
1. Leistungseffizienz
2. Sicherheit

Nutzungsqualität:
1. Effizienz




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
Die Grundidee des V-Modells ist das dass Testen als gleichwertige Tätigkeit wie die Entwicklungsarbeit gewertet wird.
Das wird mit einem V verbildlicht.
Es werden Teststufen unterschieden wobei jede Stufe "gegen" ihre entsprechende Entwicklungsstufe testet.
#### Lernziel 10: erklären den Unterschied zwischen Verifizieren und Validieren
Verifizierung ist die Frage ob wir das System richtig gebaut haben.
Validierung ist die Frage ob das richtige System gebaut wurde. 

Verifizierung Shop:
Wird die Bestellungso aufgegeben wie es in der Spezifikation steht?

Validierung Shop:
Erfüllt der Shop in der Praxis seinen Zweck?
#### Lernziel 11: erklären die Unterschiede zwischen Blackbox- und Whitebox-Tests resp. Anforderungsbezogene Test und Strukturbezogene Tests
Ich sehe bzw. berücksichtige **nicht die innere Struktur** der Software. Ich erstelle die Tests anhand der **Spezifikation/Anforderungen** und prüfe, ob das System das erwartete Verhalten zeigt.

Ich kenne und berücksichtige die **innere Struktur bzw. den Programmcode**. Ich erstelle Tests anhand dieser Struktur, z. B. anhand von `if`-Verzweigungen.

> **Anforderungsbezogene Tests werden typischerweise als Blackbox-Tests durchgeführt.**

> **Strukturbezogene Tests werden typischerweise als Whitebox-Tests durchgeführt.**


#### Lernziel 12: erklären TDD und wenden diesen Prozess an
TDD steht für Test Driven Development.
Da werden zuerst automatisierte Tests geschrieben und danach der Programmcode.

Phasen: Rot -> Grün -> Refactor -> wiederholen
#### Lernziel 13: erklären die Elemente des dynamischen Testens gemäss Abbildung 5-1 und 5-2 im Lehrmittel
Beim **dynamischen Testen wird das Testobjekt ausgeführt**.
Vereinfacht:
**Testdaten → Testobjekt → tatsächliches Ergebnis**
und dieses Ergebnis wird mit dem
**erwarteten Ergebnis** verglichen.

Das unterscheidet sich vom statischen Testen, bei dem beispielsweise Code oder Dokumente untersucht werden, **ohne das Programm auszuführen**.
Wichtige Begriffe:
- **Testobjekt** → wird getestet
- **Testtreiber** → ruft Testobjekt auf
- **Stub/Mock** → simuliert andere Programmteile
- **Testdaten** → Eingaben
- **erwartetes Ergebnis** → Soll
- **tatsächliches Ergebnis** → Ist
- **Blackbox** → innere Struktur nicht berücksichtigt
- **Whitebox** → innere Struktur wird berücksichtigt

![[Pasted image 20260925003325.png]]
![[Pasted image 20260925003403.png]]
#### Lernziel 14: nennen Methoden zur Ermittlung von positiven und negativen Testfällen und wenden diese an: Äquivalenzklassen, Grenzwertanalyse, Spezialfälle
**Äquivalenzklassen:**
> Eingabewerte in sinnvolle Gruppen aufteilen und pro Gruppe repräsentative Werte testen.

**Grenzwertanalyse:**
> Werte an den Grenzen der Äquivalenzklassen testen.

**Spezial-/Sonderfälle:**
> Ungewöhnliche, seltene oder leicht vergessene Eingaben/Situationen testen.

### Wichtigster Merksatz:
**① KLASSEN**  
→ Welche Gruppen gibt es?

**② GRENZEN**  
→ Was passiert an den Übergängen?

**③ SONDERFÄLLE**  
→ Gibt es besondere/ungewöhnliche Fälle?

Und bei jeder Methode immer fragen:
**Was ist ein positiver Fall?**
**Was ist ein negativer Fall?**

# Fragen

| Frage | Antwort |
| ----- | ------- |
|       |         |
|       |         |
|       |         |

# Merken