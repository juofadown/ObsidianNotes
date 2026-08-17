# 6.1 Aufgabe: CI/CD

**Aufgabe:** Beantwortet folgende Fragen anhand der Logs:
1. In welchem Verzeichnis läuft der Job? (Output von `pwd`)
/builds/uek/210/2024-210-sa2/ssaxej/first-pipeline

2. Welche Dateien sind dort vorhanden? (Output von `ls -al`)
.git und .gitlab-ci.yml
3. Was sagt euch `uname -a` über die Umgebung?

4. In welcher Reihenfolge laufen die zwei Jobs – und warum?


INFRASTURCTUE_STAGE = stage2

Checkliste
- Warum ist `when: manual` für den Deploy-Job wichtig?
- Was passiert mit der restlichen Pipeline, wenn der `lint`-Job fehlschlägt?
- Wie schützt GitLab den Terraform State vor gleichzeitigen Änderungen? (Stichwort: Locking)
- Warum verwenden wir `needs: []` für den Test-Job?
