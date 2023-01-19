# Exercice 2.7 

## Pseudo-code

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

## Algorigramme

[![](https://mermaid.ink/img/pako:eNptU9ty2jAQ_RXNvtDMGOMLEPCUvITHtjOkeSpmMsJaQIMtEVlOmnr8Qclv8GOVZZsSil6k3XN89uxaKiGRDCGCTSpfkx1VmjzOY0HMQsG42H7ZcHETiya1xi0Xos6y4_u60Dd1soH6_T6hec634gHzgxQ5LmNQaE9kRnqqF8PqkroouDa0Z7MZzoamOX5i8c0PqRflOV41aIMYEpEFN9tda_cSFVJYVCFlJ2ODlCskrbnBqi3VwYvyn-3ninSKJ_hK5sxG7fVRFbhsTWtzXlmkMXX1485lIsULKj2XxTrFZRtxRRjPNRUJmiYJs2Aneb_DZD9v4ZKRuxnxXM8nqAkjX2fE9-w6Te0T_9z3q-Ia723FnEuxHBzfE1WPqdcVf9pnZEB8d-xNe2ZoV3r6T7zry4o_oBmJwgyFPlP_RskLTbEwTUozsOOHNtlEZgfF87rfOuw6apu5qA4OZKgyypm5xmXtJQa9M3ViiMyRUbWPIRaV4dFCy59vIoGo_i0OFAdGNc453SqaQWQvmAPIuJbqe_Mu7PNw4EAFRCX8hmgUuuGtF3j-1B8OA38SOvAGUTBxg_E0mHoTf-wHwzAYVQ78kdKo-q7nmTgYB6PheBROQ6v2y2K1jeovApUeyA?type=png)](https://mermaid.live/edit#pako:eNptU9ty2jAQ_RXNvtDMGOMLEPCUvITHtjOkeSpmMsJaQIMtEVlOmnr8Qclv8GOVZZsSil6k3XN89uxaKiGRDCGCTSpfkx1VmjzOY0HMQsG42H7ZcHETiya1xi0Xos6y4_u60Dd1soH6_T6hec634gHzgxQ5LmNQaE9kRnqqF8PqkroouDa0Z7MZzoamOX5i8c0PqRflOV41aIMYEpEFN9tda_cSFVJYVCFlJ2ODlCskrbnBqi3VwYvyn-3ninSKJ_hK5sxG7fVRFbhsTWtzXlmkMXX1485lIsULKj2XxTrFZRtxRRjPNRUJmiYJs2Aneb_DZD9v4ZKRuxnxXM8nqAkjX2fE9-w6Te0T_9z3q-Ia723FnEuxHBzfE1WPqdcVf9pnZEB8d-xNe2ZoV3r6T7zry4o_oBmJwgyFPlP_RskLTbEwTUozsOOHNtlEZgfF87rfOuw6apu5qA4OZKgyypm5xmXtJQa9M3ViiMyRUbWPIRaV4dFCy59vIoGo_i0OFAdGNc453SqaQWQvmAPIuJbqe_Mu7PNw4EAFRCX8hmgUuuGtF3j-1B8OA38SOvAGUTBxg_E0mHoTf-wHwzAYVQ78kdKo-q7nmTgYB6PheBROQ6v2y2K1jeovApUeyA)