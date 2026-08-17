## Was ist OpenAPI?

Die OpenAPI Specification (vormals Swagger Specification) ist ein Standard zur Beschreibung von REST-konformen Programmierschnittstellen (Application Programming Interface -> API). Gefördert wird die Spezifikation von der OpenAPI Initiative. Die Initiative verfolgt die Vision, im Sinne einer vernetzten Welt ein offenes und herstellerneutrales Beschreibungsformat für API-Dienste bereitzustellen. Das Projekt wird von der Linux Foundation unterstützt (Quelle: [Wikipedia](https://de.wikipedia.org/wiki/OpenAPI)).

Es ist ein Standard für Programmierschnittstellen für REST API. 

## Was ist Swagger?

Swagger ist eine Sammlung von Open-Source-Werkzeugen, um HTTP-Webservices (auch HTTP API oder REST-like API) zu entwerfen, zu erstellen, zu dokumentieren und zu nutzen. Swagger benutzt dazu den Beschreibungsstandard OpenAPI.

# Test
## Welche Operationen sind bei der API geschützt ?
### Meine Antwort
"**DELETE for Pets**" -> **Falsch**
Ich habe gesehen das DELETE bei /pet der einzige war der einen api_key als parameter hatte, also habe ich angenommen es wäre der einzige der geschützt ist. 
![[Pasted image 20251027094843.png]]

### Richtige Antwort
/pet
Ich denke weil nur /pet dieses Schloss Icon hat.
![[Pasted image 20251027095422.png]]

## Kann eine API-Definition über Swagger, ein Postman-Projekt, ein Client oder Code heruntergeladen oder generiert werden? Wenn ja, wie heisst die heruntergeladene Datei?
### Meine Antwort
"**Nein**" -> **Falsch**
