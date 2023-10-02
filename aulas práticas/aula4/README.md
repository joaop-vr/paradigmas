1) Utilizando interfaces (Java), você pode especificar comportamentos semelhantes
para classes possivelmente não relacionadas. Com base nessa ideia, siga as
instruções abaixo:

    a. Crie duas classes não relacionadas por herança: classe Produto
    Eletrônico e a classe Serviço. Dê a cada classe atributos e
    comportamentos únicos que não estejam relacionados com os
    atributos e métodos da outra classe. Sugestão:
        i. Produto Eletrônico – atributos: nome do fabricante,
        peso, marca, etc.
        ii. Serviço – atributos: formato (R: remoto, L: em loja ou D: em
        domicílio), duração (em minutos), etc.

    b. Escreva uma interface Loja com os métodos vender e acionar
    garantia. Faça cada uma das classes Produto Eletrônico e
    Serviço implementar esta interface. Os métodos em cada classe
    devem simplesmente apresentar mensagens informativas na tela. Ex.:
    “Vendendo um serviço!”.

    c. Escreva um aplicativo que crie um objeto de cada uma das duas
    classes. Crie um objeto ArrayList<Loja> e insira as referências dos
    objetos instanciados nesta coleção. Finalmente, itere pela coleção,
    chamando polimorficamente o método vender e acionar garantia de
    cada objeto.

    
2) Modifique o código do exercício 1, tornando Produto Eletrônico uma classe
abstrata, e implementando duas novas subclasses concretas Televisao e
Celular.

    a. O aplicativo que cria a coleção de objetos vai continuar funcionando após a
    modificação na estrutura das classes?

    b. Modifique o aplicativo para que passe a instanciar diretamente objetos
    Televisao e Celular, incluindo-os na coleção.


3) Modifique o código do exercício 2, apagando os métodos vender e acionar
garantia da classe Produto Eletrônico.

    a. O aplicativo vai continuar funcionando após a remoção dos métodos?

    b. Modifique o aplicativo para que os métodos vender e acionar garantia
    sejam implementados nas classes Televisao e Celular.

    c. Crie os métodos ligar e desligar na classe Produto Eletrônico.
    Cada método deverá exibir a mensagem de acordo com o objeto 
    passado como parâmetro. Por exemplo: se o objeto for uma televisão,
    o método ligar deverá exibir a mensagem “Ligando a televisão”.

    d. No aplicativo, instancie um objeto para cada uma das classes
    Televisao, Celular e Serviço. Crie uma coleção
    LinkedList<Loja> e insira as referências dos objetos instanciados
    nesta coleção. Finalmente, itere pela coleção, chamando
    polimorficamente os métodos vender, acionar garantia, ligar e
    desligar, de acordo com cada objeto. Dica: use o instanceof.


4) Faça as seguintes alterações nas classes abaixo:

    a. Classe Produto Eletrônico
        i. Crie o construtor completo e padrão

    b. Classe Televisao
        i. Adicione o atributo tamanho em polegadas
        ii. Crie o construtor completo
        iii. Crie um método para exibir todos os dados do objeto (uma
        alternativa é usar o método toString())

    c. Classe que contém o método main
        i. Crie três instâncias de televisão com os seguintes dados
             Objeto 1
             Nome do fabricante: LG Electronics
             Marca: LG
             Peso: 30,8 kg
             Polegadas: 75
             Objeto 2
             Nome do fabricante: Mondial
             Marca: Sony
             Peso: 4,5 kg
             Polegadas: 32
             Objeto 3
             Nome do fabricante: Britânia
             Marca: Philco
             Peso: 16 kg
             Polegadas: 50
        ii. Crie uma HashSet<ProdutoEletronico> e adicione os
        objetos. Itere pela coleção exibindo os dados de cada objeto.


5) Faça as seguintes alterações nas classes abaixo:

    a. Classe Televisao
        i. Faça essa classe implementar a interface Comparable
        ii. Implemente o método compareTo usando o atributo peso
 
    b. Classe que contém o método main
        i. Crie uma TreeSet<ProdutoEletronico> e adicione as
        três instâncias de televisão.
        ii. Exiba os objetos em ordem decrescente do peso.