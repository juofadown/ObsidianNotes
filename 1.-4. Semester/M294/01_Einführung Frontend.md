### HTTP Protokoll
#### URL Aufbau
Ein URL ist so aufgebaut:
1. Protokoll
2. Hostname
##### Protokoll
Das wird für eine Request verwendet wird. http:// oder https://
##### Hostname
Der Hostname beseht aus Subdomain, Second-Level-Domain und Top-Level-Domain
##### Beispiel: 
https://info.cern.ch/

Protokoll: **https://**
Hostname: 
- Subdomain: **info**
- Second-Level-Domain: **cern**
- Top-Level-Domain: **.ch**

Im Client-Server-Modell sieht das vereinfacht so aus: 
```http
GET / HTTP/1.1
Host: info.cern.ch
Accept: text/html
```
Der Client (z.B. ein Browser) fordert vom Server info.cern.ch, die Startseite (/pfad) an und erwartet eine HTML-Antwort.
