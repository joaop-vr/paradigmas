2) Implemente uma classe Time que encapsule os atributos hora e minuto. 

- A classe deve conter três construtores e os seguintes métodos:

    -> boolean anterior(int h, int m), indica se a hora/min fornecida
    como parâmetro é anterior à hora representada pelo objeto;

    -> boolean posterior(int h, int m), indica se a hora/min fornecida
    como parâmetro é posterior à hora representada pelo objeto no qual este
    método é executado;

    -> boolean equals(int h, int m), indica se a hora/min fornecida
    como parâmetro é igual à hora representada pelo objeto no qual este método
    é executado;

    -> toString()para exibir as horas/minutos representadas pelo objeto no
    formato “hora:minuto”.

- Implemente uma classe que contenha o método main() que leia duas horas (horas
e minutos, nesta ordem), exiba-as na tela usando o método toString() e as
compare, apresentando uma mensagem na tela indicando se a primeira é
anterior, posterior ou igual a segunda.