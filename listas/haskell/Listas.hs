module Listas where

-- Encontre o último elemento de uma lista.
encontreUltimo :: [a] -> a
encontreUltimo [ultimoElemento] = ultimoElemento
encontreUltimo (cabeca:cauda) = encontreUltimo cauda

-- Encontre o elemento K-ésimo de uma lista
encontreK :: Int -> [a] -> a
encontreK num (cabeca:cauda) = 
    if (num == 1) 
        then cabeca
    else
        encontreK (num-1) cauda

-- Encontre o número de elementos em uma lista.
encontreLength :: [a] -> Int
encontreLength [] = 0
encontreLength (cabeca:cauda) = 1 + encontreLength cauda

-- Reverter uma lista
reverteLista :: [a] -> [a]
reverteLista [] = []
reverteLista (cabeca:cauda) = reverteLista cauda ++ [cabeca]

-- Descubra se uma lista é um palíndromo
ehPalindromo :: Eq a => [a] -> Bool
ehPalindromo xs = xs == reverse xs

-- Duplicar os elementos de uma lista
duplicaLista :: [a] -> [a]
duplicaLista [] = []
duplicaLista (cabeca:cauda) = [cabeca] ++ [cabeca] ++ duplicaLista cauda

-- Replicar os elementos de uma lista um determinado número de vezes.
replicarKVezes :: [a] -> Int -> [a]
replicarKVezes [] _ = []
replicarKVezes (cabeca:cauda) k = replicarElemento cabeca k ++ replicarKVezes cauda k
  where
    replicarElemento _ 0 = [] -- Caso base
    replicarElemento elemento n = elemento : replicarElemento elemento (n - 1)

-- Exclua cada K-ésimo elmento de uma lista
excluirElementoK :: [a] -> Int -> [a]
excluirElementoK [] k = []
excluirElementoK (cabeca:cauda) 1 = cauda
excluirElementoK (cabeca:cauda) n = [cabeca] ++ excluirElementoK cauda (n-1)

-- Extrair uma fatia de uma lista
extrairFatia :: [a] -> Int -> Int -> [a]
extrairFatia [] _ _ = []
extrairFatia _ _ 0 = []
extrairFatia (cabeca:cauda) 1 k = cabeca : extrairFatia cauda 1 (k - 1)
extrairFatia (_:cauda) j k = extrairFatia cauda (j - 1) (k - 1)

-- Gire uma lista N lugares à esquerda
rotacionaLista :: [a] -> Int -> [a]
rotacionaLista (cabeca:cauda) 1 = cauda ++ [cabeca]
rotacionaLista (cabeca:cauda) n = rotacionaLista aux (n-1)
    where
        aux = cauda ++ [cabeca]

