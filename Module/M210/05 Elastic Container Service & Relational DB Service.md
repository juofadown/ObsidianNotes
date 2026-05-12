AWS Dienste:

| Dienst                           | Funktion                                 |
| -------------------------------- | ---------------------------------------- |
| ALB (Application Load Balancer)  | Traffic auf Container verteilen          |
| CloudWatch                       | Logs und Metriken überwachen             |
| ECR (Elastic Container Registry) | Container-Images speichern und verwalten |
| ECS (Elastic Container Service)  | Container orchestrieren und ausführen    |

---

ECS-Begriffe:

| Begriff         | Beschreibung                                                |
| --------------- | ----------------------------------------------------------- |
| Task            | Eine laufende Instanz eines oder mehrerer Container         |
| Task Definition | Blueprint, beschreibt wie der Container laufen soll         |
| Service         | Überwacht und steuert die gewünschte Anzahl Tasks           |
| Cluster         | Logische Gruppierung, entählt Services und Rechenressourcen |

---
Schritte ECS Deployment:
1. Docker Image bauen und nach ECR (Registry) pushen
2. Task Definition mit Image Referenz erstellen
3. ECS Service aktualisieren
4. Health Check abwarten, alter Container wird gestoppt

---
*Was passiert wenn du den Befehl `\aws ecs update-service --force-new-deployment\` ausführst?*
ECS zieht das neueste Image aus ECR und startet neue Tasks

---
*Wozu dient Amazon ECR?*
Zum Speichern und verwalten von Docker Images

---
*Dein ECS Service zeigt «0 running tasks», obwohl du 1 konfiguriert hast. Was ist die wahrscheinlichste Ursache?*
Der Container besteht den Health Check nicht und wird immer wieder neu gestartet.

---

