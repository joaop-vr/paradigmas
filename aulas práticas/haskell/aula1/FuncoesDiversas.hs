module FuncoesDIversas where

calcularReajuste :: Float -> Float
calcularReajuste salario = salario*1.25

mediaPonderada :: Float -> Float -> Float -> Float -> Float -> Float -> Float
mediaPonderada n1 n2 n3 p1 p2 p3 = (n1*p1 + n2*p2 + n3*p3)/(p1 + p2 + p3)

converteTemp :: Float -> Float
converteTemp celcius = celcius*(9/5) + 32

calcularIdade2032 :: Int -> Int
calcularIdade2032 ano = 2032-ano

calcularMinutos :: Int -> Int -> Int
calcularMinutos horas minutos = horas*60+minutos

calcularSomaQuadrados1 :: Int -> Int -> Int -> Int
calcularSomaQuadrados1 a b c = a*a + b*b + c*c

calcularSomaQuadrados2 :: Int -> Int -> Int -> Int
calcularSomaQuadrados2 a b c = a ^ 2 + b ^ 2 + c ^ 2

calcularSomaQuadrados3 :: Float -> Float -> Float -> Float
calcularSomaQuadrados3 a b c = a ** 2 + b ** 2 + c ** 2

ehImpar1 :: Int -> Bool
ehImpar1 num = even (num+1)

ehImpar2 :: Int -> Bool
ehImpar2 num = (mod num 2) == 1

ehDivisivel :: Int -> Int -> Bool
ehDivisivel a b = (mod a b) == 0

calcularSalario :: Float -> Float
calcularSalario salario = salario*1.05 + salario*0.93


