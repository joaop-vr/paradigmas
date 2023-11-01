module ListasCompreensao where

lista1 :: [Int]
lista1 = [a | a <- [0,3..99]]

lista2 :: [[Int]]
lista2 = [ [a] | a <- [1..9]]