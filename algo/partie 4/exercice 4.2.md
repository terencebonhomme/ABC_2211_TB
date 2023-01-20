# Exercice 4.2

## Pseuco-code

    entier n
    entier compteur
    entier somme
    entier nombre

    nombre <-- 2

    écrire "Programme de recherche des nombres parfaits."

    écrire "Combien de nombre parfaits souhaitez-vous afficher ?"
    lire n

    pour compteur de 0 à n faire
        somme <-- 0
        diviseur <-- 1

        tant que diviseur <= nombre/2 faire
            si nombre mod diviseur = 0 alors
                somme <-- somme + diviseur                
            fin si

            diviseur <-- diviseur + 1
        fin tant que

        si somme = nombre alors 
            compteur <-- compteur + 1
        fin si
    fin pour