# 3 Divisible

## Pseudo-code

### main

    PROGRAMME

        écrire "saisir a et b"
        lire a, b

        si estDivisible(a;b) alors
            écrire a, " est divisible par ", b
        sinon
            écrire a, " n'est divisible par ", b
        fin si
    
    FIN PROGRAMME

### estDivisible

    booleen FONCTION estDivisible (VAL entier a, VAL entier b)

        si a mod b = 0 alors
            retourner vrai
        sinon            
            retourner faux
        fin si
        
    FIN FONCTION