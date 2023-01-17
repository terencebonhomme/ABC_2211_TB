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

[![](https://mermaid.ink/img/pako:eNp1kc9Kw0AQh19l2EsttERvEkRQeq0XRcGmh2l2kk5tZspmF5HSB6qvkRdzt_EPWruXLL_f8H1sZmtKtWRyU631tVyi8_AwKQTiWVDNIiz1me32i-CHfTwej8ER2puaZtmaHQHWlM1_Sq7u9FadbGMOV3C-66uvOM6ABo6fa_BLkifHnvpqlnX70iXk4FFDCzLo3j21sMEWSEqNhXT7QTZPvGOqqCQoV1MWdZ_6i8tv_yH-V39oZhn81vfyhoWCS9L0OBKb_kjFMjzCRv8fLK5OY3GVsHCKa0amIdcg27icbcoKE8ENFSaPV4vupTCF7OIcBq_3b1Ka3LtAIxM2Fj1NGGuHjckrXLcxJcte3bTf9mHpI7NBeVb9mtl9AD1irr4?type=png)](https://mermaid.live/edit#pako:eNp1kc9Kw0AQh19l2EsttERvEkRQeq0XRcGmh2l2kk5tZspmF5HSB6qvkRdzt_EPWruXLL_f8H1sZmtKtWRyU631tVyi8_AwKQTiWVDNIiz1me32i-CHfTwej8ER2puaZtmaHQHWlM1_Sq7u9FadbGMOV3C-66uvOM6ABo6fa_BLkifHnvpqlnX70iXk4FFDCzLo3j21sMEWSEqNhXT7QTZPvGOqqCQoV1MWdZ_6i8tv_yH-V39oZhn81vfyhoWCS9L0OBKb_kjFMjzCRv8fLK5OY3GVsHCKa0amIdcg27icbcoKE8ENFSaPV4vupTCF7OIcBq_3b1Ka3LtAIxM2Fj1NGGuHjckrXLcxJcte3bTf9mHpI7NBeVb9mtl9AD1irr4)

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

[![](https://mermaid.ink/img/pako:eNqFks9uwjAMxl8l8oUhteq9myZRwYHDtAM7jXBwGxeitU5nEqEJ8UA8By-2QMefiQM5RfbP32fH2ULlDEEOdeM21QrFq4-xZhVPSUvLbHn5ZA77MvhhH07TVG3EeppyF_xonh32lVghNVijXVtRo0G2uKJCaCLUHInRbeKqUdxrFHcaxZ9GkS1i9Jqz9ZRrEuuk2KJ6UeWuz93Ez3hfolywafqq_Ir4gswzDZceMFHPiSoHGqLXbWmqiM3xQWrLwwc27LivaNY0C90JeZfJd8Dmn1l5MsMHZpBAS9KiNXFV2yOmIQ7QkoY8Xg3KlwbNu8hh8G72wxXkXgIlEDqDnsYWl4It5DXGhhIgY72Tt373py-QQIf86dyZ2f0CvBynpA?type=png)](https://mermaid.live/edit#pako:eNqFks9uwjAMxl8l8oUhteq9myZRwYHDtAM7jXBwGxeitU5nEqEJ8UA8By-2QMefiQM5RfbP32fH2ULlDEEOdeM21QrFq4-xZhVPSUvLbHn5ZA77MvhhH07TVG3EeppyF_xonh32lVghNVijXVtRo0G2uKJCaCLUHInRbeKqUdxrFHcaxZ9GkS1i9Jqz9ZRrEuuk2KJ6UeWuz93Ez3hfolywafqq_Ir4gswzDZceMFHPiSoHGqLXbWmqiM3xQWrLwwc27LivaNY0C90JeZfJd8Dmn1l5MsMHZpBAS9KiNXFV2yOmIQ7QkoY8Xg3KlwbNu8hh8G72wxXkXgIlEDqDnsYWl4It5DXGhhIgY72Tt373py-QQIf86dyZ2f0CvBynpA)

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

[![](https://mermaid.ink/img/pako:eNqNk89OhDAQxl-lmcu6CWQj_jkQY6K7Fw9e1JPWQ2kL2wjtpluyMYQH2ufYF7MUiAUDay8lM19_882UVkAV4xBDmqsD3RJt0NsGS2RXwjMhpZDZBTsdk9Is23AYhkikD08yfawIukNJ3ca7mM0jVQq73XehtZPRTtYiGkmrWDsQ9UD9Gua8QwctDH_h-zI3lx8rDKcj1UJztCABogFKFhhWn84nl6zxnwq5PMeWSrojHjwawxPLn4F37U7QrgY065PMW_Xm2dO6AtGfgfYJf_he6etB6cSVpmem5CN_67upRXPXNeXhZtx-Y-P_NxVNTPV23BqdwjYwCKDguiCC2T--agphMFtecAyx_WREf2HAsrY6Uhr1-i0pxEaXPIByx4jhG0EyTQqIU5LvbZQzYZR-bp-Qe0kB7Ih8V6rX1D9N_gGW?type=png)](https://mermaid.live/edit#pako:eNqNk89OhDAQxl-lmcu6CWQj_jkQY6K7Fw9e1JPWQ2kL2wjtpluyMYQH2ufYF7MUiAUDay8lM19_882UVkAV4xBDmqsD3RJt0NsGS2RXwjMhpZDZBTsdk9Is23AYhkikD08yfawIukNJ3ca7mM0jVQq73XehtZPRTtYiGkmrWDsQ9UD9Gua8QwctDH_h-zI3lx8rDKcj1UJztCABogFKFhhWn84nl6zxnwq5PMeWSrojHjwawxPLn4F37U7QrgY065PMW_Xm2dO6AtGfgfYJf_he6etB6cSVpmem5CN_67upRXPXNeXhZtx-Y-P_NxVNTPV23BqdwjYwCKDguiCC2T--agphMFtecAyx_WREf2HAsrY6Uhr1-i0pxEaXPIByx4jhG0EyTQqIU5LvbZQzYZR-bp-Qe0kB7Ih8V6rX1D9N_gGW)

[![](https://mermaid.ink/img/pako:eNqNk8tygjAUhl8lczatM6hcAgjTunLbVbtq6SKEqJlKcNIw1jI8kM_hizVcHBGsLRvCOT_fxwFSAM0SBiEsN9mOrolU6GURCaQPvrQKgh5QjJhC1YJWC1pVylPCvpqYP3YiTjeiO1couKg7NzHuRabPaVJMJFys7pdcjE6lmK24EFU1OR7iXI1QUx-Px9WAzUU7rS6iLOf6NEc7yRWz3qYRHA9UcsnQHTEQNVB8F8H0vb6_0Q0QIhMt3j732tc1UNh9Rawtvys6mLPGuey3r32gci5UehRyc5oe6qzDw0z7GQdKfKGMayX9W9nBnbXu9Vz7dwzUbn_ayv4_dQd50tdIrz8NvYI8AcCAlMmU8ERvrqISRaDWLGURhHqZEPkRQSRKnSO5yp73gkKoZM4MyLcJUWzByUqSFMIl2XzqKku4yuRTs1vrTWvAlggIC_iC0PKDiYmxH8x82_ZMx7QN2EPoWhPL8_DMdUzfMwM3KA34zjJNNSc-DrA1s12MncAKsF_jXutm9RzlD4AWGGA?type=png)](https://mermaid.live/edit#pako:eNqNk8tygjAUhl8lczatM6hcAgjTunLbVbtq6SKEqJlKcNIw1jI8kM_hizVcHBGsLRvCOT_fxwFSAM0SBiEsN9mOrolU6GURCaQPvrQKgh5QjJhC1YJWC1pVylPCvpqYP3YiTjeiO1couKg7NzHuRabPaVJMJFys7pdcjE6lmK24EFU1OR7iXI1QUx-Px9WAzUU7rS6iLOf6NEc7yRWz3qYRHA9UcsnQHTEQNVB8F8H0vb6_0Q0QIhMt3j732tc1UNh9Rawtvys6mLPGuey3r32gci5UehRyc5oe6qzDw0z7GQdKfKGMayX9W9nBnbXu9Vz7dwzUbn_ayv4_dQd50tdIrz8NvYI8AcCAlMmU8ERvrqISRaDWLGURhHqZEPkRQSRKnSO5yp73gkKoZM4MyLcJUWzByUqSFMIl2XzqKku4yuRTs1vrTWvAlggIC_iC0PKDiYmxH8x82_ZMx7QN2EPoWhPL8_DMdUzfMwM3KA34zjJNNSc-DrA1s12MncAKsF_jXutm9RzlD4AWGGA)

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

[![](https://mermaid.ink/img/pako:eNptUktuwjAQvYo7G4oUwAkhP6ldVGzppt20pAuDJ2CV2Mg4AhpxIM7BxeokAvGJN47nzftMNCXMFUdIIFup7XzJtCGf41QSe7ZaGHxXb2KzwZ0RK5wOTse5FhpJRypJZhegM_i5orQSWppRciEXz5mQ3VQ2pRkuhJRVlZ-Os8J0m3Kv1yMaGf9CpqeDVSXIpEQ8K1W4yCaK-yUjueLEJ08vhB4atDoNahuJKoS9Xh-nq1WaTG28auKLj0tpWSeo3eyL3NpdqBV0ZdrI3ZDt6z7srfmtwt0fbg3dxj_HfxgbHMhR50xwuwRlJZKCWWKOKST2kzP9m0IqD7aPFUZ97OUcEqMLdKBYc2ZwLNhCsxySjK02topcGKUnzVbVy-XAmklISthB4oZxn_p-GEeh5wV0SD0H9pCM3L4bBH40GtIwoPEoPjjwp5RVpf3Qj3038kZREARx7Hm13HcN1paHf3C21Qs?type=png)](https://mermaid.live/edit#pako:eNptUktuwjAQvYo7G4oUwAkhP6ldVGzppt20pAuDJ2CV2Mg4AhpxIM7BxeokAvGJN47nzftMNCXMFUdIIFup7XzJtCGf41QSe7ZaGHxXb2KzwZ0RK5wOTse5FhpJRypJZhegM_i5orQSWppRciEXz5mQ3VQ2pRkuhJRVlZ-Os8J0m3Kv1yMaGf9CpqeDVSXIpEQ8K1W4yCaK-yUjueLEJ08vhB4atDoNahuJKoS9Xh-nq1WaTG28auKLj0tpWSeo3eyL3NpdqBV0ZdrI3ZDt6z7srfmtwt0fbg3dxj_HfxgbHMhR50xwuwRlJZKCWWKOKST2kzP9m0IqD7aPFUZ97OUcEqMLdKBYc2ZwLNhCsxySjK02topcGKUnzVbVy-XAmklISthB4oZxn_p-GEeh5wV0SD0H9pCM3L4bBH40GtIwoPEoPjjwp5RVpf3Qj3038kZREARx7Hm13HcN1paHf3C21Qs)

### Exercice 2.5 

    lire n 

    pour i = n – 1 à 2

        si n % i = 0 alors 
            écrire i, “ est un diviseur de ”, n 
        fin si 

        i <-- i - 1 

    fin pour 

[![](https://mermaid.ink/img/pako:eNpdkc9O4zAQxl9lNBeoSNskpEkTLZwQEgf2AHui6cHEbhltM64chz8b5YF4jr7YOjHadvHF1u_7_M3Y02GlpcICNzv9Vr0IY-HXTcnglmJJvD3fEE9K9uhZbYl5oPLw-dzaicfT6RRE09CW71YEVxCvj9woIX-u5jsyCnh-ItDmVpuO4Adw7-lInAa6JbddO3Cv5V3HUGsJQ3DYg7f6kH_GIxzWmyGrHlTT7uxqfviszFD7jAJQjYWWQdIrNao1IFUAfDZff7s_lubKqFqx9S8iuIBo_dWU6_K_LljzqPgPO0q-_VPHMfU0qmQMsFamFiTdJLohoUT74pwlFu4ohfldYsm984nW6scPrrCwplUBtnsprLohsTWixmIjdo2jSpLV5t6PdpxwgHvBWHT4jkWU5bMwSbJ8mcVxGl6GcYAfWCyiWZSmyXJxGWZpmC_yPsA_WrvUcJYleRIt48UyTdM8j-Mx7mkUx5L9X8WBqo0?type=png)](https://mermaid.live/edit#pako:eNpdkc9O4zAQxl9lNBeoSNskpEkTLZwQEgf2AHui6cHEbhltM64chz8b5YF4jr7YOjHadvHF1u_7_M3Y02GlpcICNzv9Vr0IY-HXTcnglmJJvD3fEE9K9uhZbYl5oPLw-dzaicfT6RRE09CW71YEVxCvj9woIX-u5jsyCnh-ItDmVpuO4Adw7-lInAa6JbddO3Cv5V3HUGsJQ3DYg7f6kH_GIxzWmyGrHlTT7uxqfviszFD7jAJQjYWWQdIrNao1IFUAfDZff7s_lubKqFqx9S8iuIBo_dWU6_K_LljzqPgPO0q-_VPHMfU0qmQMsFamFiTdJLohoUT74pwlFu4ohfldYsm984nW6scPrrCwplUBtnsprLohsTWixmIjdo2jSpLV5t6PdpxwgHvBWHT4jkWU5bMwSbJ8mcVxGl6GcYAfWCyiWZSmyXJxGWZpmC_yPsA_WrvUcJYleRIt48UyTdM8j-Mx7mkUx5L9X8WBqo0)

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

[![](https://mermaid.ink/img/pako:eNp9U8tu2zAQ_BWClzSoHOtVP4Qkp_TgQ4wC7amWUdAi5SxiLR2KapIK-qB8R36sFCVYghRHFwmzO8OZ1bKkieSCRjQ9yOfkgSlNft3FSMzzrECLHwoysS6ynVCb6ftbokAJcoEOEbkmBRKU2c4gRyUyEGq67VHX8iwZL2r6keXnJQATAwjUqw2QGwLkq9dWBHLA_ZcU8DLGBtqJPSDWKH9_2xX6sgab0mQyISzPYY-rvO_HGPjTHmnk_yoG2xHBnuz3cCUYX2-mhzoHTnsFSL8_FezglmgYbtWebXO0FdNGZAHmddvKWzcDHykrXra2B9IVpmvbc0YNJQ47SyDXBInQpCdbkW4anU6n3jMG6b3kKxMik5zAMEpHrrvOBPI_TNSon37pZ5qnWB90d9hoRqeIg2itHKTNgPpz6Y91NIrh9tvf3KzeiNdzPd78EbFeWurQTKiMATdXr6zxmOoHEy2mkfnkTD3GNMbK9LFCy5-vmNBIq0I4tDhypsUdsL1iGY1SdsgNKjhoqe6bu2yvtEOPDGlU0hcaeX5w5YfzwA3D0A1m7nzh0FcaTRYGNuh85n9bLr1ZUDn0n5RG1btyQ28RhL67CPz5MrRiv22pdlH9B4ESTU4?type=png)](https://mermaid.live/edit#pako:eNp9U8tu2zAQ_BWClzSoHOtVP4Qkp_TgQ4wC7amWUdAi5SxiLR2KapIK-qB8R36sFCVYghRHFwmzO8OZ1bKkieSCRjQ9yOfkgSlNft3FSMzzrECLHwoysS6ynVCb6ftbokAJcoEOEbkmBRKU2c4gRyUyEGq67VHX8iwZL2r6keXnJQATAwjUqw2QGwLkq9dWBHLA_ZcU8DLGBtqJPSDWKH9_2xX6sgab0mQyISzPYY-rvO_HGPjTHmnk_yoG2xHBnuz3cCUYX2-mhzoHTnsFSL8_FezglmgYbtWebXO0FdNGZAHmddvKWzcDHykrXra2B9IVpmvbc0YNJQ47SyDXBInQpCdbkW4anU6n3jMG6b3kKxMik5zAMEpHrrvOBPI_TNSon37pZ5qnWB90d9hoRqeIg2itHKTNgPpz6Y91NIrh9tvf3KzeiNdzPd78EbFeWurQTKiMATdXr6zxmOoHEy2mkfnkTD3GNMbK9LFCy5-vmNBIq0I4tDhypsUdsL1iGY1SdsgNKjhoqe6bu2yvtEOPDGlU0hcaeX5w5YfzwA3D0A1m7nzh0FcaTRYGNuh85n9bLr1ZUDn0n5RG1btyQ28RhL67CPz5MrRiv22pdlH9B4ESTU4)

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

[![](https://mermaid.ink/img/pako:eNptUstu2zAQ_BViL24AWdbDkSWhziU-tgWc5lTLKGhxZRO2SIeikqaCPij9Df9YqVfquNaF5M5wZ4baClLJEGLIDvIl3VGlyeMiEcR8KBgX208ZFzeJ6Eob3HIhmio7vW1KfdMUO2g8HhNaFHwrHrA4SlHgKgGF7Y7MyUiNElhfUpcl14b2ZBbDyeihwA8snn2Telmd43WHdoghEVlys9z1di9RIUWL8mywtaz-uXqqyXDhHb5SOVNprDyqEle9J232616h0bx6eTCRSvGMSi9kuTngqj9xRRgvNBUpmgyEteDQ8n6H6X7RwxUjd3Pi2I5LUBNGPs-J67Tf-6N84J_7flFc432rWHApVpPTW6q4QjIaxH_uczIhrh040WiyJlcy_dd8yNU2f0DzJApzFPqs-xdKnukBSxNSmgc7_dGmmsr8qHjR5G2OQ6I-zIU6WJCjyilnZkqrxksCemd0EojNllG1TyARteHRUsvvryKFuPktFpRHRjUuON0qmkPczo8FyLiW6ms39u30W3CkAuIKfkEc-HZwO42iyJma1fUDC14h9kLbC2fezAkcf-rcelFtwW8pTVPXdkLfC0PPC2a-606jWdvtRws2Nuq_Jh8TXg?type=png)](https://mermaid.live/edit#pako:eNptUstu2zAQ_BViL24AWdbDkSWhziU-tgWc5lTLKGhxZRO2SIeikqaCPij9Df9YqVfquNaF5M5wZ4baClLJEGLIDvIl3VGlyeMiEcR8KBgX208ZFzeJ6Eob3HIhmio7vW1KfdMUO2g8HhNaFHwrHrA4SlHgKgGF7Y7MyUiNElhfUpcl14b2ZBbDyeihwA8snn2Telmd43WHdoghEVlys9z1di9RIUWL8mywtaz-uXqqyXDhHb5SOVNprDyqEle9J232616h0bx6eTCRSvGMSi9kuTngqj9xRRgvNBUpmgyEteDQ8n6H6X7RwxUjd3Pi2I5LUBNGPs-J67Tf-6N84J_7flFc432rWHApVpPTW6q4QjIaxH_uczIhrh040WiyJlcy_dd8yNU2f0DzJApzFPqs-xdKnukBSxNSmgc7_dGmmsr8qHjR5G2OQ6I-zIU6WJCjyilnZkqrxksCemd0EojNllG1TyARteHRUsvvryKFuPktFpRHRjUuON0qmkPczo8FyLiW6ms39u30W3CkAuIKfkEc-HZwO42iyJma1fUDC14h9kLbC2fezAkcf-rcelFtwW8pTVPXdkLfC0PPC2a-606jWdvtRws2Nuq_Jh8TXg)

## Partie 3

### Exercice 3.1 

    entier N 
    entier essai 
    entier choix 
    entier minFourchette
    entier maxFourchette


    essai <-- 0 

    N <-- nombre aléatoire de 0 à 100

    faire 

        écrire "deviner le nombre mystere entre ", minFourchette," et ", maxFourchette 
        lire choix 

        essai <-- essai + 1 

        

            si choix <= N alors 
                si choix >= minFourchette alors
                    minFourchette <-- choix
                fin si
            sinon si choix >= N alors
                si choix <= maxFourchette alors
                    maxFourchette <-- choix
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
    entier nombre
    entier i
    entier indice
    booléen yFigure

    yFigure <-- faux

    lire nombre

    pour i de 0 à |t| - 1

        si yFigure = faux alors
            si t[i] = nombre alors                
                yFigure = vrai
                indice = i - 1
            fin si
        fin si        

    fin pour

    si yFigure = vrai alors
        écrire indice
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


### Exercice 5.5

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

### Exercice 6.2

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

#### tests

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