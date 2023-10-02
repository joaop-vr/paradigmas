1. Use o conceito de polimorfismo para implementar o programa abaixo:

   - Crie uma classe abstrata Imovel que possui um atributo do tipo endereço
     (rua, número, bairro, cidade, estado) e um atributo preço. Nessa classe você
     deverá também declarar o método abstrato calcularValorImove().

   - Crie duas classes filhas (subclasses) da classe Imovel:
     a) ImovelNovo
     b) ImovelVelho

   - Cada uma dessas classes deve conter um construtor que receba o endereço e
     preço do imóvel. Cada classe também deve implementar o método
     calcularValorImovel(), retornando ao usuário o valor final do imóvel (o cálculo
     de cada imóvel deverá ser elaborado por você).

   - No método main da classe Principal, crie um único array de tamanho 200 do
     tipo Imovel. Insira de forma alternada, instâncias dos dois tipos de imoveis
     neste array. Em seguida, use um laço de repetição para exibir o valor de cada
     imóvel, chamando o método calcularValorImovel() dos objetos. Utilize os
     métodos da classe Scanner para interação com o usuário.

2. Descreva as categorias de polimorfismo que você usou no Exercício 1, indicando o
   nome da categoria (sobrecarga, coerção, inclusão e/ou paramétrico), a classe em
   que foi usada e a(s) instrução(ões) referentes a cada categoria.

3. Escreva um programa em Java que contenha uma classe para aluno monitor com
   os atributos nome, matrícula, código da disciplina responsável. No método main()
   da classe Principal crie uma coleção do tipo TreeSet para armazenar três
   monitores, um da disciplina de Paradigmas de Programação (CI1062) e dois da
   disciplina de Fundamentos de Programação de Computadores (CI182). Após
   inicializar a coleção, imprima os dados de cada monitor ordenados pelo nome.

4. Implemente uma classe Professor com os atributos nome e matrícula. No método
   main() da classe Principal crie uma coleção do tipo LinkedList para armazenar os
   dados de 5 professores. Em seguida, execute as seguintes ações: busque e
   remova um professor pelo número de matrícula
