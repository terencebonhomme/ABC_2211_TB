# Exercice 2

## Pseudo-code

    PROGRAMME

        réel a, b, c

        écrire "saisir a, b et c"
        lire a, b, c

        perimetre_aire_triangle(a, b, c)

    FIN PROGRAMME

    PROCEDURE perimetre_aire_triangle (VAL réel a, VAL réel b, VAL réel c)

        réel p, aire
        
        p <-- a + b + c
        aire <-- ((p/2-a)*(p/2-b)*(p/2-c))^(1/2)

        écrire "p : ", p
        écrire "aire : ", aire

    FIN PROCEDURE