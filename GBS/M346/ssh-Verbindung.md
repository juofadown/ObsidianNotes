---

---

---
##### IP-Adress

Lokaler Rechner:
```ip
192.168.210.132
```

Router: 
```ip
192.168.207.2
```

Ubuntumaschine: 
```ip
192.168.210.22
```

Windowsmaschine: 
```ip
192.168.210.132
```
##### Username
Lokaler Rechner: **ju**
Ubuntumaschine: **vmadmin**
Windowsmaschine: **vmadmin**
##### ping
Von Windowsmaschine -> Ubuntumaschine pingen
Von Ubuntumaschine -> Internet pingen (www.gbssg.ch)
##### Ubuntumaschine muss ssh-server installiert haben
 ```command
 sudo apt-get update
 ```

 ```command
 sudo apt-get install openssh-server
 ```
 
 ``` command
 sudo service ssh status
 ```

##### ssh-Verbindung mit Passwort
ssh Verbindung von Windowsmaschine auf Ubuntumaschine
ssh **"user"@ip-adress**

```command
ssh vmadmin@192.168.210.22
```
Es wird danach gefragt ob man die Ubuntumaschine zu den bekannten Hosts hinzufügen möchte.
Hier mit *yes* antworten.

##### ssh-Verbindung mit publickey
Auf Windowsmaschine Schlüsselpaar aus Private- und Publickey erstellen.
```command
ssh
```