module Exercicios where

obterPrimeiroElemento :: (String, String, Char) -> String
obterPrimeiroElemento (primeiro, _, _) = primeiro

obterSegundoElemento :: (String, String, Char) -> String
obterSegundoElemento (_, segundo, _) = segundo

obterTerceiroElemento :: (String, String, Char) -> Char
obterTerceiroElemento (_, _, terceiro) = terceiro

base :: Int -> (String, String, Char) 
base x 
 |x == 1 = ("joao", "mestre", ‘m’) 
 |x == 2 = ("jonas", "doutor", ‘m’) 
 |x == 3 = ("joice", "mestre", ‘f’) 
 |x == 4 = ("janete", "doutor", ‘f’) 
 |x == 5 = ("jocileide", "doutor", ‘f’) 
 |otherwise = ("ninguem", ‘x’)

contMestre :: (Int -> (String, String, Char)) -> Int -> Int
contMestre (nome,carreira,genero) numero
    | nome == "ninguem" = 0
    | carreira == "mestre" = 1 
    | otherwise base numero + contMestre numero-1