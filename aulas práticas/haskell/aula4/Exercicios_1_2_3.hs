module Exercicios_1_2_3 where

// Primeiro exercício
obterCarreira :: (String, String, Char) -> String
obterCarreira (_, carreira, _) = carreira

// Segundo exercício
obterGenero :: (String, String, Char) -> Char
obterGenero (_,_,genero) = genero

base :: Int -> (String, String, Char) 
base x 
 | x == 1 = ("joao", "mestre", 'm') 
 | x == 2 = ("jonas", "doutor", 'm') 
 | x == 3 = ("joice", "mestre", 'f') 
 | x == 4 = ("janete", "doutor", 'f') 
 | x == 5 = ("jocileide", "doutor", 'f') 
 | otherwise = ("ninguem", "",'x')

contMestre :: Int -> Int
contMestre numero
    | numero == 0 = 0
    | obterCarreira (base numero) == "mestre" = 1 + contMestre (numero - 1)
    | otherwise = contMestre (numero - 1)

contDoc :: Int -> Int
contDoc numero
    | numero == 0 = 0
    | obterCarreira (base numero) == "doutor" = 1 + contDoc (numero - 1)
    | otherwise = contDoc (numero - 1)

contMD :: Int -> String -> Int
contMD numero titulacao
    | numero == 0 = 0
    | obterCarreira (base numero) == titulacao = 1 + contMD (numero - 1) titulacao
    | otherwise = contMD (numero - 1) titulacao

contGenero :: Int -> Char -> Int
contGenero numero genero
    | numero == 0 = 0
    | obterGenero (base numero) == genero = 1 + contGenero (numero - 1) genero
    | otherwise = contGenero (numero - 1) genero

// Terceiro exercício
type Nome = String
type Titulo = String
type Genero = Char
type Pesquisador = (Nome, Titulo, Genero)
type Grupo = [Pesquisador]

criaPesquisador :: Int -> Pesquisador
criaPesquisador numero = base numero

criaLista :: Int -> Grupo
criaLista numero 
    | numero == 0 = []
    | otherwise = criaPesquisador numero : criaLista (numero - 1)

filtroDoc :: Pesquisador -> Bool
filtroDoc pesquisador
    | obterCarreira pesquisador == "doutor" = True
    | otherwise = False

somenteDoc :: (Pesquisador -> Bool) -> Grupo -> Grupo
somenteDoc _ [] = []
somenteDoc filtro (cabeca:cauda)
    | (filtro cabeca) == True = cabeca : (somenteDoc filtro cauda)
    | otherwise = somenteDoc filtro cauda

// Quarto exercício

