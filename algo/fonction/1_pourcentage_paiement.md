# Pourcentage paiement

## Pseudo-code

### main

    PROGRAMME

        entier carte_bleue, cheque, virement, total

        écrire "Nombre de paiement par Carte Bleue : "
        lire carte_bleue

        écrire "Nombre de chèques émis : "
        lire cheque

        écrire "Nombre de virements automatiques : "
        lire virement

        total = carte_bleue + cheque + virement        

        écrire "Vous avez émis ", total, " ordres de debit dont : "
        écrire pourcentage(carte_bleue, total), "% par Carte Bleue
        écrire pourcentage(cheque, total), "% par chèque
        écrire pourcentage(virement, total), "% par virement

    FIN PROGRAMME

### pourcentage

    double FONCTION pourcentage (VAL entier paiement, VAL entier total)

        RETOURNER paiement / total * 100
        
    FIN FONCTION