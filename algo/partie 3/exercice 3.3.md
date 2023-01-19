# Exercice 3.3

## Pseudo-code

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

## Algorigramme

[![](https://mermaid.ink/img/pako:eNqFk8FS2zAQhl9FsxfKxE5s13GIp-UEmemhXMqpcQ6KJZudxhKV5UJq8kA8By_WlTUQU8pUM56xVv9-2l8r9VBqISGHaqfvyhtuLLu-KBSjIZVAVX-oUJ0Wyoe2skalXFQ8PW47e-qCfikMQ8bbFmv1RbUo5LqA_Qrrzkj2mVV818oCNm-lYqUNSZFE0SuBkVxcdc1WmvVsh0RRutkaORtJSk0VWtSKGH0BLfvEHuxDAYdjVW6MZZT3y3B02ViVnTFS2cuffh9C2DVuqBK_lQMdKW68SXnBnTMcXF-bzjn3EyJZmpOtoVxUJfnFUjrLOJls_g-veHfv4aNUwk8mHnr-2ty7nl84lW9OP26Oc0Be_67GK0cO7wxa6ctYz54eS-O6coJDIAxPZt6lvzXvwp4rGWCXxpCfIyuNUnalLVvpTol_ASGARpqGo6Ab27sY9exGNnTGOf0Kbn4UUKgD6Xhn9be9KiF3PQiguxXcygvkteHNc1DSIWnz1b-A4SEEcMsV5D3cQ54sommcLJdncZLF9C0C2EMefkyn0VkWZ3G6mEdpms0PAfzWmqDRdJlFSTRPkjhKFss0iwfc92HR7Xj4A4YWEOM?type=png)](https://mermaid.live/edit#pako:eNqFk8FS2zAQhl9FsxfKxE5s13GIp-UEmemhXMqpcQ6KJZudxhKV5UJq8kA8By_WlTUQU8pUM56xVv9-2l8r9VBqISGHaqfvyhtuLLu-KBSjIZVAVX-oUJ0Wyoe2skalXFQ8PW47e-qCfikMQ8bbFmv1RbUo5LqA_Qrrzkj2mVV818oCNm-lYqUNSZFE0SuBkVxcdc1WmvVsh0RRutkaORtJSk0VWtSKGH0BLfvEHuxDAYdjVW6MZZT3y3B02ViVnTFS2cuffh9C2DVuqBK_lQMdKW68SXnBnTMcXF-bzjn3EyJZmpOtoVxUJfnFUjrLOJls_g-veHfv4aNUwk8mHnr-2ty7nl84lW9OP26Oc0Be_67GK0cO7wxa6ctYz54eS-O6coJDIAxPZt6lvzXvwp4rGWCXxpCfIyuNUnalLVvpTol_ASGARpqGo6Ab27sY9exGNnTGOf0Kbn4UUKgD6Xhn9be9KiF3PQiguxXcygvkteHNc1DSIWnz1b-A4SEEcMsV5D3cQ54sommcLJdncZLF9C0C2EMefkyn0VkWZ3G6mEdpms0PAfzWmqDRdJlFSTRPkjhKFss0iwfc92HR7Xj4A4YWEOM)