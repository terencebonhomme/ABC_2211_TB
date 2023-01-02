# Algorithmes Exercices #1 

## Partie 1 

### Exercice 1.1 

    entier nombre1 
    entier nombre2 
    réel moyenne 

    écrire “Programme de calcul de la moyenne de 2 nombres.” 

    écrire “Veuillez saisir un premier nombre” 
    lire nombre1 

    écrire  “Veuillez saisir un second nombre” 
    lire nombre2 

    moyenne <-- (nombre1 + nombre2) / 2 

    écrire “La moyenne de “, nombre1, “ et “, nombre2, “ est : “, moyenne 
    écrire "Appuyez sur une touche pour quitter.” 

### Exercice 1.2 

    réel aire 
    réel rayon  
    réel volume

    écrire “Veuillez saisir le rayon de la sphère” 
    lire rayon 

    aire <-- 4 * PI * rayon^2
    écrire “L’aire de la sphère est “, aire

    volume <-- (4/3) * PI * rayon^3
    écrire “Le volume de la sphère est “, volume 

### Exercice 1.3 

    réel aire 
    réel rayon 
    réel angle 

    écrire “Veuillez saisir le rayon du cercle” 
    lire rayon 

    écrire “Veuillez saisir l’angle du cercle” 
    lire angle 

    aire <-- (PI * rayon^2 * angle) / 360 
    écrire “L’aire du cercle est “, aire 

### Exercice 1.4 

    réel somme 
    réel interet 
    entier annee 
    entier compteur 

    compteur <-- 0 

    écrire “Veuillez saisir la somme placée sur le compte” 
    lire somme  

    écrire “Veuillez saisir le nombre d’années de placement de la somme” 
    lire annee 

    écrire “Veuillez saisir l’intérêt offert par la banque” 
    lire interet 

    sommeIntSimple = somme * (1 + annee * interet/100)
    sommeIntCompose = somme * (1 + interet/100)^annee

    écrire "La somme avec un intérêt simple est", sommeIntSimple, " et la somme avec un intérêt composé est ", sommeIntCompose

### Exercice 1.5 

    entier a 
    entier b 
    entier temp 

    écrire “Veuillez saisir la valeur de a” 
    lire a 

    écrire “Veuillez saisir la valeur de b” 
    lire b 

    écrire  “La valeur de a est “, a 
    écrire  “La valeur de b est “, b 

    temp <-- b 
    b <-- a 
    a <-- temp

    écrire  “La valeur de a est “, a 
    écrire  “La valeur de b est “, b 

## Partie 2 

## Exercice 2.1 

    entier a 

    lire a 

    si a < 0 alors 

        écrire "Vous n'êtes pas encore né" 

    sinon 

        si a < 18 alors 
            écrire “Vous êtes mineur” 
        sinon 
            écrire “Vous êtes majeur” 
        fin si 

    fin si 


### Exercice 2.2 

    entier a 
    entier b

    écrire "Saisir A"
    lire a
    écrire "Saisir B"
    lire b 

    si a < b alors 
        écrire a, “, “, b 
    sinon 
        écrire b, “, “, a 
    fin si 


### Exercice 2.3 

    réel a 
    réel b 
    réel c 

    si a < b alors 

        si a < c alors 

            si c < b alors
                écrire a, “, “, c, “, “, b 
            sinon
                écrire a, “, “, b, “, “, c 
            fin si

        sinon 
            écrire c, “, “, a, “, “, b
        fin si

    sinon 

        si a < c alors 
            écrire b, “, “, a, “, “, c 
        sinon

            si c < b alors
                écrire c, “, ”, b, “, ”, a
            sinon
                écrire b, “, ”, c, “, ”, a
            fin si             
            
        fin si	

    fin si 

### Exercice 2.4 

    lire a 

    si a % 4 != 0 alors 

        écrire “Non bissextile” 

    sinon  

        si a % 100 = 0 alors 

            si a % 400 != 0 alors 
                écrire “Bissextile” 
            sinon 
                écrire “Non bissextile”
            fin si

        sinon 

            écrire “Non bissextile”	
             
        fin si 

    fin si 

### Exercice 2.5 

    lire n 

    pour i = n – 1 à 2

        si n % i = 0 alors 
            écrire i, “ est un diviseur de ”, n 
        fin si 

        i <-- i - 1 

    fin pour 

### Exercice 2.6 

    entier n 
    entier est_premier 

    lire n 

    est_premier <-- 0 

    pour i = n – 1 à 2 

        si n % i = 0 alors 
            écrire “i” 
        fin si 

        i <-- i - 1 

    fin pour 

### Exercice 2.7 

    réel distance_km 
    réel distance_miles 
    chaîne reponse

    reponse <-- ""

    tant que reponse != q

        écrire "Saisir une distance entre 0.01 et 1000000"
        lire distance_km

        si(distance_km >= 0.01 et distance_km <= 1000000 alors
            écrire distance_km / 1.609
        sinon
            écrire "La valeur doit être comprise entre 0.01 et 1000000"
        fin si

        écrire q pour quitter, autre pour continue
        lire reponse

    fin tant que

## Partie 3

### Exercice 3.1 

    entier N 
    entier essai 
    entier choix 

    essai <-- 0 

    N <-- RANDOM(0,100) 

    faire 

        écrire “deviner le nombre mystère” 
        lire choix 

        essai <-- essai + 1 

        si choix != N alors 

            si choix < N alors 
                écrire “plus petit” 
            sinon 
                écrire “plus grand” 
            fin si 

        fin si 

    tant que N != choix 

    écrire “Bravo vous avez trouvé en ”, essai ,” essais” 

### Exercice 3.2 

    entier S 
    entier magasin 

    magasin <-- 0 

    lire S 

    tant que S > 0 

        si  S = 1 alors 
            S <-- 0 
        sinon 
            S <-- S / 2 - 1 
        fin si 

        magasin <-- magasin + 1	 

    fin tant que 

    écrire magasin 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 

 