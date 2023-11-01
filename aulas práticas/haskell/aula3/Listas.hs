module Listas where

somaElementos :: [Int] -> Int
somaElementos [] = 0
somaElementos (cabeca:cauda) = cabeca + somaElementos cauda

removePares :: [Int] -> [Int]
removePares [] = []
removePares (cabeca:cauda)
    | mod cabeca 2 == 0 = removePares cauda
    | otherwise = cabeca : removePares cauda

inverteElementos :: [Float] -> [Float]
inverteElementos [] = []
inverteElementos (cabeca:cauda) = invertido : inverteElementos cauda
    where
        invertido = cabeca*(-1)

filtraNomes :: [[Char]] -> [[Char]]
filtraNomes [] = []
filtraNomes(cabeca:cauda)
    | head cabeca == 'A' = cabeca : filtraNomes cauda
    | otherwise = filtraNomes cauda