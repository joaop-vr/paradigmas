module Recursao where

fibonacci :: Int -> Int
fibonacci a
    | a == 0 = 0
    | a == 1 = 1
    | otherwise = fibonacci (a-1) + fibonacci (a-2)

contadorDigitos :: Int -> Int
contadorDigitos a
    | a < 1 = 0
    | otherwise = 1 + contadorDigitos (a `div` 10)

somadorDigitos :: Int -> Int
somadorDigitos a 
    | a < 1 = 0
    | otherwise = a `mod` 10 + somadorDigitos (a `div` 10)
