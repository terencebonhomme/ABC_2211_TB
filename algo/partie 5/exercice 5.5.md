# Exercice 5.5

## Pseudo-code

    chaine texte
    chaine alphabet
    tableau entier compteur_alphabet
    
    texte <-- texte d'au moins 150 caractères
    alphabet <-- lettres de l'alphabet

    convertir texte en tableau de caractères
    convertir alphabet en tableau de caractères

    convertir texte en minuscules
    
    pour indice_alphabet de 0 à |alphabet| exclus
        compteur_alphabet[indice_alphabet] <-- 0
        
        pour indice_texte de 0 à |texte| exclus           
            si texte[indice_alphabet] = texte[indice_texte] alors
                compteur_alphabet[indice_alphabet] <-- compteur_alphabet[indice_alphabet] + 1
            fin si
        fin pour

        écrire alphabet[indice_alphabet], " a ", compteur_alphabet[indice_alphabet], " occurences"
    fin pour