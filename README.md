# EVENTTIME

Haben Sie es auch ständig satt Konzerte Ihrer Lieblingskünstler zu verpassen?

EVENTTIME ermöglicht es Ihnen Konnzerte von Ihren Lieblingskünstlern zu verfolgen und diese zu verwalten.
Durch das Einloggen auf der Webseite haben sie jederzeit Zugriff auf Ihre gespeicherten Favoriten.

Sie können Events folgen und werden benachrichtigt sobald diese anstehen. Zudem ermöglicht EVENTTIME Ihnen, Konzerthistorien von Künstlern einzusehen.
Die Suche nach Konzerten kann durch folgende Kriterien erfolgen:

- Künstler
- Location


Experimentelle Featureüberlegung: Weiterleitung zur Ticketverkaufstelle.
APIs: Songkick
Heroku Lik: https://eventtime-21.herokuapp.com

USE-CASES:

OKTA:
-Logge dich ein mit dem Login-Button
-bestehende Credentials können genutzt werden oder ein User kann sich registrieren
-bei der Registrierung müssen alle Felder ausgefüllt werden und anschließend muss auf den Registrier-Button geklickt werden

EVENTTIME:
-Home-Seite bietet die Möglichkeit durch in blau gekennzeichnete Verlinkungen, folgende Seiten aufzurufen: Lieblingskünstler*innen --> Artists, bestimmten Orten --> Locations
-auf der Seite Artists kann man nach einem beliebigen Künstler suchen 
-man bekommt dann zum Künstler die bevorstehenden Konzerte mit den folgenden Infos:
    --> Location, 
    --> Name, 
    --> Datum,
    --> und eine Verlinkung zur Ticketverkaufsstelle (bereitgestellt durch die externe API von Songkick)
-Auf der Seite Locations kann man nach einer beliebigen Stadt suchen 
-man bekommt daraufhin eine Liste mit den passenden Städten und die Infos: 
    --> Stadt
    --> Land 
    --> und eine Verlinkung zur Songkick (bereitgestellt von der externen API Songkick)
        --> Diese Verlinkung gibt Informationen zu den bevorstehenden Konzerten 
        --> Man hat die Möglichkeit auch nach einem passenden Genre, Datum, Artist zu filtern
-Auf der Seite AddFavorites kann man seine Lieblingskünstler und die passende Location notieren und abspeichern(auf der Oracle-Datenbank)
-auf der Seite Favorites kann man diese abgespeicherten Daten aufgelistet sehen