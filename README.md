## Team

Aantal studenten: 1

Student 1: Anton STEEGMANS

## Titel app

NJOY

## Programmeertaal

Java

## Github link en branch

### Link

[Github link](https://github.com/AntonSteegmansPXL/NJOY.git)

### Branch

Branch: **master**

## Thema's

Welk(e) smart city thema('s) komt/komen aan bod in jullie project?

* Communicatie tussen burgers en organisatoren cultuursector

## Korte beschrijving

Het doel van de app is om het zoeken en vinden van evenementen in de buurt (of elders) te vergemakkelijken. De doelgroep is dus mensen die op zoek zijn naar evenementen in de buurt (of elders).

## Minimale eisen

Ja

## Schermen

## Aantal schermen

Het aantal schermen in onze app bedraagt **3**

### Lijst van schermen

* Splash screen
* EventList screen (fragment)
* EventMap screen (fragment)
* Settings screen (fragment)

## Lokale opslag / Shared Preferences

Er is gebruik gemaakt van lokale opslag bij het ophalen van de json objecten die naar de RecyclerView worden gestuurd.

## 

**

## Extra's

*Beschrijf hieronder de verschillende extra's die in je app aan bod komen, telkens in een aparte sectie*

### Extra 1

Splash screen

### Beschrijving extra 1

Toevoeging van een splash screen, dat eerst het logo van de app toont en na 3 seconden overschakelt naar de MainActivity met de BottomNavigationView, en dan de het eerste Fragment opstart.

## Ondersteuning landscape en portrait / correct gebruik van Fragments

Ondersteunt de app zowel landscape als portrait mode? Wordt er correct gebruik gemaakt van Fragments? Beschrijf kort wat de stand van zaken is en hoe dit gerealiseerd werd.
De UI van de app bestaat uit 2 delen, vanonder de BottomNavigationView en erboven een fragmentcontainer waarin 3 verschillende fragments kunnen geplaatst worden aan de hand van de BottomNavigationView. De ondersteuning voor zowel landscape als portrait mode is aanwezig, echter heb ik hierbij niet veel aan de layout veranderd.

## Web service / API

Er is gebruik gemaakt van Google Maps waarop per evenement een marker werd geplaatst.

## Extra informatie

*Als er nog bepaalde informatie nuttig is om toe te voegen, is daar hier ruimte voor. Je wil bijvoorbeeld aangeven dat bepaalde zaken niet werken zoals voorzien, of niet helemaal zijn afgeraakt. Of je weet dat er nog een bepaalde bug in de code zit die je niet tijdig opgelost kreeg.*
Ik heb nog zitten proberen om de markers van de evenementen via een functie rechtstreeks op de map de plaatsen (en niet hard te coderen zoals het nu is gedaan) maar dit is uiteraard niet meer gelukt. Alsook staat er nog code in comment die gebruikt kan worden om de huidige locatie van de gebruiker op te vragen. Ook nog code in comment is code die de met SharedPreferences zou moeten zorgen voor een werkend SettingsFragment (Dit heeft gewerkt, maar werkt nu niet meer).
