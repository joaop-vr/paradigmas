Crie um módulo chamado de funções diversas e salve em um script. Em seguida, declare
as funções abaixo. Lembre-se de adicionar a assinatura de tipo para cada função. Após a
implementação de cada função, teste o seu script usando o ambiente interativo GHCi:

    i. Carregar o script:
        :l <nome do script>

    ii. Testar cada uma das funções
        <nome da funcao> <argumentos>

Importante: ao criar as funções, use a convenção recomendada para nomes de função
e nomes de parâmetro.

    a) Função calcular reajuste: recebe o salário de um funcionário, e retorna o valor do
    novo salário, sabendo-se que este sofreu um aumento de 25%.

    b) Função calcular média ponderada: recebe três notas e seus respectivos pesos, e
    retorna o valor da média ponderada entre essas notas. Assuma que os pesos serão
    sempre maior ou igual a zero.

    c) Função converter temperatura: recebe uma temperatura em graus Celsius e
    converte para Fahrenheit. A fórmula de conversão é: F = C* (9.0/5.0)+32.0, sendo F
    a temperatura em Fahrenheit e C a temperatura em Celsius.

    d) Função calcular idade em 2032: recebe o ano de nascimento de uma pessoa, e
    retorna quantos anos esta pessoa terá em 2032.

    e) Função calcular minutos: recebe uma hora formada por hora e minutos e retorna a
    hora apenas em minutos.

    f) Função calcular soma dos quadrados: recebe três valores numéricos e retorna a
    soma dos quadrados dos três valores. Faça três implementações: a primeira sem
    usar funções prontas, a segunda usando a função ** do módulo Prelude e a
    terceira usando a função ^ do módulo Prelude. Pesquise a diferente entre as
    funções ** e ^.

    g) Função verificar número ímpar: recebe um número inteiro e retorna se ele é ímpar
    ou não. Faça duas implementações, uma usando a função even do módulo Prelude
    e outra usando a função mod.

    h) Função verificar divisibilidade: recebe dois números inteiros e verifica se o primeiro
    é divisível pelo segundo.
    
    i) Função calcular salário: recebe o salário base de um funcionário e retorna o salário
    a receber, sabendo-se que esse funcionário tem gratificação de 5% sobre o saláriobase, e paga imposto de 7% sobre o salário-base.