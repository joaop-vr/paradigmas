module Condicionais where

podeBeber1 :: Int -> String
podeBeber1 idade = if (idade >= 18) 
    then "Pode beber!"
    else "Nao pode beber!"

podeBeber2 :: Int -> String
podeBeber2 idade
    | idade >= 18 = "Pode beber!"
    | otherwise = "Nao pode beber!"

qualEhOSinal1 :: Int -> String
qualEhOSinal1 numero = if (numero < 0)
    then "Negativo"
    else if (numero == 0)
        then "Zero"
        else "Positivo"

qualEhOSinal2 :: Int -> String
qualEhOSinal2 numero
    | numero < 0 = "Negativo"
    | numero == 0 = "Zero"
    | otherwise = "Positivo"

ehBissexto1 :: Int -> Bool 
ehBissexto1 ano = if ((mod ano 4 == 0) && (mod ano 100 /= 0)) || (mod ano 400 == 0)
    then True
    else False

ehBissexto2 :: Int -> Bool 
ehBissexto2 ano = 
    if condicao1 || condicao2
        then True
        else False
    where
        condicao1 = ((mod ano 4 == 0) && (mod ano 100 /= 0))
        condicao2 = mod ano 400 == 0
    

ehBissexto3 :: Int -> Bool 
ehBissexto3 ano
    | condicao1  = True
    | condicao2 = True
    | otherwise = False
    where
        condicao1 = ((mod ano 4 == 0) && (mod ano 100 /= 0))
        condicao2 = mod ano 400 == 0
    