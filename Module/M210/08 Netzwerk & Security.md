Die Firma **CloudPix GmbH** hat folgende Struktur:

|Abteilung|Mitarbeiter|Aufgaben|
|---|---|---|
|**Development**|Anna, Ben|Code deployen, Logs lesen, Lambda entwickeln|
|**Operations**|Clara, David|Server starten/stoppen, Monitoring, Backups|
|**Marketing**|Eva|Reports lesen, Dashboards anschauen|

**Anwendungen der Firma:**
- **Photo Storage App** – S3 Bucket `cloudpix-photos`, Lambda für Thumbnails
- **Customer Portal** – EC2 Instances, RDS Datenbank
- **Analytics Dashboard** – CloudWatch Dashboards (read-only)

#### Teil 2: IAM Design (~15 min)

**2.1** Entwirf ein IAM-Konzept für CloudPix GmbH. Fülle die Tabelle aus:

| Group | Users        | Benötigte Berechtigungen |
| ----- | ------------ | ------------------------ |
| DEV   | Anna, Ben    | Read Write Execute       |
| OPR   | Clara, David |                          |
| MRK   | Eva          |                          |