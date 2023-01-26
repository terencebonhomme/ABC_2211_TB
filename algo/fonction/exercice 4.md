# Exercice 4

## Pseudo-code

    BOOLEAN FONCTION bissextile (VAL entier annee)

        lire annee

        si annee mod 4 != 0 alors 

            RETOURNE faux

        sinon  

            si annee mod 100 = 0 et annee mod 400 != 0 alors 

                RETOURNE vrai

            sinon 

                RETOURNE faux
                
            fin si 

        fin si 
        
    FIN FONCTION
