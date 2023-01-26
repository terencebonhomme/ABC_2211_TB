# 2 Plus grand entier dans un tableau

## Pseudo-code

### main

     PROGRAMME

        tableau d'entiers nombres

        nombres <-- {1, 2, 9, 4}

        écrire max(nombres)        

    FIN PROGRAMME

### max

    entier FONCTION max (VAL tableau d'entiers nombres)

        entier max

        max <-- -1

        pour i de 0 à |nombres| alors
            
            si nombres(i) > max alors
                max = nombre(i)
            fin si

        fin pour

        RETOURNER max
        
    FIN FONCTION