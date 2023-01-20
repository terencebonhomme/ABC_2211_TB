# Exercice 6.2

## Pseudo-code

    chaîne texte
    booléen palindrome
    entier moitié

    palindrome = vrai

    si |texte| = 0 alors
        écrire 'LA CHAINE EST VIDE'
    sinon si |texte| = 1 alors
         écrire 'CHAINE D'AU MOINS 2 CARACTERES'
    sinon
        supprimer les espaces de texte

        si |texte| % 2 = 0 alors
            moitié = |texte| / 2 - 1
        sinon
            moitié = (|texte| - 1) / 2
        fin si

        pour i de 0 à moitié faire
            si texte[i] != texte[|texte| - 1 - i] alors
                palindrome <-- faux
            fin si
        fin pour

        si palindrome alors
            écrire 'CE TEXTE EST UN PALINDROME'
        sinon
            écrire 'CE TEXTE N'EST PAS UN PALINDROME'
        fin si
    fin si

## Tests

    AA
    38783
    LAVAL
    LAVAL A ETE A LAVAL
    ET LA MARINE VA VENIR A MALTE

    A10A
    382783
    LAV3AL
    LAVAL4 A ETE A LAVAL
    ET LA MARINE VA VENI5R A MALTE