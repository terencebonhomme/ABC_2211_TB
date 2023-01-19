# Exercice 4.1

## Pseudo-code

    entier n 
    entier i
    booléen est_premier 

    est_premier <-- vrai

    écrire "saisir un nombre"
    lire n    

    si n = 0 ou n = 1 alors
        est_premier <-- faux
    fin si

    pour i = 2 à n - 1

        si n mod i = 0 et est_premier alors
            est_premier <-- faux
        fin si

        i <-- i + 1

    fin pour 

    si est_premier alors
        écrire "n est un nombre premier"
    sinon
        écrire "n n'est pas un nombre premier"
    fin si

## Algorigramme

[![](https://mermaid.ink/img/pako:eNp9U8tu2zAQ_BWClzSobOvl2BLSntKDDzEKNKdaRkGLlLOotXQpqkkq6IPyHfmxkpJgC1IcXUTM7gxnVtqKppILGtPsIJ_SR6Y0ebhLkJjnSYEW3xXkYl3mO6E2s7fXVIES5AodIgpNSiQo851BjkrkINRs26Ou5UUyXln6kRWXJQBTAwjUqw2QLwTIZ6-rCOSA-08Z4HWCLbQTe0C0KH973ZX62oJtaTKZEFYUsMdV0fdjDPzqrjTyfxWD7YjQ3Oz3cCUYX29mB5sDZ70CZN_-lOzgVmgYLpElsQev7kw0gboW02_qYF5fu3saWwNDGSuft00PZCvM1k3PBTWUOOysgNwaC0KTnmxNzmM565zVe8Ygu5d8ZdLkkhM7BbceEFuy7boQyH83Uat--rYfaZ5ivdN9xkYzOkUcROvkIGsH1J9Lf6yjUQzXoPne7T844vVcj1dgRLR_L3VoLlTOgJsdrCyeUP1ooiU0NkfO1O-EJlibPlZq-eMFUxprVQqHlkfOtLgDtlcsp3HGDoVBBQct1X271M1uO_TIkMYVfaax5y6mc28ZLKPQ94Mwcn2HvtDY96bBMnRvwsXCdaObeRTUDv0npZH1pm5oCGEYzQNz8MOw0fvZFK2R-j_vJFA3?type=png)](https://mermaid.live/edit#pako:eNp9U8tu2zAQ_BWClzSobOvl2BLSntKDDzEKNKdaRkGLlLOotXQpqkkq6IPyHfmxkpJgC1IcXUTM7gxnVtqKppILGtPsIJ_SR6Y0ebhLkJjnSYEW3xXkYl3mO6E2s7fXVIES5AodIgpNSiQo851BjkrkINRs26Ou5UUyXln6kRWXJQBTAwjUqw2QLwTIZ6-rCOSA-08Z4HWCLbQTe0C0KH973ZX62oJtaTKZEFYUsMdV0fdjDPzqrjTyfxWD7YjQ3Oz3cCUYX29mB5sDZ70CZN_-lOzgVmgYLpElsQev7kw0gboW02_qYF5fu3saWwNDGSuft00PZCvM1k3PBTWUOOysgNwaC0KTnmxNzmM565zVe8Ygu5d8ZdLkkhM7BbceEFuy7boQyH83Uat--rYfaZ5ivdN9xkYzOkUcROvkIGsH1J9Lf6yjUQzXoPne7T844vVcj1dgRLR_L3VoLlTOgJsdrCyeUP1ooiU0NkfO1O-EJlibPlZq-eMFUxprVQqHlkfOtLgDtlcsp3HGDoVBBQct1X271M1uO_TIkMYVfaax5y6mc28ZLKPQ94Mwcn2HvtDY96bBMnRvwsXCdaObeRTUDv0npZH1pm5oCGEYzQNz8MOw0fvZFK2R-j_vJFA3)
