﻿# ExercicioComposi-o_EnumsJava
# ExercicioComposi-o_EnumsJava

Este é um projeto de exercício em Java para praticar os conceitos de composição e enumerações. O programa simula um sistema de gerenciamento de pedidos, onde é possível cadastrar um cliente, criar um pedido com vários itens e calcular o valor total.

## Funcionalidades

* Cadastro de cliente com nome, e-mail e data de nascimento.
* Criação de um pedido associado a um cliente.
* Adicionar múltiplos itens a um pedido, cada um com um produto, quantidade e preço.
* O status do pedido pode ser definido como `PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, ou `DELIVERED`.
* Calcular o subtotal de cada item do pedido e o valor total do pedido.
* Exibir um resumo do pedido, incluindo os dados do cliente, o status do pedido, os itens do pedido e o preço total.

## Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)
* Composição
* Enumerações

## Como Executar

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/ricardoissadesousa/exerciciocomposi-o_enumsjava.git](https://github.com/ricardoissadesousa/exerciciocomposi-o_enumsjava.git)
    ```
2.  **Navegue até o diretório do projeto:**
    ```bash
    cd exerciciocomposi-o_enumsjava
    ```
3.  **Compile os arquivos Java:**
    ```bash
    javac -d out src/application/Main.java src/entites/Client.java src/entites/Enum/OrderStatus.java src/entites/Order.java src/entites/OrderItem.java src/entites/Product.java
    ```
4.  **Execute o programa:**
    ```bash
    java -cp out application.Main
    ```

## Exemplo de Uso

O programa solicitará que você insira os dados do cliente e do pedido. Aqui está um exemplo de como seria a interação:
