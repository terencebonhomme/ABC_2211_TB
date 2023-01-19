# Exercice 3.1 

## Pseudo-code

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

## Algorigramme

[![](https://mermaid.ink/img/pako:eNqNVNuO2jAQ_RXXL9tVw51w04JUdVupD-xDt1KlAg8mnoDVxKaOw4ZF-Zd95Tv4sU5iWJIF1M1DnByfOTNzkvGWeooDHVA_UE_ekmlDft5PJcELJBdy8dEX8nYqLTSHhZAyQ_l-N4_NbQbarUqlQjSTXIUTSYZEqnCugbBgv2NGCXzkQOpk_0Lk7BQg5Co2X5ZKeDCp7Xeezog3HNZCgiYBHGXCTWQAV5BGg0NCIb-pWHtLMAZfwSDEkhN0U5sVCxsRDYwf0wRZDg9fElIrleJpCDHBZxQIV2YCUcQEdmLXT6RxIBdC_O_S__r3YWvV7rDr9LCdXcdt5JK1Ro2sktO2pdiqHuPVWMiDzmhYbjB9E3QeWMpgliARm5Q0yB1ScvnZBbWsGa5-LUUA98J_2EryYWjZ6XtS-yxO8tQFjbO4y768hgof9U5ejnIvrwhYEcsvtn6t1gTzjVly-kyln-WSvWex5w6zZFKSKTr8xs936v_fxmLT19n2XoBLxRdG7iLxVZc8aWHgB0RxYArDOddsrchaxRFha3gmRqt4vd_haBLHzsphibIpzJyw54hNRh0agg6Z4HjkbDNsStHOEKZ0gI-c6T9TOpUp8lhs1ONGenRgdAwOjVecGSyTLTQL6cBnQYQocGGUHtszLD_KHLpikg62NKGDSrNZ7bl1t9FsuG673nD7TYduEG9169V-u9dp9buNbr_fcbupQ5-VQuFGtV13ey231Wp36s1OLvc738nqSP8Bl5-O4A?type=png)](https://mermaid.live/edit#pako:eNqNVNuO2jAQ_RXXL9tVw51w04JUdVupD-xDt1KlAg8mnoDVxKaOw4ZF-Zd95Tv4sU5iWJIF1M1DnByfOTNzkvGWeooDHVA_UE_ekmlDft5PJcELJBdy8dEX8nYqLTSHhZAyQ_l-N4_NbQbarUqlQjSTXIUTSYZEqnCugbBgv2NGCXzkQOpk_0Lk7BQg5Co2X5ZKeDCp7Xeezog3HNZCgiYBHGXCTWQAV5BGg0NCIb-pWHtLMAZfwSDEkhN0U5sVCxsRDYwf0wRZDg9fElIrleJpCDHBZxQIV2YCUcQEdmLXT6RxIBdC_O_S__r3YWvV7rDr9LCdXcdt5JK1Ro2sktO2pdiqHuPVWMiDzmhYbjB9E3QeWMpgliARm5Q0yB1ScvnZBbWsGa5-LUUA98J_2EryYWjZ6XtS-yxO8tQFjbO4y768hgof9U5ejnIvrwhYEcsvtn6t1gTzjVly-kyln-WSvWex5w6zZFKSKTr8xs936v_fxmLT19n2XoBLxRdG7iLxVZc8aWHgB0RxYArDOddsrchaxRFha3gmRqt4vd_haBLHzsphibIpzJyw54hNRh0agg6Z4HjkbDNsStHOEKZ0gI-c6T9TOpUp8lhs1ONGenRgdAwOjVecGSyTLTQL6cBnQYQocGGUHtszLD_KHLpikg62NKGDSrNZ7bl1t9FsuG673nD7TYduEG9169V-u9dp9buNbr_fcbupQ5-VQuFGtV13ey231Wp36s1OLvc738nqSP8Bl5-O4A)