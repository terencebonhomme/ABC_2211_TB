# Exercice 4.3

## Partie 1

### Pseudo-code

    string reponse
    réel distance

    écrire "saisir une distance en kilomètres comprise entre 0.01 et 1000000, q pour terminer"
    lire reponse

    faire
        si réponse != q alors

            distance <-- convertir reponse en réel
            
            si distance >= 0.01 et <= 1000000 alors
                écrire distance / 1.609
            fin si

        fin si
    tant que reponse != "q"

## Partie 2

### Pseudo-code

    string unite

    écrire "saisir une unité de mesure (km ou ml)
    lire unite

    si unite = "" ou unite = "km" alors
        écrire distance / 1.609
    sinon si unite = "ml" alors
        écrire distance * 1.609
    fin si

## Ensemble

### Pseudo-code

    string reponse
    réel distance
    string unite

    écrire "saisir une unité de mesure (km ou ml)
    lire unite

    écrire "saisir une distance comprise entre 0.01 et 1000000, q pour terminer"
    lire reponse

    faire
        si réponse != q alors

            distance <-- convertir reponse en réel
            
            si distance >= 0.01 et <= 1000000 alors
               
            si unite = "" ou unite = "km" alors
                écrire distance / 1.609
            sinon si unite = "ml" alors
                écrire distance * 1.609
            fin si
        fin si
    tant que reponse != "q"