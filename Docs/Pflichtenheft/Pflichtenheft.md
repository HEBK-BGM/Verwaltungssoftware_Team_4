# Kapitelübersicht

1. Beschreibung der Anwendung
   

2. Beschreibung der Funktionen 
   
   2.1.1 Funktion: shopshowcards

   2.1.2 Funktion: buycard

   2.1.3 Funktion: sellcard

   2.1.4 Funktion: changepassword

   2.2 Sequenzdiagramm

3. Diagramme - Dokumentation

   3.1 Klassendiagramm

   3.2 Objektdiagramm
---


## 1. Beschreibung der Anwendung

Beschreibung des Programmes:
Wir erstellen ein Programm, mit dem wir Pokémon Karten verwalten können. Man kann in der  Anwendung Karten(/Packs) kaufen bzw. verkaufen. Dabei haben verschiedene Karten unterschiedliche Seltenheitsstufen (und werden auch seltener bzw. öfter gezogen). Der Benutzer kann sich ein Konto erstellen, sich jederzeit ab und dann auch wieder anmelden, auch wenn das Programm zwischendurch geschlossen wurde ( -> Datenbank), dabei bleiben seine Inhalt.

--- 

## 1.1 Beschreibung des Menüs
Im Menü kann man mithilfe eines Scanners eingaben tätigen. Somit lässt sich dort auch ein User erstellen, außerdem kann man sich anmelden und abmelden. Im Menu kann man sich dazu auch noch sein Geld, sein Inventar, den Shop und auch sein Profil anzeigen lassen.
Zu Beginn gibt es die Möglichkeit ein Konto zu erstellen oder sich anzumelden. Im Anschluss, kann man sich s Inventar, sein Geld, den Shop und sein Profil ansehen. Im Inventar werden alle Karten aufgelistet, außerdem lassen sich dort auch die Stats anzeigen. Im Shop kann man sich immer eine von 5 Karten kaufen. Beim Profil lässt sich Name, ID, Alter und das Passwort des Users anzeigen, wobei sich das Passwort dort auch ändern lässt. Von den einzelnen Möglichkeiten kommt man immer wieder zurück ins Menü, von dort aus man sich abmelden kann.


![Menu](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/Menu.iuml)

---
## 2 Beschreibung der Funktionen


## 2.1.1 Funktion: **shopshowcards**

![showcards](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/Funktion_shopkartenanzeigen.iuml)

Bei dieser Funktion soll der User denn Shop mit den Karten sehen. Zu erst geht er über das Menü zu dem Shop. Danach wird der Shop angezeigt und die 5 Karten die man im Shop kaufen kann.

---

## 2.1.2 Funktion: **buycard**

![buycard](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/Funktion_buycard.iuml)

Diese Methode soll erlauben Karten zu kaufen. Dafür muss der User angemeldet sein. Dann muss er über das Menü auf den Shop gehen. Als nächstes kann er sich von den 5 Karten eine aussuchen, welcher er haben möchte. Dann wird nach einer Bestätigung gefragt und die Karten erscheint im Inventar des Users und das Geld so viel wie die Karte kostet wird vom Guthaben abgezogen.

---
## 2.1.3 Funktion: **sellcard**
![sellcard](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/Funktion_sellcard.iuml)

Die Methode sellcard ist dafür gedacht Karten aus dem Inventar zu verkaufen. Der User muss angemeldet sein und als nächstes sich sein Inventar über das Menü anzeigen lassen. Dann wählt er die gewünsche Karte aus und verkauft sie. Zuerst wird nach einer Bestätigung gefragt ob er die Karte verkaufen will und dann wird die Karte aus dem Inventory gelöscht und er bekommt das Geld gutgeschrieben so viel wie die Karte kostet.

---



## 2.1.4 Funktion: **changepassword**
![changepassword](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/Funktion_changepassword.iuml)


Der User kann auf den Menü auswählen sein Passwort zu ändern. Dann wird nach dem neuen Passort gefragt. Dieser soll der User dann eingeben und dann wird das Passwort erst überprüft und dann bestätigt. Dann hat der User ein neues Passwort für seinen account.



## 2.2 Sequenzdiagramm 

## 2.2.1 showcards()

![showcards](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/Sequenzdiagramm-showcards.iuml)

---
## 2.2.2 buyCards()
![buycards](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/Sequenzdiagram-buyCard.iuml)

---
## 2.2.3 sellcard()
![sellcard](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/Sequenzdiagramm-sellcard.iuml)

---

## 2.2.4 changepassword()
![changepassword](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/Sequenzdiagramm-changepassword.iuml)

---
## 3.1 Klassendiagramm 

![Klassendiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/Klassendiagramm-Card.iuml)


---




## 3.2  Objektdiagramm 

![Objektdiagramm](https://www.plantuml.com/plantuml/proxy?cache=no&src=https://raw.githubusercontent.com/HEBK-BGM/Verwaltungssoftware_Team_4/main/Docs/Pflichtenheft/Diagramme/objektdiagramm.iuml)

 