# BeadGame2.0

    Disclaimer
    
    A program egyes részei nem a saját tulajdonomat képezik, ezek Easter eggek képében jelennek meg a játékban

    Rövid leírás

Egy Java frame-ban készült "gomb nyomogatós játék"  történettel, és egyebekkel. 
(EREDETI README -> BeadGame2.0DEV-README.txt)

    A programról:

A program maga panelekből épül fel, melyeket egymásra helyezve card layout-tal változtatja a játék helyzetét.
XML fájlba menti a karaktereket, a hozzájuk tartozó NPC-ket, illetve XML-ből olvassa be az ellenfeleket.

    Login / avagy belépés panel

3 Gomb áll elérhetően
    •	Load
    •	New
    •	Exit

    Exit

Értelem szerűen kilépni az exit, vagy a jöbb felső sarokban található X-el lehet.

    New

A New gomb egy új karakter létrehozására szolgál, ezt megnyomva behozza a karakter
kreáció panelt:
    •	Karakter neve
    •	Karakter neme

A két opció kitöltésével és a Create gombra kattintással létrehozunk egy új karaktert,
melynek nevét és nemét mi állítjuk be, minden egyéb tulajdonságát alapbeállításokra helyezi a program.
Értelem szerűen a Cancel nullázza a beadott adatokat, nem kreál karaktert.

    (Akkor működik a mentés, ha a megadott nevű karakter még nem létezik, név alapján ellenőriz a program és összeakadást
    okozhat 2 ugyan olyan)

    Load

A játék betöltésére szolgáló gomb, megnyomásakor behozza a load panelt, melyen a karakterek listája,
betöltendő karakter kiválasztása, és betöltése, vagy törlése lehetséges

Betöltéshez kiválasztod a karaktert a legördülő listából,
Törléshez szintén, de kipipálod a törlés szándékát jelző kockát, és delete gombra kattintva kitörli.

Cancel-lel vissza lehet menni a login panelre.

Betöltéskor a kiválasztott karaktert, és a hozzá tartozó npc-ket tölti be.

    Game / játék panel
    
Jobb felső sarokban jelzi a játékos adatait, alatta 3 gomb található:
    •	List Enemy
    •	Save
    •	Exit

    List Enemy

Az ellenfelek leírását tartalmazó lista megjelenítése

    Save

Manuális mentése a játéknak 

    Exit

Visszalépés a login panelre, automatikus mentés

    Questek

A game/játék panel bal szélén találhatóak, 5 darab van, mindegyikhez 3-3 külön ellenféllel (összesen 15)

A küldetések szinthez kötöttek, lehet hogy néhol, a JFrame egyes hibái miatt nem megfelelően játszódik le a harc, de teljesíthetőek

Egy új, várost jelző gomb is bekerült (Mashiria) 9 további NPC-vel

Ezeket a Questeket a középen található térképről is eléri a játékos.

    Questek - Harc

Külön panelen játszódik, ahol láthatjuk a (karakter neméhez illő) karakterünket, ellenfelünket, a hozzájuk tartozó adatokat

Karakter adatainál található a gyógyításra szánt heal gomb (mindig 100-ba kerül először majd növekszik)

HIT gomb - behozza a támadás panelét, ahova eredetileg egy light és charged támadás volt tervezve, viszont jelenleg így maradt meg,
A támadás gombot nyomva tudjuk sebezni az ellenfelet, aki ha nem hal meg közben, akkor vissza is támad, ha valamelyik fél, ahhoz
Megfelelően visszatér a játék a game panelhez

RUN gomb - visszavonulást fújsz vele...

    Questek - Város

Mashiria, mily nem túl gyönyürű, hajnalok hajnalán fáradtságomban kitalált név...

15-ös szinttől elérhető, az npc-k egy része pedig szintén szinthez kötött

9 NPC-t tartalmaz:
    •	3 Q&A npc
    •	5 Quest npc
    •	1 Mystery minigame

    Q&A npc-k

Egy kérdést kell megválaszolni

    Quest npc-k

Egy adott küldetést kell újra megcsinálni

Minden npc küldetése/egyebe egyszer teljesíthető, kivéve a minigame

    A játékban található illusztrációk (ismétlem nem a saját tulajdonaim) saját kézzel lettek rajzolva/átrajzolva
    Egyik - másik pedig Easter egg-ként is szerepel