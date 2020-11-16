a. Pattern Name and Classification
O padrão State é um padrão comportamental que permite que um objeto altere seu comportamento quando o seu estado interno muda.
b. Intent
Permitir ao objeto possuir diferentes estados a partir das suas informações contidas na instância e retornar comportamentos diferentes com base nesse estado.
c. Motivation
A necessidade de que uma classe tenha comportamentos específicos determinados por seu estado atual.
d. Applicability
Projetos em que se tem a necessidade de gerenciar comportamentos diferentes dependendo de um número de estados diferentes.
e. Structure
![alt text](https://https://github.com/JSampietri/DesignPatterns/State/estrutura.png?raw=true)
f. Participants
Context: define a interface com o cliente e mantém a instância d eestado concreto o qual define o estado atual do objeto;
State: Interface que permite encapsular as responsabilidade associadas ao estado particular de contexto;
ConcreteState: Um ou mais estados concretos que implementam a interface estado.
g. Sample Code
https://https://github.com/JSampietri/DesignPatterns/State/CodigoExemplo
