|            | Beschreibung                                                                                                                                                                                                                     |
| ---------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Person** | Die Entität "Person" repräsentiert einen Benutzer der ToDo-Liste. Jede Person hat eine eindeutige Identifikation, einen Namen und eventuell weitere Informationen.                                                               |
| **Item**   | Die Entität "Item" steht für einen einzelnen Eintrag in einer ToDo-Liste. Ein Item hat eine Beschreibung, einen Status (z.B. "offen", "erledigt"), ein Fälligkeitsdatum und kann optional mit Tags versehen werden.              |
| **Tag**    | Die Entität "Tag" dient zur Kategorisierung von Items. Ein Tag hat einen Namen und kann an mehrere Items angehängt werden. Tags helfen dabei, Items leichter zu finden und zu sortieren, z.B. "Einkauf", "Arbeit", "Privat" usw. |
# Beziehungen
![[Pasted image 20251028112853.png]]
# URL's

**Entität: Person**
CRUD:
  GET /persons
  GET /persons/{id}
  POST /persons
  PUT /persons/{id}
  DELETE /persons/{id}

**Entität: Item**
CRUD:
  GET /items
  GET /items/{id}
  POST /persons/{personId}/items
  PUT /items/{id}
  DELETE /items/{id}

**Entität: Tag**
CRUD:
  GET /tags
  GET /tags/{id}
  POST /tags
  PUT /tags/{id}
  DELETE /tags/{id}




eyJhbGciOiJIUzI1NiJ9.eyJleHAiOjE3NjI1MTk3NTQsInN1YiI6ImRhbmllbCJ9.CvAcqetsd11noYOh_6t675BOVMkp3QT1Jw81_-ndJX4