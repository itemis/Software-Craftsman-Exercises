# Praktische Übung:

### 1. Einleitung:
*Die Geschichte zur Feature Entwicklung*

An einem Freitag vormittag, bei blühendem Sonnenschein begibt sich ein eifriger Schüler auf den Weg zu seinem Praktikum. 
Erst vor einer Woche meisterte der neuntklässler das Vorstellungsgespräch bei einem nahmhaften Unternehmen mit bravur und konnte es kaum erwarten mit seiner neuen Arbeit loszulegen. 
Eifrig installiert sich der Schüler Java 10 auf seiner Maschine, bekommt nach einigen Anlaufschwierigkeiten auch Maven zum laufen, von dem er bei Stackoverflow gelesen hat und fährt seine frisch aufgesetzte IDE hoch.
Ein Blick ins Wiki verrät, dass es in dem Unternehmen üblich ist git zu nutzen. Mit der Frage im Hinterkopf was das überhaupt ist, arbeitet er eifrig die Punkte zur Ausführung der neuen Unternehmenssoftware durch:

```
git clone repo_name.git
```

"Hach, denkt sich der fleißige Schüler. Easy..."
Mit dem Projekt auf dem Laptop macht er sich an die Implementierung. Doch plötzlich, ein Erdbeben und der Schüler vertippt sich, wodurch alle Features des Programmes zerstört werden. 
Zusätzlich pusht er unwissend durch eine unbekannte Tastenkombination auf den ungeschützten master und die Applikation ist zerstört. Ängstlich, erinnert sich der Junge an seinen Informatikleherer, der irgendwann etwas von Tests erzählt hat. 
Leider war es Teil des Nachmittagsunterrichtes und er das Zuhören fiel ihm nach dem Mittagessen schon immer etwas schwer. Doch wusste er noch, dass Testen eine gute Sache ist. Ein Blick in den Testordner. "Yes, Tests vorhanden."
Nach 3 RedBull und einigem Schweißvergießen gelingt es ihm zumindest die Methoden der Features so zu gestalten, dass viele Tests seiner Meinung nach zumindest was sinnvolles Anzeigen.

Beim Hochladen ist sein letzter Gedanke: "Wer kann mir bloß helfen das alles wieder zu reparieren?"

### 2. Übung:
Wichtig: Für diese Übung wird ein installiertes Java 11 vorausgesetzt!
Die Übung zum ausprobieren einiger Java 9/10 Features wird im Stiel von "CDD (Code Driven Development) - in dieser Übung nur ein Name" durchgeführt. Tests sind bereits implementiert und sollten als Anforderung (Doku) für die Realisierung dienen.
Empfohlen wird für die Übung der Einsatzt von IntelliJ als IDE. Voraussetzung ist mindestens Java 10 und Maven.

Schritt 1: git checkout -b "dein_name(euer_name)"\
Schritt 2: Navigiere in den test ordner und starte alle Tests = Kein Test sollte grün sein!\
Schritt 3: Impementiere jedes Feature und die entsprechenden Methoden anhand der einzelnen Tests und der entsprechenden Beschreibung im Test-Namen. 
Ist der Test grün, kann das nächste Feature angegangen werden. Die Realisierungsdetails(Syntax, API etc.) müssen entsprechend selbstständig recherchiert werden!
