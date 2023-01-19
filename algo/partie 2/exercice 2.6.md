# Exercice 2.6 

## Pseudo-code

    entier n 
    entier i
    booléen est_premier 

    lire n 

    est_premier <-- vrai

    pour i de 2 à n - 1

        si n mod i = 0 alors 
            est_premier <-- faux
        fin si  

    fin pour 

    si est_premier alors
        écrire "n est un nombre premier"
    sinon
        écrire "n n'est pas un nombre premier"
    fin si

## Algorigramme

[![](https://mermaid.ink/img/pako:eNp9U8tu2zAQ_BWClzSoHOtVP4Qkp_TgQ4wC7amWUdAi5SxiLR2KapIK-qB8R36sFCVYghRHFwmzO8OZ1bKkieSCRjQ9yOfkgSlNft3FSMzzrECLHwoysS6ynVCb6ftbokAJcoEOEbkmBRKU2c4gRyUyEGq67VHX8iwZL2r6keXnJQATAwjUqw2QGwLkq9dWBHLA_ZcU8DLGBtqJPSDWKH9_2xX6sgab0mQyISzPYY-rvO_HGPjTHmnk_yoG2xHBnuz3cCUYX2-mhzoHTnsFSL8_FezglmgYbtWebXO0FdNGZAHmddvKWzcDHykrXra2B9IVpmvbc0YNJQ47SyDXBInQpCdbkW4anU6n3jMG6b3kKxMik5zAMEpHrrvOBPI_TNSon37pZ5qnWB90d9hoRqeIg2itHKTNgPpz6Y91NIrh9tvf3KzeiNdzPd78EbFeWurQTKiMATdXr6zxmOoHEy2mkfnkTD3GNMbK9LFCy5-vmNBIq0I4tDhypsUdsL1iGY1SdsgNKjhoqe6bu2yvtEOPDGlU0hcaeX5w5YfzwA3D0A1m7nzh0FcaTRYGNuh85n9bLr1ZUDn0n5RG1btyQ28RhL67CPz5MrRiv22pdlH9B4ESTU4?type=png)](https://mermaid.live/edit#pako:eNp9U8tu2zAQ_BWClzSoHOtVP4Qkp_TgQ4wC7amWUdAi5SxiLR2KapIK-qB8R36sFCVYghRHFwmzO8OZ1bKkieSCRjQ9yOfkgSlNft3FSMzzrECLHwoysS6ynVCb6ftbokAJcoEOEbkmBRKU2c4gRyUyEGq67VHX8iwZL2r6keXnJQATAwjUqw2QGwLkq9dWBHLA_ZcU8DLGBtqJPSDWKH9_2xX6sgab0mQyISzPYY-rvO_HGPjTHmnk_yoG2xHBnuz3cCUYX2-mhzoHTnsFSL8_FezglmgYbtWebXO0FdNGZAHmddvKWzcDHykrXra2B9IVpmvbc0YNJQ47SyDXBInQpCdbkW4anU6n3jMG6b3kKxMik5zAMEpHrrvOBPI_TNSon37pZ5qnWB90d9hoRqeIg2itHKTNgPpz6Y91NIrh9tvf3KzeiNdzPd78EbFeWurQTKiMATdXr6zxmOoHEy2mkfnkTD3GNMbK9LFCy5-vmNBIq0I4tDhypsUdsL1iGY1SdsgNKjhoqe6bu2yvtEOPDGlU0hcaeX5w5YfzwA3D0A1m7nzh0FcaTRYGNuh85n9bLr1ZUDn0n5RG1btyQ28RhL67CPz5MrRiv22pdlH9B4ESTU4)