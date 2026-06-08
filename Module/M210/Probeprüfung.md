A1:
a)
Bei Public Cloud teilt man sich die Infrastruktur beim Anbieter und bei sich selbst. Bei der Private Cloud hat man alles bei sich, also On-Prem. Die Hybrid Cloud ist eine Mischung aus beidem, man kann sensible Datend privat bei sich haben, und unkritische Daten und Ressourcen in der Public Cloud sind.

b)
Hybrid. Ich würde die sensiblen Daten in der privaten Cloud im Rechenzentrum haben und die restlichen Daten in der Cloud speichern. 

A2:
a)
Secutrity OF the Cloud ist der Teil der der Anbieter übernimmt und verantwortlich ist. Es geht um die Sicherheit von der Infrastruktur selbst, wie zum Beispiel Schutz vor DDoS-Angriffe.

Security IN the Cloud ist der Teil der der Kunde übernimmt und verantwortlich ist. Es geht um die Sicherheit der Daten an sich. Zum Beispiel muss der Kunde selbst die Security-Groups für die Container machen oder Firewalls einrichten.

b)
Trage für jede Zeile ein, ob AWS oder der Kunde verantwortlich ist:

| Aufgabe                                    | AWS oder Kunde? |
| ------------------------------------------ | --------------- |
| Physische Sicherheit des Rechenzentrums    | AWS             |
| Security Groups konfigurieren              | Kunde           |
| Betriebssystem-Patches auf RDS             | AWS             |
| IAM-Berechtigungen der eigenen Applikation | Kunde           |

A3:
a)
Der IAM-User kann das Nutzerprofil einer Person beschreiben oder ein Nutzerprofil sein für etwas spezifisches, also ein technischer Account.

b)
Principle of Least Privilege beschreibt das jeder nur das wissen und können soll was man als minimum braucht. Also alles blockieren und nur spezifisches durchlassen. In der Photo Gallery App muss ECS **nur** Traffic vom ALB akzeptieren und die RDS soll **nur** Traffic von ECS akzeptieren.

A4:
**a)** Ordne die folgenden AWS-Services dem richtigen Dienstmodell zu (IaaS, PaaS, FaaS, SaaS):

| Service         | Dienstmodell |
| --------------- | ------------ |
| EC2             | IaaS         |
| ECS Fargate     | PaaS         |
| Lambda          | FaaS         |
| Amazon WorkMail | SaaS         |

b)
1. Bei Serverless/FaaS zahlt man nur für die genutze Leistung (Pay-per-Use)
2. Man muss sich bei Serverless/FaaS nur um die Funktionen kümmern.
3. Besser: Automatische Skalkierung man könnte von 0 auf 1000 automatische Ausführungen.

A5:
a)
Der Benutzer gibt im Browser die URL ein. Das gelangt über DNS-Server auf die Webseite und geht zum ALB hier ist auch die ALB-SG. Von da geht es zum ECS / ECS-SG. Und von da geht es in die RDS-SG. 

Erster Schritt vielleicht Internet.
ALB-SG Offener Port 80 HTTP. Alles darf rein.
ECS-SG Port 3000 ALB-SG hier darf nur ALB-SG rein. 
RDS-SG 5432 PostgreSQL nimmt nur von ECS-SG. Die RDS ist in einem privaten Subnetz und nimmt nur von ECS an.

A5:
Ordner erstellt
mit VSCode geöffnet.
server.js datei erstellt und copypasted.
dockerfile erstellt

Cloud Computing ist die bedarfsabhängige Bereitstellung von IT-Ressourcen über das INternet zu nutzungabhängigen Preisen.


