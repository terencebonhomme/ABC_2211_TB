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

[![](https://mermaid.ink/img/pako:eNp9Uk1PAjEQ_SuTXoC4ZMMeN_FggjcxRo0HqYfSDtDYj3XahiDhB_E7-GPusiwBjfTUmb6-N_PyNkx6haxkc-NXcikowuuYO6jPDBfaOe0WfbXfzVIctO3hcAgr0hHHGOQ03-8kaULoPZFfkLAWQSFIYWQyzc0IsH6Nzh36BThvZ4Shl3_8ons8PIzOGN8waWPwG4LQQRMkBxWh1UhHlgsSQqFOHKYhaEGjf5SK60oBpXfqulBxIVScg1oDRMRJu_yUs86GW-gfJ4Ob7usAcig4-z3pM4Zk4jTn7DTqw7mfWbdjBhi7oqiLEKGErEP2OPtjwr1TZwbcVVVaN_unZnmE6JNcIlS-rr-SjhHpwgN0qgnGXLsBy5hFskKrOkWbBsJZXKJFzsr6qgR9csbdtsaJFP3L2klWRkqYsVSp2qGxFk1wWDkXJtRdVDp6mrSxPKQzY5Vw7953mO0P7SfpgA?type=png)](https://mermaid.live/edit#pako:eNp9Uk1PAjEQ_SuTXoC4ZMMeN_FggjcxRo0HqYfSDtDYj3XahiDhB_E7-GPusiwBjfTUmb6-N_PyNkx6haxkc-NXcikowuuYO6jPDBfaOe0WfbXfzVIctO3hcAgr0hHHGOQ03-8kaULoPZFfkLAWQSFIYWQyzc0IsH6Nzh36BThvZ4Shl3_8ons8PIzOGN8waWPwG4LQQRMkBxWh1UhHlgsSQqFOHKYhaEGjf5SK60oBpXfqulBxIVScg1oDRMRJu_yUs86GW-gfJ4Ob7usAcig4-z3pM4Zk4jTn7DTqw7mfWbdjBhi7oqiLEKGErEP2OPtjwr1TZwbcVVVaN_unZnmE6JNcIlS-rr-SjhHpwgN0qgnGXLsBy5hFskKrOkWbBsJZXKJFzsr6qgR9csbdtsaJFP3L2klWRkqYsVSp2qGxFk1wWDkXJtRdVDp6mrSxPKQzY5Vw7953mO0P7SfpgA)

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

[![](https://mermaid.ink/img/pako:eNptUs1qAjEQfpVhLqtlRaieFnooeBFaKG3xUGNh3Iwamk2WbFKx4vvU5_DFml0Vf2oOYZh8f8lkjbmVjBnOtF3mC3Ie3gfCQFxTnitjlJm35G47Db69b3c6HVg65XloyuBfSapQjbu7be6UY0hGHJTW_AMVqUo50AyOVtaAZNAEVbnY_TpOupOTmmOSRx1dizSEc0ROOg-aPD9G7Fgg1agH6MMdvAzj1hA-7wVOrjI2-FO4p6RhXkQBrnwKdT-5aTmyOhQcTb-bItq2-t1e-9K699_6wDszZzhI3PDfn1wkYCPrx58p08YUC3YFKRknta4hAv2CCxaYxVKS-xIozCbiKHj7tjI5Zt4FTjGUMl5ioGjuqMBsRrqKXZbKW_e8H33zA1IsyXxYe8Rs_gD-NrOQ?type=png)](https://mermaid.live/edit#pako:eNptUs1qAjEQfpVhLqtlRaieFnooeBFaKG3xUGNh3Iwamk2WbFKx4vvU5_DFml0Vf2oOYZh8f8lkjbmVjBnOtF3mC3Ie3gfCQFxTnitjlJm35G47Db69b3c6HVg65XloyuBfSapQjbu7be6UY0hGHJTW_AMVqUo50AyOVtaAZNAEVbnY_TpOupOTmmOSRx1dizSEc0ROOg-aPD9G7Fgg1agH6MMdvAzj1hA-7wVOrjI2-FO4p6RhXkQBrnwKdT-5aTmyOhQcTb-bItq2-t1e-9K699_6wDszZzhI3PDfn1wkYCPrx58p08YUC3YFKRknta4hAv2CCxaYxVKS-xIozCbiKHj7tjI5Zt4FTjGUMl5ioGjuqMBsRrqKXZbKW_e8H33zA1IsyXxYe8Rs_gD-NrOQ)

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

[![](https://mermaid.ink/img/pako:eNp9kd1KAzEQhV9lmJttZUtFwYsFL4TeCAqi4oWNwjSZboPZbMkmlFr6QH2OvphJan9EaK6G4ZtzDjkrlK1irHBq2oWckfPwOhIW4ptwra3Vtu6p7WYSfH-3HgwGsHDa8zMpHbrxcLuRTjuG4o2DNoa_oSPdaQeGwdGytaACSHbScDH8OIo4JrXXMEkgw6dEtrmzteFzLgUl4ozJr0L2yOwpIMnIYCj6RHQskBJ1C72ne7jYJfq8ilO-68MQrm8uBf7LmG6PER-KrHJIBNz5EtLuTza2Kv3uVNs-ltiwa0irWMUqIQL9jBsWWMVRkfsSKOw6chR8-7K0EivvApcY5iqmH2mqHTVYTcl0cctK-9Y97rrNFZc4J_vetntm_QPxr6eS?type=png)](https://mermaid.live/edit#pako:eNp9kd1KAzEQhV9lmJttZUtFwYsFL4TeCAqi4oWNwjSZboPZbMkmlFr6QH2OvphJan9EaK6G4ZtzDjkrlK1irHBq2oWckfPwOhIW4ptwra3Vtu6p7WYSfH-3HgwGsHDa8zMpHbrxcLuRTjuG4o2DNoa_oSPdaQeGwdGytaACSHbScDH8OIo4JrXXMEkgw6dEtrmzteFzLgUl4ozJr0L2yOwpIMnIYCj6RHQskBJ1C72ne7jYJfq8ilO-68MQrm8uBf7LmG6PER-KrHJIBNz5EtLuTza2Kv3uVNs-ltiwa0irWMUqIQL9jBsWWMVRkfsSKOw6chR8-7K0EivvApcY5iqmH2mqHTVYTcl0cctK-9Y97rrNFZc4J_vetntm_QPxr6eS)

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

[![](https://mermaid.ink/img/pako:eNqNk8FOwzAMhl_FioTGYNPgOokTXDhwGuIABclL3BGROCVNQIB4oPIafTHSdKyMIURPje18v38neRPSKRJzURr3LO_RB7g8KxjSt6SVZta82ldts4xh3Ien0yk8ex3onKsYFtHezNpGeu0JRlcUtTH0CjXqWnswCLWzlqAyKNuGoI4pSCCdrQKNZrcD0hOqDDMdKe_6nh4UzzmQpzr8JTvSHNrGtx8BXFlSMlVh7maJ_BgJiGFvR30A5xb0evm9TKKR0WCghbaVoc2OQuSG07pPwMna9wHsH8MhIDN1i54ZYAbHR0fjQvyGPk2zcZHVL_Ccqnfoa-qsY95lqS1yHt2PhofZbY4In0hCZBhGV_deUv0Etv2Ndo5mp-t_KchsqG06DRhE1j63VIhVdxVLzWMxEZa8Ra3SvX3rSgoR7skm2_P0q9A_FKLg91SHMbjFC0sxDz7SRMRKpRGfaVx5tGJeoqlTlJQOzl_0DyG_h4mokK-d-6p5_wQIJxrQ?type=png)](https://mermaid.live/edit#pako:eNqNk8FOwzAMhl_FioTGYNPgOokTXDhwGuIABclL3BGROCVNQIB4oPIafTHSdKyMIURPje18v38neRPSKRJzURr3LO_RB7g8KxjSt6SVZta82ldts4xh3Ien0yk8ex3onKsYFtHezNpGeu0JRlcUtTH0CjXqWnswCLWzlqAyKNuGoI4pSCCdrQKNZrcD0hOqDDMdKe_6nh4UzzmQpzr8JTvSHNrGtx8BXFlSMlVh7maJ_BgJiGFvR30A5xb0evm9TKKR0WCghbaVoc2OQuSG07pPwMna9wHsH8MhIDN1i54ZYAbHR0fjQvyGPk2zcZHVL_Ccqnfoa-qsY95lqS1yHt2PhofZbY4In0hCZBhGV_deUv0Etv2Ndo5mp-t_KchsqG06DRhE1j63VIhVdxVLzWMxEZa8Ra3SvX3rSgoR7skm2_P0q9A_FKLg91SHMbjFC0sxDz7SRMRKpRGfaVx5tGJeoqlTlJQOzl_0DyG_h4mokK-d-6p5_wQIJxrQ)

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

[![](https://mermaid.ink/img/pako:eNplkcFqwzAMhl_F6NIVGnoP7BDTyw67bL0lOyixkoolTpBtyih9oD5HX2zOMmg2-2DMr88_v6QLNKMhyKHtx3NzQvHqeKisiqemjq1l2z2Z-60OfrvIWZaps7CnFzsFX5T7-60RFlIbh-xYVLHZfzxQITQR6meiWBceHjr10ImH_vXQ6wI6x5090jCVPl7qWWFSLUqMep3ouqyjPn_7H-qNXOjXnaW5F2QV_E8ssmYeW8t2CzsYSAZkE2d8mZEK_IkGqiCPT4PyWUFlr5HD4Mf3L9tA7iXQDsJk0NOBsRMcIG-xd1Elw36U12VpP7u7fgMTtpFt?type=png)](https://mermaid.live/edit#pako:eNplkcFqwzAMhl_F6NIVGnoP7BDTyw67bL0lOyixkoolTpBtyih9oD5HX2zOMmg2-2DMr88_v6QLNKMhyKHtx3NzQvHqeKisiqemjq1l2z2Z-60OfrvIWZaps7CnFzsFX5T7-60RFlIbh-xYVLHZfzxQITQR6meiWBceHjr10ImH_vXQ6wI6x5090jCVPl7qWWFSLUqMep3ouqyjPn_7H-qNXOjXnaW5F2QV_E8ssmYeW8t2CzsYSAZkE2d8mZEK_IkGqiCPT4PyWUFlr5HD4Mf3L9tA7iXQDsJk0NOBsRMcIG-xd1Elw36U12VpP7u7fgMTtpFt)

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
    entier i
    booléen est_premier 

    lire n 

    est_premier <-- vrai

    pour i = 2 à n - 1

        si n mod i = 0 alors 
            est_premier <-- faux
        fin si 

        i <-- i + 1 

    fin pour 

    si est_premier alors
        écrire "n est un nombre premier"
    sinon
        écrire "n n'est pas un nombre premier"
    fin si

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

### Exercice 3.3

    tableau entier t
    entier n
    entier i
    booléen figure

    i <-- 0
    figure <-- faux

    lire n

    tant que 

        si i < |t| alors

            si t[i] = n alors                
                figure = vrai
                i <-- |t|
            fin si
            
        fin si        

        i <-- i + 1    

    fin tant que 

    si figure = vrai alors
        écrire figure
    sinon
        écrire "404 Not found"
    fin si

### Exercice 3.4

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

#### tests

    chaine = ""
    chaine = "."
    chaine = "BCD."
    chaine = "ABC."
    chaine = "ABACD."