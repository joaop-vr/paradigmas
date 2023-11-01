module Tuplas where

tuplaMultiplicar :: Int -> (Int, Int, Int, Int)
tuplaMultiplicar a = (2*a, 3*a, 4*a, 5*a)

ehPar :: Int -> (Int, String)
ehPar a
    | mod a 2 == 0 = ( divisao, "Par")
    | otherwise = ( divisao, "Impar")
    where
        divisao = div a 2

somaPMultN :: [Int] -> (Int, Int)
somaPMultN [] = (0,1)
somaPMultN (cabeca:cauda)
    | cabeca < 0 = (soma, cabeca*mul)
    | otherwise = (cabeca + soma, mul)
    where
        (soma, mul) = somaPMultN cauda