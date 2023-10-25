1. Implemente as seguintes classes usando o conceito de herança:
   a. Data com os atributos dia, mês, ano e métodos get/set
   b. Funcionário com os atributos nome, matrícula, data de contratação, se é
   estrangeiro e métodos get/set.
   c. Funcionário mensalista com o atributo salário mensal e métodos get/set.
   d. Funcionário horista com os atributos valor da hora e número de horas
   trabalhadas e métodos get/set.

2. Crie o construtor completo para cada uma das classes do item 1. Dica: para
   algumas classes você deve usar a palavra-chave super.

3. Crie dois outros construtores, diferente do construtor completo, para as classes
   funcionário mensalista e funcionário horista. Para pensar: observe os códigos
   repetidos nos construtores. Será que tem como aplicar o conceito de
   reusabilidade de código em construtores?

4. Crie o método toString() para cada uma das classes do item 1 de forma que todos
   os atributos da classe sejam impressos na tela. Dica: aplique o conceito de
   reusabilidade de código.

5. Utilizando o conceito de sobreposição, crie um método calcular salário final para
   cada uma das classes do item 1, em que:
   a. Na classe funcionário o método deve retornar 0.0;
   b. Na classe funcionário mensalista o método deve retornar o salário
   mensal;
   c. Na classe funcionário horista o método deve retornar o resultado do
   produto de horas trabalhadas e valor da hora.

6. Crie uma subclasse para a classe funcionário mensalista com um atributo e
   métodos get/set. Dica: dê um nome para a nova classe que atenda ao conceito de
   herança.

7. Crie um método final para a classe funcionário mensalista que não poderá ser
   herdado pela classe que você criou no item 6. Dica: o método criado deve fazer
   sentido para o contexto do problema.

8. Crie um programa principal que instancie um objeto para a classe funcionário
   horista e mensalista e chame os métodos toString() (para exibir os dados do
   funcionário) e calcular salário final. Dica: após chamar o método calcular salário
   final imprima o resultado na tela.

9. Altere o programa principal anterior (item 8) para que seja criado um vetor de
   objetos de tamanho 100 para cada uma das classes funcionário mensalista e
   funcionário horista. Em seguida, imprima a média salarial para cada vetor de
   funcionário (mensalista e horista).
