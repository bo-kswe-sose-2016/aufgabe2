# KSwe SoSe 2016 - Aufgabe 2

Ziel der Aufgabe ist das Merging von verschiedenen Git-Branches. Diese enthalten
Konflikte, welche mit Hilfe von `git mergetool` in der (Git) Bash gelöst werden
sollen. Falls `git mergetool` keine Standardanwendung definiert hat, sollte
folgende Anleitung zur Hilfe genommen werden:

* http://stackoverflow.com/questions/426026/git-on-windows-how-do-you-set-up-a-mergetool

## Beschreibung

Sowohl der Branch `master` als auch der Branch `implement-point-distance` haben
die Funktion `double distanceTo(Point other)` implementiert. Entscheide, welche
die richtige Lösung ist und merge entsprechend.

## Ergebnis

Bei Ausführung von `Conflicts.java` sollte als Entfernung ungefähr `60232`
ausgegeben werden.
