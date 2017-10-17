# forsikring

Dette er et Maven prosjekt hvor jars for JAX-RS er lagt til. For å oppnå den ønskede @POST fra klienten har det blitt brukt
postman i Chrome. 

Struktur på @POST:
personNummer er en kritisk verdi for at tjenesten skal fungere og forspørselen sendes som Content-Type, JSON.
{
"navn":"Ole Olsen",
"personNummer":"2002198022349"
}

Det er opprettet en lokal database som inneholder 2 kunder, som hver har 2 eksisterende avtaler. På denne måten kan tjenesten testes mht håndtering av kunder og flere avtaler. Antallet avtaler kommer til uttrykk gjennom avtaleId som genereres når forespørselen fra en person som allerede eksisterer i systemet.

eksisterende kunder er:
{
"navn":"Lars Marius Strande",
"personNummer":"2"
}

Dersom samme personnummer blir benyttet vil ikke kunden bli registrert, men kundenummer og eksisterende avtaler vil hentes inn fra den falske databasen.

Brevtjenesten er veldig enkel og har blitt modellert som en system.out til konsollen.
