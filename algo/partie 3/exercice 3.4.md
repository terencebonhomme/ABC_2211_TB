# Exercice 3.4

## Pseudo-code

    // VARIABLES

    chaîne chaine
    tableau de caractères chaine_caractere
    caractère lettre
    entier nombre_occurrence
    entier i

    i <- 0
    nombre_occurrence <- 0

    // DEBUT PROGRAMME

    écrire "saisir une chaine qui se termine par un point"
    lire chaine

    écrire "saisir une lettre"
    lire lettre

    convertir chaine en tableau de caractères

    si |chaine| = 0 ou |chaine| = 1 et chaine[0] = . alors
        
        écrire "LA CHAINE EST VIDE"

    sinon       

        tant que chaine[i] != .

            si chaine[i] = lettre alors
                nombre_occurrence <- nombre_occurrence + 1
            fin si

        fin tant que

        écrire nombre_occurrence

    fin si

    // FIN PROGRAMME

## Algorigramme

[![](https://mermaid.ink/img/pako:eNqNk91O2zAUx1_F8w1DJG1Ck3RE6iTUZBoS28WKdrGGC5M47dESOzj2oJQ-EM_Bi82Oy5a2IOGbxOfjd_4-x17jnBcUx7is-F2-JEKiqyRjSC_KCmCLjyWw44xZ0w1dAGPGWjw_3Sh5bM2u6yJgIL9wMQc0Qd61se76plwxScWc57kSlOW0i_sfcydA0pkUGj4fPj_lAgRFRy2BFgRSjCItDvTnVgFqKdKo2mwbYryo4cDk0bDHE5QUL7jKsGz-cL_kJZVG1qslK-0T9AD7ktJhbUw_BEpbN60buVpn-NFWfjQHRlyh3t5HVG6FzXXTJmiQ4Y0lmbVD0uw_goDrfrbCO2NP9-U5mn49v_ieonR2hX5eJKkW3gmyg3wbWxJ132GXUNGpEno8MoEy4VKr36qDa_RhX55Zhzk9nVBuPemt7dkOb7Lt3QHTatxL7WNZfnCbTk7sWV8R9D742014x4H_JZvB_KCtqmRvMp3ITuXuRLCDa32NCRT6_a1NmQzLJa11R2L9WxDxO8MZ2-g4oiSfrViOYykUdbBqCiJpAmQhSI3jklStttICJBff7IPu3rWDG8JwvMb3OPaDgR9GgR96Iy8KzyI_cvAKx24QhtpxOjqLxuOx74WjjYMfONdYfxCMg9MojDztDkL_U9DxfnVOI2TzF8cbW38?type=png)](https://mermaid.live/edit#pako:eNqNk91O2zAUx1_F8w1DJG1Ck3RE6iTUZBoS28WKdrGGC5M47dESOzj2oJQ-EM_Bi82Oy5a2IOGbxOfjd_4-x17jnBcUx7is-F2-JEKiqyRjSC_KCmCLjyWw44xZ0w1dAGPGWjw_3Sh5bM2u6yJgIL9wMQc0Qd61se76plwxScWc57kSlOW0i_sfcydA0pkUGj4fPj_lAgRFRy2BFgRSjCItDvTnVgFqKdKo2mwbYryo4cDk0bDHE5QUL7jKsGz-cL_kJZVG1qslK-0T9AD7ktJhbUw_BEpbN60buVpn-NFWfjQHRlyh3t5HVG6FzXXTJmiQ4Y0lmbVD0uw_goDrfrbCO2NP9-U5mn49v_ieonR2hX5eJKkW3gmyg3wbWxJ132GXUNGpEno8MoEy4VKr36qDa_RhX55Zhzk9nVBuPemt7dkOb7Lt3QHTatxL7WNZfnCbTk7sWV8R9D742014x4H_JZvB_KCtqmRvMp3ITuXuRLCDa32NCRT6_a1NmQzLJa11R2L9WxDxO8MZ2-g4oiSfrViOYykUdbBqCiJpAmQhSI3jklStttICJBff7IPu3rWDG8JwvMb3OPaDgR9GgR96Iy8KzyI_cvAKx24QhtpxOjqLxuOx74WjjYMfONdYfxCMg9MojDztDkL_U9DxfnVOI2TzF8cbW38)