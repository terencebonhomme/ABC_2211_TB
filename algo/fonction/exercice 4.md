# Exercice 4

## Pseudo-code

    PROGRAMME

        entier annee

        écrire "saisir annee"
        lire annee

        si bissextile alors
            écrire "annee bissextile"
        sinon
            écrire "annee non bissextile"
        fin si

    FIN PROGRAMME

    BOOLEAN FONCTION bissextile (VAL entier annee)

        RETOURNE annee mod 4 == 0 && (annee mod 100 != 0 || annee mod 400 == 0)
        
    FIN FONCTION
