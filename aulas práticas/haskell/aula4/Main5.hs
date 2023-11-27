module Main5 where

import Exercicio_5

-- Lista
lista :: [Double]
lista = [-3,-2,-1,0,1,2,3,4]

main :: IO ()
main = do
    putStrLn "Resultados:"
    putStrLn "-----------"
    putStrLn "Para (a):"
    print $ aplicaFuncao ehNegativo lista
    putStrLn "Para (b):"
    print $ aplicaFuncao ehPositivo lista
    putStrLn "Para (c):"
    print $ aplicaFuncao ehZero lista
    