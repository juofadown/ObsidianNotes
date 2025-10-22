## Schritt 1 – User Story
Formuliere eine **User Story** im Format:
> **As a [Rolle] I want [Ziel], so that [Nutzen].**
Beispiel: _As a library member I want to search for books by title or author, so that I can quickly find the book I need._

---
## Schritt 2 – Akzeptanzkriterien

Lege **mindestens 3 Akzeptanzkriterien** fest. Formuliere sie so, dass man klar prüfen kann, ob die Story „fertig“ ist. Tipp: Nutze „Given – When – Then“-Struktur.

Beispiel:

- Given I am on the search page, when I type a title and click search, then I see a list of matching books.
- Given I enter a keyword that doesn’t exist, then I see the message: "No books found".

---

## Schritt 3 – Funktionale Anforderungen

Schreibe **3 funktionale Anforderungen** zur Story. Beispiel:

- Das System ermöglicht die Suche nach Büchern anhand von Titel oder Autor.
- Das System zeigt die Ergebnisse in einer Liste mit Titel, Autor und Erscheinungsjahr.

---

## Schritt 4 – Nicht-funktionale Anforderungen

Schreibe **2 nicht-funktionale Anforderungen** (z. B. Performance, Usability, Sicherheit). Beispiel:

- Die Suchergebnisse müssen innerhalb von 2 Sekunden angezeigt werden.
- Die Anwendung soll auf Desktop, Tablet und Smartphone benutzbar sein.

---
1, 3, 4

# Tests
**Manuelles Testen in Projekten**  
Systematisches und kontinuierliches Testen ist ein fester Bestandteil des Entwicklungsprozesses.

**Manuelle Tests**

- Werden ohne oder vor Automatisierung durchgeführt.
    
- Testen funktionale und nicht-funktionale Anforderungen.
    
- Prüfen, ob Funktionen Akzeptanzkriterien erfüllen und die Qualität den Vorgaben entspricht.
    

**Funktionales Testen (Schwerpunkt)**

- Überprüft, ob die Software die spezifizierten funktionalen Anforderungen erfüllt.
    
- Testet Eingaben und erwartete Ausgaben, ohne die interne Struktur zu berücksichtigen.
    

**Wichtige Punkte bei funktionalen Tests:**

1. Anforderungen müssen klar und eindeutig sein.
    
2. Testabdeckung aller wichtigen Funktionen.
    
3. Grenzwertanalyse (extreme Eingaben, unerwartete Szenarien).
    
4. Negativtests (ungültige Eingaben prüfen).
    
5. Benutzerperspektive berücksichtigen.
    

**Dokumentation:**

- **Anforderungsdokumente:** Basis für die Tests (z. B. Akzeptanzkriterien, User Stories).
    
- **Testfälle & Testablauf:** Eingaben, Testschritte, erwartete Ergebnisse.
    
- **Testprotokolle:** Testergebnisse und Fehler dokumentieren.
    
- **Bug-Reports:** Fehler im Tracking-System erfassen.
    
- **Testabschlussbericht:** Zusammenfassung und Bewertung der Softwarequalität.
    

**Vorgehen:**

1. **Analyse der Anforderungen:** Funktionale Anforderungen identifizieren, offene Fragen klären.
    
2. **Testfall-Erstellung:** Testfälle mit klaren Eingaben, Schritten und erwarteten Ergebnissen entwickeln.
    
3. **Testdurchführung:** Manuelle Durchführung und Ergebnisdokumentation.
    
4. **Fehlerdokumentation & Behebung:** Fehler in Bug-Tracking-Tool erfassen.
    
5. **Testabschlussbericht:** Testergebnisse zusammenfassen und Softwarequalität bewerten.
    

**Aufgabe:**

- Für die aktuelle Aufgabe reicht die Analyse der Anforderungen und Erstellung der Testfälle.
    

**Arten von manuellen Tests (optional):**

- Exploratives Testen
    
- Ad-hoc-Testing
    
- Funktionales Testen
    
- Regressionstests
    
- Usability-Tests
    
- Smoke-Tests
    
- Integrationstests
    
- Systemtests
    
- Akzeptanztests (UAT)
    
- Sicherheitstests

| ID    | Anforderungen                   | Vorbedingungen        | Ablauf            | Erwartetes Resultat                                                                                                                                                                                                            |
| ----- | ------------------------------- | --------------------- | ----------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| TC_01 | Korrekte Daten werden angezeigt | Applikation gestartet | Startseite öffnen | Titel _Chroniken der Sternenföderation_ wird angezeigt<br><br>Auflistung der Chroniken wird mit definierten Testdaten angezeigt<br><br>Anzeige eines Listenelements entspricht den Designvorgaben  <br>(Chronicles Komponente) |
