# 4 Vengeance de la fourchette

## Pseudo-code

### Programme

    PROGRAMME

        chaîne gagnant

        gagnant = jeu()
        
        écrire "le vainqueur est ", gagnant
    
    FIN PROGRAMME

### Jeu

    chaîne FONCTION jeu ()

        entier nombre, min, max
        booléen quitter
        chaîne joueur

        min <-- 0
        max <-- 100
        quitter <-- faux
        nombre <-- générer un nombre aléatoire
        premier <-- determinerPremier()

        faire

            si joueur = "humain" alors

                écrire "nombre entre", min, " et ", max
                lire essai

            sinon
                
                essai <-- jouer()

            fin si

            si essai = nombre alors

                retourner joueur

            sinon si essai < nombre

                min <-- essai + 1                
                
            sinon

                max <-- essai - 1

            fin si

        tant que quitter = faux

    FIN FONCTION


### Jouer

    entier FONCTION jouer ()
        
        retourner générer un nombre aléatoire
                
    FIN FONCTION

### Determiner le premier

    entier FONCTION determinerPremier ()
        
        entier nombre_aleatoire

        nombre_aleatoire <-- générer un nombre aléatoire 0 ou 1

        si nombre_aleatoire = 0 alors
            retourner "humain"
        sinon
            retourner "ordinateur"
        fin si
                
    FIN FONCTION