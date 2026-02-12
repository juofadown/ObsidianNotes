# Docker Image
Ein Docker Image ist ein *read-only* File das benutzt wird um Container zu bauen. Die Images haben alles was der Container braucht und bietet ein privates Filesystem für den Container.
Ein Image wird von einem Dockerfile erstellt. 
# Dockerfile
Ein Dockerfile beinhaltet die Anleitung wie man ein Image erstellt. Es besteht aus mehreren `[action][target]` Befehlen.
# Docker Container
Sobald man ein Image aus einem Dockerfile gebuilded hat, können wir einen oder mehrere Container deployen. Container sind nichts anderes als Instanzen eines Images. 
# Docker Registry
Eine Registry beinhaltet mehrere Images. Es gibt bekannte Registrys die schon fertige Images haben.

# Docker Engine
Ist die zentrale Komponente von Docker die für das Verwalten, Erstellen und Ausführen von Containern verantwortlich ist.

# Portweiterleitung
