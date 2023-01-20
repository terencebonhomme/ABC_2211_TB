# Exercice 4

## Partie 1

### Pseudo-code

    chaîne entree
    chaine separateur
    chaine valeur
    chaine unite
    réel temperature

    écrire "saisir une valeur numérique comprise entre -456.67 et 5000000 suivi de l'unité de température"
    lire entree

    pour i de 0 à |entree|
        si entree[i] = " " alors
            separateur = i
        fin si
    fin pour

    valeur <--0-(separateur - 1)
    unite <--(separateur + 1)-|entree|

    temperature <-- convertir valeur en réel

    si unite = "C" ou unite = "Celsius" alors
        écrire (temperature * 9 / 5) + 32, " °F"
    sinon si unite = "F" ou unite = "Fahrenheit" alors        
        écrire (temperature  - 32) * 5 / 9, " °C"
    fin si

### Algorigramme

[![](https://mermaid.ink/img/pako:eNp1VMty2jAU_RWNNobGBj8wBE-TDRlmOtOuknZROwvFvoCmRmaERJISPohdvqH8WK8tg00bPOOxdXyO7rkPa0vTIgMa0VlePKcLJhV5uEsEwQtExsW8M-OimwgDPcGcC1Gi2WH_pFXXwI7jEI7sFGJOboj72MDPkiv4IlZaxf3DPpVcArHWjK-5JFoA2bActLT6LYkElv1guYa4n5d0EEoCtBl89hXEfKG2CeXkM3kzjLeE7gynvI4cFGwk445zi9D9iqWAKiPo8C66tYh1JjTiitnSrmEV480kU-gXZfyxTjuVMb-6Kle3p6CXdpsx_VLxUEU-9HpkmLrUHLOIE1qjN3VNOq5NWqYc4nUT2qqTFlh8lFXPRoUSqCVXxLNP9TsXp4XYgFQPsKzYWkJcQ9i62ggIIg97gPysOd8x3GR7DGpNLFJo0iwhX3O9ts56VUla5a7GZsoWEsQCOM5OQk_T01GNJfKJjEmfhF3MJPBt8ud9it3sm96YAf4ozKkPFTJtvE7PvTYOrP8mpFL-axmTSzG5y36xSYHfRdsh2h6XhieXDZ8HOpo2LGrTJcgl4xn-vNtSk1C1gCUkNMLXjMlfCU3EDnlMq-L-VaQ0UlKDTfUqw-7fcTaXbEmjGcvXiELGVSG_mdOgOhRsumKCRlv6QiMv9HqD0B0NPNcbhsPh2LfpK42cUdAbhdfBaBD4oe-6gb-z6e-iwG29Xuhfj3wf8YEXukEwqvb7WX0sjez-AqqoYlE?type=png)](https://mermaid.live/edit#pako:eNp1VMty2jAU_RWNNobGBj8wBE-TDRlmOtOuknZROwvFvoCmRmaERJISPohdvqH8WK8tg00bPOOxdXyO7rkPa0vTIgMa0VlePKcLJhV5uEsEwQtExsW8M-OimwgDPcGcC1Gi2WH_pFXXwI7jEI7sFGJOboj72MDPkiv4IlZaxf3DPpVcArHWjK-5JFoA2bActLT6LYkElv1guYa4n5d0EEoCtBl89hXEfKG2CeXkM3kzjLeE7gynvI4cFGwk445zi9D9iqWAKiPo8C66tYh1JjTiitnSrmEV480kU-gXZfyxTjuVMb-6Kle3p6CXdpsx_VLxUEU-9HpkmLrUHLOIE1qjN3VNOq5NWqYc4nUT2qqTFlh8lFXPRoUSqCVXxLNP9TsXp4XYgFQPsKzYWkJcQ9i62ggIIg97gPysOd8x3GR7DGpNLFJo0iwhX3O9ts56VUla5a7GZsoWEsQCOM5OQk_T01GNJfKJjEmfhF3MJPBt8ud9it3sm96YAf4ozKkPFTJtvE7PvTYOrP8mpFL-axmTSzG5y36xSYHfRdsh2h6XhieXDZ8HOpo2LGrTJcgl4xn-vNtSk1C1gCUkNMLXjMlfCU3EDnlMq-L-VaQ0UlKDTfUqw-7fcTaXbEmjGcvXiELGVSG_mdOgOhRsumKCRlv6QiMv9HqD0B0NPNcbhsPh2LfpK42cUdAbhdfBaBD4oe-6gb-z6e-iwG29Xuhfj3wf8YEXukEwqvb7WX0sjez-AqqoYlE)

## Partie 2

### Pseudo-code

    chaîne commande
    chaîne unite
    réel minimum
    réel maximum

    commande <-- ""

    faire

        écrire "saisir une unite de mesure (C ou F)"
        lire unite

        écrire "saisir le minimum et le maximum d'une plage de valeurs"
        lire minimum
        lire maximum

        si unite = "C" alors
            minimum --> (minimum * 9 / 5) + 32
            maximum --> (maximum * 9 / 5) + 32
        sinon si unite = "F"
            minimum --> (minimum  - 32) * 5 / 9
            maximum --> (maximum  - 32) * 5 / 9
        sinon si unite = "quit"
            quitter le programme
        fin si

        si unite = "C" alors
            écrire minimum, " à ", maximum, " °F"
        sinon si unite = "F" alors
            écrire minimum, " à ", maximum, " °C"
        fin si

    tant que commande != "quit"