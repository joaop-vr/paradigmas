1. Use o conceito de classe abstrata para implementar o programa abaixo:

- Crie uma classe abstrata chamada CartaoWeb. Essa classe representa todos
  os tipos de cartões web contendo apenas um atributo: destinatario (String).
  Nessa classe você deverá também declarar o método abstrato
  retornarMensagem(String remetente).

- Crie três classes filhas (sub-classes) da classe CartaoWeb:
  a) CartaoDiaDosNamorados
  b) CartaoNatal
  c) CartaoAniversario.

- Cada uma dessas classes deve conter um método construtor que receba o
  nome do destinatário do cartão. Cada classe também deve implementar o
  método retornarMensagem(String remetente), retornando uma mensagem ao
  usuário com o nome do destinatário, um texto que seja específico para a data
  comemorativa do cartão, acrescido do remetente ao final da mensagem. Por
  exemplo, essa poderia ser uma mensagem de um cartão de dia dos
  namorados:

      “Querida Maria,
      Feliz Dia dos Namorados!
      Espero que esse tenha sido o único cartão do dia dos namorados que tenha
      ganhado nessa data!”
      De todo meu coração,
      João”

- No método main da classe Principal, crie um único array de CartaoWeb. Insira
  de forma alternada, instâncias dos três tipos de cartões neste array. Em
  seguida, use um laço de repetição para exibir as mensagens dos cartões,
  chamando o método retornarMensagem(String remetente) dos objetos,
  utilizando como argumento o seu nome para remetente. Utilize os métodos
  da classe Scanner para interação com o usuário.
