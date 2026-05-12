# 1.1 Vorarbeit: Cloud Computing

Cloud Computing is composed of five essential characteristics, three service models, and four deployment models.

### Vorteile Cloud Computing
- **Agilität**: Server können schnell genutzt und auch wieder freigegeben werden. Es ist nicht *fix*.
- **Elastizität**: Auslastung ist sehr unterschiedlich (z.B. Black Friday) Kann hier dynamsich hoch&runter gestellt werden.
- **Kosteneinsparungen**: Es wird nur für die genutzten Cloud Services bezahlt, daher müssen nicht zwingend grosse Investitionen am Anfang unternommen werden.
- **Sicherheit:** Man hat von Anfang an gute IT-Sicherheit.
- **Weltweite Bereitstellung in wenigen Minuten**: Bei geografischer Ausbreitung kann muss nicht neue Hardware erworben werden, sondern weiterhin den CLoud Service benutzen.

![[Pasted image 20260504084525.png]]

![[Pasted image 20260504084811.png]]
# 1.2 Vorarbeit: Dienstmodelle

#### Checkliste
Stelle sicher, dass du die folgenden Punkte verstanden hast:
- Ich kann die vier Service Models (IaaS, PaaS, SaaS, FaaS) in eigenen Worten erklären.
- Ich kann für jedes Modell ein konkretes Beispiel nennen.
- Ich verstehe, dass mehr Komfort beim Anbieter = weniger Kontrolle für den Kunden bedeutet.
- Ich kann Service Models (_was_ wird bereitgestellt) von Deployment Models (_wo_ wird betrieben) unterscheiden.
- Ich weiss, dass FaaS eine Unterkategorie von Serverless Computing ist.
---
Diese *Cloudservices* beschreiben **was** der Anbieter bereitstellt.
Die *Cloud Deployment Models (Public, Private, Hybrid)* beschreiben *wo* die Cloud ist.

## Iaas
*Infrastructure as a Service*
Das ist der Big BOI. Da wird der phyisische Server bereitgestellt. Mit Speicher, Netzwerk und Virtualisierung. Kunde hat volle Kontrolle  üb Betriebssystem, Runtime, Middleware, Anwendung. Dafür auch für Updates/Wartung usw. 

**Beispiel:** Ein Unternehmen mietet EC2 Instances in der Cloud, installiert darauf ein Linux-Betriebssystem, konfiguriert die Firewall (Security Groups) und deployt eigene Anwendungen. Die Firma ist für alle Updates und Patches ab Betriebssystem-Ebene verantwortlich.
## Paas
*Platform as a Service*
Hier wird eine Plattform gegeben, das heisst, der Kunde hat nicht mehr die Kontrolle über Server, OS und Runtime. Hier kann ich eigene Software anbieten / hochladen.   

**Beispiel:** Ein Entwicklerteam deployt seine Web-App über AWS App Runner. Das Team schreibt nur den Code und pushed ihn, AWS kümmert sich um Server, Skalierung, Load Balancing und OS-Updates.
## Saas
*Software as a Service*
Hier bin ich nur Nutzer, da kann ich nichts hochladen? Ja, also ich kann nur konsumieren. 

**Typische Beispiele:**

- **Microsoft 365** – E-Mail (Outlook), Dokumentbearbeitung (Word, Excel, PowerPoint), Teams, alles im Browser.
- **Google Workspace** – Gmail, Google Docs, Google Drive, cloudbasierte Zusammenarbeit.
- **Salesforce** – CRM-Lösung für Kundenmanagement und Vertrieb.
- **Slack** – Team-Kommunikation und Messaging.

**Beispiel:** Ein Unternehmen nutzt Microsoft 365 für E-Mail und Dokumentenbearbeitung. Alles läuft im Browser, die Firma muss weder Server betreiben noch Updates einspielen.
## Faas
*Function as a Service*
Kann ich einzuelne Funktionen hochladen die auf Events prüfen. Zahle nur aufruf und dauer des aufrufs.

**Beispiel:** Ein Online-Shop braucht eine Funktion, die bei jeder Bestellung automatisch eine Bestätigungs-E-Mail versendet. Mit AWS Lambda wird die Funktion nur ausgeführt, wenn eine Bestellung eingeht, in der restlichen Zeit fallen keine Kosten an.

