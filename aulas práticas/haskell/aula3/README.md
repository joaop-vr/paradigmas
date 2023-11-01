-> Listas

    1) Escreva uma função recursiva que some todos os elementos de uma lista de inteiros.

    2) Escreva uma função recursiva que remova todos os números pares de uma lista de
    inteiros.

    3) Escreva uma função recursiva que inverta os elementos de uma lista de números reais.

    4) Escreva uma função recursiva que receba uma lista de nomes e retorne outra lista
    apenas com os nomes que começam com a letra A. Dica: utilize a função head do
    módulo Prelude para pegar a primeira letra de um nome.


-> Listas por Compreensão

1) Defina as seguintes listas por compreensão
    a) [0, 3, 6, 9, 12, 15]
    b) [[1], [2], [3], [4], [5]]


-> Tuplas

    1) Faça uma função que receba um inteiro e retorne uma tupla, contendo: o dobro deste
    número na primeira coordenada, o triplo na segunda, o quádruplo na terceira e o
    quíntuplo na quarta.

    2) Faça uma função que receba um número inteiro n1 e retorne uma tupla contendo o
    resultado da divisão inteira desse número por dois e uma string indicando se n1 é par
    ou ímpar.

    3) Faça uma função recursiva que receba uma lista de números inteiros (positivos e
    negativos) e retorne uma tupla contendo a soma dos números positivos e o produto
    dos números negativos.

    4) Escreva uma função que receba uma lista dos pontos turísticos de Curitiba e uma
    avaliação qualquer fornecida no intervalo de 0 a 10. Cada ponto turístico é formado por
    um nome, uma nota de avaliação e um tipo (ex.: Barigui, 10, parque). A função deve
    retornar uma lista com os nomes e avaliação dos pontos turísticos de Curitiba que
    possuem nota acima de um valor de referência fornecido e que sejam parques ou
    museus.

        a. Implemente uma solução usando lista por compreensão e utilize type para criar
        apelidos para os tipos.
        
        b. Teste sua função no GHCI com a seguinte linha de comando:
        pontosTuristicos 6 [("Rua 24 Horas", 5, "rua"), ("Tangua", 10, "parque"), ("MON", 7,
        "museu"), ("Mercado Municipal", 8, "mercado"), ("Jardim Botanico", 10, "parque"),
        ("Museu Paranaense", 6, "museu"), ("Feira do Largo da ordem", 9, "feira"),
        ("Barigui", 10, "parque"), ("Rua das Flores", 7, "rua") ]