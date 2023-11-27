module Exercicio_5 where

ehNegativo:: Double -> Bool
ehNegativo a
    | a < 0 = True
    | a == 0 = False
    | otherwise = False

ehPositivo:: Double -> Bool
ehPositivo a
    | a > 0 = True
    | a == 0 = False
    | otherwise = False

ehZero:: Double -> Bool
ehZero a
    | a == 0 = True
    | otherwise = False

aplicaFuncao:: (Double -> Bool) -> [Double] -> [Double]
aplicaFuncao _ [] = []
aplicaFuncao funcao (cabeca:cauda)
    | (funcao cabeca) == True = cabeca : aplicaFuncao funcao cauda
    | otherwise = aplicaFuncao funcao cauda