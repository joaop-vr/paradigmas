-- Main.hs
module Main4 where

import Exercicio_4

-- Função de alta ordem
aplicarFuncao :: (String -> String) -> [String] -> [String]
aplicarFuncao f nomes = mapeiaPronTratamento f nomes

-- Lista de nomes
nomesParaA :: [String]
nomesParaA = ["Joao", "Maria", "Carlos"]

nomesParaB :: [String]
nomesParaB = ["Ana", "José", "Laura"]

nomesParaC :: [String]
nomesParaC = ["Pedro", "Isabela", "Ricardo"]

main :: IO ()
main = do
    putStrLn "Resultados:"
    putStrLn "-----------"
    putStrLn "Para (a):"
    print $ aplicarFuncao senhor nomesParaA
    putStrLn "Para (b):"
    print $ aplicarFuncao senhora nomesParaB
    putStrLn "Para (c):"
    print $ aplicarFuncao senhorita nomesParaC
