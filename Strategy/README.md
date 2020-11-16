a. Pattern Name and Classification
O Padrão Strategy, também chamado de Policy, é um padrão comportamental que delega responsabilidades, aumentado a coesão e aprimorando a comuncação entre os objetos. Permite também que o algoritmo varie independentemente dos clientes que o utilizam.
b. Intent
Definir novos algoritmos sem alterar as classes dos elementos sobre os quais opera. Definir e encapsular famílias de algoritmos e torná-las intercambiáveis.
c. Motivation
Facilitar a escolha dos algoritmos criados para uma determinada função.
d. Applicability
Quando um projeto tiver muitas classes que se relacionam e diferem no modo de atuação ou quando há necessidade de variar o algoritmo de acordo com as condições de chamada.
e. Structure
![alt text](https://https://github.com/JSampietri/DesignPatterns/Strategy/estrutura.png?raw=true)
f. Participants
Context: define  mantém a referência para uma classe Strategy específica;
Strategy: Interface(ou classe abstrata) comum a todos os algoritos suportados;
ConcreteStrategy: Um ou ais algoritmos fornecidos para a aplicação;
g. Sample Code
https://https://github.com/JSampietri/DesignPatterns/Strategy/CodigoExemplo
