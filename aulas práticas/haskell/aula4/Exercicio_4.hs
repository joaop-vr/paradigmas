module Exercicio_4 where

senhor :: String -> String
senhor nome = "Sr." ++ nome

senhora :: String -> String
senhora nome = "Sra." ++ nome

senhorita :: String -> String
senhorita nome = "Srta." ++ nome

mapeiaPronTratamento:: (String -> String) -> [String] -> [String]
mapeiaPronTratamento _ [] = []
mapeiaPronTratamento funcao (cabeca:cauda) = funcao cabeca : mapeiaPronTratamento funcao cauda