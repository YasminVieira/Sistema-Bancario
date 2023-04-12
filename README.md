# Aplicação - Sistema Bancário
Este é um projeto básico e iniciante em Java que simula uma conta bancária simples.
O usuário pode verificar o saldo da conta, receber e realizar transferências.

# Como executar o projeto

1. Certifique-se de que você tenha o Java instalado em seu computador.
2. Clone este repositório em sua máquina.
3. Abra o arquivo Desafio.java em seu editor de código preferido.
4. Compile o arquivo digitando o seguinte comando no terminal:
javac Desafio.java
5. Execute o programa digitando o seguinte comando no terminal:
java Desafio
6. Siga as instruções exibidas no console para interagir com o programa.

# Funcionamento do programa
Ao ser executado, o programa exibe as informações do titular da conta, tipo da conta e saldo disponível.
O usuário pode escolher uma das opções disponíveis digitando um número entre 1 e 4.

1. Verificar saldo da conta

* O programa exibe o saldo disponível na conta.

2. Receber transferência

 * O programa pede para o usuário informar o valor da transferência.
 * O saldo da conta é atualizado com o valor da transferência.

3. Realizar transferência

 * O programa pede para o usuário informar o valor da transferência.
 * Se o saldo da conta for suficiente para a transferência, o programa atualiza o saldo.
 * Caso contrário, o programa exibe uma mensagem de erro.

4. Sair

 * Encerra a execução do programa.
 * Caso o usuário digite um valor inválido, o programa exibe uma mensagem de erro e volta ao início do loop.
