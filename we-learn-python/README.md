# Wir lernen python

### Setup
Dieses Projekt beinhaltet eine IntelliJ Konfiguration.(IntelliJ wird für diese Übung als IDE empfohlen.). 
Die nachfolgenden Schritte zeigen einen möglichen Weg, um mit python Programmierung (und damit dem Projekt) zu starten.
1. Installiere IntelliJ (Community Edition)
2. Download und Installiere python 3.6 von [here](https://www.python.org/downloads/release/python-360/)
3. Drücke Strg+Alt+S (Settings) - Plugins - Suche nach python - Drücke den Button "Browse repositories..." - installiere "Python Community Edition" -> IntelliJ erwartet vermutlich einen Neustart.
4. Lade das Projekt (nachdem das Projekt bereits mit git clone auf den lokalen Rechner "gecloned" wurde) in IntelliJ mit:
    1. File - Open - we_learn_python (wähle das jeweilige Projekt)
    2. Konfiguriere python SDK, rechtsklick auf das Modul "we-learn-python" und wähle "Open Module Settings" aus. Unter 'Platform Settings' klicke auf SDKs und füge ein neues Python 3.6 SDK hinzu.
    3. Zur Überprüfung der korrekten Konfiguration navigiere zu dem package legacy, in die Datei main.py und 
    führe die "main"-Methode mit Strg+Shift+F10 (oder Rechtsklick in die Methode - Run 'main') aus. Wird in der Konsole "4:Run" kein Fehler angezeigt. 
    Ist das Setup erfolgreich durchgeführt worden , kann es mit der nachfolgenden Übung losgehen:

### Übung 1
Die Übung verfolgt die Idee des TDLL (Test-Driven-Language-Learning) Konzepts. Um mit der Übung zu beginnen, ist es hilfreich die nachfolgenden Punkte zu beachten. 
Die konkreten Code Beispiele (der angegebenen .py-files des packages 'legacy') beinhalten jeweils Kommentare, die zum Verständnis der Implementierungsdetails verhelfen.

1. Schau in die main.py. Hier kann die "Applikation" experimentell gestartet werden.
2. name_builder.py beinhaltet Code, der zunächst durch zurhilfenahme der Kommentare für kurze Zeit betrachtet und nachfolzogen werden soll. 
In diesem Schritt ist es wichtig den Fokus auf die Semantik der Implementierung zu legen und folglich das Konzept zunächst "oberflächlich" zu verstehen.
3. Implementiere Tests für den bestehenden Code. 
Hierfür existieren bereits erste Tests in name_builder_test.py (mit Kommentaren). Das Ziel ist es die volle Funktionalität des NameBuilder "unit zu testen".

Die Realisierung von Schritt 3. beinhaltet das gezielte Lernen und Verstehen der python Syntax und das strukturierte Vorgehen zum Testen von bestehendem (ungetestetem) Code. 
**Folglich TDLL!**

### Übung 2
##### Der Code soll nun (TDD) um ein weiteres Feature erweitert werden: 
Es soll möglich sein eine *optionale* Liste von *special characters* als Parameter zu übergeben, 
die ebenfalls im finalen String ersetzt werden. Hierbei sollen enthaltene *special characters* in ascii Representation dargestellt 
und der endgültige Ausgabe-string mit dem Prefix 'CHARACTER' versehen werden.
Falls refactoring notwendig ist, nur zu!